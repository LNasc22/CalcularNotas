package br.pucpr.poo.Notas;

public class Homework {

    private String name;
    private float grade;

    Homework(String name) {

        this(name,0);
    }

    Homework(String name, float grade) {

        this.setName(name);
        this.setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {

        if (grade<0 || grade>10){

            this.grade=0;
        }
        else{
            this.grade = grade;
        }
    }
}
