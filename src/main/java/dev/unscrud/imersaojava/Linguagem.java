package dev.unscrud.imersaojava;

public class Linguagem {
  private final String title;
  private final String image;
  private final int ranking;

  public Linguagem(String title, String image, int ranking) {
    this.title = title;
    this.image = image;
    this.ranking = ranking;
  }

  public String getTitle() {
    return title;
  }

  public String getImage() {
    return image;
  }

  public int getRanking() {
    return ranking;
  }

}
