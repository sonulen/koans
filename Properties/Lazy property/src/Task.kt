import java.lang.IllegalStateException

class LazyProperty(val initializer: () -> Int) {
    var value: Int? = null
    val lazy: Int
        get() {
            if (value == null) {
                value = initializer()
            }
            return value ?: throw IllegalStateException("mda")
        }
}
