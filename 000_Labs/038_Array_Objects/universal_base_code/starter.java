class starter {
    public static void main(String args[]) {
        int[] w = new int[100];
        int[] z = new int[100];
        for (int i = 0; i < 100; i++) {
            w[i] = (int)(Math.random() * 20) + 1;
            z[i] = (int)(Math.random() * 20) + 1;
        }
        int i = 0;
        int j = 0;
        while (i < 100 && j < 100) {
            int d = (int)(Math.random() * 10) + 1;
            w[i] -= d;
            if (w[i] < 0) {
                w[i] = 0;
            }
            System.out.println("Gandolf hits Gilmi for " + d + ", Gilmi now " + w[i]);

            if (w[i] == 0) {
                i++;
            }
            if (i >= 100) {
                break;
            }
            int e = (int)(Math.random() * 5) + 1;
            z[j] -= e;
            if (z[j] < 0) {
                z[j] = 0;
            }
            System.out.println("Gilmi hits Gandolf for " + e + ", Gandolf now " + z[j]);
            if (z[j] == 0) {
                j++;
            }
        }
        if (i >= 100) {
            int l = 100 - j;
            System.out.println("Wizards win with " + l + " left");
        } 
        else {
            int l = 100 - i;
            System.out.println("Warriors win with " + l + " left");
        }
    }
}
