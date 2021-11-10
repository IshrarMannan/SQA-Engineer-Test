
package students;

import java.util.*;

class StudentInfo{
   private int id;
   private String fname;
   private float cgpa;
   public StudentInfo(int id, String fname, float cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public float getCgpa() {
      return cgpa;
   }
}
public class Students {

    public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	      int num= Integer.parseInt(in.nextLine());
	      
	      List<StudentInfo> studentList = new ArrayList<>();
	      while(num>0){
	         int id = in.nextInt();
	         String fname = in.next();
	         float cgpa = in.nextFloat();
	         
	         StudentInfo st = new StudentInfo(id, fname, cgpa);
	         studentList.add(st);
	         
	         num--;
	      }
	       Collections.sort(studentList, (StudentInfo s1, StudentInfo s2) -> {
                   if(s2.getCgpa()>s1.getCgpa()){
                       return 1;
                   }else if(s2.getCgpa()<s1.getCgpa()){
                       return -1;
                   }
                   return s1.getFname().compareTo(s2.getFname());
              });
               
                System.out.println("Output:");	      
	        for(StudentInfo st: studentList){
	        System.out.println(st.getFname());
	      }
    }
    
}
