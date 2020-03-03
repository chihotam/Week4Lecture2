package oop.electronics

class BoomBox(var one: Battery) extends Electronic() {
  override var battery: Battery = one
  override def use(): Unit = {
    if (one.charge >= 3) {
      one.charge -= 3
    }
  }
}
