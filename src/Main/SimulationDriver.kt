package Main

class SimulationDriver {


    private val board = SimulationBoard()
    private var amountTicks = 0
    private val moveManager = MoveManager(board)
    private val collectManager = CollectManager(board)
    private val copManager = CopManager(board)
    private val eventManager = EventManager(board)
    private val harborService = HarbourService(board)
    fun setTicks(ticks: Int) {
        this.amountTicks = ticks
    }
    fun runOneTick(tick:Int){
        for(corp in board.corporations){
            for(ship in corp.ships){
                moveManager.moveShip(ship,corp)
            }
        }
        for(corp in board.corporations){
            for(ship in corp.ships){
                collectManager.collectGarbage(ship,corp)
            }
        }
        for(corp in board.corporations) {
            for (ship in corp.ships) {
                copManager.corp(ship, corp)
            }
        }
        for(corp in board.corporations){
            harborService.serve(corp)
        }

        drift()
        eventManager.applyEvents(tick)
        
    }
    fun runSimulation(){
        for(i in 0..amountTicks){
            runOneTick(i)
        }
    }
    fun drift(){
        TODO()
    }
}