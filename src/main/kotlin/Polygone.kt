class Polygone(): Line() {
    var coords = emptyArray<Double>()

    constructor(vararg _coords: Double) : this(){
        if (_coords.size < 6) throw Exception("Введите координаты минимум трёх точек")
        if (_coords.size % 2 == 1) throw Exception("Координаты точки не полные")
        for (i in 0 until _coords.size){
            coords += _coords[i]
        }
    }

    fun moveX(moveX: Double){
        for (i in 0 until coords.size){
            if (i % 2 == 0) coords[i] += moveX
        }
    }

    fun moveY(moveY: Double){
        for (i in 0 until coords.size){
            if (i % 2 == 1) coords[i] += moveY
        }
    }

    fun moveXY(moveX: Double, moveY: Double){
        for (i in 0 until coords.size){
            if (i % 2 == 0) coords[i] += moveX
        }
        for (i in 0 until coords.size){
            if (i % 2 == 1) coords[i] += moveY
        }
    }

    override fun info() {
       var count = 1
       for (i in 1 .. coords.size step 2){
           println("x$count = ${coords[i-1]}; y$count = ${coords[i]}")
           count++
        }
    }
}