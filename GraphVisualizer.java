import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

public class GraphVisualizer {
    public static void visualizeMap(List<City> cities, List<Road> roads) {
        Graph graph = new SingleGraph("CityMap");

        // Add cities as nodes
        for (City city : cities) {
            Node node = graph.addNode(city.getName());
            node.setAttribute("ui.label", city.getName());
        }

        // Add roads as edges
        for (Road road : roads) {
            String edgeId = road.getCity1().getName() + "-" + road.getCity2().getName();
            Edge edge = graph.addEdge(edgeId, road.getCity1().getName(), road.getCity2().getName());
            edge.setAttribute("ui.label", road.getLaneType().name());

            switch (road.getLaneType()) {
                case NATIONAL_HIGHWAY:
                    edge.setAttribute("ui.style", "fill-color: red;");
                    break;
                case INTER_STATE_HIGHWAY:
                    edge.setAttribute("ui.style", "fill-color: orange;");
                    break;
                case HIGHWAY:
                    edge.setAttribute("ui.style", "fill-color: yellow;");
                    break;
                case MAIN_ROAD:
                    edge.setAttribute("ui.style", "fill-color: green;");
                    break;
            }
        }

        graph.display();
    }

    public static void main(String[] args) {
        List<City> cities = MapGenerator.generateRandomCities();
        List<Road> roads = MapGenerator.generateRandomRoads(cities);
        visualizeMap(cities, roads);
    }
}
