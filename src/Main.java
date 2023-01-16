public class Main {
    public static void main(String[] args) {

        Class  cl = new Class(93,"Gulnur",new int []{2,33,22,45,94,4,7,3});


        System.out.println("This number: " + cl.getNumber() + "\nThis word: " + cl.getWord() + "\nThis array: ");
        cl.getArray();
    }
}