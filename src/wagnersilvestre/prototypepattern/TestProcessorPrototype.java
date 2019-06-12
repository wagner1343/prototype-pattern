package wagnersilvestre.prototypepattern;

import java.util.ArrayList;
import java.util.Random;

public class TestProcessorPrototype {
    public static void main(String[] args) {
        Fx8300Prototype fx8300Prototype = new Fx8300Prototype();
        Fx6300Prototype fx6300Prototype = new Fx6300Prototype();
        ArrayList<ProcessorPrototype> processors = new ArrayList<>();

        Random rand = new Random();
        for(int x = 0; x < 4; x++){
            Fx8300Prototype fx8300 = fx8300Prototype.clonePrototype();
            fx8300.setAge(rand.nextInt(10));
            processors.add(fx8300);
        }

        for(int x = 0; x < 4; x++){
            Fx6300Prototype fx6300 = fx6300Prototype.clonePrototype();
            fx6300.setAge(rand.nextInt(10));
            processors.add(fx6300);
        }

        for(ProcessorPrototype p : processors){
            System.out.println(p.showInfo());
        }
    }
}
