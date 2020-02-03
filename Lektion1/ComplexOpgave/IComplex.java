import java.util.Objects;

public interface IComplex {



    // return a string representation of the invoking Complex object
    String toString();



    // return abs/modulus/magnitude
    public double abs();

    // return angle/phase/argument, normalized to be between -pi and pi
    public double phase();

    // return a new Complex object whose value is (this + b)
    public Complex plus(Complex b);

    // return a new Complex object whose value is (this - b)
    public Complex minus(Complex b);

    // return a new Complex object whose value is (this * b)
    public Complex times(Complex b);

    // return a new object whose value is (this * alpha)
    public Complex scale(double alpha);

    // return a new Complex object whose value is the conjugate of this
    public Complex conjugate();

    // return a new Complex object whose value is the reciprocal of this
    public Complex reciprocal();

    // return the real or imaginary part
    public double re();
    public double im();

    // return a / b
    public Complex divides(Complex b);
    // return a new Complex object whose value is the complex exponential of this
    public Complex exp();

    // return a new Complex object whose value is the complex sine of this
    public Complex sin();

    // return a new Complex object whose value is the complex cosine of this
    public Complex cos();

    // return a new Complex object whose value is the complex tangent of this
    public Complex tan();



    // a static version of plus
    public Complex plus(Complex a, Complex b);

    // See Section 3.3.
    public boolean equals(Object x);

    // See Section 3.3.
    public int hashCode();


}





}
