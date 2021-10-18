package nl.dijkrosoft


import spock.lang.Specification

class AapTest extends Specification {

    def testCombinations() {
        given: "an array"
        when: "combined"
        def combinations = [[2, 3],[4, 5, 6]].combinations()

        then: "all combintations"
        assert combinations == [[2, 4], [3, 4], [2, 5], [3, 5], [2, 6], [3, 6]]
    }
}
