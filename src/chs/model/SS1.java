package chs.model;

import java.util.ArrayList;

public class SS1 extends SeniorClass{
    ArrayList<Register> ss1 = new ArrayList<>();
    @Override
    public void snrclass(Register student) {
    ss1.add(student);
    }

    @Override
    public void setSnrStudentResult(Register pupil) {

    }
}
