import java.util.ArrayList;

public class Student {

	String Name;
	int id;
	String Location;
	
	public Student(String Name, int id, String Location) {
		this.Name=Name;
		this.id=id;
		this.Location=Location;
	}

	//toString() method returning string type data
	public String toString(){
		
		//return this.Name+""+this.id+""+this.Location;
		return "("+Name+","+id+","+Location+")";
		
	}

	public static void  main(String args[]){
		String searchString="Suraj";
		ArrayList<Student> al=new ArrayList<Student>();
		Student s=new Student("Suraj1",101,"Mumbai");
		Student s1=new Student("Sam",102,"Bangalore");
		Student s2=new Student("Rose",103,"Delhi");
		Student s3=new Student("Risa",104,"Rajkot");
		Student s4=new Student("Ram",105,"Patna");
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		String S1="";
		//for(int i=0;i<al.size();i++)
		for(Student student:al){
			S1=student.toString();
			char[] cc=S1.toCharArray();
			for(char c:cc){
			if(c>=48&&c<=57)
			System.out.println("Invalid Data");
			break;
			}
			 if(S1.contains(searchString))
			System.out.println(student.toString());
			
		}
	
}
}
