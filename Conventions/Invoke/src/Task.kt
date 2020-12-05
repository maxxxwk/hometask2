class Invokable {
    var numberOfInvocations: Int = 0
        private set

    operator fun invoke(): Invokable {
        return Invokable().also {
            it.numberOfInvocations = this.numberOfInvocations + 1
        }
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()
