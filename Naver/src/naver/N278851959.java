package naver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner; 
class PatientInfo { 
   private String name; 
   private boolean gender; 
   private int reason, age; 
   public String get_name() { 
      return name; 
   } 
   public void set_name(String name) { 
      this.name = name; 
   } 
   public String get_gender() { 
      String male = "남"; 
      String female = "여"; 
      if (gender == true) 
      return male; 
      else 
      return female; 
   } 
   public void set_gender(boolean gender) { 
      this.gender = gender; 
   } 
   public String get_reason() { 
      String cold = "감기"; 
      String stomach = "배탈"; 
      String head = "두통"; 
      String sprain = "염좌"; 
      String back = "요통"; 
      if (reason == 1) 
      return cold; 
      else if (reason == 2) 
      return stomach; 
      else if (reason == 3) 
      return head; 
      else if (reason == 4) 
      return sprain; 
      else 
      return back; 
   } 
   public void set_reason(int reason) { 
      this.reason = reason; 
   } 
   public int get_age() { 
      return age; 
   } 
   public void set_age(int age) { 
      this.age = age; 
   } 
} 
public class N278851959 { 
   static ArrayList<PatientInfo> patient = new ArrayList<PatientInfo>(); 
   static PatientInfo a = new PatientInfo(); 
   static int change(String reason) { 
      if (reason == "감기") 
      return 1; 
      else if (reason == "배탈") 
      return 2; 
      else if (reason == "두통") 
      return 3; 
      else if (reason == "염좌") 
      return 4; 
      else 
      return 5; 
   } 
   static int changebool(String gender) { 
      if (gender == "남") 
      return 1; 
      else 
      return 0; 
   } 
   static void compare() { 
      PatientInfo a = new PatientInfo(); 
      PatientInfo temp=new PatientInfo(); 
      PatientInfo temp2=new PatientInfo(); 
      int input; 
      int i, j; 
      Scanner s = new Scanner(System.in); 
      System.out.printf("환자를 어떤 순서대로 정렬하시겠습니까?(1.나이 2.성별 3.증상)>> "); 
      input = s.nextInt(); 
      switch (input) { 
         case 1: 
         System.out.println("나이순으로 정렬합니다."); 
         //AgeAsc(); 
         for (i = 0; i < patient.size(); i++) { 
            for (j = i + 1; j <patient.size(); j++) { 
               if (patient.get(i).get_age() >patient.get(j).get_age()) { 
                  temp = patient.get(i); 
                  patient.set(i, patient.get(j));
                  patient.set(j, temp);
               } 
            } 
         } 
         PrintPatient(); 
         break; 
         case 2: 
         System.out.println("성별순으로 정렬합니다."); 
         //GenderAsc(); 
         for (i = 0; i < patient.size(); i++) { 
             for (j = i + 1; j <patient.size(); j++) { 
                if (patient.get(i).get_age() >patient.get(j).get_age()) { 
                   temp = patient.get(i); 
                   patient.set(i, patient.get(j));
                   patient.set(j, temp);
                } 
             } 
          } 
         PrintPatient(); 
         break; 
         case 3: 
         System.out.println("증상순으로 정렬합니다."); 
         //ReasonAsc(); 
         /* 
         * for (i = 0; i < patient.size(); i++) { for (j = i + 1; j < 
            * patient.size(); j++) { if (change(patient.get(i).get_reason()) > 
               * change(patient.get(j).get_reason())) { temp2 = 
                  * change(patient.get(i).get_reason()); 
                  * patient.get(i).set_reason(change(patient.get(j).get_reason())); 
               * patient.get(j).set_reason(temp2); } } } 
               */ 
               System.out.println("정렬되었습니다."); 
               PrintPatient(); 
               break; 
               default: 
               return; 
            } 
         } 
         static int PrintMenu() { 
            int menu; 
            Scanner s = new Scanner(System.in); 
            System.out.println("============================================================"); 
            System.out.println("1.환자조회   2.환자등록   3.환자정보수정   4.환자삭제   5.처방전   6.정렬   0.종료"); 
            System.out.println("============================================================"); 
            System.out.printf(">>> "); 
            menu = s.nextInt(); 
            return menu; 
         } 
         static void NewPatient() { 
            Scanner s = new Scanner(System.in); 
            PatientInfo a = new PatientInfo(); 
            String temp; 
            boolean gender; 
            System.out.printf("이름 : "); 
            String name = s.next(); 
            System.out.printf("성별 (남/여) : "); 
            temp = s.next(); 
            if (temp.equals("남")) 
            gender = true; 
            else 
            gender = false; 
            System.out.printf("증상 (1.감기  2.배탈  3.두통  4.염좌  5.요통) : "); 
            int reason = s.nextInt(); 
            System.out.printf("나이 : "); 
            int age = s.nextInt(); 
            a.set_name(name); 
            a.set_gender(gender); 
            a.set_reason(reason); 
            a.set_age(age); 
            patient.add(a); 
         } 
         static void PrintPatient() { 
            if (patient.size() == 0) 
            System.out.println("등록된 환자가 없습니다."); 
            else { 
               System.out.println("총인원수 : " + patient.size()); 
               System.out.println(" 번호\t이름\t나이\t성별\t증상"); 
               System.out.println("----------------------------------"); 
               int i; 
               for (i = 0; i < patient.size(); i++) { 
                  a = patient.get(i); 
                  System.out.println("[" + (i + 1) + "]\t" + a.get_name() + "\t" + a.get_age() + "\t" + a.get_gender() 
                  + "\t" + a.get_reason()); 
               } 
            } 
         } 
         static void ModPatient() { 
            Scanner s = new Scanner(System.in); 
            PrintPatient(); 
            String temp; 
            System.out.printf("변경할 환자번호>>"); 
            int InputNum = s.nextInt(); 
            System.out.printf("변경할 항목(1.이름  2.나이  3.성별  4.증상)>>"); 
            int ChangeNum = s.nextInt(); 
            switch (ChangeNum) { 
               case 1: 
               System.out.printf("변경할 이름>>"); 
               patient.get(InputNum - 1).set_name(s.next()); 
               break; 
               case 2: 
               System.out.printf("변경할 나이>>"); 
               patient.get(InputNum - 1).set_age(s.nextInt()); 
               break; 
               case 3: 
               System.out.printf("변경할 성별(남/여)>>"); 
               temp = s.next(); 
               if (temp.equals("남")) 
               patient.get(InputNum - 1).set_gender(true); 
               else if (temp.equals("여")) 
               patient.get(InputNum - 1).set_gender(false); 
               break; 
               case 4: 
               System.out.printf("변경할 증상(1.감기  2.배탈  3.두통  4.염좌  5.요통)>>"); 
               patient.get(InputNum - 1).set_reason(s.nextInt()); 
               break; 
               default: 
               System.out.printf("잘못된 숫자를 입력하였습니다."); 
            } 
            System.out.println("변경되었습니다"); 
         } 
         static void DelPatient() { 
            Scanner s = new Scanner(System.in); 
            PrintPatient(); 
            System.out.printf("삭제할 환자번호>>"); 
            int input; 
            input = s.nextInt(); 
            System.out.printf("%s 환자를 정말로 삭제하시겠습니까?(y/n)>>", a.get_name()); 
            String choice; 
            choice = s.next(); 
            if (choice.equals("y")) { 
               patient.remove(input - 1); 
               System.out.println("삭제되었습니다."); 
            } else if (choice.equals("n")) 
            System.out.println("삭제하지 않고 다시 메뉴로 돌아갑니다."); 
            else 
            System.out.printf("잘못된 입력을 하였습니다. 메뉴로 돌아갑니다."); 
         } 
         static void prescription() { 
            Scanner s = new Scanner(System.in); 
            PrintPatient(); 
            String cold = "감기"; 
            String stomach = "배탈"; 
            String head = "두통"; 
            String sprain = "염좌"; 
            String back = "요통"; 
            System.out.printf("처방전을 발행할 환자 번호>>"); 
            int input = s.nextInt(); 
            System.out.println("---------------처방전---------------"); 
            System.out.println("이름:" + patient.get(input - 1).get_name() + "   나이:" + patient.get(input - 1).get_age() 
            + "   성별:" + patient.get(input - 1).get_gender()); 
            if (patient.get(input - 1).get_reason().equals(cold)) { 
               if (patient.get(input - 1).get_age() <= 15) 
               System.out.println("위 환자에게는 \"감기약 반 개\"를 처방한다."); 
               else if (patient.get(input - 1).get_age() >= 60) 
               System.out.println("위 환자에게는 \"감기약 한 개\"를 처방한다."); 
               else 
               System.out.println("위 환자에게는 \"감기약 두 개\"를 처방한다."); 
               } else if (patient.get(input - 1).get_reason().equals(stomach)) { 
               if (patient.get(input - 1).get_age() <= 15) 
               System.out.println("위 환자에게는 \"설사약 반 개\"를 처방한다."); 
               else if (patient.get(input - 1).get_age() >= 60) 
               System.out.println("위 환자에게는 \"설사약 한 개\"를 처방한다."); 
               else 
               System.out.println("위 환자에게는 \"설사약 두 개\"를 처방한다."); 
               } else if (patient.get(input - 1).get_reason().equals(head)) { 
               if (patient.get(input - 1).get_age() <= 15) 
               System.out.println("위 환자에게는 \"두통약 반 개\"를 처방한다."); 
               else if (patient.get(input - 1).get_age() >= 60) 
               System.out.println("위 환자에게는 \"두통약 한 개\"를 처방한다."); 
               else 
               System.out.println("위 환자에게는 \"두통약 두 개\"를 처방한다."); 
               } else if (patient.get(input - 1).get_reason().equals(sprain)) { 
               if (patient.get(input - 1).get_age() <= 15) 
               System.out.println("위 환자에게는 \"소염제 반 개\"를 처방한다."); 
               else if (patient.get(input - 1).get_age() >= 60) 
               System.out.println("위 환자에게는 \"소염제 한 개\"를 처방한다."); 
               else 
               System.out.println("위 환자에게는 \"소염제 두 개\"를 처방한다."); 
               } else if (patient.get(input - 1).get_reason().equals(back)) { 
               if (patient.get(input - 1).get_age() <= 15) 
               System.out.println("위 환자에게는 \"파스 반 개\"를 처방한다."); 
               else if (patient.get(input - 1).get_age() >= 60) 
               System.out.println("위 환자에게는 \"파스 한 개\"를 처방한다."); 
               else 
               System.out.println("위 환자에게는 \"파스 두 개\"를 처방한다."); 
            } else 
            System.out.println("잘못된 숫자를 입력하였습니다."); 
         } 
         static void ReasonAsc() { 
            Comparator<PatientInfo> sort = new Comparator<PatientInfo>() { 
               @Override 
               public int compare(PatientInfo a, PatientInfo b) { 
                  // TODO Auto-generated method stub 
                  return ((Integer) change(a.get_reason())).compareTo((Integer) change(b.get_reason())); 
               } 
            }; 
            Collections.sort(patient, sort); 
         } 
         static void AgeAsc() { 
            Comparator<PatientInfo> sort = new Comparator<PatientInfo>() { 
               @Override 
               public int compare(PatientInfo a, PatientInfo b) { 
                  // TODO Auto-generated method stub 
                  return ((Integer) a.get_age()).compareTo((Integer) b.get_age()); 
               } 
            }; 
            Collections.sort(patient, sort); 
         } 
         static void GenderAsc() { 
            Comparator<PatientInfo> sort = new Comparator<PatientInfo>() { 
               @Override 
               public int compare(PatientInfo a, PatientInfo b) { 
                  // TODO Auto-generated method stub 
                  return ((Integer) changebool(a.get_gender())).compareTo((Integer) changebool(b.get_gender())); 
               } 
            }; 
            Collections.sort(patient, sort); 
         } 
         public static void main(String[] args) { 
            int menu; 
            while (true) { 
               menu = PrintMenu(); 
               if (menu == 0) { 
                  System.out.println("프로그램을 종료합니다. 감사합니다!!"); 
                  return; 
               } 
               switch (menu) { 
                  case 1: 
                  PrintPatient(); 
                  break; 
                  case 2: 
                  NewPatient(); 
                  System.out.println("정보가 입력되었습니다!"); 
                  break; 
                  case 3: 
                  ModPatient(); 
                  break; 
                  case 4: 
                  DelPatient(); 
                  break; 
                  case 5: 
                  prescription(); 
                  break; 
                  case 6: 
                  compare(); 
                  break; 
                  default: 
                  System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요."); 
               } 
            } 
         } 
      } 