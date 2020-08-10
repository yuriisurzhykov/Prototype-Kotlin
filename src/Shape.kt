import java.awt.Color

//Объявляем абстрактный класс, в котором опеределяем абстрактный метод clone()
// и базовые поля класса
//Можно добавить и какие-то методы
abstract class Shape(): Prototype {
    var x = 0
    var y = 0
    var color: Color = Color.BLACK
    abstract override fun clone(): Prototype
}