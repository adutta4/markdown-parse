import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        assertEquals(List.of("https://something.com", "some-page.html"), 
            MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    }
}

