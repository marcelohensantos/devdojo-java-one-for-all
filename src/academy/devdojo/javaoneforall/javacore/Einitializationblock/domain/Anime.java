package academy.devdojo.javaoneforall.javacore.Einitializationblock.domain;

public class Anime {
    private String name;
    private int[] episodes;

    // 1 - Memory allocated
    // 2 - Each class attribute is initialized
    // 3 - Init block is executed
    // 4 - The constructor is initialized
    {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : episodes) {
            System.out.println(episode + " ");
        }
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
