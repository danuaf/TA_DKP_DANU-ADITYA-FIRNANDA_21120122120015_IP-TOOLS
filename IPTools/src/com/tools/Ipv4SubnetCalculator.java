package com.tools;

public class Ipv4SubnetCalculator extends IpTools {

    public Ipv4SubnetCalculator(String[] ipAddress, String prefix){
        super(ipAddress, prefix);
    }

    protected boolean checkIpAddress(){
        for (String octet : getIpAddress()){
            if (octet.equals("") || Integer.parseInt(octet) > 255 || Integer.parseInt(octet) < 0){
                return false;
            }
        }
        return true;
    }

    protected boolean checkPrefix(){
        if (!getPrefix().equals("")){
            return Integer.parseInt(getPrefix()) >= 0 && Integer.parseInt(getPrefix()) <= 32;
        }
        return false;
    }

    protected void ipAddress(){
        String decimalIpAddress = "";

        for(int i = 0; i < 4; i++){
            decimalIpAddress += getIpAddress()[i]+ (i <= 2 ? "." : "");
        }

        setDecimalIpAddress(decimalIpAddress);
        setBinaryIpAddress(decimalToBinary(decimalIpAddress));
    }

    protected void netmask(){
        String binaryNetmask = "";
        for(int i = 1; i <= 32; i++){
            binaryNetmask += i <=  Integer.parseInt(getPrefix()) ? "1" : "0";
            binaryNetmask += (i % 8 == 0 && i <= 24 ? "." : "");
        }

        setDecimalNetmask(binaryToDecimal(binaryNetmask));
        setBinaryNetmask(binaryNetmask);
    }

    protected void wildcard(){
        String binaryWildcard = "";

        for(int i = 1; i <= 32; i++){
            binaryWildcard += i <= Integer.parseInt(getPrefix()) ? "0" : "1";
            binaryWildcard += (i % 8 == 0 && i <= 24 ? "." : "");
        }

        setDecimalWildcard(binaryToDecimal(binaryWildcard));
        setBinaryWildcard(binaryWildcard);
    }

    protected void networkAddress(){
        if (Integer.parseInt(getPrefix()) > 31){
            setDecimalNetworkAddress("Unknow");
            setBinaryNetworkAddress("");
            return;
        }

        String[] binaryIpAddressOctet = getBinaryIpAddress().split("\\.");
        String[] binaryNetmaskOctet = getBinaryNetmask().split("\\.");
        String binaryNetworkAddress = "";

        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 8; j++){
                if(binaryIpAddressOctet[i].charAt(j) == '1' && binaryNetmaskOctet[i].charAt(j) == '1'){
                    binaryNetworkAddress += "1";
                }else{
                    binaryNetworkAddress += "0";
                }
            }
            binaryNetworkAddress += i <=2 ? "." : "";
        }

        setDecimalNetworkAddress(binaryToDecimal(binaryNetworkAddress));
        setBinaryNetworkAddress(binaryNetworkAddress);
    }

    protected void broadcastAddress(){
        if (Integer.parseInt(getPrefix()) > 31){
            setDecimalBroadcastAddress("Unknow");
            setBinaryBroadcastAddress("");
            return;
        }

        String[] binaryIpAddressOctet = getBinaryIpAddress().split("\\.");
        String[] binaryWildcardkOctet = getBinaryWildcard().split("\\.");
        String binaryBroadcastAddress = "";
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 8; j++){
                if(binaryIpAddressOctet[i].charAt(j) == '1' || binaryWildcardkOctet[i].charAt(j) == '1'){
                    binaryBroadcastAddress += "1";
                }else{
                    binaryBroadcastAddress += "0";
                }
            }

            binaryBroadcastAddress += i <=2 ? "." : "";
        }

        setDecimalBroadcastAddress(binaryToDecimal(binaryBroadcastAddress));
        setBinaryBroadcastAddress(binaryBroadcastAddress);
    }

    protected void firstHostAddress(){
        if (Integer.parseInt(getPrefix()) > 30) {
            setDecimalFirstHostAddress("Unknow");
            setBinaryFirstHostAddress(" ");
            return;
        }

        String binaryStartHostIp =  getBinaryNetworkAddress().substring(0,getBinaryNetworkAddress().length()-1) + "1";
        setDecimalFirstHostAddress(binaryToDecimal(binaryStartHostIp));
        setBinaryFirstHostAddress(binaryStartHostIp);
    }

    protected void lastHostAddress(){
        if (Integer.parseInt(getPrefix()) > 30){
            setDecimalLastHostAddress("Unknow");
            setBinaryLastHostAddress("");
            return;
        }
        String binaryEndHostAddress = getBinaryBroadcastAddress().substring(0,getBinaryBroadcastAddress().length()-1) + "0";
        setDecimalLastHostAddress(binaryToDecimal(binaryEndHostAddress));
        setBinaryLastHostAddress(binaryEndHostAddress);
    }

    protected void totalIp(){
        setTotalIp((int)Math.pow(2, 32-Integer.parseInt(getPrefix())));
    }
    protected void totalHost(){
        setTotalHost(getTotalIp() - (Integer.parseInt(getPrefix()) == 32 ? 1 : 2));
    }

    protected void ipClass(){
        String ipClass = "",
                ipType = "";
        int[] octet = new int[4];

        for (int i = 0; i < 4; i++){
            octet[i] = Integer.parseInt(getIpAddress()[i]);
        }


        if (octet[0] >= 0 && octet[0] <= 126){
            ipClass = "A";
            if (octet[0] == 10){
                ipType = "Private";
            }else {
                ipType = "Public";
            }
        } else if (octet[0] >= 128 && octet[0] <= 191) {
            ipClass = "B";
            if (octet[0] == 172 && octet[1] >= 16 && octet[1] <= 31){
                ipType = "Private";
            }else {
                ipType = "Public";
            }
        }else if (octet[0] >= 192 && octet[0] <= 223){
            ipClass = "C";
            if (octet[0] == 192 && octet[1] == 168){
                ipType = "Private";
            }else {
                ipType = "Public";
            }
        } else if (octet[0] >= 224 && octet[0] <= 239) {
            ipClass = "D";
            ipType = "Multicast";
        }else if (octet[0] >= 240 && octet[0] <= 254){
            ipClass = "E";
            ipType = "Experimental";
        }else {
            ipClass = "Undefined";
            ipType = "Unknow";
        }

        setIpClass("Class " + ipClass + " (" + ipType + " IP)");

    }
}
