package br.edu.ifpb.cadastrardados.listiners;

import android.content.Intent;
import android.view.View;

import br.edu.ifpb.cadastrardados.ListarActivity;
import br.edu.ifpb.cadastrardados.MainActivity;

/**
 * Created by Henrique on 05/10/2016.
 */
public class TelaListarListiner implements View.OnClickListener{

    MainActivity main;

    public TelaListarListiner(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this.main,ListarActivity.class);
        this.main.startActivity(intent);
    }
}
