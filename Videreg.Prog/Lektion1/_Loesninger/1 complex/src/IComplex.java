  public interface IComplex {
        // return a string representation of the invoking Complex object
        String toString();

        // return abs/modulus/magnitude
        double abs() ;

        // return angle/phase/argument, normalized to be between -pi and pi
        double phase();

        // return a new Complex object whose value is (this + b)
        IComplex plus(IComplex b);

        // return a new Complex object whose value is (this - b)
        IComplex minus(IComplex b);

        // return a new Complex object whose value is (this * b)
        IComplex times(IComplex b) ;

        // return a new object whose value is (this * alpha)
        IComplex scale(double alpha);

        // return a new Complex object whose value is the conjugate of this
        IComplex conjugate();

        // return a new Complex object whose value is the reciprocal of this
        IComplex reciprocal();

        // return the real or imaginary part
        double re();
        double im();

        // return a / b
        IComplex divides(IComplex b);

        // return a new Complex object whose value is the complex exponential of this
        IComplex exp();

        // return a new Complex object whose value is the complex sine of this
        IComplex sin() ;

        // return a new Complex object whose value is the complex cosine of this
        IComplex cos() ;

        // return a new Complex object whose value is the complex tangent of this
        IComplex tan() ;

}
