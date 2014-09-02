import violentg.Gnome

class BootStrap {

    def init = { servletContext ->

        Gnome.executeUpdate('delete from Gnome')
        def gnomeList = ['http://1.bp.blogspot.com/-RUkMEVHxO74/TZnknBMZn3I/AAAAAAAAABI/C3IQNR_3n3I/s380/imagesCAG9DAHM.jpg',
                         'http://www.unsigned.com/_files/artists/full/us_artists_17016_dinosaurpirateninjasecretagentbumgnomes_2.jpg',

                         'http://a.tgcdn.net/images/products/zoom/1c81_rampaging_kaiju_garden_gnome.jpg',

                         'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQaOyzTCaBfgCcKJiApEhyGdxwwyIWedUfHKENnSvTcbqXaFc2c',

                         'http://www.halloweenforum.com/members/demon-dog-albums-halloween-2011-picture100539-vampire-gnome.jpg',

                         'http://www.theamericanconservative.com/wp-content/uploads/2012/09/il_fullxfull.376951169_8fnx.jpeg',
                         'http://4.bp.blogspot.com/_ekehePDB92c/TRzZPJRBTVI/AAAAAAAAAVA/OAJ54j4iH1g/s1600/zombie_xmas.jpg',

                         'https://outsideperception.files.wordpress.com/2011/12/fleeing-gnomes.jpg',

                         'http://www.geekalerts.com/u/zombie-garden-gnome-statue.jpg',

                         'http://media-cache-ec0.pinimg.com/236x/16/6c/71/166c71beda3162f5f83342fc778bf92c.jpg',

                         'http://getghostgear.com/images/zombie-garden-gnome.jpg',

                         'http://thumbs4.ebaystatic.com/d/l225/m/md1VPMJRqAN4kUoSbRZljWQ.jpg',

                         'http://i.guim.co.uk/w--/h--/q-95/sys-images/Guardian/Pix/pictures/2009/10/14/1255532420270/installation-called-Dance-003.jpg',

                         'http://homylicious.com/wp-content/uploads/combat-garden-gnomes-combat-garden-gnome-28192-666x499.jpg',

                         'http://abcnews.go.com/images/Entertainment/ht_shawn_thorsson_gnomes_3_ll_121002_wblog.jpg',

                         'http://www.thedrunkgnome.com/wp-content/uploads/2013/11/vet1.jpg',

                         'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3rqh-shiQeE3X8lfPJhww8v1rJooP3YCpLE2b-poqUqVhqZD8',

                         'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSwgn_PBuR-C7QwWYxjiWJLzk76MoG2EJ6fHysHrzocWCPRv2McJw',

                         'http://media-cache-ak0.pinimg.com/236x/97/6f/cf/976fcf8dd7722639f3447b2524a0f02f.jpg',

                         'http://img1.etsystatic.com/il_570xN.296705953.jpg',

                         'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3QUKW74vf10vYjFWi9cgRt9bkhSDbRyF2MvFvfs16WldwUPyN',
                         'http://www.gardengnomeworld.com/wp-content/uploads/2013/04/Tiki-Garden-Gnome-1.jpg']
        new Gnome(name: 'Handgun', imageUrl: 'http://cdn.hiconsumption.com/wp-content/uploads/2012/07/Combat-Garden-Gnomes-2.jpg').save(true)
        new Gnome(name: 'Sniper', imageUrl: 'http://cdn.hiconsumption.com/wp-content/uploads/2012/07/Combat-Garden-Gnomes-1.jpg').save(true)
        gnomeList.eachWithIndex { gnomeImg, num ->
            new Gnome(name: 'Gnome Number ' + num, imageUrl: gnomeImg).save(true)
        }
    }
    def destroy = {
    }
}
