fun main() {
    val rect = Rectangle()
    rect.width = 100
    rect.height = 200
    rect.y = 50
    rect.x = 120
    var clone = rect.clone()
    println("First object - $rect, \nclone - $clone")
}