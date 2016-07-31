package com.example.android.justjava;


//import android.os.Bundle;
import android.os.Bundle;
//import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarActivity;
//import android.view.View;
import android.view.View;
//import android.widget.TextView;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
//public class MainActivity extends ActionBarActivity {
public class MainActivity extends ActionBarActivity {

    int numberOfCoffees=0;

    /**MainActivity(){
        TextView tv = (TextView)findViewById(R.id.quantity_text_view) ;
        numberOfCoffees =  Integer.valueOf(tv.getText().toString());
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView)findViewById(R.id.quantity_text_view) ;

    /**
        CharSequence cs = tv.getText();
        String s = cs.toString();
        Integer i = new Integer(s);
        numberOfCoffees = i.intValue();
        */
        Integer i = new Integer(tv.getText().toString());
        numberOfCoffees = i.intValue();
         /**
        numberOfCoffees =  Integer.valueOf(tv.getText().toString());
         */
        display(numberOfCoffees);
        //displayPrice(numberOfCoffees);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        //int numberOfCoffees=2;
        //display(numberOfCoffees);
        displayPrice(numberOfCoffees*6);
    }

    public void incOrder(View view) {
        //int numberOfCoffees=2;
        //display(numberOfCoffees);
        //displayPrice(numberOfCoffees*6);
        numberOfCoffees++;
        display(numberOfCoffees);
        //displayPrice(numberOfCoffees*10);
    }

    public void decOrder(View view) {
        //int numberOfCoffees=2;
        //display(numberOfCoffees);
        //displayPrice(numberOfCoffees*6);
        if(numberOfCoffees>0)
            numberOfCoffees--;
        display(numberOfCoffees);
        //displayPrice(numberOfCoffees*10);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number){
        TextView priceTextView = (TextView)findViewById(R.id.price_text_view);
        //priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
        StringBuffer str = new StringBuffer(NumberFormat.getCurrencyInstance().format(number));
        str.append("\n");
        str.append("Thank you for your order!");
        priceTextView.setText(str.toString());

    }
    /**
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }*/


    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
