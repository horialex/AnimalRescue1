package entities.animals;

public class Cat extends Animal {

    public Cat() {
        super.type = "Cat";
    }

    public void speak() {
        System.out.println("Meaww!");
    }

    public void speak(String sound){
        System.out.println(sound);
    }

    public void speak(String sound, int numberOfSounds){
        for(int i = 0; i < numberOfSounds; i++){
            System.out.println(sound);
        }

    }


}
