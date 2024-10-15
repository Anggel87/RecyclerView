package Adaptador;
import com.example.recyclerview.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import Modelos.Persona;

public class PersonasAdapter extends RecyclerView.Adapter<PersonasAdapter.PersonaViewHolder> {

    private List<Persona> listaPersonas;

    public PersonasAdapter(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public int getItemCount() {
        return listaPersonas.size();
    }

    @NonNull
    @Override
    public PersonaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_persona, parent, false);
        return new PersonaViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonaViewHolder holder, int position) {
        Persona persona = listaPersonas.get(position);
        holder.txtNombre.setText(persona.getNombre());
        holder.txtTelefono.setText(persona.getTelefono());
    }

    public static class PersonaViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre, txtTelefono;

        public PersonaViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtTelefono = itemView.findViewById(R.id.txtTelefono);
        }
    }
}
