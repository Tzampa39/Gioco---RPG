package World;

public class PerlinNoise {
    private static final int[] P = new int[512];
    private static final int[] permutation = new int[256];

    public PerlinNoise() {
        for (int i = 0; i < 256; i++) {
            permutation[i] = i;
        }
        for (int i = 0; i < 256; i++) {
            int j = (int) (Math.random() * 256);
            int temp = permutation[i];
            permutation[i] = permutation[j];
            permutation[j] = temp;
        }
        System.arraycopy(permutation, 0, P, 0, 256);
        System.arraycopy(P, 0, P, 256, 256);
    }

    public double noise(double x, double y) {
        int X = (int) Math.floor(x) & 255;
        int Y = (int) Math.floor(y) & 255;

        x -= Math.floor(x);
        y -= Math.floor(y);

        double u = fade(x);
        double v = fade(y);

        int a = P[X] + Y;
        int b = P[X + 1] + Y;

        return lerp(v, lerp(u, grad(P[a], x, y), grad(P[b], x - 1, y)),
                        lerp(u, grad(P[a + 1], x, y - 1), grad(P[b + 1], x - 1, y - 1)));
    }

    private double fade(double t) {
        return t * t * t * (t * (t * 6 - 15) + 10);
    }

    private double lerp(double t, double a, double b) {
        return a + t * (b - a);
    }

    private double grad(int hash, double x, double y) {
        int h = hash & 15;
        double u = h < 8 ? x : y;
        double v = h < 4 ? y : h == 12 || h == 14 ? x : 0;
        return (h & 1) == 0 ? u + v : u - v;
    }
}
