package nl.dijkrosoft


import spock.lang.Specification

class CalculatorTest extends Specification
{
    def "Sum: #a + #b = #expectedResult"()
    {

        given: "Calculator"
        def calc = new com.example.test.Calculator()

        when: "add"
        def result = calc.sum( a, b )

        then: "result is as expected"
        result == expectedResult
        println "result = ${result}"

        where:
        a  | b | expectedResult
        1  | 2 | 3
        -5 | 2 | -3
    }
}