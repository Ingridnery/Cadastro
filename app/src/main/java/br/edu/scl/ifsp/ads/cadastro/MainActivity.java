package br.edu.scl.ifsp.ads.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nomeE;
    private EditText telefoneE;
    private EditText emailE;
    private CheckBox ingressarCB;
    private RadioButton masculinoRB;
    private RadioButton femininoRB;
    private RadioGroup sexoRG;
    private EditText cidadeE;
    private Spinner estadoSp;

    private Button limparBt;
    private Button salvarBt;

    private String nome;
    private String telefone;
    private String email;
    private String cidade;
    private String estado;
    private Boolean ingressar;
    private Sexo sexo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeE = findViewById(R.id.nomeE);
        telefoneE = findViewById(R.id.telefoneE);
        emailE = findViewById(R.id.emailE);
        ingressarCB=findViewById(R.id.ingressarCB);
        masculinoRB= findViewById(R.id.masculinoRB);
        femininoRB=findViewById(R.id.femininoRB);
        cidadeE=findViewById(R.id.cidadeE);
        estadoSp= findViewById(R.id.estadoSp);

        salvarBt= findViewById(R.id.salvarBt);
        salvarBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validar()){
                    ingressar= ingressarCB.isChecked();
                    if(femininoRB.isChecked())
                        sexo = Sexo.FEMININO;
                    else
                        sexo = Sexo.MASCULINO;
                    nome = String.valueOf(nomeE.getText());
                    telefone = String.valueOf(telefoneE.getText());
                    email = String.valueOf(emailE.getText());
                    cidade = String.valueOf(cidadeE.getText());
                    estado = estadoSp.getSelectedItem().toString();

                    Formulario formulario = new Formulario(nome,telefone,email,ingressar,sexo,cidade,estado);

                    Context context = getApplicationContext();
                    CharSequence text = formulario.toString();
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    limpar();

                }

            }
        });

        limparBt=findViewById(R.id.limparBt);
        limparBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpar();

            }
        });


    }
    private boolean validar(){
        if(nomeE.length()==0){
            nomeE.setError("Campo obrigatorio");
            return false;
        }
        if(telefoneE.length()==0){
            telefoneE.setError("Campo obrigatorio");
            return false;
        }
        if(emailE.length()==0){
            emailE.setError("Campo obrigatorio");
            return false;
        }
        if(cidadeE.length()==0){
            cidadeE.setError("Campo obrigatorio");
            return false;

        }
        return true;

    }
    private void limpar(){
        nomeE.setText("");
        telefoneE.setText("");
        emailE.setText("");
        cidadeE.setText("");
        ingressarCB.setChecked(false);

    }
}

