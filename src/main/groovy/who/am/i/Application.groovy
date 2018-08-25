package who.am.i

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.runtime.Micronaut

@CompileStatic
@Controller("/who-am-i")
class Application {
    static void main(String[] args) {
        Micronaut.run(Application)
    }

    @Get
    String whoAmI() {
        InetAddress.localHost.canonicalHostName
    }

}