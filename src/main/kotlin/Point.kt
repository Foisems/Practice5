open class Point() {
    var x1: Double? = null
    var y1: Double? = null

    constructor(_x1: Double, _y1: Double): this(){
        x1 = _x1
        y1 = _y1
    }

    open fun info () {
       println("Coord: x = $x1, y = $y1;")
    }
}