package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("loading data from file");
    }

    @Override
    public void remove() {
        System.out.println("removing data from file");
    }
}
