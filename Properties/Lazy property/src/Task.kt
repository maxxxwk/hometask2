class LazyProperty(val initializer: () -> Int) {
    private var value: Int? = null
    val lazy: Int
        get() {
            when(value){
                null -> value = initializer()
            }
            return value!!
        }
}
