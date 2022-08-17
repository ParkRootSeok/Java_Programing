public class J19013126Q02 {
    public static void main(String[] args) {
        String num = "19013126"; System.out.println("학번 : " + num);
        String name = "박근석"; System.out.println("이름 : " + name);


        int rSum = 0;
        int intArray[][] = new int[4][];
        intArray[0] = new int[5];
        intArray[1] = new int[4];
        intArray[2] = new int[3];
        intArray[3] = new int[2];

        for (int i = 0 ; i < intArray.length ; i++) {
        	
            for (int j = 0 ; j < intArray[i].length ; j++) {
                int rNum = (int)(Math.random() * 100 + 1); // 1 ~ 100 난수 발생
                intArray[i][j] = rNum;
                rSum += rNum;
                
                System.out.printf("%d ", intArray[i][j]);
            }
            
            System.out.printf("=> Sum of this row = %d\n", rSum);
        
        }
    }
}
