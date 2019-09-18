package chapter10;

public class zoo {

    public static void main(String[] args){

        dog rocky = new dog();
        rocky.makeSound();
        rocky.fetch();
        feed(rocky);
//
        animal sasha = new dog();
        sasha.makeSound();
//        feed(sasha);
//
        sasha = new cat();
        sasha.makeSound();

//        ((cat) sasha).scratch();
//        feed(sasha);
    }

    public static void feed(animal hewan){

        if(hewan instanceof dog){
            System.out.println("here's your dog food");
        }

        else if(hewan instanceof cat){
            System.out.println("here's your cat food");
        }
    }


}
