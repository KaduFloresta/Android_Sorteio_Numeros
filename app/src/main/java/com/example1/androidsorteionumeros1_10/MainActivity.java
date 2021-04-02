// Define onde o arquivo está...
package com.example1.androidsorteionumeros1_10;

// Carrega os recursos utilizados
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

// Classe - Ações
public class MainActivity extends AppCompatActivity {

    // Começo da aplicação
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){
        // Acessando o componente pelo ID
        TextView numero = findViewById(R.id.textoResultado);

        // Gerar numero aleatório
        int resultado = new Random().nextInt(11);

        // Inserindo Texto + o valor randomico
        numero.setText("Número Sorteado: " + resultado);
    }
}