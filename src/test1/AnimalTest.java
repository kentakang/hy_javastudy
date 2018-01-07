package test1;

public class AnimalTest {

    public static void main(String[] args) {
        Animal[] a = new Animal[3];
        a[0] = new AnimalDog();
        a[1] = new AnimalCat();
        a[2] = new AnimalUnicorn();

        for(int i = 0; i < a.length; i++) {
            a[i].bark();
        }
    }
}
