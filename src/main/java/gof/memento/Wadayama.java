package gof.memento;

import java.util.HashMap;
import java.util.Map;

public class Wadayama {
    private static Map<String, Calc.Memento> map = new HashMap<>();

    public static void wadayamaCals(){
        Calc calc = new Calc();
        for (int n = 1; n <= 5; n++) {
            calc.plus(n);
        }
        System.out.println("5までの足し算:" + calc.getTemp());
        map.put("5までの足し算", calc.createMemento());
 
        Calc calc2 = new Calc();
        calc2.setMemento(map.get("5までの足し算"));
        for (int n = 6; n <= 10; n++) {
            calc2.plus(n);
        }
        System.out.println("10までの足し算:" + calc2.getTemp());
        map.put("10までの足し算", calc2.createMemento());
    }
}