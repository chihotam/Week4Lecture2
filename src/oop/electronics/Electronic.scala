package oop.electronics

abstract class Electronic() {
  var battery: Battery
  def use(): Unit = {

  }
  def replaceBattery(one: Battery): Battery = {
    val temp = this.battery
    this.battery = one
    temp
  }
}
