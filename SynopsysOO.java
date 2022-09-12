
package synopsysoo;  

/**
 *
 * @author Alexander Zabolotnii
 */
public class SynopsysOO {

    
    public static void main(String[] args) { 
        
        //Set of unit tests, testing every class' methods and variables  
        
        //Create a university 
        University UoA = new University("University of Alberta"); 
        System.out.println(UoA.universityName); 
        
        //Create departments within said university 
        University.Department engg = UoA.new Department("Engineering"); 
        University.Department health = UoA.new Department("Health"); 
        University.Department arts = UoA.new Department("Arts"); 
        
        System.out.println("has " + engg.departmentName + ", " + health.departmentName + ", and " + arts.departmentName + " departments"); 
        
        //Create programs within a department 
        University.Department.Program elec = engg.new Program("Electrical");
        //Create a course within a program 
        University.Department.Program.Course e5909 = elec.new Course("ELEC 5909"); 
        System.out.println(engg.departmentName + " has the " + elec.programName + " program, the first class is " + e5909.courseName);
        

        //Assign 3 students and 1 teacher to ELEC 5909 
        University.Department.Program.Course.Teacher prof = e5909.new Teacher("Michael", "Mann", "mm@mail.com", 1);
        University.Department.Program.Course.Student stu1 = e5909.new Student("Howard", "Hulahoop", "hh@mail.com", 2);
        University.Department.Program.Course.Student stu2 = e5909.new Student("Vanessa", "Violin", "vv@mail.com", 3);
        University.Department.Program.Course.Student stu3 = e5909.new Student("Eric", "Elastic", "ee@mail.com", 4);
        
        System.out.println(prof.firstname + " " + prof.surname + ": " + prof.contactEmail + " - id: " + prof.id); 
        System.out.println(stu1.firstname + " " + stu1.surname + ": " + stu1.contactEmail + " - id: " + stu1.id); 
        System.out.println(stu2.firstname + " " + stu2.surname + ": " + stu2.contactEmail + " - id: " + stu2.id); 
        System.out.println(stu3.firstname + " " + stu3.surname + ": " + stu3.contactEmail + " - id: " + stu3.id); 
        
        //One of each type of Assessment: Lab Assignment, Quiz, Exam 
        University.Department.Program.Course.LaboratoryAssignment ray = e5909.new LaboratoryAssignment("Resistors and You", "DICE 5901"); 
        University.Department.Program.Course.Quiz rq = e5909.new Quiz("Resistors Quiz", "2021-09-07"); 
        University.Department.Program.Course.Exam re = e5909.new Exam("Resistors Exam", "2021-11-21"); 
        
        //Students work through assessments 
        stu1.takeTest(ray); stu1.takeTest(rq); stu1.takeTest(re);
        System.out.print("Student: " + stu1.firstname + " " + stu1.surname + "\nTranscript:" + stu1.getTranscript() + "\n");

        //Test if Exam's getDate and setDate strings work 
        System.out.println(re.assessmentName + " is scheduled for " + re.getDate()); 
        re.setDate("2022-10-31");
        System.out.println(re.assessmentName + " is now scheduled for " + re.getDate()); 
        

    }// end of main function 
    
}// end SynopsysOO class 
