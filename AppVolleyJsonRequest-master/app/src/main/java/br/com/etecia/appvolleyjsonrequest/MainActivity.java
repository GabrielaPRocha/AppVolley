package br.com.etecia.appvolleyjsonrequest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    TextView codigo, nome,genero,locado ;
    Button btnCarregaDados;

    String url_json = "http://192.168.56.1/Projetovolleyapi/informacao.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        codigo = findViewById(R.id.txtCodigo);
        nome = findViewById(R.id.txtNome);
        genero = findViewById(R.id.txtGenero);
        locado = findViewById(R.id.txtlocado);

        btnCarregaDados = findViewById(R.id.btnCarregaInformacao);

        btnCarregaDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (getApplicationContext(),Listar_filmes.class))
                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url_json, null,
                        new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                try {
                                    //Os nomes recebidos pelo response.get deverá ter o mesmo nome dos campos da tabela php
                                    nome.setText(response.getString("Codigo"));
                                    nome.setText(response.getString("Nome"));
                                    email.setText(response.getString("genero"));
                                    mobile.setText(response.getString("locado"));
                                } catch (JSONException e) {
                                    Toast.makeText(getApplicationContext(),
                                            "Nenhum nome encontrado...",
                                            Toast.LENGTH_SHORT).show();
                                    e.printStackTrace();
                                }
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(),
                                "Erro ao carregar as informações",
                                Toast.LENGTH_SHORT).show();
                        error.printStackTrace();
                    }
                });
                MySingleton.getInstance(MainActivity.this).addToRequestque(jsonObjectRequest);
            }
        });
    }
}
