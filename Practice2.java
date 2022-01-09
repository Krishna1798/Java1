public class Practice2 {
    public static void main(String[] args){
        String s="123456789";
        char[] ch=s.toCharArray();
        int a=0;
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
            a=Integer.parseInt(String.valueOf(ch[i]));

        }
        System.out.print(a+" ");
/*
        a = 1, if i> 5
        a = 0, otherwise*/

        System.out.println();
        int b=1;
        int i=6;
        System.out.println((i>5)?(b=1):(b=0));

        /*Given String 's', validate s on following conditions
        print summer, s = hot
        print winter, s = cold
        print rainy,  s = humid*/

        String s1="hot";
        //Scanner sc=new Scanner()
       /* if(s1=="hot"){
            System.out.println("Weather is summer!");
        }else if(s1=="cold"){
            System.out.println("Wether is winter!");
        }else if(s1=="humid"){
            System.out.println("Wether is rainy!");
        }*/
        switch (s1){
            case "hot":
                System.out.println("Weather is summer!");
                break;
            case "cold":
                System.out.println("Weather is summer!");
                break;
            case "humid":
                System.out.println("Weather is summer!");
                break;
            default:
                System.out.println("Inapprpriate input!");

        }
        //int[][] arr=new int[2][2];
        /*int[][] arr={{2,3,1},{7,5,3},{5,8,3},{1,2,5}};
        Arrays.sort(arr);
        System.out.println("Smallest element : "+arr[0]);*/

       /* Scanner sc= new Scanner(System.in);
        System.out.println("ENter elements in array : ");
        for(int j=0;j<arr.length;j++){

        }*/


        System.out.println("Hello"+1+2+3);

    }

}
