public class Book {
    private String name;
    private int pageNumber;
    private String authorName;
    private String publishDate;

    public Book(String name, int pageNumber, String authorName, String publishDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    @Override
    public String toString(){
        String ret="";
        ret+="Kitap Adı : "+this.name+"\n";
        ret+="Sayfa sayısı : "+this.pageNumber+"\n";
        ret+="Yazarı : "+this.authorName+"\n";
        ret+="Yayınlanma tarihi : "+this.publishDate+"\n";
        return ret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
}
