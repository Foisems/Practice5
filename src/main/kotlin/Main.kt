fun main(args: Array<String>) {
    val point: Point = Point(2.4, 3.6)
    point.info()

    val coloredPoint: ColoredPoint = ColoredPoint(4.4, 5.5, "White")
    coloredPoint.info()

    val line: Line = Line(3.5, 5.3, 5.2, 7.5)
    line.info()

    val coloredLine: ColoredLine = ColoredLine(3.6, 7.8, 3.6, 6.4, "Blue")
    coloredLine.info()

    val polygone: Polygone = Polygone(6.5,4.5,4.7, 4.0, 5.6, 5.9)
    polygone.moveX(2.0)
    polygone.moveY(2.0)
    polygone.moveXY(1.009, 1.0)
    polygone.info()
}
