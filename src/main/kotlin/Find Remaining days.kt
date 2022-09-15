fun main() {
    println("------------------------------------------------")
    println("      Find A Remaining Days of the year")
    println("------------------------------------------------")
    print("Enter The Date   -> ")
    val userDate = readLine()?:""
    val date= userDate.toInt()
    print("Enter The Month  -> ")
    val userMonth = readLine()?:""
    val month= userMonth.toInt()
    print("Enter The Year   -> ")
    val userYear = readLine()?:""
    val year= userYear.toInt()
    println("------------------------------------------------")

    println("Date: $date, Month: $month, Year: $year")
    find(date,month,year)

}


fun find(Date: Int,Month: Int,year: Int) {
    val remainingDate: Int
    val odd = 31
    val even = 30
    val febNo = 28

    val feb = (1.. febNo).toList()
    val mar = (1.. odd).toList()
    val apr = (1.. even).toList()
    val may = (1.. odd).toList()
    val jun = (1.. even).toList()
    val jul = (1.. odd).toList()
    val aug = (1.. odd).toList()
    val sep = (1.. even).toList()
    val oct = (1.. odd).toList()
    val nov = (1.. even).toList()
    val dec = (1.. odd).toList()

var sizeDate=0
var sizeMonth=0
    when (Month){
        1 ->{
           sizeDate += odd.minus(Date)
           sizeMonth += feb.size+mar.size+apr.size+may.size+jun.size+jul.size+aug.size+sep.size+oct.size+nov.size+dec.size
        }
        2 ->{sizeDate += febNo.minus(Date)
            sizeMonth += mar.size+apr.size+may.size+jun.size+jul.size+aug.size+sep.size+oct.size+nov.size+dec.size
        }
        3 ->{sizeDate += odd.minus(Date)
            sizeMonth += apr.size+may.size+jun.size+jul.size+aug.size+sep.size+oct.size+nov.size+dec.size
        }
        4 ->{sizeDate += even.minus(Date)
            sizeMonth += may.size+jun.size+jul.size+aug.size+sep.size+oct.size+nov.size+dec.size
        }
        5 ->{sizeDate += odd.minus(Date)
            sizeMonth += jun.size+jul.size+aug.size+sep.size+oct.size+nov.size+dec.size
        }
        6 ->{sizeDate += even.minus(Date)
            sizeMonth += jul.size+aug.size+sep.size+oct.size+nov.size+dec.size
        }
        7 ->{sizeDate += odd.minus(Date)
            sizeMonth += aug.size+sep.size+oct.size+nov.size+dec.size
        }
        8 ->{sizeDate += odd.minus(Date)
            sizeMonth += sep.size+oct.size+nov.size+dec.size
        }
        9 ->{sizeDate += even.minus(Date)
            sizeMonth += oct.size+nov.size+dec.size
        }
        10 ->{sizeDate += odd.minus(Date)
            sizeMonth += nov.size+dec.size
        }
        11 ->{sizeDate += even.minus(Date)
            sizeMonth += dec.size
        }
        12 ->{sizeDate += odd.minus(Date)
        }
    }
    val leapYear = if ((year/4 == 0) || (year % 4 == 0)) 1 else 0
    remainingDate = sizeDate + sizeMonth + leapYear

    println("Remaining Days = $remainingDate")
}