import ru.wilddisk.URLParameter
import kotlin.test.Test
import kotlin.test.assertEquals

class URLParameterTest {
    @Test
    fun `add & in url`() {
        assertEquals(
            "http://localhost:8080/test?message=hello world",
            URLParameter("http://localhost:8080/test?").add("message", "hello world")
        )
    }
    @Test
    fun `add 2nd param in url`() {
        assertEquals(
            "http://localhost:8080/test?message=hello world&id=1",
            URLParameter("http://localhost:8080/test?message=hello world").add("id", "1")
        )
    }
    @Test
    fun `add 2nd param in url with check &`() {
        assertEquals(
            "http://localhost:8080/test?message=hello world&id=1",
            URLParameter("http://localhost:8080/test?message=hello world&").add("id", "1")
        )
    }
}