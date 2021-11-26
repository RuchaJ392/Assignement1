class SuperDepartment
{
         
       String departmentName()
	{
		return "SuperDepartment";
	}
       String getTodaysWork()
	{
		return "No work as of now";
	}
       String getWorkDeadline()
	{
		return "NIL";
	}
       String isTodayAHoliday()
	{
		return "Today ia not a holiday";
	}
}
class AdminDepartment extends SuperDepartment 
{
        String departmentName()
	{
		return "Admin Department";
	}  
        
        String getTodaysWork()
	{
		return "Complete your document submission";
	} 
        String getWorkDeadline()
	{
		return "Complete by EOD";
	}   
}
class HRDepartment extends SuperDepartment
{
	String departmentName()
	{
		return "HR Department";
	}
	
	String getTodaysWork()
	{
     		return "Fill today's timesheet and mark your attendance";
	}
        String getWorkDeadline()
	{
		return "Complete by EOD";
	}
        String doActivity()
	{
		return "team lunch";
	}
}
 
class TechDepartment extends SuperDepartment
{
 	String departmentName()
	{
		return "Tech Department";
	}
   
        String getTodaysWork()
	{
		return "Complete coding of module 1";
	}
        
        String getWorkDeadline()
	{
		return "Complete by EOD";
	}
	
	String getTechStackInformation()
	{
		return "Core Java";
	}
}
class Main
{
        public static void main(String[] args)
	{
            AdminDepartment admin=new AdminDepartment();
            System.out.println("Welcome to"+admin.departmentName());
            System.out.println(admin.getTodaysWork());
 	    System.out.println(admin.getWorkDeadline());
            System.out.println(admin.isTodayAHoliday());
             
            HRDepartment hr=new HRDepartment();
            System.out.println("\nWelcome to"+hr.departmentName());
   	    System.out.println(hr.doActivity());
            System.out.println(hr.getTodaysWork());
 	    System.out.println(hr.getWorkDeadline());
            System.out.println(hr.isTodayAHoliday());
   
            TechDepartment tech=new TechDepartment();
            System.out.println("\nWelcome to"+tech.departmentName());
   	    System.out.println(tech.getTodaysWork());
 	    System.out.println(tech.getWorkDeadline());
            System.out.println(tech.getTechStackInformation());
            System.out.println(tech.isTodayAHoliday());
	}

}