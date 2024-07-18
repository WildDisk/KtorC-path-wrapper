package ru.wilddisk

/**
 * Путь до конечной точки обращения
 * @property origin
 */
class Path(private val origin: Client) {
    /**
     * URI до ендпоинта
     * @param uri
     */
    fun with(uri: String): Path = Path(Client(this.origin.ktor, SlashCutURI(this.origin.url).cut(uri)))
    /**
     * Добавление параметров в URL
     */
    fun withParam(): Parameter = Parameter(Client(this.origin.ktor, this.origin.url+"?"))
    /**
     * Клиент
     */
    fun build(): Client = this.origin
}