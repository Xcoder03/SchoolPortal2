package chs.result;

public class Result {
    private int firstTest;
    private int secondTest;
    private int examScore;
    private  int totalScore;

    public Result(int firstTest, int secondTest, int examScore) {
        this.firstTest = firstTest;
        this.secondTest = secondTest;
        this.examScore = examScore;
    }

    public Result() {
    }

    public int getFirstTest() {
        return firstTest;
    }

    public void setFirstTest(int firstTest) {
        this.firstTest = firstTest;
    }

    public int getSecondTest() {
        return secondTest;
    }

    public void setSecondTest(int secondTest) {
        this.secondTest = secondTest;
    }

    public int getExamScore() {
        return examScore;
    }

    public void setExamScore(int examScore) {
        this.examScore = examScore;
    }

    public int getTotalScore() {
        this.totalScore = getFirstTest() + getSecondTest() + getExamScore();
        return  totalScore;

    }


}
