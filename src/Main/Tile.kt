package Main

abstract class Tile(private val x: Int, private val y: Int, id: Int) {
    //Work as a Node
    val coordinate = Coordinate(x, y)
    val neighbors = HashMap<Tile, Int>()
    public var canMove: Boolean = false;
    fun setMoveable(value: Boolean) {
        canMove = value;
    }

    fun addNeighbor(neighbor: Tile, distance: Int) {
        neighbors[neighbor] = distance
    }
}