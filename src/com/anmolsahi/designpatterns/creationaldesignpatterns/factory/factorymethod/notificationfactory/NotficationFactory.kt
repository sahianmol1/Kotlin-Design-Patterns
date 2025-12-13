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

class NotificationManager() {
    private val notifications = mutableListOf<Notification>()

    fun addNotification(type: NotificationType) {
        notifications.add(NotificationFactory.createNotification(type))
    }

    fun sendNotifications() {
        require(notifications.isNotEmpty()) { "No notifications found to send" }
        notifications.forEach { it.send() }
    }
}

object NotificationFactory {
    fun createNotification(type: NotificationType) : Notification{
        return when (type) {
            NotificationType.EMAIL -> EmailNotification()
            NotificationType.PUSH -> PushNotification()
        }
    }
}

fun main() {
    val notificationManager = NotificationManager()
    notificationManager.addNotification(NotificationType.EMAIL)
    notificationManager.addNotification(NotificationType.PUSH)
    notificationManager.sendNotifications()
}

enum class NotificationType { EMAIL, PUSH }