package nl.dijkrosoft

class Aap {

    static void main(String[] args) {
        print 'hallo'
        def p = Person(name:'dick', lastName: 'dijk')
        print p
    }

    def add(i, j) {
        return i+j
    }
}
