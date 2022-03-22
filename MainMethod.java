package com.motivity2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.Scanner;

	public class MainMethod
	{
	   

		public static void main( String[] args )
	    {
	         
	        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
	        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
	        Scanner sc=new Scanner(System.in);
	        System.out.println("1:Insert 2:Delete 3:Update 4:Exit");
	        
	       
	        do {
	        	 int n=sc.nextInt();
	        switch(n) {
	        
	        case 1:
	        	System.out.println("insert student values");
	        	String query1="insert into student(student_id,student_name,student_address,student_mobile) value(?,?,?,?)";
	        int a=sc.nextInt();
	        String b=sc.next();
	        String c=sc.next();
	        String d=sc.next();
	        int result1=template.update(query1,a,b,c,d);
	        System.out.println("Number of records inserted.. "+ result1);
	        break;
	        //delete
	        case 2:
	        	System.out.println("delete student values");
	        	int m=sc.nextInt();
	        	String query2="delete from student where student_id=?";
	        int result2=template.update(query2,m);
	        System.out.println("Number of records deleted.. "+ result2);
	        break;
	        //update
	        case 3:
	        	System.out.println("update cases 1.update student_name 2.update student_address 3.update student_mobile");
	        	int k=sc.nextInt();
	        	switch(k) {
	        	
	        	
	        	case 1:
	                   System.out.println("Enter student to be updated");
	                   int h=sc.nextInt();
	                   System.out.println("update student_name");
	                   String query3="update student set student_name=? where student_id=?";
	                   String e=sc.next();//student_name
	                   int result3=template.update(query3,e,h);
	                   System.out.println("Number of records updated.. "+ result3);
	                   break;
	        case 2:
	        	
	            System.out.println("Enter student to be updated");
	            
	            int i=sc.nextInt();
	            System.out.println("update student_address");
	            String query4="update student set student_adress=? where student_id=?";
	            String f=sc.next();//student_address
	            int result4=template.update(query4,f,i);
	            System.out.println("Number of records updated.. "+ result4);
	            break;
	        case 3:
	             System.out.println("Enter student to be updated");
	             int j=sc.nextInt();
	             System.out.println("update student_mobile");
        	    String query5="update student set student_mobile=? where student_id=?";
	        
	            String g=sc.next();//student_mobile
	            int result5=template.update(query5,g,j);
	            System.out.println("Number of records updated.. "+ result5);
	            break;
	        	}
	       // case 6:String query4="select * from student";
	       // List<Student> student=new ArrayList<>();
	        case 6:java.lang.System.exit(0);
	        break;
	        
	        }
	        } while(true);
	        
	        
}
}

	        
	        
	        
	        
	        
	        
	        
