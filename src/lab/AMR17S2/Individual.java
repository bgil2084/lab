package lab.AMR17S2;

public class Individual {
    //instance fields
    private String name;
    int memNo;
    private String dOB;
    private String tier;
    private Double mileage;
    private Double points;
    private int age;

    //constructors

    public Individual(){

    }

    // getters& setter


    public void setName(String name){
        this.name = name;
    }
    public void setdOB(String dOB){
        this.dOB = dOB;
    }
    public void setMemNo(Integer memNo){
        this.memNo = memNo;
    }
    public void setTier(String tier){
        this.tier = tier;
    }
    public void setMileage(Double mileage){
        this.mileage = mileage;
    }
    public void setPoints(Double points){
        this.points = points;
    }

    public String getName(){
        return this.name;
    }
    public String getdOB(){
        return this.dOB;
    }
    public int getMemNo(){
        return this.memNo;
    }
    public String getTier(){
        return this.tier;
    }
    public Double getMileage(){
        return this.mileage;
    }
    public Double setPoints(){
        return this.points;
    }

    public String toString(){
        String output = this.name +" "+this.dOB+" "+this.memNo+" "+this.tier+" "+this.mileage+" "+this.points;
        return output;
    }


    //instance methods

    public void earnMileage(){

    }

    public void redeemPoints(){

    }
    //validations

}
