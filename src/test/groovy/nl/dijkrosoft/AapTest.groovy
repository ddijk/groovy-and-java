package nl.dijkrosoft

import org.junit.jupiter.api.Test

class AapTest extends GroovyTestCase {

    @Test
    void testAdd() {

        Aap aap = new Aap();

        assert 3 == aap.add(1,2)
    }
}
