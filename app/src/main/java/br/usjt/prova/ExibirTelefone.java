package br.usjt.prova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
// Nome: Cláudio Oliveira, RA:201518641
public class ExibirTelefone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_telefone);

        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.EXTRA_TELEFONE);
        TextView textView = new TextView(this);
        textView.setText("O seu número de telefone convertido é: \n"+ message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_exibir_telefone);
        layout.addView(textView);
    }
}
