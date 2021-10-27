package Package.Vector;

public class Main {
    public static void main(String[] args) {
        Vector[] vectors = Vector.randomGenerate(10);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].LenghtVector());
        System.out.println(vectors[1].scalarMultication(vectors[0]));
        System.out.println(vectors[0].vectorMultication(vectors[1]));
        System.out.println(vectors[0].cos(vectors[1]));
        System.out.println(vectors[0].add(vectors[1]));
        System.out.println(vectors[0].subtract(vectors[1]));
    }
}
