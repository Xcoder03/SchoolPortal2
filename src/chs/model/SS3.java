package chs.model;

import java.util.ArrayList;

public class SS3 extends SeniorClass{
    ArrayList<Register> ss3 = new ArrayList<>();

    @Override
    public void snrclass(Register student) {
        ss3.add(student);
    }

    @Override
    public void setSnrStudentResult(Register pupil) {

    }
}
