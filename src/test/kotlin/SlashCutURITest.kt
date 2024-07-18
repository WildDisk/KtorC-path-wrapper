import org.junit.jupiter.api.Assertions.assertEquals
import ru.wilddisk.SlashCutURI
import kotlin.test.Test

class SlashCutURITest {
    @Test
    fun `add uri in url`() {
        assertEquals(
            "http://localhost/api",
            SlashCutURI("http://localhost").cut("api")
        )
    }
    @Test
    fun `cut last slash in url and add uri`() {
        assertEquals(
            "http://localhost/api",
            SlashCutURI("http://localhost/").cut("api")
        )
    }
    @Test
    fun `replace slash on space in uri`() {
        assertEquals(
            "http://localhost/api",
            SlashCutURI("http://localhost/").cut("//api/")
        )
    }
}