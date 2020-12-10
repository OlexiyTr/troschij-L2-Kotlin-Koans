class LazyProperty(val initializer: () -> Int) {
    var el: Int? = null
    val lazy: Int
        get() {
           if(el == null){
               el = initializer()
           }
            return el!!
        }
}
