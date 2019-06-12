package wagnersilvestre.prototypepattern;

public class Fx6300Prototype extends ProcessorPrototype{

    protected Fx6300Prototype(Fx6300Prototype fx){
        this.setCoreAmount(fx.getCoreAmount());
        this.setMaxClock(fx.getMaxClock());
        this.setAge(fx.getAge());
    }

    public Fx6300Prototype(){
        this.setCoreAmount(6);
        this.setMaxClock(3800);
        this.setAge(0);
    }

    @Override
    public String showInfo() {
        return "Processador FX8300, nucleos: " + this.getCoreAmount() + ", clock máximo: " + this.getMaxClock() + ", idade: " + this.getAge();
    }

    @Override
    public Fx6300Prototype clonePrototype() {
        return new Fx6300Prototype(this);
    }
}
