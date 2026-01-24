import assignment.AlgAnalysis;

void main() {

/**
 * Main method
 * Provides prompts for all experiments
 */

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter 0 to test Arrays.sort(), 1 for unique, any other number to exit");
            int opt1 = scanner.nextInt();
            if(opt1 == 0){
                System.out.println("Enter number of arrays to test");
                int count = scanner.nextInt();
                System.out.println("Enter largest array size");
                int n = scanner.nextInt();
                AlgAnalysis.arraySortRuntime(count, n);
                System.out.println();
            }
            else if(opt1 == 1){
                while(true){
                    System.out.println("Enter 1 to test unique1, 2 for unique2, any other number to exit");
                    int opt2 = scanner.nextInt();
                    if(opt2 == 1){
                        System.out.println("Enter n value");
                        int n = scanner.nextInt();
                        System.out.println("Time Elapsed: "+AlgAnalysis.nanoToSeconds(AlgAnalysis.unique1Runtime(n))+" secs");
                        System.out.println();
                    }
                    else if(opt2 == 2){
                        System.out.println("Enter n value");
                        int n = scanner.nextInt();
                        System.out.println("Time Elapsed: "+AlgAnalysis.nanoToSeconds(AlgAnalysis.unique2Runtime(n))+" secs");
                        System.out.println();
                    }
                    else{
                        System.out.println("End of Program!");
                        return;
                    }
                }
            }
            else {
                System.out.println("End of Program!");
                return;
            }

        }


}