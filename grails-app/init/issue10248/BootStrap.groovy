package issue10248

class BootStrap {

    def init = { servletContext ->
        new demo.Person(name: 'Jeff').save()
        new demo.Person(name: 'Jake').save()
    }
    def destroy = {
    }
}
