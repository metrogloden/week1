class Main {
    public static void main(String[] args) {

        String[][] twoD = new String[9][9];
        for(int i = 0; i<twoD.length; i++) {
            for(int y = 0; y<twoD[i].length; y++) {
                if(y == 2  || y == 7)
                    twoD[i][y] = "a";
                else if(i == 4) {
                    if (y > 1 && y < 7 )
                        twoD[i][y] = "3";
                    else
                        twoD[i][y] = " ";
                } else
                    twoD[i][y] = " ";
                System.out.print(twoD[i][y] + " ");
            }
            System.out.println();
        }
    }
}
