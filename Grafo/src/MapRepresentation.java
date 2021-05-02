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
 
        df.addEdge(new Edge(df, toluca, 100));
        df.addEdge(new Edge(df, cuernavaca, 90));
        df.addEdge(new Edge(df, campeche, 1133.8));
 
        toluca.addEdge(new Edge(toluca, cuernavaca, 150));
        toluca.addEdge(new Edge(toluca, puebla, 350));
        toluca.addEdge(new Edge(toluca, tlaxcala, 340));
 
        cuernavaca.addEdge(new Edge(cuernavaca, puebla, 100));
 
        puebla.addEdge(new Edge(puebla, tlaxcala, 20));
 
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