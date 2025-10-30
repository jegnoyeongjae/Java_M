package day1030;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrListEx4 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Profile> addressBook = new ArrayList<>();
	        boolean run = true;

	        while (run) {
	            System.out.println("\n===== 주소록 메뉴 =====");
	            System.out.println("1. 추가");
	            System.out.println("2. 검색");
	            System.out.println("3. 수정");
	            System.out.println("4. 삭제");
	            System.out.println("5. 전체출력");
	            System.out.println("6. 데이터 초기화");
	            System.out.println("7. 종료");
	            System.out.print("선택: ");

	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1: // 추가
	                    System.out.print("이름: ");
	                    String name = sc.nextLine();
	                    System.out.print("전화번호: ");
	                    String phone = sc.nextLine();
	                    System.out.print("주소: ");
	                    String address = sc.nextLine();

	                    addressBook.add(new Profile(name, phone, address));
	                    System.out.println("주소록에 추가되었습니다.");
	                    break;

	                case 2: // 검색
	                    System.out.print("검색할 이름: ");
	                    String searchName = sc.nextLine();
	                    boolean found = false;
	                    for (Profile p : addressBook) {
	                        if (p.getName().equals(searchName)) {
	                            System.out.println(p);
	                            found = true;
	                        }
	                    }
	                    if (!found) {
	                        System.out.println("찾는 이름이 없습니다.");
	                    }
	                    break;

	                case 3: // 수정
	                    System.out.print("수정할 이름: ");
	                    String modifyName = sc.nextLine();
	                    boolean modified = false;
	                    for (Profile p : addressBook) {
	                        if (p.getName().equals(modifyName)) {
	                            System.out.print("새 전화번호: ");
	                            p.setPhone(sc.nextLine());
	                            System.out.print("새 주소: ");
	                            p.setAddress(sc.nextLine());
	                            System.out.println("수정 완료");
	                            modified = true;
	                        }
	                    }
	                    if (!modified) {
	                        System.out.println("수정할 이름이 없습니다.");
	                    }
	                    break;

	                case 4: // 삭제
	                    System.out.print("삭제할 이름: ");
	                    String deleteName = sc.nextLine();
	                    boolean removed = addressBook.removeIf(p -> p.getName().equals(deleteName));
	                    if (removed) {
	                        System.out.println("삭제 완료");
	                    } else {
	                        System.out.println("삭제할 이름이 없습니다.");
	                    }
	                    break;

	                case 5: // 전체 출력
	                    if (addressBook.isEmpty()) {
	                        System.out.println("주소록이 비어 있습니다.");
	                    } else {
	                        for (Profile p : addressBook) {
	                            System.out.println(p);
	                        }
	                    }
	                    break;

	                case 6: // 데이터 초기화
	                    addressBook.clear();
	                    System.out.println("주소록 초기화 완료");
	                    break;

	                case 7: // 종료
	                    run = false;
	                    System.out.println("프로그램 종료");
	                    break;

	                default:
	                    System.out.println("잘못된 선택입니다.");
	            }
	        }

	        sc.close();
	    }
}
