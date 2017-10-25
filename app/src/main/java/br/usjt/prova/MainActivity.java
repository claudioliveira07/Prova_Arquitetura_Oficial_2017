package br.usjt.prova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
// Nome: Cláudio Oliveira, RA:201518641
public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_TELEFONE = "EXTRA_TELEFONE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validarTelefone(View view) {
        EditText to = (EditText) findViewById(R.id.editText);
        String telefone = to.getText().toString();
        String v;
        String telefoneConvertido ="";

        if(telefone.length()!=0) {
            for (int i = 0; i < telefone.length(); i++) {
                v = telefone.substring(i, i + 1);
                if (v.equals("A") || v.equals("a") || v.equals("B") || v.equals("b") || v.equals("C") || v.equals("c")) {
                    v = "2";
                } else if (v.equals("D") || v.equals("d") || v.equals("E") || v.equals("e") || v.equals("F") || v.equals("f")) {
                    v = "3";
                } else if (v.equals("G") || v.equals("g") || v.equals("H") || v.equals("h") || v.equals("I") || v.equals("I")) {
                    v = "4";
                } else if (v.equals("J") || v.equals("j") || v.equals("K") || v.equals("k") || v.equals("L") || v.equals("l")) {
                    v = "5";
                } else if (v.equals("M") || v.equals("m") || v.equals("N") || v.equals("n") || v.equals("O") || v.equals("o")) {
                    v = "6";
                } else if (v.equals("P") || v.equals("p") || v.equals("Q") || v.equals("q") || v.equals("R") || v.equals("r") || v.equals("S") || v.equals("s")) {
                    v = "7";
                } else if (v.equals("T") || v.equals("t") || v.equals("U") || v.equals("u") || v.equals("V") || v.equals("v")) {
                    v = "8";
                } else if (v.equals("W") || v.equals("w") || v.equals("X") || v.equals("x") || v.equals("Y") || v.equals("y") || v.equals("Z") || v.equals("z")) {
                    v = "9";
                }
                telefoneConvertido += v;
            }
        }else{
            telefoneConvertido = "Insira um número / Letra de telefone para exibi-lo";
        }

        Intent intent = new Intent(this, ExibirTelefone.class);
        intent.putExtra(EXTRA_TELEFONE, telefoneConvertido);
        startActivity(intent);
    }
}
