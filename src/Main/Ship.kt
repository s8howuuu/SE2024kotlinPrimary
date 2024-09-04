package Main

 class Ship(private val type: ShipType,private val id:Int) {

    fun getId(): Int {
        return id
    }

     fun getType():ShipType{
         return type
     }

}