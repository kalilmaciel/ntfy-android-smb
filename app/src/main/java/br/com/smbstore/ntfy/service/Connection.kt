package br.com.smbstore.ntfy.service

interface Connection {
    fun start()
    fun close()
    fun since(): String?
}

data class ConnectionId(
    val baseUrl: String,
    val topicsToSubscriptionIds: Map<String, Long>,
    val topicIsUnifiedPush: Map<String, Boolean>
)
