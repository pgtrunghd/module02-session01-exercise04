void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("width = ");
    double width = Double.parseDouble(sc.nextLine());
    System.out.print("height = ");
    double height = Double.parseDouble(sc.nextLine());
    System.out.printf("Diện tích: %.2f\n", width * height);
    System.out.printf("Chu vi: %.2f", (width + height) * 2);
    sc.close();
}