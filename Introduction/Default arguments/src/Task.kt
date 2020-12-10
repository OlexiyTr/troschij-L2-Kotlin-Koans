fun foo(name: String, number: Int, toUpperCase: Boolean) =
        (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        foo("a",42,false),
        foo("b", 1,false),
        foo("c", 42, true),
        foo("d", 2, true)
)
