package designPatterns.composite

class Employee(
    var name: String,
    var department: String,
    var salary: Int,
    val subordinates : MutableList<Employee?> = mutableListOf()
) {

    fun add(e : Employee) {
        subordinates.add(e)
    }
    fun remove(e : Employee) {
        subordinates.remove(e)
    }

    override fun toString() : String {
        return "Employee: $name, Name: $name, Dept: $department, Salary: $salary"
    }
}