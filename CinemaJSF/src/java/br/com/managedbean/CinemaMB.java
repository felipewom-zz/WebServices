/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.managedbean;

import br.com.model.Filme;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Felipe
 */
@ManagedBean
public class CinemaMB {
    public List<Filme> getFilmesEmCartaz(){
        Client client = Client.create();
        WebResource wr = client.resource("http://localhost:8080/Cinema/webresources/filmes");
        String json = wr.get(String.class);
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<List<Filme>>(){}.getType());
    }
}
