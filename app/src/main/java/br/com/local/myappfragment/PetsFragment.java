package br.com.local.myappfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class PetsFragment extends Fragment {

    ListView listaPets;

    String titulo_Pets[] = {"Cachorros", "Gatos", "Pássaros"};
    int descricao_Pets[] = {R.string.texto_cachorros, R.string.texto_gatos, R.string.texto_passaros};
    String valor_Pets[] = {"8.5", "8.6", "8.7"};
    int imagem_Pets[] = {R.drawable.dog, R.drawable.gato, R.drawable.passaro};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pets, container, false);

        listaPets = view.findViewById(R.id.idListaPets);

        MyAdapter adapter = new MyAdapter();

        listaPets.setAdapter(adapter);


        return view;

    }

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imagem_Pets.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imgPets;
            TextView txtTitulo, txtDescricao, txtValor;

            View v = getLayoutInflater().inflate(R.layout.modelo_pets, null);

            txtTitulo = v.findViewById(R.id.txtTituloPets);
            txtDescricao = v.findViewById(R.id.txtDescricaoPets);
            txtValor = v.findViewById(R.id.txtValorPets);
            imgPets = v.findViewById(R.id.imgPets);

            txtTitulo.setText(titulo_Pets[position]);
            txtDescricao.setText(descricao_Pets[position]);
            txtValor.setText(valor_Pets[position]);
            imgPets.setImageResource(imagem_Pets[position]);


            return v;
        }
    }
}