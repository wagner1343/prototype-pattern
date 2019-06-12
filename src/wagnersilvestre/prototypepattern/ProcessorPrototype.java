package wagnersilvestre.prototypepattern;

public abstract class ProcessorPrototype {
    private int coreAmount;
    private int maxClock;
    private int age;

    public abstract String showInfo();

    public abstract ProcessorPrototype clonePrototype();

    public int getCoreAmount() {
        return coreAmount;
    }

    public void setCoreAmount(int coreAmount) {
        this.coreAmount = coreAmount;
    }

    public int getMaxClock() {
        return maxClock;
    }

    public void setMaxClock(int maxClock) {
        this.maxClock = maxClock;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
