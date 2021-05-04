
public class CourseManager 
{
	
		String defaultCourseName = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� ";
		String programming = "Programlama";
		
		Courses course1 = new Courses(defaultCourseName+"(C# + ANGULAR)",9,0,programming);
		Courses course2 = new Courses(defaultCourseName+"(JAVA + REACT)",26,0,programming);
		Courses course3 = new Courses("Programlamaya Giri� i�in Temel Kurs",0,0,programming);
		
		Instructor instructor1 = new Instructor("Engin", "Demiro�");
		
		Courses[] courses = {course1,course2,course3};
		
		public void showCourse() 
		{
			for (Courses course : courses) {
				
				if(course.courseProgress > 0) 
				{
				System.out.println(course.nameOfTheCourse + " %" + course.courseProgress + " TAMAMLANDI");
				}
				else if (course.courseProgress == 0) 
				{
					System.out.println(course.nameOfTheCourse);
					// Site only prints the price tag if there is no progress instead of a "Progress : 0".
					if(course.coursePrice == 0) 
					{
						System.out.println("�CRETS�Z");
					}
					
				}
	            }
			System.out.println("The instructor for all of these courses is : "+instructor1.firstName+" "+instructor1.lastName);
			
	}
}
