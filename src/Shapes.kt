//Объявляем класс, который унаследуется от Shape,
// Теперь нам нужно переопределить метод clone()
open class Rectangle() : Shape() {

    var width = 0
    var height = 0

    // создаем конструктор с параметром объекта
    constructor(rect: Rectangle): this() {
        this.color = rect.color
        this.x = rect.x
        this.y = rect.y
        this.height = rect.height
        this.width = rect.width
    }

    override fun clone(): Rectangle {
        return Rectangle(this)
    }

    override fun toString(): String {
        return "Rectangle(width=$width, height=$height, x=$x, y=$y, color=$color)"
    }

}

// Точно такие же действия проделываем и для Куба
open class Cube(cube: Cube) : Shape() {

    var side = 0

    init {
        this.color = cube.color
        this.x = cube.x
        this.y = cube.y
        this.side = cube.side
    }

    override fun clone(): Cube {
        return Cube(this)
    }

    override fun toString(): String {
        return "Cube($side, $x, $y, color=$color)"
    }
}