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

    @Test
    public void testFile2() throws IOException {
        assertEquals(List.of(), 
            MarkdownParse.getLinks(Files.readString(Path.of("testfile2.md"))));
    }
/*
    @Test
    public void testFile3() throws IOException {
        assertEquals(List.of(), 
            MarkdownParse.getLinks(Files.readString(Path.of("testfile3.md"))));
    }

    @Test
    public void testFile4() throws IOException {
        assertEquals(List.of("https://canvas.ucsd.edu"), 
            MarkdownParse.getLinks(Files.readString(Path.of("testfile4.md"))));
    }
    */
}

