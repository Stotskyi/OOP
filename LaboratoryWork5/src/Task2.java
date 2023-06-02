public class Task2 {
    private int first,second,third;
    public Task2(int First,int Second,int Third) {
        first = First;
        second = Second;
        third = Third; 
    }
    public Task2() {
    }

    public void GetTheSmallestNumber(){
        System.out.println("The smalllest number is: " + CalculateSMallestNumber(first,second,third));
    }
    private int CalculateSMallestNumber(int f,int s,int t){
        if(f < s && f < t){
            return f;
        }
        else if(s < f && s < t){
            return s;
        }
        else{
            return t;
        }
    }

    public void Init(){
        Task2 a = new Task2(1,676,235);
        a.GetTheSmallestNumber();
    }
}
