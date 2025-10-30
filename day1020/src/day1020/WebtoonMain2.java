package day1020;

public class WebtoonMain2 {

	public static void main(String[] args) {

		
		Webtoon w1 = new Webtoon("나혼자만 레벨업!", "판타지", "나혼자");
        Webtoon w2 = new Webtoon("스위트 집", "스릴러", "김달콤");
        Webtoon w3 = new Webtoon("이태원 클래식", "드라마", "이태원");

        // 정ㅅ후값을 지정하는 배열
        // int[] arr = {10,20,30};
        // webtoon값을 저장하는 배열
        
        Webtoon[] webtoons = { w1, w2, w3 };

        
        for (Webtoon w : webtoons) {
            System.out.println(w.getInfo());
        }

        System.out.println("총 웹툰의 수 : " + webtoons.length);
	}

}
