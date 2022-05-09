import java.lang.IllegalStateException
import kotlin.reflect.KProperty

class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by Lazy(initializer)
}

class Lazy(private val initializer: () -> Int) {
    private var prop: Int? = null

    operator fun getValue(
        thisRef: LazyProperty,
        property: KProperty<*>
    ): Int {
        if (prop == null) prop = initializer.invoke()
        return prop ?: throw IllegalStateException("what")
    }
}
