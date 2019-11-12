// use extend to inherit a parent class
public class Reptiles extends Animal{

    private String scales;
    private String coldBlood;
    private String scute;

    public String getScales() {
        return scales;
    }

    public String getColdBlood() {
        return coldBlood;
    }

    public String getScute() {
        return scute;
    }

    public Reptiles(int brain, int limbs, int eyes, int lungs, boolean isVertebrate, String scales, String coldBlood, String scute) {
        super (1,limbs, 2, lungs,true);
        this.scales = scales;
        this.coldBlood = coldBlood;
        this.scute = scute;
    }
    }

