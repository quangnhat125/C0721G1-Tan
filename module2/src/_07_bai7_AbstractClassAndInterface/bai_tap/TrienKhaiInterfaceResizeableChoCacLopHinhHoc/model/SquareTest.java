package _07_bai7_AbstractClassAndInterface.bai_tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc.model;


class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.toString());

        square = new Square(2.3);
        System.out.println(square.toString());

        square = new Square(5.8, "yellow", true);
        System.out.println(square.toString());
    }
}
