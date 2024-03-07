public class BabyKoala extends ZooAnimal {
    private boolean eyesOpen;
    private int age;
    public BabyKoala(String name, int age) {
        super(name, age);
        this.eyesOpen = false;
    }

    public boolean hasEyesOpen() {
        return eyesOpen;
    }

    public void openEyes() {
        System.out.println("hello world!");
        eyesOpen = true;
    }
}
