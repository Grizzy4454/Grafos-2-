public class Arista {

    private Vertice initialVertice;
    private Vertice finalVertice;
    private int weight;

    public Arista(Vertice initialVertice, Vertice finalVertice, int weight){
        this.initialVertice = initialVertice;
        this.finalVertice = finalVertice;
        this.weight = weight;
    }
    public  Vertice getInitialVertice(){
        return this.initialVertice;
    }
    public Vertice getFinalVertice(){
        return this.finalVertice;
    }
    public int getWeight(){
        return this.weight;
    }
}