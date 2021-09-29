package logic;

import Pojo.Requirement;

import java.util.LinkedHashMap;

public class Save {
    static LinkedHashMap<Integer,Requirement> info=new LinkedHashMap();
    static  LinkedHashMap<Integer,Integer>bus=new LinkedHashMap<>();

    public void  addGiveDetails(Requirement details){
           info.put(details.getUserId(),details);
     }
     public boolean check (int userId,String password) {
         if (info.containsKey(userId)) {
             return true;
         }
         else {
          return false;
         }
     }
     public LinkedHashMap available(){
         for (int i = 0; i <= 10; i++) {
             bus.put(i,100);
         }
        return  bus;
     }
     public LinkedHashMap  booked(int[] bookedSeat){
         for (int i = 0; i < bookedSeat.length; i++) {
            if( bus.containsKey(bookedSeat[i])){
                bus.remove(bookedSeat[i]);
            }
         }
         return bus;
     }
}
