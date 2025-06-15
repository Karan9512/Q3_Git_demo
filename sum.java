class sum {
    public static void main(String[] args) {
        int count = 0, num = 2, sum = 0;
        while (count < 5) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println("Sum of first 5 prime numbers: " + sum);
    }

}