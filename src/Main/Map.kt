package Main

class Map {
    //Map works as a Graph
    private val Tiles = HashSet<Tile>()
    private val MovableGraph = HashSet<Tile>()
    public fun addTile(tile: Tile) {
        Tiles.add(tile)
    }

    public fun buildMovableMap(tile: Tile) {
        if (tile.canMove) {
            MovableGraph.add(tile)
        }
    }
    public fun findShortestPath(start: Tile, end: Tile): List<Tile>? {
        return null
    }
    fun test(){

    }
}