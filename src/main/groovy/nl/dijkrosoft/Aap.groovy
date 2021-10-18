package nl.dijkrosoft

class Aap {

    static void main(String[] args) {
        print 'hallo'
        def p = Person(name:'dick', lastName: 'dijk')
        print p
    }
}
class Person {
    String name
    String lastName
}