package chs.model;

import java.util.ArrayList;

public class SS2 extends SeniorClass{
    ArrayList<Register> ss2 = new ArrayList<>();
    @Override
    public void snrclass(Register student) {
     ss2.add(student);
    }

    @Override
    public void setSnrStudentResult(Register pupil) {

    }
}
