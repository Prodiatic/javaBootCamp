
public class Courses {

	
	public Courses(String nameOfTheCourse,int courseProgress,int coursePrice,String courseCategory) 
	{
		this.nameOfTheCourse = nameOfTheCourse;
		this.courseProgress = courseProgress;
		this.coursePrice = coursePrice;
		this.courseCategory = courseCategory;
	}
	
	String nameOfTheCourse;
	int courseProgress;
	int coursePrice; 
	String courseCategory;
	/*I left the coursePrice as a string.If, god forbid, one day courses stop being free, we can still do calculations with them...*/

}
