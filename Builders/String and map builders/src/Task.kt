import java.util.HashMap
import javax.swing.UIManager.put

fun <K, V> buildMap(
    build: HashMap<K, V>.() -> Unit
): HashMap<K, V> {
    return HashMap<K, V>().also(build)
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
