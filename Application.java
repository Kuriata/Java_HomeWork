package HW4;

import HW4.Airport.Airplane;
import HW4.Airport.Commandpost;
import HW4.Airport.Person;
import HW4.Airport.Pilot;

public class Application {
    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        pilot.setFirst_name("Yakiv ");
        pilot.setLast_name("Grigorovich ");

        Commandpost commandpost = new Commandpost();

        Person person = new Pilot();

        Airplane airplane = new Airplane("MRIYA");
        airplane.setSpeed("850km/h");
        airplane.setCarrying_capacity("250t");

        Airplane airplane2 = new Airplane("Boeing747");
        airplane2.setSpeed("908km/h");
        airplane2.setCarrying_capacity("134t");

        Airplane airplane3 = new Airplane("BoeingC-17");
        airplane3.setSpeed("830km/h");
        airplane3.setCarrying_capacity("56t");

        airplane2.reserve(pilot);
        System.out.println(Airplane.getStatistic(airplane));
        System.out.println(airplane);
        System.out.println(airplane2);
        System.out.println(airplane3);
        airplane.act(pilot);
        pilot.sayHello();
        System.out.println(pilot.getFirst_name() + pilot.getLast_name());
        airplane.act(commandpost);
        commandpost.sayHello();


//        Airplane airplane = new Airplane("MRIYA", "850km/h", "250t");
//        Airplane airplane2 = new Airplane("Boeing747", "908km/h", "134t");
//        Airplane airplane3 = new Airplane("BoeingC-17", "830km/h", "56t");
//        Airplane airplane4 = new Airplane("AirbusA380", "950km/h", "90t");

//        System.out.println(airplane);
//        System.out.println(airplane2);
//        System.out.println(airplane3);
//        System.out.println(airplane4);
    }
}
