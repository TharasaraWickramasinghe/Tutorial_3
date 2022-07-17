//Question 1
def Area(rad: Float): Double  = math.Pi * rad * rad
println(Area(5))

//--------------------------------------------

//Question 2
def Temperate(cel: Float) : Float = (cel * 1.800f) + 32.00f
println(Temperate(35))

//---------------------------------------------------------------------------

//Question 3
def Volume(rad: Float) : Double = 4.0f / 3.0f * math.Pi * rad * rad * rad
println(Volume(5))

//---------------------------------------------------------------------------

//Question 4

def TotalPrice(copies: Int) : Float = copies * 24.95f
def DiscountPrice(totalPrice: Float) : Float = totalPrice * 0.6f
def ShippingCosts(copies: Int) : Float = if (copies > 50){
  50 * 3.00f + (copies - 50) * .75f
}
else{
  50 * 3.00f
}


def TotalCost(copies: Int) : Float = {
  val totalPrice = TotalPrice(copies)
  val discountedPrice = DiscountPrice(totalPrice)
  val shippingCosts = ShippingCosts(copies)
  discountedPrice + shippingCosts
}

println(TotalCost(60))

//----------------------------------------------------------------------------------

//Question 5

val minPerKmEasy = 8
val minPerKmTempo = 7
val totalRunningTime = (minPerKmEasy * 2) + (minPerKmTempo * 3) + (minPerKmEasy * 2)
println(totalRunningTime)

