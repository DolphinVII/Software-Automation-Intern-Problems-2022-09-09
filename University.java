package synopsysoo;
import java.util.ArrayList; // import the ArrayList class, specifically for to store the Student Transcript

//Nested 
public class University {
    // Insert relevant data for a university 
    String universityName; 
    
    public University(String n){
        universityName = n; 
    }//end university constructor 
    
    
    public class Department {
        String departmentName;  
    
        public Department(String n){
            departmentName = n;  
        } // end department constructor 
    
        
        public class Program {
            String programName; 
            
            public Program(String n){
                programName = n; 
            }//end program constructor
            
            
            public class Course {
                String courseName; 
                
                public Course(String n){
                    courseName = n; 
                }// end course constructor 
                // Each course has people and assessments associated with them 
                // The person class has Student and Teacher subclasses. 
                // Assessments has LaboratoryAssignments, Quiz, and Exam subclasses 
                
                public class Person {
                    String firstname; 
                    String surname;
                    String contactEmail; 
                    int id; 
                    
                    public Person(String fn, String ln, String ce, int iden){
                        firstname = fn; 
                        surname = ln; 
                        contactEmail = ce; 
                        id = iden; 
                    }//end person constructor 
                                    
                }//end Person Class  
                ////////////////////////////////////////////////////////////////
                
                class Teacher extends Person{
                        
                        Teacher(String fn, String ln, String ce, int iden){
                            super(fn, ln, ce, iden); 
                        }//end Teacher constructor 
                        
                    }//end teacher Class
                
                class Student extends Person{ 
                        //using an Array List to accomodate the increasing number of Assessments a student must accomplish  
                        private ArrayList<String> transcript = new ArrayList<String>();  
                        //Made private to prevent it from being rewritten outside of this class for security reasons. 
                        
                        
                        Student(String fn, String ln, String ce, int iden){
                            super(fn, ln, ce, iden); 
                        }//end student constructor 
                        
                        
                        //Here is a function that simulates aa 
                        public String takeTest(Assessment a){
                            //Here would be the place to put code for for an online test
                            //That is outside the scope of this project, so it just returns "DNF" 
                            String grade = "DNF"; 
                            transcript.add(a.assessmentName + ": " + grade); 
                            return grade; 
                        }// end takeTest function       
                        
                        public ArrayList<String> getTranscript(){
                        return transcript; //This allows the transcript to be accessed without being able to rewrite it.
                        }// end getTranscript
                        
                    }//end student class  
                
                public class Assessment {
                    String assessmentName; 
                    
                    public Assessment(String n){
                        assessmentName = n; 
                    }//end assessment constructor                
                }//end Asssessment Class 
                
                
                class LaboratoryAssignment extends Assessment{
                        String labLocation; 
                        LaboratoryAssignment(String n, String ll){super(n); labLocation = ll;} // end of LaboratoryAssignment constructor 
                    }//end LaboratoryAssignment Class 
    
                    class Quiz extends Assessment{
                        String date;
                        Quiz(String n, String d){super(n); date = d;}//end of Quiz constructor 
                    }//end Quiz Class 
    
                    class Exam extends Assessment{
                        private String date;
                        Exam(String n, String d){super(n); date = d;}//end of Exam constructor 
                        
                        public String getDate(){return date;} //function to get the date, as it cannot be accessed otherwise
                        public void setDate(String d){date = d;} //sets the private variable 
                    }//end Exam Class 
                
            }// end Course Class 
        }  //end Program Class 
    }// end Department Class    
}//end University Class 
