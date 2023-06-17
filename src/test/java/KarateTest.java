/*------------THIS IS A RUNNER FILE FOR KARATE----------------------------------------------
This runner file supports parallel execution and tag & environment configuration
Sample maven commands - mvn test "-Dkarate.options=--tags @first"

---------------END OF COMMENTS--------------------------------------------------------------*/


import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KarateTest {

    @Test
    void testParallel() {
        Results results = Runner.path("classpath:feature")
                //.outputCucumberJson(true)
                .tags("first")
                .parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

//    @Karate.Test
//    Karate testSample() {
//        return Karate.run("sample").relativeTo(getClass());
//    }
//
//    @Karate.Test
//    Karate testTags() {
//        return Karate.run("tags").tags("@second").relativeTo(getClass());
//    }
//
//    @Karate.Test
//    Karate testSystemProperty() {
//        return Karate.run("classpath:karate/tags.feature")
//                .tags("@second")
//                .karateEnv("e2e")
//                .systemProperty("foo", "bar");
//    }

}
