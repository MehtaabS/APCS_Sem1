class starter {
    public static void main(String args[]) {
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 10) + 1;
        }
        System.out.print("Array ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int t = (int)(Math.random() * 10) + 1;
        System.out.println("Target " + t);
        int count = 0;
        System.out.print("Indexes ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == t) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total duplicates " + count);
        System.out.println("Consecutive duplicates");
        int c = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println(a[i] + " at indexes " + i + " and " + (i + 1));
                c++;
            }
        }
        if (c == 0) {
            System.out.println("None found.");
        }
    }
}
