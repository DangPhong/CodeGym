public class People {



    public static void main(String[] args) {
        Student student = new Student("The","female","C0519G1","CodeGym","50");
        System.out.println(student.toString());
    }

    private String name;
    private String sex;

    public People(){

    }

    public People(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nSex: " + getSex();
    }


}

class Student extends People {
    private String studentClass;
    private String school;
    private String score;

    public Student(){

    }

    public Student(String studentClass, String school, String score){
        this.studentClass = studentClass;
        this.school = school;
        this.score = score;
    }

    public Student (String name, String sex, String studentClass, String school, String score){
        super(name, sex);
        this.studentClass = studentClass;
        this.school = school;
        this.score = score;
    }


    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nClass: " + getStudentClass()
                +"\nSchool: " + getSchool()
                +"\nScore: "+ getScore();
    }
}
