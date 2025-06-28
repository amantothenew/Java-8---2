// Q2)Create and access default and static method of an interface.

interface Interface {
    default void Display() {
        System.out.println("Default function");
    }

    static void Display2 () {
        System.out.println("This is Static funciton");
    }
}

class Display implements Interface {
    @Override
    public void Display() {
        System.out.println("Interface Display function is over-riden");
    }
}

class FlatMap{
    public static void main(String[] args) {
        Interface.Display2();
        Display display = new Display();
        display.Display();
    }
}
