package com.therock.resistence;

import android.graphics.drawable.PaintDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Breiniciar, Bnegro, Bmarron, Brojo, Bnaranja, Bamarillo, Bverde, Bazul, Bpurpura, Bgris, Bblanco, Bmasdorado, Bmasgris;
    private TextView Tprimero, Tsegundo, Ttercero, Tcuarto, Tresultado;
    private Integer contador = 0;
    private String First = " ", Second = " ", complete = " ";
    private Double Result = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Breiniciar = (Button) findViewById(R.id.Breiniciar);
        Bnegro = (Button) findViewById(R.id.Bnegro);
        Bmarron = (Button) findViewById(R.id.Bmarron);
        Brojo = (Button) findViewById(R.id.Brojo);
        Bnaranja = (Button) findViewById(R.id.Bnaranja);
        Bamarillo = (Button) findViewById(R.id.Bamarillo);
        Bverde = (Button) findViewById(R.id.Bverde);
        Bazul = (Button) findViewById(R.id.Bazul);
        Bpurpura = (Button) findViewById(R.id.Bpurpura);
        Bgris = (Button) findViewById(R.id.Bgris);
        Bblanco = (Button) findViewById(R.id.Bblanco);
        Bmasdorado = (Button) findViewById(R.id.Bmasdorado);
        Bmasgris = (Button) findViewById(R.id.Bmasgris);
        Tprimero = (TextView) findViewById(R.id.Tprimero);
        Tsegundo = (TextView) findViewById(R.id.Tsegundo);
        Ttercero = (TextView) findViewById(R.id.Ttercero);
        Tcuarto = (TextView) findViewById(R.id.Tcuarto);
        Tresultado = (TextView) findViewById(R.id.Tresultado);

    }

    public void Reiniciar(View view) {
        Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.white));
        Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.white));
        Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.white));
        Tcuarto.setBackgroundColor(Tcuarto.getContext().getResources().getColor(R.color.white));
        Tresultado.setText(" ");
        contador = 0;
    }

    public void Negro(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.black));
            contador += 1;
            First = "0";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.black));
            contador += 1;
            Second = "0";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.black));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) * 1;
        } else if (contador >= 3) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Marron(View view) {

        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.brown));
            contador += 1;
            First = "1";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.brown));
            contador += 1;
            Second = "1";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.brown));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) * 10;
        } else if (contador == 3) {
            Tcuarto.setBackgroundColor(Tcuarto.getContext().getResources().getColor(R.color.brown));
            contador += 1;
            Tresultado.setText("Resistencia de: " + Result + " Ohms y Tolerancia de +-1%");
        } else if (contador >= 4) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Rojo(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.red));
            contador += 1;
            First = "2";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.red));
            contador += 1;
            Second = "2";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.red));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) * 100;
        } else if (contador == 3) {
            Tcuarto.setBackgroundColor(Tcuarto.getContext().getResources().getColor(R.color.red));
            contador += 1;
            Tresultado.setText("Resistencia de: " + Result + " Ohms y Tolerancia de +-5%");
        } else if (contador >= 4) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Naranja(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.orangered));
            contador += 1;
            First = "3";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.orangered));
            contador += 1;
            Second = "3";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.orangered));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) * 1000;
        } else if (contador >= 3) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Amarillo(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.yellow));
            contador += 1;
            First = "4";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.yellow));
            contador += 1;
            Second = "4";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.yellow));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) * 10000;
        } else if (contador >= 3) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Verde(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.green));
            contador += 1;
            First = "5";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.green));
            contador += 1;
            Second = "5";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.green));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) * 100000;
        } else if (contador >= 3) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Azul(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.blue));
            contador += 1;
            First = "6";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.blue));
            contador += 1;
            Second = "6";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.blue));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) * 1000000;
        } else if (contador >= 3) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Purpura(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.purple));
            contador += 1;
            First = "7";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.purple));
            contador += 1;
            Second = "7";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.purple));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) / 10;
        } else if (contador >= 3) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Gris(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.gray));
            contador += 1;
            First = "8";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.gray));
            contador += 1;
            Second = "8";
        } else if (contador == 2) {
            Ttercero.setBackgroundColor(Ttercero.getContext().getResources().getColor(R.color.gray));
            contador += 1;
            complete = First + Second;
            Result = Double.parseDouble(complete) / 100;
        } else if (contador >= 3) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void Blanco(View view) {
        if (contador == 0) {
            Tprimero.setBackgroundColor(Tprimero.getContext().getResources().getColor(R.color.white));
            contador += 1;
            First = "9";
        } else if (contador == 1) {
            Tsegundo.setBackgroundColor(Tsegundo.getContext().getResources().getColor(R.color.white));
            contador += 1;
            Second = "9";
        } else if (contador >= 2) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void MasDorado(View view) {
        if (contador == 0) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 1) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 2) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 3) {
            Tcuarto.setBackgroundColor(Tcuarto.getContext().getResources().getColor(R.color.goldenrod));
            contador += 1;
            Tresultado.setText("Resistencia de: " + Result + " Ohms y Tolerancia de +-5%");
        } else if (contador >= 4) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }

    public void MasGris(View view) {
        if (contador == 0) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 1) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 2) {
            Tresultado.setText("Error, No Valido");
        } else if (contador == 3) {
            Tcuarto.setBackgroundColor(Tcuarto.getContext().getResources().getColor(R.color.darkblue));
            contador += 1;
            Tresultado.setText("Resistencia de: " + Result + " Ohms y Tolerancia de +-10%");
        } else if (contador >= 4) {
            Tresultado.setText("Error, No Valido, llego al limite de colores");
        }
    }
}
