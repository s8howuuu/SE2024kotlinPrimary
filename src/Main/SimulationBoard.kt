package Main

class SimulationBoard {
    public val map = Map()
    val events = ArrayList<Event>()
    val ships = ArrayList<Ship>()
    val garbages = ArrayList<Garbage>()
    val  corporations = ArrayList<Corporation>()
    val  shipLocations = HashMap<Ship,Tile>()
    public fun addEvent(event: Event) {
        events.add(event)
    }
    public fun addShip(ship: Ship) {
        ships.add(ship)

    }
    public fun addGarbage(garbage: Garbage) {
        garbages.add(garbage)
    }
    public fun addCorporation(corporation: Corporation) {
        corporations.add(corporation)
    }



}