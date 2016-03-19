package at.becast.youploader.youtube.data;

public class Video {
  public final Snippet snippet;
  public final Status status;

  public static class Snippet {
    public String title;
    public String description;
    public String[] tags;
    public int categoryId;

    public Snippet(String title, String description, String[] tags, int categoryId) {
      this.title = title;
      this.description = description;
      this.tags = tags;
      this.categoryId = categoryId;
    }
    
    public Snippet(){
    	
    }
  }

  public static class Status {
    public String privacyStatus;
    public boolean embeddable;
    public String license;
    public String publishAt;

    public Status(String privacyStatus, boolean embeddable, String license) {
      this.privacyStatus = privacyStatus;
      this.embeddable = embeddable;
      this.license = license;
    }
    
    public Status(){
    	
    }
    
    public void setPublishDate(String date){
    	this.privacyStatus = "private";
    			//String pattern = "yyyy-MM-dd'T'HH:mm:ss.sssZ";
    	this.publishAt = date;
    }

  }
  

  public Video() {
    this.snippet = new Snippet(
      null,
      "",
      new String[0],
      20
    );
    this.status = new Status(
      "private",
      true,
      "youtube"
    );
  }
}
