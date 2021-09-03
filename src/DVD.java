public class DVD {
    private String name;
    private int releaseYear;
    private String director;

    public DVD(String name, int releaseYear, String director){
        this.name=name;
        this.releaseYear=releaseYear;
        this.director=director;
    }

    public String toString(){
        System.out.println(
                this.name + ", directed by "+ this.director+ ", released in " + this.releaseYear );
        return this.name + ", directed by "+ this.director+ ", released in " + this.releaseYear;
    }
}
