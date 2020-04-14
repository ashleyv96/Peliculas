package com.ashley.domain

import com.ashley.domain.entities.MovieEntity
import com.ashley.domain.entities.Optional
import io.reactivex.Observable

<<<<<<< HEAD

=======
/**
 * Created by Yossi Segev on 11/11/2017.
 */
>>>>>>> git3/master
interface MoviesDataStore {

    fun getMovieById(movieId: Int): Observable<Optional<MovieEntity>>
    fun getMovies(): Observable<List<MovieEntity>>
    fun search(query: String): Observable<List<MovieEntity>>
}