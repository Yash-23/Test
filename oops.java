class Animals{
    void eat(){
        System.out.println("eating");
    }
}
class Dogs extends Animals{
    void bark(){
        System.out.println("barking");
    }
}

class oops{
    public static void main(String args[]){
        Dogs d = new Dogs();
        d.bark();
        d.eat();
    }
}