package com.anmolsahi.designpatterns.creationaldesignpatterns.factory.factorymethod.notificationfactory

interface Notification {
    fun send()
}

class EmailNotification(): Notification {
    override fun send() {
        println("Sending email notification")
    }
}

class PushNotification(): Notification {
    override fun send() {
        println("Sending push notification")
    }
}


object NotificationFactory {
    fun createNotification(type: NotificationType) : Notification{
         return when (type) {
            NotificationType.EMAIL -> {
                EmailNotification()
            }

            NotificationType.PUSH -> {
                PushNotification()
            }
        }
    }
}

fun main() {
    val notification = NotificationFactory.createNotification(type = NotificationType.PUSH)
    notification.send()
}

enum class NotificationType { EMAIL, PUSH }