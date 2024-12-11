package work6;
public class Main {
    private CoordinateSystem coordinateSystem;
    /**
     * Constructor.
     *
     * @param coordinateSystem initial coordinate system
     */
    public Main(CoordinateSystem coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }

    /**
     * Sets a new coordinate system.
     *
     * @param coordinateSystem new coordinate system
     */
    public void setCoordinateSystem(CoordinateSystem coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }

    /**
     * Plots the graph of a function.
     *
     * @param function mathematical function
     */
    public void plot(String function) {
        System.out.println("Preparing to display the graph...");
        coordinateSystem.displayGraph(function);
    }

    public static void main(String[] args) {

        CoordinateSystem dekart = new DekartCoordinateSystem();
        CoordinateSystem polar = new PolarCoordinateSystem();
        Main graph = new Main(dekart);
        graph.plot("y = x^2");
        graph.setCoordinateSystem(polar);
        graph.plot("r = sin(θ)");
    }
}
