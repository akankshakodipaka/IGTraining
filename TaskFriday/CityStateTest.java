package com.TaskSaturday;
public class CityStateTest {

    public static void main(String[] args) {
 
        CityStateService service = new CityStateService();

        CityStateMap city1 = new CityStateMap("New York", "New York");
        CityStateMap city2 = new CityStateMap("Los Angeles", "California");
        CityStateMap city3 = new CityStateMap("Chicago", "Illinois");
        CityStateMap city4 = new CityStateMap("Buffalo", "New York");
        CityStateMap city5 = new CityStateMap("San Francisco", "California");

        
        service.addCityStatePair(city1);
        service.addCityStatePair(city2);
        service.addCityStatePair(city3);
        service.addCityStatePair(city4); 
        service.addCityStatePair(city5); 

        System.out.println("All Cities: " + service.getAllCities());
        System.out.println("All States: " + service.getAllStates());
        System.out.println("Cities in New York: " + service.getCitiesForState("New York"));
        System.out.println("Cities in California: " + service.getCitiesForState("California"));
        service.deleteCitiesForState("Illinois");
        service.printMap();
    }
}

