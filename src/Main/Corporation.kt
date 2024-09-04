package Main

class Corporation {
    val ships = ArrayList<Ship>()
    val harbors = ArrayList<Harbor>()
    val mapView = ArrayList<Tile>()
    fun sortShip(){
        ships.sortBy { it.getId()}
    }
    fun addShip(ship: Ship){
        ships.add(ship)
    }
    fun addHarbor(harbor: Harbor){
        harbors.add(harbor)
    }


}