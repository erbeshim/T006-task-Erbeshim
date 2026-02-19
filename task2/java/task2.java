
void main() {
    int[] arr = {1,1,5,7,13};
    boolean inc = true;
    for(int i =0;i < arr.length-2; i++) {
        int a = arr[i];
        int b = arr[i+1];
        int c = arr[i+2];
        if(a>=b){
            inc = false;
            break;
        }
        if (b>=c){
            inc=false;
            break;
        }
    }
    if(inc){
        System.out.println("YES");
    }
    else {
        System.out.println("NO");
    }


}
