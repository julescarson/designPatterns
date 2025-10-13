package designPatterns.factoryPattern

fun factoryMain() {
    println("Factory Pattern:")
    val vehicleFactory : VehicleFactory = VehicleFactory()
    val bike1 : Vehicle? = vehicleFactory.getVehicle("Bike")
    bike1?.printVehicle()

    val car1 : Vehicle? = vehicleFactory.getVehicle("Car")
    car1?.printVehicle()
    println("-")
}
