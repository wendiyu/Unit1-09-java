
/****************************************************************************
 * Created by: Wendi Yu
 * Created on: Feb 21 2019
 * Created for: ICS4U
 * This program for students assignment higher marks occur more often
 ****************************************************************************/
import java.util.Random;
 public class studentAssignmentExtra {

        private static int sum = 0;
        private static int count = 0;
  
        public static void main(String[] args)
        {
        			/* generates a 4x7 array, one of them is 
        			 * belong to the students list. 
        			 * */

                     String [][] studentList = new String[4][7];
                     
                     studentList[0][0] = "Student 1:";
                     studentList[1][0] = "Student 2:";
                     studentList[2][0] = "Student 3:";
                     studentList[3][0] = "Student 4:";
                     
                     for (int i = 0; i < 4; i++){
                    	 
                            for (int j=1; j<7; j++){
                            	
                            //generate random higher numbers more often for assignment marks	
                            Random range = new Random();	          			        	
            	    		int marks = range.nextInt(100 - 80) + 80;
                            
                            // returns the string representation to int
                            studentList[i][j] = String.valueOf(marks);
                            
                            sum += marks;
                            count++;
                            
                            }
                     }
                     
                     for(int i=0; i < 4; i++){
                    	 
                           for(int j =0; j<7; j++){
                        	   
                        	   	// print out all the random number and student list
                                  System.out.print(studentList[i][j] + "   ");
                           }
                           System.out.println();
                     }
                  // print out the sum 
                     System.out.println("The sum is " + sum);
                     // print out the class average
                     System.out.println("The class average is " + sum/count);
  
         }

}
