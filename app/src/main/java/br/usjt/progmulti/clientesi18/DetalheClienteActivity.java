package br.usjt.progmulti.clientesi18;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author RA:818119557 Nome:Alison Almeida Turma: SIN3AN-MCA1
 */
public class DetalheClienteActivity extends Activity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_cliente);
        TextView nomeSelecionado = (TextView)findViewById(R.id.nome_selecionado);
        Intent intent = getIntent();
        nomeSelecionado.setText(intent.getStringExtra(ListaClientesActivity.NOME));
    }
}
