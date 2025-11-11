package Movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Movie {
	private long id;	//영화코드
	private String title;	//영화제목
	private String genre;	//영화장르
	private static final File file = new File("movies.txt");
	
	public Movie(String title, String genre) {
		//타임스탬프 : 1970년 1월 1일 0시 0분 0초를 숫자 0으로 정하고
		//현재까지 경과된 시간을 표시
		this(Instant.now().getEpochSecond(), title, genre);
	}
	
	public Movie(long id, String title, String genre) {
		this.id = id;
		this.title = title;
		this.genre = genre;
	}
	
	//영화 추가 하기
	public void save() throws IOException {
		//FileWriter 객체에 이어쓰기 모드(true)로 설정
		FileWriter fw = new FileWriter(file, true);
		fw.write(this.toFileString() + "\n");
		fw.flush(); //버퍼 비우기
		fw.close();
	}
	
	//영화 목록 보기
	public static ArrayList<Movie> findAll() throws Exception{
		
		//영화 목록을 저장할 ArrayList를 생성
		ArrayList<Movie> movies = new ArrayList<>();
		
		//FileReader() : 문자 기반 입력 스트림(텍스트 파일의 내용을 한글자씩 읽어옴)
		//텍스트 파일의 내용을 한글자씩 읽어오므로 속도가 느림.
		//BufferedReader() : 버퍼 보조 스트림
		// read 메서드 : 문자 단위로 읽어옴
		// readLine 메서드 : 한줄 전체를 읽어서 String으로 반환
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		
		//메모장에 저장된 내용을 한 행씩 읽어와서 line에 저장
		while((line = br.readLine()) != null) {
			
			//split(",") : ,를 기준으로 문자열을 나줘줌
			String[] temp = line.split(",");
			//영화 객체 생성
			Movie m = new Movie(Long.valueOf(temp[0]), temp[1], temp[2]);
			//생성된 영화 객체를 ArrayList에 추가
			movies.add(m);
		}
		//파일 객체를 종료
		br.close();
		
		//영화 객체가 담긴 ArrayList를 반환
		return movies;
	}
	
	//영화 삭제하기
	//삭제 과정 : 삭제할 영화를 제외하고 복사하여 파일에 덮어쓰기
	public static void delete(String movieIdStr) throws IOException {
		//파일 읽어오기 위해 객체 생성
		BufferedReader br = new BufferedReader(new FileReader(file));
		String text = "";	//파일 복사를 위한 빈 문자열
		String line = null;
		
		//행단위로 반복
		while((line = br.readLine()) !=null) {
			String[] temp = line.split(",");
			
			//쉼표를 기준으로 분리한 값에서
			//삭제할 대상에 해당하는 영화를 찾으면
			//다음 반복으로 넘어감 (복사 제외)
			if(movieIdStr.equals(temp[0])) {
				continue;
			}
			//읽어온 문자열을 누적하여 복사
			text += line + "\n";
		}
		br.close();
		
		//파일을 덮어쓰기 위한 객체를 생성
		FileWriter fw = new FileWriter(file);
		fw.write(text); // 덮어쓰기
		fw.flush(); //버퍼 비우기
		fw.close(); //출력 흐름 해제
	}
	
	
	// 영화 코드에 해당하는 영화 찾기
	public static Movie findById(String movieIdStr) throws IOException{
		Movie movie = null;
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		
		while((line = br.readLine()) != null) {
			String[] temp = line.split(",");

			if (movieIdStr.equals(temp[0])) {
				movie = new Movie(Long.valueOf(temp[0]), temp[1], temp[2]);
				break;
			}
		}
		br.close();
		return movie;
	}
	
	
	
	//파일에 저장할 형식
	private String toFileString() {
		return String.format("%d,%s,%s", id, title, genre);
	}
	
	@Override
	public String toString() {
		return String.format("[%d]: %s(%s)", id, title, genre);
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}
	
	
}
