package academy.devdojo.lacosderepeticao.fors;

public class ExercicioCalculadora {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Fazedo tabuada do número :" + i);
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + "x" + j + " = " + (i * j) );
            }
        }
    }
}
