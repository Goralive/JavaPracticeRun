package gradebookTest;

import gradebook.ExaminationResults;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


public class GradebookTest {

    Map<String, Integer> finalGrads = new HashMap<>();
    ExaminationResults exam = new ExaminationResults();

    @BeforeEach
    public void setUpMap() {
        finalGrads.put("Angie", 97);
        finalGrads.put("Dave", 82);
        finalGrads.put("Lisi", 80);
        finalGrads.put("Raja", 89);
        finalGrads.put("Shashi", 79);
        finalGrads.put("Bas", 98);
        finalGrads.put("Carlos", 80);
        finalGrads.put("Amber", 95);
        finalGrads.put("Rex", 95);
        finalGrads.put("Jason", 63);
        finalGrads.put("Nikolay", 79);
    }

    @Test
    public void studentMarksTest() {
        Assertions.assertEquals(finalGrads, exam.marksAfterTwoExams());
    }
}
