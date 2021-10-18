package nl.dijkrosoft
import spock.lang.Specification

class NootTest extends Specification
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
        1  | 3 | 4
        -5 | 3 | -2
    }

}
