public class RealImage implements Image{
    private final String filename;

    public RealImage(String filename){
        this.filename = filename;
        loadFromMemory();
    }

    public void loadFromMemory(){
        System.out.println("Loading image from filename " + this.filename);
    }

    @Override
    public void display() {
        System.out.println("Exibindo imagem: " + this.filename);
    }
}
