package day1020;

public class Webtoon {

    private String title;
    private String cate;
    private String auther;

    public Webtoon(String title, String cate, String auther) {
        this.title = title;
        this.cate = cate;
        this.auther = auther;
    }

    public String getInfo() {
        return "Webtoon { 제목 : " + title + ", 장르 : " + cate + ", 작가 : " + auther + "}";
    }
	
	
}
