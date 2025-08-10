class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

 class Main
{
    public static void main(String[] args)
    {
        Animal a1=new Animal();
        a1.sound();
        Animal a2=new Dog();
        a2.sound();
        Dog d1=new Dog();
        d1.sound();
    }

}