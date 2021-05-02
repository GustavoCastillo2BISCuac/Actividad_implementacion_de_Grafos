/**@author ANDRES */
public class MapRepresentation {
public static Graph getCities() {
        Node df = new Node("DF");
        Node toluca = new Node("Toluca");
        Node cuernavaca = new Node("Cuernavaca");
        Node puebla = new Node("Puebla");
        Node tlaxcala = new Node("Tlaxcala");
        Node campeche = new Node("Campeche");
        Node tabasco = new Node("Tabasco");
        Node guadalajara = new Node("Guadalajara");
 
        df.addEdge(new Edge(df, toluca, 63.4));
        df.addEdge(new Edge(df, cuernavaca, 92.8));
        df.addEdge(new Edge(df, campeche, 1133.8));
 
        toluca.addEdge(new Edge(toluca, tabasco, 857.8));
        toluca.addEdge(new Edge(toluca, puebla, 195.1));
        toluca.addEdge(new Edge(toluca, tlaxcala, 180.7));
 
        cuernavaca.addEdge(new Edge(cuernavaca, guadalajara, 609.1));
        Graph graph = new Graph();
        graph.addNode(df);
        graph.addNode(toluca);
        graph.addNode(cuernavaca);
        graph.addNode(puebla);
        return graph;
    }
    public static void main(String[] args) {
       Graph graph = getCities();
        System.out.println(graph);
    }
}