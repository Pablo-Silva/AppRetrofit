package com.example.appretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText titulo, duracao, genero;
    private TextView textView;
    private APIService mAPIService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titulo = findViewById(R.id.titulo);
        duracao = findViewById(R.id.duracao);
        genero = findViewById(R.id.genero);
        textView = findViewById(R.id.textView);

    }


    public void onClick(View view){
        mAPIService = ApiUtils.getAPIService();
        String tituloAux = titulo.getText().toString().trim();
        String duracaoAux = duracao.getText().toString().trim();
        String generoAux = genero.getText().toString().trim();
        if(!TextUtils.isEmpty(tituloAux) && !TextUtils.isEmpty(duracaoAux)) {
            sendPost(tituloAux, duracaoAux, generoAux);
        }
    }

    public void sendPost(String titulo, String duracao, String genero) {
        Filme filme = new Filme();
        filme.setGenero(genero);
        filme.setDuracao(duracao);
        filme.setTitulo(titulo);

        Gson gson = new Gson();

        String json = gson.toJson(filme);

        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), json);


        mAPIService.savePost(body).enqueue(new Callback<Filme>() {

            @Override
            public void onResponse(Call<Filme> call, Response<Filme> response) {

                if(response.isSuccessful()) {
                    showResponse(response.body().toString());
                    Toast.makeText(getApplicationContext(), "post submitted to API.", Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onFailure(Call<Filme> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Unable to submit post to API." , Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void showResponse(String response) {
        if(textView.getVisibility() == View.GONE) {
            textView.setVisibility(View.VISIBLE);
        }
        textView.setText(response);
    }
}
