 String[] wordDict = {"friends", "Phoebe", "broke", "after", "cafe",
                "sad", "lived", "Monica", "promised", "went", "happily",
                "Joey", "Chandler", "to", "up", "remained", "forever"};

        int a = 0;
        int b = wordDict.length;

        System.out.println(b);   // QUESTION 1, 20 points
        int i = 0;
        int j = 0;

        int[] M = {11, 9, 6, 55, 77, 3, 10, 5, 99, 5, 7, 3, 7, 13, 11, 16, 1};
        System.out.println(M.length); // QUESTION 2, 20 points

        String text = "";

        while (i <= a) {
            text = text + "Ross ";
            text = text + "and ";
            text = text + "Rachel ";
            System.out.println(text);  // QUESTION 3, 30 points

            while (j < b) {
                if (M[j] % 2 == 0) {
                    text = text + wordDict[M[j]];
                    text = text + " ";
                }
                j = j + 1;
            }
            i = i + 1;
            text = text + ".";
        }
        System.out.println(text);  // QUESTION 4, 30 points