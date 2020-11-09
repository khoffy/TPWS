package com.khoffylab;

import com.khoffylab.ws.BanqueService;

import javax.xml.ws.Endpoint;

// Creation d'un serveur pour l'application
public class ServeurJaxWS {
    public static void main(String[] args) {
        // Pour accéder au serveur http://localhost:8686/BanqueWS?wsdl
        String url = "http://0.0.0.0:8686/";
        // Endpoint de jax-ws pour publier un web service java
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service déployé sur " + url );
    }
}
