package feature.api2;

import com.intuit.karate.junit5.Karate;

class Runner2 {

    @Karate.Test
    Karate testUsers() {
        return Karate.run("users","users1").relativeTo(getClass());
    }

}