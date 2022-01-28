package kg.geektech.filmapplesson1.ui.films_detail;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import kg.geektech.filmapplesson1.R;
import kg.geektech.filmapplesson1.databinding.FragmentFilmDetailBinding;


public class FilmDetailFragment extends Fragment {

   private FragmentFilmDetailBinding binding;

    public FilmDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFilmDetailBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String getDirector = requireArguments().getString("Director");
        binding.tvDirectorDetail.setText(getDirector);
        String getProducer = requireArguments().getString("Producer");
        binding.tvProducerDetail.setText(getProducer);
        String getTitle = requireArguments().getString("Title");
        binding.tvTitleDetail.setText(getTitle);
        String getReleaseDate = requireArguments().getString("ReleaseDate");
        binding.tvReleaseDateDetail.setText(getReleaseDate);
        //Glide
        String getImage = requireArguments().getString("Film");
        Glide.with(binding.imgDetail).load(getImage).into(binding.imgDetail);
    }
}