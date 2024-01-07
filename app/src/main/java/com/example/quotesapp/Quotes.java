package com.example.quotesapp;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Quotes extends AppCompatActivity {

    private TextView quoteTxt,writerName;
    ImageView back;
    private final List<QuotesList> quotesLists = new ArrayList<>();

    private int currentQuotePosition = 0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        final TextView categoryName = findViewById(R.id.categoryName);
        quoteTxt = findViewById(R.id.quoteTxt);
        writerName = findViewById(R.id.writerName);

        final Button prevBtn = findViewById(R.id.prevBtn);
        final Button nextBtn = findViewById(R.id.nextBtn);
        final ImageView copyBtn = findViewById(R.id.copyBtn);

        final String getName = getIntent().getStringExtra("name");

        categoryName.setText(getName);

        findViewById(R.id.back).setOnClickListener(
                a -> finish()
        );

        switch (getName) {
            case "Life":
                quotesLists.addAll(QuotesData.getLifeQuotes());
                break;
            case "Success":
                quotesLists.addAll(QuotesData.getSuccessQuotes());
                break;
            case "Motivation":
                quotesLists.addAll(QuotesData.getMotivationQuotes());
                break;
            case "Nature Love":
                quotesLists.addAll(QuotesData.getLoveQuotes());
                break;
            case "Education":
                quotesLists.addAll(QuotesData.getEducationQuotes());
                break;
            case "Friendship":
                quotesLists.addAll(QuotesData.getFriendshipQuotes());
                break;
        }

        setQuoteToTextView();

        prevBtn.setOnClickListener(view -> {
            currentQuotePosition--;
            if(currentQuotePosition < 0){
                currentQuotePosition = quotesLists.size()-1;
            }

            setQuoteToTextView();
        });

        copyBtn.setOnClickListener(view -> {
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("quote",quotesLists.get(currentQuotePosition).getQuote()+"\nby "+quotesLists.get(currentQuotePosition).getWriter());
            clipboardManager.setPrimaryClip(clipData);

            Toast.makeText(Quotes.this, "Copied to clipboard", Toast.LENGTH_SHORT).show();
        });

        nextBtn.setOnClickListener(view -> {
           currentQuotePosition++;
           if(currentQuotePosition >= quotesLists.size()){
               currentQuotePosition = 0;
           }

           setQuoteToTextView();
        });
    }

    private void setQuoteToTextView(){
        quoteTxt.setText(quotesLists.get(currentQuotePosition).getQuote());

        writerName.setText(quotesLists.get(currentQuotePosition).getWriter());
    }
}