package alterra.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs {
    int angka1,angka2;
    String operator;
    @When("I want count {int} and {int}")
    public void iWantCountAnd(int arg0, int arg1) {
        angka1 = arg0;
        angka2 = arg1;
    }

    @And("I using operator {string}")
    public void iUsingOperator(String arg0) {
        operator = arg0;
    }

    @Then("I receive {int} from this count")
    public void iReceiveFromThisCount(int arg0) {
        switch (operator){
            case "+" :
                if ((angka1 + angka2) == arg0){
                    System.out.println("Hasil : "+(angka1 + angka2)+ " Sesuai");
            } else {
                    System.out.println("Tidak Sesuai");
                }
                break;
            case "-" :
                if ((angka1 -angka2) == arg0){
                    System.out.println("Hasil : "+(angka1-angka2)+" Sesuai");
                }else {
                    System.out.println("Tidak Sesuai");
                }
                break;
            case "*" :
                if ((angka1 +angka2) ==arg0){
                    System.out.println("Hasil : "+(angka1*angka2)+" Sesuai");
                }else {
                    System.out.println("Tidak Sesuai");
                }
                break;
            case "/" :
                if ((angka1 / angka2) == arg0){
                    System.out.println("Hasil : "+(angka1/angka2)+" Sesuai");
                } else {
                    System.out.println("Tidak Sesuai");
                }
                break;
            default:
                System.out.println("Tidak Sesuai");
                break;
              }
    }
}

