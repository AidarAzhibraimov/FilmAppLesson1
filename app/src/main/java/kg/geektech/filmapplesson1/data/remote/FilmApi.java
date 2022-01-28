package kg.geektech.filmapplesson1.data.remote;

import java.util.List;

import kg.geektech.filmapplesson1.data.model.Film;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FilmApi {



    @GET("/films")
    Call<List<Film>> getFilms();

    @GET("/films/{id}")
    Call<Film> filmId(
            @Path("id") String id
    );

}
