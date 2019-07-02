abstract class GeneralBank {
    abstract float getFixedInterest();
    abstract float getSavingInterest();
}

class ICICI extends GeneralBank{

    @Override
    public float getFixedInterest() {
        return 8.5f;
    }

    @Override
    float getSavingInterest() {
        return 4f;
    }

    public static void main(String[] args) {
        ICICI obj=new ICICI();
        System.out.println(obj.getFixedInterest()+" "+obj.getSavingInterest());
    }
}
class KotMBank extends GeneralBank{

    @Override
    float getFixedInterest() {
        return 9;
    }

    @Override
    float getSavingInterest() {
        return 6;
    }

    //widening and narrowing
    //not allowed to override method with lower accessibility level if declared with higher accessibility level
}
