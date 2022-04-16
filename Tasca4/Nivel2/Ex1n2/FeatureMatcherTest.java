package Ex1n2;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeatureMatcherTest {
	@Test
    void testHamcrest(){
            assertThat("axl", is("axl"));
            assertThat("axl", equalTo("axl"));
            assertThat("axl", is (equalTo("axl")));
            assertEquals("axl", is("axl"));
    }

    @Test
    public void tamanio() {
        assertThat("Mordor", length(is(6)));
        //assertThat("Mordor", length(is(10)));
    }

    public static Matcher<String> length(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher, "a String of length that", "length") {

            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }

}
