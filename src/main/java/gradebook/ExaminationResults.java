package gradebook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExaminationResults {
    public Map<String, Integer> getOriginalGrades() {

        Map grades = new HashMap();
        grades.put("Angie", 24);
        grades.put("Dave", 32);
        grades.put("Lisi", 80);
        grades.put("Raja", 50);
        grades.put("Shashi", 79);
        grades.put("Bas", 40);
        grades.put("Carlos", 59);
        grades.put("Amber", 55);
        grades.put("Rex", 95);
        grades.put("Jason", 63);
        grades.put("Nikolay", 32);

        return grades;
    }

    public Map<String, Integer> getMakeUpGrades() {

        Map grades = new HashMap();
        grades.put("Angie", 97);
        grades.put("Dave", 82);
        grades.put("Lisi", 76);
        grades.put("Raja", 89);
        grades.put("Shashi", 79);
        grades.put("Bas", 98);
        grades.put("Carlos", 80);
        grades.put("Amber", 95);
        grades.put("Rex", 90);
        grades.put("Jason", 62);
        grades.put("Nikolay", 79);

        return grades;
    }

    public Map<String, Integer> marksAfterTwoExams() {
        Map<String, Integer> firstExam = getOriginalGrades();
        Map<String, Integer> secondExam = getMakeUpGrades();

        for (var student : secondExam.entrySet()) {
            Integer firstMark = firstExam.get(student.getKey());
            Integer secondMark = secondExam.get(student.getKey());

            if (firstMark < secondMark) {
                firstExam.put(student.getKey(), secondMark);
            }
        }
        return firstExam;
    }
}


