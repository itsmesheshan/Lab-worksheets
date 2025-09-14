package LW_1;

class Circle {

    double radius;
    double PHI=Math.PI;
    Circle(double radius) {
        this.radius=radius;

    }

    public double claArea() {
        return PHI*radius*radius;
    }
}
