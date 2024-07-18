package ru.wilddisk

/**
 * Параметры в url
 */
class Parameter(private val origin: Client) {
    /**
     * Параметр
     * @param key ключ параметра
     * @param value значение параметра
     */
    fun with(key: String, value: String): Parameter = Parameter(
        Client(this.origin.ktor, URLParameter(this.origin.url).add(key, value))
    )
    /**
     * клиент
     */
    fun build(): Client = this.origin
}