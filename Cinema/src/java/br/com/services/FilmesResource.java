/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.services;

import br.com.model.Filme;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author Felipe
 */
@Path("filmes")
public class FilmesResource {

    private List<Filme> filmes;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FilmesResource
     */
    public FilmesResource() {
        filmes = new ArrayList<Filme>();
        filmes.add(new Filme(1L, "Casa Vazia", "Um jovem vagabundo invade a casa de estranhos e mora nelas enquanto os donos estão fora. Para pagar a estadia ele realiza pequenos consertos ou faz limpeza na casa. Ele costuma ficar um ou dois dias em cada lugar, trocando de casa constantemente. Até que um dia encontra uma bela mulher em uma mansão, que assim como ele também está tentando escapar da vida que leva.", "Drama, Mistério", "<iframe width=\"728\" height=\"400\" src=\"//www.youtube.com/embed/undefined\" frameborder=\"0\" allowfullscreen></iframe>", Double.parseDouble("88")));
        filmes.add(new Filme(2L, "Casa Vazia", "Um jovem vagabundo invade a casa de estranhos e mora nelas enquanto os donos estão fora. Para pagar a estadia ele realiza pequenos consertos ou faz limpeza na casa. Ele costuma ficar um ou dois dias em cada lugar, trocando de casa constantemente. Até que um dia encontra uma bela mulher em uma mansão, que assim como ele também está tentando escapar da vida que leva.", "Drama, Mistério", "<iframe width=\"728\" height=\"400\" src=\"//www.youtube.com/embed/undefined\" frameborder=\"0\" allowfullscreen></iframe>", Double.parseDouble("88")));
        filmes.add(new Filme(3L, "Casa Vazia", "Um jovem vagabundo invade a casa de estranhos e mora nelas enquanto os donos estão fora. Para pagar a estadia ele realiza pequenos consertos ou faz limpeza na casa. Ele costuma ficar um ou dois dias em cada lugar, trocando de casa constantemente. Até que um dia encontra uma bela mulher em uma mansão, que assim como ele também está tentando escapar da vida que leva.", "Drama, Mistério", "<iframe width=\"728\" height=\"400\" src=\"//www.youtube.com/embed/undefined\" frameborder=\"0\" allowfullscreen></iframe>", Double.parseDouble("88")));
        filmes.add(new Filme(4L, "Casa Vazia", "Um jovem vagabundo invade a casa de estranhos e mora nelas enquanto os donos estão fora. Para pagar a estadia ele realiza pequenos consertos ou faz limpeza na casa. Ele costuma ficar um ou dois dias em cada lugar, trocando de casa constantemente. Até que um dia encontra uma bela mulher em uma mansão, que assim como ele também está tentando escapar da vida que leva.", "Drama, Mistério", "<iframe width=\"728\" height=\"400\" src=\"//www.youtube.com/embed/undefined\" frameborder=\"0\" allowfullscreen></iframe>", Double.parseDouble("88")));
        filmes.add(new Filme(5L, "Casa Vazia", "Um jovem vagabundo invade a casa de estranhos e mora nelas enquanto os donos estão fora. Para pagar a estadia ele realiza pequenos consertos ou faz limpeza na casa. Ele costuma ficar um ou dois dias em cada lugar, trocando de casa constantemente. Até que um dia encontra uma bela mulher em uma mansão, que assim como ele também está tentando escapar da vida que leva.", "Drama, Mistério", "<iframe width=\"728\" height=\"400\" src=\"//www.youtube.com/embed/undefined\" frameborder=\"0\" allowfullscreen></iframe>", Double.parseDouble("88")));
    }

    /**
     * Retrieves representation of an instance of br.com.services.FilmesResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        Gson gson = new Gson();
        return gson.toJson(filmes);
    }
    
    @Path("{filmeId}")
    @GET
    @Produces("application/json")
    public String getFilme(@PathParam("filmeId") String id){
        for(Filme filme: filmes){
            if(filme.getId().equals(Long.valueOf(id))){
                Gson gson = new Gson();
                return gson.toJson(filme);
            }
        }
        return "Filme nao encontrado!";
    }
    /**
     * PUT method for updating or creating an instance of FilmesResource
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
