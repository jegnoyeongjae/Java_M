package day1107;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RGBTpGray {
	// Color 객체를 이용해 픽셀의 색상을 읽어옴
	// 컬러 -> 그레이스케일(흑백) 계산하는 공식
	// Y = 0.299R + 0.587G + 0.1148
	
	// 에러: The package java.awt is not acessible이라는 에러로 패키지에 접근할 수 없다는 에러 발생
	// 원인: java11 이후 버전부터 생성한 모듈은 java.base모듈만 기본적으로 사용 가능, 때문에 java base 모듈 안에있는 java.lang/ java.math/ java.util/ java.io/ java.net/java.time등만 기본적으로 사용이 가능
	// 해결: java.awt와 java.swing을 사용하기 위해서는 java.se모듈[java.desktop(java.awt, java.swin)/ java.sql(java.sql, javax.sql)]을 따로 등록을 해줘야 한다.  즉 프로젝트 파일의 module-info 에다 	requires java.desktop; 추가를 통해 해결
	// 참고:  https://m.blog.naver.com/ka28/221946020684
	BufferedImage myImg;
	int width;
	int height;
	
	public RGBTpGray() {
		// 사진 객체 생성
		File iFile = new File("src/files/img.png");
		
		// 사진 읽어오기
		try {
			myImg = ImageIO.read(iFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
