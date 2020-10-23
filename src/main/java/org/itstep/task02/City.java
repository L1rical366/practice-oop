//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.itstep.task02;

public class City {
    private String name;
    private String region;
    private String country;
    private int inhabitants;
    private String index;
    private String code;

   public City() {
    }

    public City(String name, String region, String country, int inhabitants, String index, String code) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.inhabitants = inhabitants;
        this.index = index;
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public String getRegion() {
        return this.region;
    }

    public String getCountry() {
        return this.country;
    }

    public int getInhabitants() {
        return this.inhabitants;
    }

    public String getIndex() {
        return this.index;
    }

    public String getCode() {
        return this.code;
    }
}
