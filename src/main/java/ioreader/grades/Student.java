package ioreader.grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> gradeList;

    public Student(String name, List<Integer> gradeList) {
        this.name = name;
        this.gradeList = gradeList;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGradeList() {
        return new ArrayList<>(gradeList);
    }

    public double average() {
        double sum = 0;
        for (Integer grade : gradeList) {
            sum += grade;
        }
        return sum / gradeList.size();
    }

    public boolean isIncreasing() {
        for (int i = 1; i < gradeList.size(); i++) {
            if (gradeList.get(i) < gradeList.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
