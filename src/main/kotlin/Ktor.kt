package ru.wilddisk

import io.ktor.client.*
import io.ktor.client.engine.*

interface Ktor {
    /**
     * Конфигурируем клиент ktor
     */
    class Configure(val client: HttpClient) {
        constructor(engineFactory: io.ktor.client.engine.HttpClientEngineFactory<*>) : this(HttpClient(engineFactory))
        constructor(engine: HttpClientEngine) : this(HttpClient(engine))
    }
}
/**
 * Создаём клиента и добавляем адрес хоста
 * @param host
 */
fun HttpClient.host(host: String): Client = Client(Ktor.Configure(this), host)