package main;

public class MyMath {
    private int start = 0;
    private int end = 0;
    private int[] a;

    public MyMath(int c, int d, int ... a) {

        this.start = Math.min(c,d);
        this.end = Math.max(c,d);
        this.a = a;
    }

    public int collOfComponent(){
        int coll = 0;


        for(int i : a){

            if(i>start & i<end){
                coll++;
            }
        }

        return coll;
    }

}
