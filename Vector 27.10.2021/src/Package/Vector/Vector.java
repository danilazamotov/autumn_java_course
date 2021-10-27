package Package.Vector;
import java.lang.Math;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {

    }
    public double LenghtVector() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double scalarMultication(Vector vector) {
        return x*vector.x + y * vector.y + z* vector.z;
    }

    public Vector vectorMultication (Vector vector) {
        return new Vector ( y * vector.z - z * vector.y,z * vector.x - x * vector.z,x * vector.y - y * vector.x);
    }

    public static Vector[] randomGenerate(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {

            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
    }
        return vectors;
    }

    public double cos(Vector vector) {
        return scalarMultication(vector) / (LenghtVector() * vector.LenghtVector());
    }

    public Vector add(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }

    public Vector subtract(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }
    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
