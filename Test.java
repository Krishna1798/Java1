public class Test {
    public static void main(String[] args) {
        int arr[]={10,20,35,40,50,60,70,80,90,100,23,63,75,72,62,59};
        int passedStudents=0;
        int costOfScholar=0;
        int notEligible=0;
        int first, second, third;
        int highestStudentCost=0;

        int num,finalcost=0;
            if (arr.length < 3) {
                System.out.print(" Invalid Input ");
                return;
            }
            third = first = second = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > first) {
                    third = second;
                    second = first;
                    first = arr[i];
                }
                else if (arr[i] > second) {
                    third = second;
                    second = arr[i];
                }
                else if (arr[i] > third)
                    third = arr[i];

                 if(arr[i]>50 && arr[i]!=first && arr[i]!=second && arr[i]!=third){

                    passedStudents++;
                    costOfScholar=passedStudents*500;
                }
            }

            System.out.println("Three largest elements are " + first + " " + second + " " + third);
            highestStudentCost=3*1000;

            int count=0;
            for(int j=0;j<arr.length;j++){
                num=arr.length-3;
                //count++;
                finalcost=num*500;

            }

        System.out.println("Cost of student scored highest marks : "+highestStudentCost);
        System.out.println("Cost of student who are eligible : "+costOfScholar);
        int total=highestStudentCost+costOfScholar;
        System.out.println("Total cost for scholarship "+ finalcost);

        }


}
