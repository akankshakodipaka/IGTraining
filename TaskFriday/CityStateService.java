package com.TaskSaturday;
import java.util.*;

public class CityStateService {

    private Map<String, Set<CityStateMap>> cityState;

    public CityStateService() {
        cityState = new HashMap<>();
    }
    public void addCityStatePair(CityStateMap cityStateMap) {
        cityState.computeIfAbsent(cityStateMap.getState(), k -> new HashSet<>()).add(cityStateMap);
    }
    public Set<String> getAllCities() {
        Set<String> allCities = new HashSet<>();
        for (Set<CityStateMap> cityStates : cityState.values()) {
            for (CityStateMap cityState : cityStates) {
                allCities.add(cityState.getCity());
            }
        }
        return allCities;
    }

    public Set<String> getAllStates() {
        return cityState.keySet();
    }

    public Set<CityStateMap> getCitiesForState(String state) {
        return cityState.getOrDefault(state, new HashSet<>());
    }

    public void deleteCitiesForState(String state) {
        cityState.remove(state);
    }

    public void printMap() {
        for (Map.Entry<String, Set<CityStateMap>> entry : cityState.entrySet()) {
            System.out.println("State: " + entry.getKey() + " -> Cities: " + entry.getValue());
        }
    }
}
