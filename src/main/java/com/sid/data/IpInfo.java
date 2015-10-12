package com.sid.data;


public class IpInfo {
    private final String ip;
    private final String countryCode;
    private final String country;

    public IpInfo(String ip, String countryCode, String country ){
        this.ip = ip;
        this.countryCode = countryCode;
        this.country = country;
    }

    public IpInfo(String[] row) {
        this.ip = row[0];
        this.countryCode = row[1];
        this.country = row[2];
    }
    public String getCountry() {
        return country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getIp() {
        return ip;
    }

    public String [] serialize() {
        return new String[]{this.ip, this.countryCode, this.country};
    }

    @Override
    public String toString() {
        return String.format("ip: %s, countryCode: %s, country: %s", ip, countryCode, country);
    }
}
