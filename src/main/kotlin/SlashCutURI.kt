package ru.wilddisk

/**
 * Контроль / символов при добавлении в url
 * @property url
 */
class SlashCutURI(private val url: String) {
    /**
     * Удаляет / в uri если по какой-то причине был добавлен и добавляет его в url
     */
    fun cut(uri: String): String = if (this.url.last() != "/".toCharArray()[0]) {
        this.url + "/" + uri.replace("/", "").trim()
    } else {
        this.url + uri.replace("/", "").trim()
    }
}