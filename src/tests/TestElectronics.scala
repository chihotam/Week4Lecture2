package tests

import oop.electronics.{Battery, BoomBox, FlashLight, UseElectronics}
import org.scalatest._


class TestElectronics extends FunSuite{
  test("Test") {
    val battery1: Battery = new Battery(3)
    val boomBox: BoomBox = new BoomBox(battery1)
    val flashLight: FlashLight = new FlashLight()
    assert(battery1.charge == 3)
    assert(flashLight.battery.charge == 5)
    UseElectronics.useAll(List(boomBox, flashLight))
    assert(battery1.charge == 0)
    assert(flashLight.battery.charge == 4)
    val boomBox1: Battery = boomBox.battery
    val flashLight1: Battery = flashLight.battery
    UseElectronics.swapBatteries(boomBox, flashLight)
    assert(boomBox.battery == flashLight1)
    assert(flashLight.battery == boomBox1)
  }
}