package mpPlay;

interface BasicSingletonI {

    int getValue();
    void setValue(int value);

}

public class BasicSingleton implements BasicSingletonI {

    private static final BasicSingletonI INSTANCE = new BasicSingleton();

    private int value = 0;

    private BasicSingleton() {}

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Static factory method
    public static BasicSingletonI getINSTANCE() {

        return INSTANCE;
    }

}

class Test {

    public static void main(String[] args) {

        BasicSingletonI bs = BasicSingleton.getINSTANCE();
        bs.setValue(3);
        System.out.println(bs.getValue());

        System.exit(0);

    }

}
