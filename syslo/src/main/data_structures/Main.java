package data_structures;

import dto.Dog;

public class Main {
    static Dog reksio = new Dog("Reksio", 4);
    static Dog bethowen = new Dog("Berhoveen", 12);
    static Dog pimpek = new Dog("Pimpek", 2);
    static Dog rusty = new Dog("Rusty", 9);

    //linkedList

    /*public static void main(String[] args) {
        LinkedList<Dog> dogLinkedList = new LinkedList<>();



        dogLinkedList.insert(reksio);
        dogLinkedList.insert(bethowen);
        dogLinkedList.insert(pimpek);
        dogLinkedList.insert(rusty);

        System.out.println("Is empty?: " + dogLinkedList.isEmpty());
        System.out.println("List size: " + dogLinkedList.size());

        for (Dog dog : dogLinkedList) {
            System.out.println(dog);
        }

        dogLinkedList.insertBefore(new Dog("Freshy", 1));

        System.out.println("-----");

        for (Dog dog : dogLinkedList) {
            System.out.println(dog);
        }
    }
*/

    //stack

    public static void main(String[]args) {
        Stack<Dog> stack = new Stack<>();
        stack.push(reksio);
        stack.push(bethowen);
        stack.push(pimpek);
        stack.push(rusty);


        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        System.out.println("PEEK: " + stack.peek().toString());
        System.out.println("POPPED: " + stack.pop());
        System.out.println("Last element: " + stack.pop());
        System.out.println("Last element2: " + stack.pop());
        System.out.println(stack.size());

        Dog nowy = new Dog("Nowy", 1);
        stack.push(nowy);
        System.out.println("Should be 'Nowy': " + stack.pop());
        System.out.println(stack.size());
    }

}

