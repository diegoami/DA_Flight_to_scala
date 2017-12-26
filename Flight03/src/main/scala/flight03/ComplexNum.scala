package flight03;

class ComplexNum(val real : Double, val imaginary : Double) {
  override def toString = s"${real} + ${imaginary}i"
  def this(real: Double) = this(real, 0)
  def +(that: ComplexNum): ComplexNum=
    new ComplexNum(real+that.real, imaginary+that.imaginary)

  def +(d: Double): ComplexNum =
    new ComplexNum (real+d,imaginary)
}
