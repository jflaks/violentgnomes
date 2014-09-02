package violentg

import grails.rest.Resource

@Resource(uri = '/gnomes', formats=['json','xml'])
class Gnome {
    String name
    String imageUrl

    static constraints = {

    }
}
