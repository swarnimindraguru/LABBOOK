
public class Lab6Exercise3 {
public static void main (String[] args) {
	String s="Earth";
	StringBuilder s1= new StringBuilder();
	s1.append(s);
	s1=s1.reverse();
	String str=s1.toString();
	System.out.print(s+"|"+str);
	
}
}
