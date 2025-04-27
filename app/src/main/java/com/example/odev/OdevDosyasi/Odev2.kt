package com.example.odev.OdevDosyasi
 // fahrenhiet a donusturme
fun main() {
    fun fahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32
    }

    // dikdortgen çevresi hesaaplama
    fun dikdortgen(en :Double, boy:Double):Double{
        return (2*en)+(2*boy)
    }

     // faktoriyel hesaplama

     fun faktoriyel(sayi: Int): Int {
         var sonuc = 1
         for (i in 1..sayi) {
             sonuc *= i
         }
         return sonuc
     }

     // a harfi kontrolu
     fun aHarfi(kelime: String): Int {
         var sayac = 0
         for (harf in kelime) {
             if (harf == 'a' || harf == 'A') {
                 sayac++
             }
         }
         return sayac
     }



 }
