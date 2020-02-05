public class Member extends Person{
    private Boolean isBasic;

    public String getMemberType(){
        if (isBasic) {
            return "Basic";
        } else {
            return "Full";
        }
    }

    public int monthlyFee(){
        if (isBasic) {
            return 199;
        } else{
            return 299;
        }
    }

}
