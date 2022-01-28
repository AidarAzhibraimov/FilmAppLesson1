package kg.geektech.filmapplesson1.ui.films;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import kg.geektech.filmapplesson1.data.model.Film;
import kg.geektech.filmapplesson1.databinding.ItemFilmBinding;

public class FilmsAdapter extends RecyclerView.Adapter<FilmsAdapter.FilmsViewHolder> {

    private List<Film> films = new ArrayList<>();
    private OnItemClick onItemClick;

    public FilmsAdapter(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
        notifyDataSetChanged();
    }
    public void getId(int position){
        films.get(position);
    }

    @NonNull
    @Override
    public FilmsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemFilmBinding binding = ItemFilmBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false);
        return new FilmsViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmsViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.onBind(films.get(position));
    }


    @Override
    public int getItemCount() {
        return films.size();
    }

    public class FilmsViewHolder extends RecyclerView.ViewHolder {
            private ItemFilmBinding binding;
            public FilmsViewHolder(@NonNull ItemFilmBinding binding){
                super(binding.getRoot());
                this.binding = binding;
            }

        public void onBind(Film film) {
                binding.tvTitle.setText(film.getTitle());
                binding.tvDescription.setText(film.getDescription());
                Glide.with(binding.imgDetail).load(film.getMoveBanner()).into(binding.imgDetail);
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onItemClick.onClick(film, film.getId());
                    }
                });
        }
    }
}
