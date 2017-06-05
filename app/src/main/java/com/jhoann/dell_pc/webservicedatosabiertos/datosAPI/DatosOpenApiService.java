package com.jhoann.dell_pc.webservicedatosabiertos.datosAPI;

import com.jhoann.dell_pc.webservicedatosabiertos.models.Lengua;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by DDELL-PC on 22/05/2017.
 */

public interface DatosOpenApiService {

    @GET("y5wk-q9yj.json")
    Call<ArrayList<Lengua>> obtenerListaLenguas();
}
