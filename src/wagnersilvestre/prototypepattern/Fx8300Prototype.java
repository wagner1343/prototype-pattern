package wagnersilvestre.prototypepattern;

public class Fx8300Prototype extends ProcessorPrototype{

    protected Fx8300Prototype(Fx8300Prototype fx){
        this.setCoreAmount(fx.getCoreAmount());
        this.setMaxClock(fx.getMaxClock());
        this.setAge(fx.getAge());
    }

    public Fx8300Prototype(){
        this.setCoreAmount(8);
        this.setMaxClock(4200);
        this.setAge(0);
    }

    @Override
    public String showInfo() {
        return "Processador FX8300, nucleos: " + this.getCoreAmount() + ", clock máximo: " + this.getMaxClock() + ", idade: " + this.getAge();
    }

    @Override
    public Fx8300Prototype clonePrototype() {
        return new Fx8300Prototype(this);
    }
}
