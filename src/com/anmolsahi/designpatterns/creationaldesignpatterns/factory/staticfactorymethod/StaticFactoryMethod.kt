package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.staticfactorymethod

import kotlin.jvm.Throws

class Server private constructor(private val port: Long) {

    init {
        println("Starting the server on port: $port")
    }

    companion object {
        val startedPorts = mutableListOf<Long>()

        /**
         * Static Factory Method creates the object for the class just like a constructor does.
         * But, with the following benefits:
         *
         * Explicit naming: It allows for more descriptive naming of object constructors, particularly
         * beneficial when a class has multiple constructors. This improves code readability and
         * makes the purpose of each constructor clearer.
         *
         * Exception handling: While constructors typically should not throw exceptions, Static
         * Factory Methods can, allowing for more explicit and flexible error handling. This acknowl-
         * edges that object instantiation can indeed fail.
         *
         * Flexibility in object creation: Static Factory Methods can offer different strategies for
         * object creation. For instance, they can provide optimizations or caching mechanisms for
         * objects with complex or slow construction processes.
         */
        @Throws(IllegalStateException::class)
        fun withPort(port: Long): Server {
            if (startedPorts.contains(port)) {
                throw IllegalStateException("Server is already running on the port: $port")
            } else {
                startedPorts.add(port)
                return Server(port)
            }
        }
    }
}

fun main() {
    Server.withPort(8080)
    Server.withPort(8081)
    // Uncomment this to get the runtime exception
    // Server.withPort(8080)

    // Java Long using the static method design pattern
    val myLong = java.lang.Long.valueOf(1010)
}
