class ColoredPoint(): Point() {
    var color: String? = null

    constructor(_x1: Double, _y1: Double, _color: String): this(){
        x1 = _x1
        y1 = _y1
        color = _color
    }

    override fun info() {
        println("Coord: x = $x1, y = $y1; Color = $color.")
    }

}