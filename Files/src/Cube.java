public class Cube {
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public static void main(String[] args) {
        Cube cube = new Cube(4);
        System.out.println(cube.volume());
        System.out.println(cube);

        System.out.println();

        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);
    }

    public int volume() {
        return edgeLength * edgeLength * edgeLength;
    }

    @Override
    public String toString() {
        return "The length of the edge of the cube is " + edgeLength + " and the volume is " + volume();
    }
}
