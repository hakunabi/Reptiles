public class Animal {

    public int brain;
    public int limbs;
    public int eyes;
    public int lungs;
    public boolean isVertebrate;

    public int getBrain() {
        return brain;
    }

    public int getLimbs() {
        return limbs;
    }

    public int getEyes() {
        return eyes;
    }

    public int getLungs() {
        return lungs;
    }

    public boolean isVertebrate() {
        return isVertebrate;
    }

    public Animal(int brain, int limbs, int eyes, int lungs, boolean isVertebrate) {
        this.brain = brain;
        this.limbs = limbs;
        this.eyes = eyes;
        this.lungs = lungs;
        this.isVertebrate = isVertebrate;
    }
}
