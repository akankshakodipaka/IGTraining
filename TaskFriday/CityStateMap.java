package com.TaskSaturday;

public class CityStateMap {

    private String city;
    private String state;
    public CityStateMap(String city, String state) {
        this.city = city;
        this.state = state;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return city + ", " + state;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CityStateMap that = (CityStateMap) obj;
        return city.equals(that.city) && state.equals(that.state);
    }

    @Override
    public int hashCode() {
        return 31 * city.hashCode() + state.hashCode();
    }
}

