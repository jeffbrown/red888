package red888

import spock.lang.Specification

class MyClassTest extends Specification {
    public void "Throws exception"() throws Exception {
        given:
        MyClass test = new MyClass()
        when:
        test.fail("sdlkfjlsdkfj")
        then:
        thrown(RuntimeException)
    }
}
