public class Main {
    public static void main(String[] args) {
        Input.stringList.add("samyar");
        Input.stringList.add("reza");
        Input.stringList.add("mohammad");
        Input.stringList.add("sara");
        Input.stringList.add("radin");
        Input.stringList.add("mozafar");
        Input.stringList.add("farnaz");
        Input.stringList.add("ali");


        Methods.onlyShowSameNumberOfLetters(Input.stringList);
        Methods.sortAndGroupBasedOnLetters(Input.stringList);
    }
}
