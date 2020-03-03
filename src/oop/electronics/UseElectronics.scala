package oop.electronics

object UseElectronics {
  def useAll(lis: List[Electronic]): Unit = {
    for (electronic <- lis) {
      electronic.use()
    }
  }
  def swapBatteries(one: Electronic, two: Electronic): Unit = {
    val temp: Battery = one.replaceBattery(two.battery)
    two.battery = temp
  }
}