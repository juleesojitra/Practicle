package com.example.retrofeetpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.retrofeetpractical.Model.Country;

import java.util.List;

public class countryActivity extends AppCompatActivity {

    List<Country>list;
    ImageView flag;
    TextView country_name,independent,status,unMember,currencies,symbol,capital,region,subregion,languages,maps
                ,population,timezones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        list = DataAdepter.list;

        flag = findViewById(R.id.flags);
        country_name = findViewById(R.id.country_name);
        unMember = findViewById(R.id.unMember);
        independent = findViewById(R.id.independent);
        status = findViewById(R.id.status);
        currencies = findViewById(R.id.currencies);
        symbol = findViewById(R.id.symbol);
        capital = findViewById(R.id.capital);
        region = findViewById(R.id.region);
        subregion = findViewById(R.id.subregion);
        languages = findViewById(R.id.languages);
        maps = findViewById(R.id.maps);
        population = findViewById(R.id.population);
        timezones = findViewById(R.id.timezones);

        int flagss = getIntent().getIntExtra("position", 0);

        try {
            Glide.with(countryActivity.this).load(list.get(flagss).getFlags().getPng()).into(flag);
        } catch (Exception e) {
        }

        try {
            country_name.setText(list.get(flagss).getName().getCommon());
        } catch (Exception e) {
        }

        try {

            if (list.get(flagss).getIndependent() == true) {
                independent.setText("true");
            } else {
                independent.setText("false");
            }
        } catch (Exception e) {
        }

        try {
            status.setText(list.get(flagss).getStatus());
        } catch (Exception e) {
        }

        try {

            if (list.get(flagss).getUnMember() == true) {
                unMember.setText("true");
            } else {
                unMember.setText("false");
            }
        } catch (Exception e) {
        }

//        try {
//            currencies.setText(list.get(flagss).getCurrencies());
//        }catch (Exception e){
//        }

        try {
            symbol.setText(list.get(flagss).getCurrencies().getEur().getSymbol());
        }catch (Exception e){
        }
        try {
            capital.setText(list.get(flagss).getCapital().toString());
        } catch (Exception e) {
        }

        try {
            region.setText(list.get(flagss).getRegion());
        } catch (Exception e) {
        }

        try {
            subregion.setText(list.get(flagss).getSubregion());
        } catch (Exception e) {
        }

        try {
            languages.setText(list.get(flagss).getLanguages().getCnr());
        } catch (Exception e) {
        }

        try {
            maps.setText(list.get(flagss).getMaps().getOpenStreetMaps());
        } catch (Exception e) {
        }

        try {
            population.setText(list.get(flagss).getPopulation());
        } catch (Exception e) {
        }
        try {
            timezones.setText(list.get(flagss).getTimezones().get());
        } catch (Exception e) {
        }

    }

}