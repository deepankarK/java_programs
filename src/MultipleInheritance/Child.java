package MultipleInheritance;

interface one {
    public void printOne();
}
interface two {
    public void printTwo();
}
interface three {
    public void printThree();
}

class Child implements one, two, three {
    @Override
    public void printOne(){
        System.out.println("I am interface One");
    }

    @Override
    public void printTwo() {
        System.out.println("I am interface Two");
    }
    @Override
    public void printThree() {
        System.out.println("I am interface Three");
    }
}

