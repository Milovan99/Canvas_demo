package com.milovanjakovljevic.canvasdemo

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : Activity() {

    lateinit var myImageView:ImageView
    lateinit var myCanvas:Canvas
    lateinit var myBlankBitmap:Bitmap
    lateinit var myPaint:Paint

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val widthInPixel=800
        val heightInPixel=600

        myBlankBitmap=Bitmap.createBitmap(widthInPixel,heightInPixel,Bitmap.Config.ARGB_8888)

        myCanvas=Canvas(myBlankBitmap)

        myImageView= ImageView(this)
        myPaint=Paint()



        myCanvas.drawColor(Color.argb(255,0,0,255))

        myPaint.textSize=100f
        myPaint.color=Color.argb(255,255,255,255)
        myCanvas.drawText("Hello World",100f,100f,myPaint)

        myPaint.color=Color.argb(255,212,207,62)

        myCanvas.drawCircle(400f,250f,100f,myPaint)

        myImageView.setImageBitmap(myBlankBitmap)
        setContentView(myImageView)
    }
}