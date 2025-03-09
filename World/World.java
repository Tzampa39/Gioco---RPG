package World;

public class World {

    private PerlinNoise perlinNoise;
    private double[][] worldMap; // Mappa del mondo
    private int width, height;
    private double scale = 0.1; // Scala per il Perlin Noise

    // Costruttore della mappa del mondo
    public World(int width, int height) {
        this.width = width;
        this.height = height;
        this.perlinNoise = new PerlinNoise(); // Assicurati che questa classe sia definita
        this.worldMap = new double[width][height];
        generateWorld();
    }

    // Funzione che genera la mappa del mondo
    private void generateWorld() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // Calcoliamo il valore del terreno in base al Perlin Noise
                worldMap[x][y] = perlinNoise.noise(x * scale, y * scale);
            }
        }
    }

    // Funzione per stampare la mappa del mondo (utile per il debug)
    public void printWorld() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // Mappa l'altezza su una scala visibile
                int terrainHeight = (int) (worldMap[x][y] * 10); // Rinomino per chiarezza
                System.out.print(terrainHeight + " ");
            }
            System.out.println();
        }
    }

    // Restituisce l'altezza del punto (x, y)
    public double getHeight(int x, int y) {
        return worldMap[x][y];
    }

    // Restituisce la larghezza della mappa
    public int getWidth() {
        return this.width;
    }

    // Restituisce l'altezza della mappa
    public int getHeight() {
        return this.height;
    }
}
