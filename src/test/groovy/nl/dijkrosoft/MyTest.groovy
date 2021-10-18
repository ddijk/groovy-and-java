package nl.dijkrosoft


import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

import java.util.stream.Stream

class MyTest {
    @Test
    void streamSum() {
        Assertions.assertTrue(Stream.of(1, 2, 3).mapToInt(i -> i).sum() > 5, () -> "Sum should be greater than 5")
    }

    @RepeatedTest(value = 2, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    void streamSumRepeated() {
        assert Stream.of(1, 2, 3).mapToInt(i -> i).sum() == 6
    }

    private boolean isPalindrome(s) { s == s.reverse() }

    @ParameterizedTest
    @ValueSource(strings = ["racecar", "radar", "able was I ere I saw elba", "legovogel"])
    void palindromes(String candidate) {
        assert isPalindrome(candidate)
    }

    @Test
    void testMe() {
        def arr = [[1, 2, 3], [10, 11, 12]]

        assert [[1, 10], [1, 11], [1, 12], [3, 10], [3, 11], [3, 12], [2, 10], [2, 11], [2, 12]] as Set == arr.combinations() as Set
    }
}