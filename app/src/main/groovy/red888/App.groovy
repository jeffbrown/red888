package red888

class App {
    static void main(String[] args) {
        //  groovy.lang.GroovyRuntimeException: Could not find matching constructor for: red888.MyClass()
        MyClass blah = new MyClass()
    }
}
