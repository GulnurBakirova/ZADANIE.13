public class Class {
    private int number;
    private String word;
    private int [] arr;

    public Class (){
    }
    public Class(int number, String word, int [] arr) {
        this.number = number;
        this.word = word;
        this.arr = arr;
    }
    public void getArray(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public int[] getArr() {
        return arr;
    }
    public void setArray(int[] arr) {
        this.arr = arr;
    }
}
