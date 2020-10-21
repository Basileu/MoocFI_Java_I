
import java.util.ArrayList;

public class GradeRegister {
    
    private ArrayList<Integer> grades;
    private int examPoints;
    
    public GradeRegister() {
        this.grades = new ArrayList<>();
        examPoints = 0;
    }
    
    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        examPoints += points;
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        
        return count;
    }
    
    public static int pointsToGrade(int points) {
        
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        
        return grade;
    }

    public double averageOfGrades() {
        double sum = 0;
        if (grades.isEmpty()) {
            return -1;
        }
        for (Integer grade : grades) {
            sum += grade;
            
        }
        return sum/grades.size();
    }
    public double averageOfPoints() {
        if (grades.isEmpty()) {
            return -1;
        }        
        return (double)examPoints/grades.size();
    }
}
