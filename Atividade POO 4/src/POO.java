package br.pucpr.poo.Notas;

public class POO {

    private float ra01,ra02,ra03,ra04;

    public POO() {
        this.ra01 = 0;
        this.ra02 = 0;
        this.ra03 = 0;
        this.ra04 = 0;
    }

    public POO(float ra01, float ra02, float ra03, float ra04) {
        this.ra01 = ra01;
        this.ra02 = ra02;
        this.ra03 = ra03;
        this.ra04 = ra04;
    }

    public float getRa01() {
        return ra01;
    }

    public void setRa01(float ra01) {
        this.ra01 = ra01;
    }

    public float getRa02() {
        return ra02;
    }

    public void setRa02(float ra02) {
        this.ra02 = ra02;
    }

    public float getRa03() {
        return ra03;
    }

    public void setRa03(float ra03) {
        this.ra03 = ra03;
    }

    public float getRa04() {
        return ra04;
    }

    public void setRa04(float ra04) {
        this.ra04 = ra04;
    }

    public float calc(float nota, float peso){
        return nota*peso;
    }

    public String calcNotaFinal() {
        return String.valueOf(Math.round(((ra01*.15)+(ra02*.35)+(ra03*.35)+(ra04*.15))*100f)/100f);
    }
}
