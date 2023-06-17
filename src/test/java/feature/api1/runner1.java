package feature.api1;

import com.intuit.karate.junit5.Karate;

class Runner2 {

    @Karate.Test
    Karate testUsers() {
        return Karate.run("users").relativeTo(getClass());
    }

}