package com.fmmuguerza.sorobanabacus;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class AbacoActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abaco);
        
        addListenerOnButton();
    }
    
    public void addListenerOnButton() {
    	final TextView Resultado0 = (TextView)findViewById(R.id.resultado0);
    	final TextView Resultado1 = (TextView)findViewById(R.id.resultado1);
    	final TextView Resultado2 = (TextView)findViewById(R.id.resultado2);
    	final TextView Resultado3 = (TextView)findViewById(R.id.resultado3);
    	//row 0
    	final ToggleButton Boton00 = (ToggleButton)findViewById(R.id.boton00);
    	final ToggleButton Boton01 = (ToggleButton)findViewById(R.id.boton01);
    	final ToggleButton Boton02 = (ToggleButton)findViewById(R.id.boton02);
    	final ToggleButton Boton03 = (ToggleButton)findViewById(R.id.boton03);
    	
    	//row1
    	final ToggleButton Boton10 = (ToggleButton)findViewById(R.id.boton10);
    	final ToggleButton Boton11 = (ToggleButton)findViewById(R.id.boton11);
    	final ToggleButton Boton12 = (ToggleButton)findViewById(R.id.boton12);
    	final ToggleButton Boton13 = (ToggleButton)findViewById(R.id.boton13);
    	//row2
    	final ToggleButton Boton20 = (ToggleButton)findViewById(R.id.boton20);
    	final ToggleButton Boton21 = (ToggleButton)findViewById(R.id.boton21);
    	final ToggleButton Boton22 = (ToggleButton)findViewById(R.id.boton22);
    	final ToggleButton Boton23 = (ToggleButton)findViewById(R.id.boton23);
    	//row3
    	final ToggleButton Boton30 = (ToggleButton)findViewById(R.id.boton30);
    	final ToggleButton Boton31 = (ToggleButton)findViewById(R.id.boton31);
    	final ToggleButton Boton32 = (ToggleButton)findViewById(R.id.boton32);
    	final ToggleButton Boton33 = (ToggleButton)findViewById(R.id.boton33);
    	//row4
    	final ToggleButton Boton40 = (ToggleButton)findViewById(R.id.boton40);
    	final ToggleButton Boton41 = (ToggleButton)findViewById(R.id.boton41);
    	final ToggleButton Boton42 = (ToggleButton)findViewById(R.id.boton42);
    	final ToggleButton Boton43 = (ToggleButton)findViewById(R.id.boton43);
    	
    	Boton00.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton00.isChecked()){
    	        	resultado=5;
    	        	if(Boton10.isChecked()){resultado++;}
    	        	if(Boton20.isChecked()){resultado++;}
    	        	if(Boton30.isChecked()){resultado++;}
    	        	if(Boton40.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado0.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton10.isChecked()){resultado++;}
    	        	if(Boton20.isChecked()){resultado++;}
    	        	if(Boton30.isChecked()){resultado++;}
    	        	if(Boton40.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado0.setText(result);
    	        }
    	    }
    	});//end listener boton00
    	
    	
    	Boton10.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton00.isChecked()){
    	        	resultado=5;
    	        	if(Boton10.isChecked()){resultado++;}
    	        	if(Boton20.isChecked()){resultado++;}
    	        	if(Boton30.isChecked()){resultado++;}
    	        	if(Boton40.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado0.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton10.isChecked()){resultado++;}
    	        	if(Boton20.isChecked()){resultado++;}
    	        	if(Boton30.isChecked()){resultado++;}
    	        	if(Boton40.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado0.setText(result);
    	        }
    	    }
    	});//end listener boton00
    	
    	Boton20.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton00.isChecked()){
    	        	resultado=5;
    	        	if(Boton10.isChecked()){resultado++;}
    	        	if(Boton20.isChecked()){resultado++;}
    	        	if(Boton30.isChecked()){resultado++;}
    	        	if(Boton40.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado0.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton10.isChecked()){resultado++;}
    	        	if(Boton20.isChecked()){resultado++;}
    	        	if(Boton30.isChecked()){resultado++;}
    	        	if(Boton40.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado0.setText(result);
    	        }
    	    }
    	});//end listener boton00
    	
    	Boton30.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton00.isChecked()){
    	        	resultado=5;
    	        	if(Boton10.isChecked()){resultado++;}
    	        	if(Boton20.isChecked()){resultado++;}
    	        	if(Boton30.isChecked()){resultado++;}
    	        	if(Boton40.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado0.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton10.isChecked()){resultado++;}
    	        	if(Boton20.isChecked()){resultado++;}
    	        	if(Boton30.isChecked()){resultado++;}
    	        	if(Boton40.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado0.setText(result);
    	        }
    	    }
    	});//end listener boton00
    	Boton40.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton00.isChecked()){
    	        	resultado=5;
    	        	if(Boton10.isChecked()){resultado++;}
    	        	if(Boton20.isChecked()){resultado++;}
    	        	if(Boton30.isChecked()){resultado++;}
    	        	if(Boton40.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado0.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton10.isChecked()){resultado++;}
    	        	if(Boton20.isChecked()){resultado++;}
    	        	if(Boton30.isChecked()){resultado++;}
    	        	if(Boton40.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado0.setText(result);
    	        }
    	    }
    	});//end listener boton00
    	
    	Boton01.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton01.isChecked()){
    	        	resultado=5;
    	        	if(Boton11.isChecked()){resultado++;}
    	        	if(Boton21.isChecked()){resultado++;}
    	        	if(Boton31.isChecked()){resultado++;}
    	        	if(Boton41.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado1.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton11.isChecked()){resultado++;}
    	        	if(Boton21.isChecked()){resultado++;}
    	        	if(Boton31.isChecked()){resultado++;}
    	        	if(Boton41.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado1.setText(result);
    	        }
    	    }
    	});//end listener boton00
    	
    	Boton11.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton01.isChecked()){
    	        	resultado=5;
    	        	if(Boton11.isChecked()){resultado++;}
    	        	if(Boton21.isChecked()){resultado++;}
    	        	if(Boton31.isChecked()){resultado++;}
    	        	if(Boton41.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado1.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton11.isChecked()){resultado++;}
    	        	if(Boton21.isChecked()){resultado++;}
    	        	if(Boton31.isChecked()){resultado++;}
    	        	if(Boton41.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado1.setText(result);
    	        }
    	    }
    	});//end listener botonX1
    	
    	Boton21.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton01.isChecked()){
    	        	resultado=5;
    	        	if(Boton11.isChecked()){resultado++;}
    	        	if(Boton21.isChecked()){resultado++;}
    	        	if(Boton31.isChecked()){resultado++;}
    	        	if(Boton41.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado1.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton11.isChecked()){resultado++;}
    	        	if(Boton21.isChecked()){resultado++;}
    	        	if(Boton31.isChecked()){resultado++;}
    	        	if(Boton41.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado1.setText(result);
    	        }
    	    }
    	});//end listener botonX1
    	
    	Boton31.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton01.isChecked()){
    	        	resultado=5;
    	        	if(Boton11.isChecked()){resultado++;}
    	        	if(Boton21.isChecked()){resultado++;}
    	        	if(Boton31.isChecked()){resultado++;}
    	        	if(Boton41.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado1.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton11.isChecked()){resultado++;}
    	        	if(Boton21.isChecked()){resultado++;}
    	        	if(Boton31.isChecked()){resultado++;}
    	        	if(Boton41.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado1.setText(result);
    	        }
    	    }
    	});//end listener botonX1
    	
    	Boton41.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton01.isChecked()){
    	        	resultado=5;
    	        	if(Boton11.isChecked()){resultado++;}
    	        	if(Boton21.isChecked()){resultado++;}
    	        	if(Boton31.isChecked()){resultado++;}
    	        	if(Boton41.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado1.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton11.isChecked()){resultado++;}
    	        	if(Boton21.isChecked()){resultado++;}
    	        	if(Boton31.isChecked()){resultado++;}
    	        	if(Boton41.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado1.setText(result);
    	        }
    	    }
    	});//end listener botonX1
    	
    	Boton02.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton02.isChecked()){
    	        	resultado=5;
    	        	if(Boton12.isChecked()){resultado++;}
    	        	if(Boton22.isChecked()){resultado++;}
    	        	if(Boton32.isChecked()){resultado++;}
    	        	if(Boton42.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado2.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton12.isChecked()){resultado++;}
    	        	if(Boton22.isChecked()){resultado++;}
    	        	if(Boton32.isChecked()){resultado++;}
    	        	if(Boton42.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado2.setText(result);
    	        }
    	    }
    	});//end listener botonX2
    	
    	Boton12.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton02.isChecked()){
    	        	resultado=5;
    	        	if(Boton12.isChecked()){resultado++;}
    	        	if(Boton22.isChecked()){resultado++;}
    	        	if(Boton32.isChecked()){resultado++;}
    	        	if(Boton42.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado2.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton12.isChecked()){resultado++;}
    	        	if(Boton22.isChecked()){resultado++;}
    	        	if(Boton32.isChecked()){resultado++;}
    	        	if(Boton42.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado2.setText(result);
    	        }
    	    }
    	});//end listener botonX2
    	
    	Boton22.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton02.isChecked()){
    	        	resultado=5;
    	        	if(Boton12.isChecked()){resultado++;}
    	        	if(Boton22.isChecked()){resultado++;}
    	        	if(Boton32.isChecked()){resultado++;}
    	        	if(Boton42.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado2.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton12.isChecked()){resultado++;}
    	        	if(Boton22.isChecked()){resultado++;}
    	        	if(Boton32.isChecked()){resultado++;}
    	        	if(Boton42.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado2.setText(result);
    	        }
    	    }
    	});//end listener botonX2
    	
    	Boton32.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton02.isChecked()){
    	        	resultado=5;
    	        	if(Boton12.isChecked()){resultado++;}
    	        	if(Boton22.isChecked()){resultado++;}
    	        	if(Boton32.isChecked()){resultado++;}
    	        	if(Boton42.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado2.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton12.isChecked()){resultado++;}
    	        	if(Boton22.isChecked()){resultado++;}
    	        	if(Boton32.isChecked()){resultado++;}
    	        	if(Boton42.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado2.setText(result);
    	        }
    	    }
    	});//end listener botonX2
    	
    	Boton42.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton02.isChecked()){
    	        	resultado=5;
    	        	if(Boton12.isChecked()){resultado++;}
    	        	if(Boton22.isChecked()){resultado++;}
    	        	if(Boton32.isChecked()){resultado++;}
    	        	if(Boton42.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado2.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton12.isChecked()){resultado++;}
    	        	if(Boton22.isChecked()){resultado++;}
    	        	if(Boton32.isChecked()){resultado++;}
    	        	if(Boton42.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado2.setText(result);
    	        }
    	    }
    	});//end listener botonX2
    	
    	Boton03.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton03.isChecked()){
    	        	resultado=5;
    	        	if(Boton13.isChecked()){resultado++;}
    	        	if(Boton23.isChecked()){resultado++;}
    	        	if(Boton33.isChecked()){resultado++;}
    	        	if(Boton43.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado3.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton13.isChecked()){resultado++;}
    	        	if(Boton23.isChecked()){resultado++;}
    	        	if(Boton33.isChecked()){resultado++;}
    	        	if(Boton43.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado3.setText(result);
    	        }
    	    }
    	});//end listener botonX3
    	
    	Boton13.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton03.isChecked()){
    	        	resultado=5;
    	        	if(Boton13.isChecked()){resultado++;}
    	        	if(Boton23.isChecked()){resultado++;}
    	        	if(Boton33.isChecked()){resultado++;}
    	        	if(Boton43.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado3.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton13.isChecked()){resultado++;}
    	        	if(Boton23.isChecked()){resultado++;}
    	        	if(Boton33.isChecked()){resultado++;}
    	        	if(Boton43.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado3.setText(result);
    	        }
    	    }
    	});//end listener botonX3
    	
    	Boton23.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton03.isChecked()){
    	        	resultado=5;
    	        	if(Boton13.isChecked()){resultado++;}
    	        	if(Boton23.isChecked()){resultado++;}
    	        	if(Boton33.isChecked()){resultado++;}
    	        	if(Boton43.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado3.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton13.isChecked()){resultado++;}
    	        	if(Boton23.isChecked()){resultado++;}
    	        	if(Boton33.isChecked()){resultado++;}
    	        	if(Boton43.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado3.setText(result);
    	        }
    	    }
    	});//end listener botonX3
    	
    	Boton33.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton03.isChecked()){
    	        	resultado=5;
    	        	if(Boton13.isChecked()){resultado++;}
    	        	if(Boton23.isChecked()){resultado++;}
    	        	if(Boton33.isChecked()){resultado++;}
    	        	if(Boton43.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado3.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton13.isChecked()){resultado++;}
    	        	if(Boton23.isChecked()){resultado++;}
    	        	if(Boton33.isChecked()){resultado++;}
    	        	if(Boton43.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado3.setText(result);
    	        }
    	    }
    	});//end listener botonX3
    	
    	Boton43.setOnClickListener(new View.OnClickListener() {
    		private int resultado=0;
    		
    		@Override
    	    
    	    public void onClick(View arg0)
    	    {
    	        if(Boton03.isChecked()){
    	        	resultado=5;
    	        	if(Boton13.isChecked()){resultado++;}
    	        	if(Boton23.isChecked()){resultado++;}
    	        	if(Boton33.isChecked()){resultado++;}
    	        	if(Boton43.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado3.setText(result);
    	        }	
    	        else{
    	        	resultado=0;
    	        	if(Boton13.isChecked()){resultado++;}
    	        	if(Boton23.isChecked()){resultado++;}
    	        	if(Boton33.isChecked()){resultado++;}
    	        	if(Boton43.isChecked()){resultado++;}
    	        	String result=String.valueOf(resultado);
    	        	Resultado3.setText(result);
    	        }
    	    }
    	});//end listener botonX3
    	
    	
    	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_abaco, menu);
        return true;
    }
}
