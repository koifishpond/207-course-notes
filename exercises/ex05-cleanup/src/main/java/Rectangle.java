/** A mutable rectangle with a width and height that supports scaling and area comparison. */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle with the given width and height.
   *
   * @param w the initial width of the rectangle
   * @param h the initial height of the rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Calculates the area by multiplying the current width and height.
   *
   * @return the product of the width and height
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales this rectangle by multiplying both dimensions by the given factor.
   *
   * @param factor the multiplier applied to both the width and height
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Checks whether this rectangle has a strictly greater area than the other rectangle.
   *
   * @param other the rectangle whose area is compared with this rectangle's area
   * @return {@code true} if this rectangle's area is strictly greater; {@code false} otherwise
   * @throws NullPointerException if {@code other} is {@code null}
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
