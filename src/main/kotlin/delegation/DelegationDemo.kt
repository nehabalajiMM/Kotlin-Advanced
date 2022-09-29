package delegation

interface Engine {
    fun runsOn()
    fun getTransmissionType()
}

class ElectricEngine: Engine{
    override fun runsOn() {
        println("Runs on electricity")
    }

    override fun getTransmissionType() {
        println("No manual transmission")
    }
}

class TeslaEngine(val engine: Engine) : Engine by engine

fun main() {
    val sampleEngine = TeslaEngine(ElectricEngine())
    sampleEngine.runsOn()
    sampleEngine.getTransmissionType()
}
