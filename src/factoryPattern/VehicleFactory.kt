package designPatterns.factoryPattern

class VehicleFactory {
    fun getVehicle(vehicleType : String): Vehicle? {

        return when (vehicleType) {
            "Bike" -> Bike()
            "Car" -> Car()
            else -> null
        }

    }
}