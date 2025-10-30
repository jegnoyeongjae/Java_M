package day1027;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("fileName: ");

        // File f = createFile(path + s.nextLine());
        File f = createFile(s.nextLine());
        System.out.println(f.getName() + " createFile");

    }

    // 16번 라인에서 호출 이때 path 넣어줘야함.
    static File createFile(String fileName) {

        String path = "C:\\Users\\user\\Desktop\\id\\";

        try {
            if (fileName == null || fileName.trim().equals("")) {
                throw new Exception("파일 이름이 유효하지않음");
            } else {
                // 원래는 fileName += path; 로 되어 있었지만,
                // 이건 "사용자입력 + path"가 아니라 "path + 사용자입력" 이어야 정상.
                // 예: "C:\\...\\id\\abc" 형태가 되어야 하므로 순서를 바꿉니다.
                fileName = path + fileName;
            }

        } catch (Exception e) {
            /* 예외가 발생해도 return이 catch보다 우선순위가 높기 때문에 finally에 있는 return이 실행되며 정상 실행된 것으로 판단 e.printStackTrace가 무산된다. 
               이때는 printStackTrace 보다 sysout에서 Message를 쓰도록하자 
               (이거 아니었음 그냥 path에 의해서 try문의 if문이 모조리 false가 되면서 애초에 throw new Exception("파일 이름이 유횻하징낳음");  자체가 실행되지 않은것이기 때문에 
               위의 글과 같은 케이스도 있을 수 있으나 이번 케이스는 해당 되지 않음)
            */ 
            // e.printStackTrace();
            // 인줄 알았는데? message로해도 에러가 안뜸 이유를 보아하니 내가 fileName에다가 path를 더해 놔서 try의 if조건 에서 무조건 false임;;; 	 
            System.out.println(e.getMessage());

            // 기본 이름이 겹칠 경우 숫자를 붙여 중복 방지
            int num = 1; // 0부터보단 1부터 시작이 자연스러움
            File f = new File(path + "제목없음");

            //  존재하는 동안 "제목없음1", "제목없음2" ... 로 증가
            while (f.exists()) {
                f = new File(path + "제목없음" + num);
                num++;
            }
            
            /*
             - exists()메서드는 비교결과를 boolean 값으로 리턴하는 메서드지이다.
             - while의 조건은 true일 때만 실행되는것이니 그걸 이용.
             - 그리고 f = new File(path + "제목없음" + num); 새로운 파일객체 생성
             */
            // 최종적으로 존재하지 않는 파일 이름으로 설정
            fileName = f.getAbsolutePath();
            /*
             62번 라인의 행위는 기존에 있던 File f = new File(path + "제목없음"); 의 ()내부에 있는 값을 초기화 한것이란 말이 아니라 
             while에서 아예 새로 생성한 f = new File(path + "제목없음" + num); 를 가리키도록 
             즉 f에 저장된 주소값을 바꾸는거고 존에 있던 File f = new File(path + "제목없음");는 아무런 변수에도 담겨있지 않으니(가리키 않으니) garbageCollector에 지워지는 과정이다.                   
             */
            

        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }

    }

    static void createNewFile(File f) {

        try {
            f.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
