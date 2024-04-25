import java.util.*;

public class Itenary {
    public static void main(String[] args) {

        Passenger p1 = new Passenger(1,"Sharanya",25);
        Passenger p2 = new Passenger(2,"Vinay",26);
        Passenger p3 = new Passenger(3,"Meher",14);
        Passenger p4 = new Passenger(4,"Shravs",12);
        Passenger p5 = new Passenger(5,"Suppy",50);
        Passenger p6 = new Passenger(6,"Pravallika",24);


        HashSet<Passenger> passengers = new HashSet<>();

        //adding the passengers to the HashSet
        passengers.add(p1);
        passengers.add(p2);
        passengers.add(p3);
        passengers.add(p4);
        passengers.add(p5);
        passengers.add(p6);

        Seat s1= new Seat("18A",false);
        Seat s2= new Seat("18B",true);
        Seat s3= new Seat("18C",false);
        Seat s4= new Seat("18D",true);
        Seat s5= new Seat("18E",true);
        Seat s6= new Seat("18F",false);


        HashSet<Seat> seats = new HashSet<>();
        seats.add(s1);
        seats.add(s2);
        seats.add(s3);
        seats.add(s4);
        seats.add(s5);
        seats.add(s6);




        HashMap<Passenger,Seat> seatAllocated = new HashMap<>();
        Iterator<Passenger> passengerIterator = passengers.iterator();

        while(passengerIterator.hasNext()){
            Passenger pass=passengerIterator.next();

            Iterator<Seat> seating = seats.iterator();
            while (seating.hasNext()){
                Seat s = seating.next();

                if(pass.getPassengerAge()<18 && s.isAile()){
                    continue;
                }

                if(!seatAllocated.containsValue(s)){
                    seatAllocated.put(pass,s);
                    seats.remove(s);
                    break;
                }

            }


        }

        for(Passenger i:seatAllocated.keySet()){
            System.out.println("Passenger "+i.getPassengerName()+"is allocated to seat "+seatAllocated.get(i).getSeatId());
        }









    }
}
