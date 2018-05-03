package com.example.adan.proyectomosca;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;

public class Dibuja extends View {

    Bitmap imagen,fondo,boton;
    public Dibuja(Context context){
        super(context);
    }

    public void onDraw(Canvas c){
     Paint p= new Paint();

     imagen= BitmapFactory.decodeResource(getResources(),R.drawable.mosca2);
     fondo= BitmapFactory.decodeResource(getResources(),R.drawable.fondo);
     boton= BitmapFactory.decodeResource(getResources(),R.drawable.boton);
     p.setColor(Color.RED);


        c.drawBitmap(fondo,500,0,p);
        c.drawBitmap(imagen,0,50,p);
        c.drawBitmap(imagen,0,500,p);
        c.drawBitmap(imagen,0,1000,p);
        c.drawBitmap(boton,800,1000,p);
       // c.drawCircle(1200,500,30,p);
    }


}
