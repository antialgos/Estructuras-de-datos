package HackerRank;

import java.util.HashMap;
import java.util.Map;

public class ParkingSystem {
    Map<Integer, Integer> system = new HashMap<>();

    public ParkingSystem(int big, int medium, int small) {
        system.put(1,big);
        system.put(2,medium);
        system.put(3,small);

    }
    
    public boolean addCar(int carType) {
        if (system.get(carType)-1 >= 0) {
            system.put(carType, system.get(carType)-1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}




// ["ParkingSystem","addCar","addCar","addCar","addCar"]
// [[1,1,0],[1],[2],[3],[1]]