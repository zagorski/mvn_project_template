import spock.lang.*

class DemoSpockTest extends Specification {

    def "Adding two numbers to return the sum"() {
        when: "you are adding one plus one"
        def sum = 1 + 1
        then: "sum should be 2"
        sum == 2
    }
}
