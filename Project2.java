import java.util.Scanner;
class Sample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Get to know the level of your knowledge in SSLC");
		System.out.println("Enter your marks obtained in exams(out of 100)");
        System.out.print("Enter your tamil marks: ");
        int lan_mark = sc.nextInt();
		System.out.print("Enter english marks: ");
		int eng_mark = sc.nextInt();
		System.out.print("Enter mathematics marks: ");
        int mat_mark = sc.nextInt();
		System.out.print("Enter science marks: ");
		int sci_mark = sc.nextInt();
		System.out.print("Enter social science marks: ");
		int soc_mark = sc.nextInt();
        int total = lan_mark+eng_mark+mat_mark+sci_mark+soc_mark;
		float avg = total/5;
        char grade;
        if (avg >= 90){
            grade = 'O';
        } 
		else if (avg >= 80 && avg < 90){
            grade = 'A';
        } 
		else if (avg >= 70 && avg < 80){
            grade = 'B';
        }
		else if (avg >= 60 && avg < 70){
            grade = 'C';
        }
		else if (avg >= 50 && avg < 60){
            grade = 'D';
        }
		else{
            grade = 'F';
        }
		System.out.println("-----------------------------------------------------");
		System.out.println("SUBJECT " +"\t"+"MARKS");
		System.out.println("-----------------------------------------------------");
		System.out.println("Tamil "+"\t"+"\t"+lan_mark);
		System.out.println("English " +"\t"+eng_mark);
		System.out.println("Mathematics " +"\t"+mat_mark);
		System.out.println("Science " +"\t"+sci_mark);
		System.out.println("Social science " +"\t"+soc_mark);
		System.out.println("-----------------------------------------------------");
		System.out.println("TOTAL "+"\t"+"\t"+total);
		System.out.println("-----------------------------------------------------");
		System.out.println("AVERAGE " +"\t"+avg);
		System.out.println("GRADE  "+"\t"+"\t"+grade);
		System.out.println("-----------------------------------------------------");
    }
}
