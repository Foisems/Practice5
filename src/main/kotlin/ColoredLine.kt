class ColoredLine(): Line() {
    var color: String? = null

    constructor(_x1: Double, _y1: Double,
                _x2: Double, _y2: Double,
                _color: String): this(){
        x1 = _x1
        y1 = _y1
        x2 = _x2
        y2 = _y2
        color = _color
    }

    override fun info() {
        println("Coord: x1 = $x1, y1 = $y1; x2 = $x2, y2 = $y2; Color = $color.")
    }
}