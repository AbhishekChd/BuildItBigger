package com.udacity.gradle.builditbigger.backend;

import com.example.abhishek.jokeprovider.JokeProvider;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "jokesApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {
    /**
     * Shortt method to fetch joke from {@link JokeProvider}
     * @return {@link MyBean} object
     */
    @ApiMethod(name = "fetchJoke")
    public MyBean fetchJoke() {
        MyBean response = new MyBean();
        JokeProvider jokeProvider = new JokeProvider();
        response.setData(jokeProvider.getRandomJoke());
        return response;
    }
}
