package com.tools;

public abstract class IpTools {

    private String[] ipAddress;
    private int totalHost, totalIp;
    private boolean validIp, validPrefix;
    private String prefix,
            decimalIpAddress,
            binaryIpAddress,
            decimalNetmask,
            binaryNetmask,
            decimalWildcard,
            binaryWildcard,
            decimalNetworkAddress,
            binaryNetworkAddress,
            decimalBroadcastAddress,
            binaryBroadcastAddress,
            decimalFirstHostAddress,
            binaryFirstHostAddress,
            decimalLastHostAddress,
            binaryLastHostAddress,
            ipClass;

    public IpTools(String[] ipAddress, String prefix){
        this.ipAddress = ipAddress;
        this.prefix = prefix;
        this.validIp = checkIpAddress();
        this.validPrefix = checkPrefix();
        if (this.validIp && this.validPrefix){
            init();
        }
    }

    private void init(){
        ipAddress();
        netmask();
        wildcard();
        networkAddress();
        broadcastAddress();
        firstHostAddress();
        lastHostAddress();
        totalIp();
        totalHost();
        ipClass();
    }

    protected String decimalToBinary(String decimal){
        String[] octet = decimal.split("\\.");
        String finalBinary = "";
        for(int i = 0; i < 4; i++){
            String binary = Integer.toBinaryString(Integer.parseInt(octet[i]));
            while(binary.length() < 8){
                binary = "0" + binary;
            }

            finalBinary += binary + (i <=2 ? "." : "");
        }

        return finalBinary;
    };
    protected String binaryToDecimal(String binary){
        String[] octet = binary.split("\\.");
        String finalDecimal = "";
        for(int i = 0; i < 4; i++){
            finalDecimal += Integer.parseInt(octet[i], 2) + (i <= 2 ? "." : "");
        }

        return finalDecimal;
    };

    //Setter
    protected void setDecimalIpAddress(String decimalIpAddress) { this.decimalIpAddress = decimalIpAddress;}
    protected void setBinaryIpAddress(String binaryIpAddress) {this.binaryIpAddress = binaryIpAddress;}
    protected void setDecimalNetmask(String decimalNetmask) {this.decimalNetmask = decimalNetmask;}
    protected void setBinaryNetmask(String binaryNetmask) {this.binaryNetmask = binaryNetmask;}
    protected void setDecimalWildcard(String decimalWildcard) {this.decimalWildcard = decimalWildcard;}
    protected void setBinaryWildcard(String binaryWildcard) {this.binaryWildcard = binaryWildcard;}
    protected void setDecimalNetworkAddress(String decimalNetworkAddress) {this.decimalNetworkAddress = decimalNetworkAddress;}
    protected void setBinaryNetworkAddress(String binaryNetworkAddress) {this.binaryNetworkAddress = binaryNetworkAddress;}
    protected void setDecimalBroadcastAddress(String decimalBroadcastAddress) {this.decimalBroadcastAddress = decimalBroadcastAddress;}
    protected void setBinaryBroadcastAddress(String binaryBroadcastAddress) {this.binaryBroadcastAddress = binaryBroadcastAddress;}
    protected void setDecimalFirstHostAddress(String decimalFirstHostAddress) {this.decimalFirstHostAddress = decimalFirstHostAddress;}
    protected void setBinaryFirstHostAddress(String binaryFirstHostAddress) {this.binaryFirstHostAddress = binaryFirstHostAddress;}
    protected void setDecimalLastHostAddress(String decimalEndHostAddress) {this.decimalLastHostAddress = decimalEndHostAddress;}
    protected void setBinaryLastHostAddress(String binaryEndHostAddress) {this.binaryLastHostAddress = binaryEndHostAddress;}
    protected void setTotalHost(int totalHost) {this.totalHost = totalHost;}
    protected void setTotalIp(int totalIp) {this.totalIp = totalIp;}
    protected void setIpClass(String ipClass) {this.ipClass = ipClass;}

    // Getter
    protected String[] getIpAddress() {return ipAddress;}
    protected String getPrefix() {return prefix;}
    public String getDecimalIpAddress() {return decimalIpAddress;}
    public String getBinaryIpAddress() {return binaryIpAddress;}
    public String getDecimalNetmask() {return decimalNetmask;}
    public String getBinaryNetmask() {return binaryNetmask;}
    public String getDecimalWildcard() {return decimalWildcard;}
    public String getBinaryWildcard() {return binaryWildcard;}
    public String getDecimalNetworkAddress() {return decimalNetworkAddress;}
    public String getBinaryNetworkAddress() {return binaryNetworkAddress;}
    public String getDecimalBroadcastAddress() {return decimalBroadcastAddress;}
    public String getBinaryBroadcastAddress() {return binaryBroadcastAddress;}
    public String getDecimalFirstHostAddress() { return decimalFirstHostAddress;}
    public String getBinaryFirstHostAddress() {return binaryFirstHostAddress;}
    public String getDecimalLastHostAddress() {return decimalLastHostAddress;}
    public String getBinaryLastHostAddress() {return binaryLastHostAddress;}
    public int getTotalHost() {return totalHost;}
    public int getTotalIp() {return totalIp;}
    public String getipClass() {return ipClass;}
    public boolean isValidIp() {return validIp;}
    public boolean isValidPrefix() {return validPrefix;}

    // Abstract Method
    protected abstract boolean checkIpAddress();
    protected abstract boolean checkPrefix();
    protected abstract void ipAddress();
    protected abstract void netmask();
    protected abstract void wildcard();
    protected abstract void networkAddress();
    protected abstract void broadcastAddress();
    protected abstract void firstHostAddress();
    protected abstract void lastHostAddress();
    protected abstract void totalHost();
    protected abstract void totalIp();
    protected abstract void ipClass();

}

