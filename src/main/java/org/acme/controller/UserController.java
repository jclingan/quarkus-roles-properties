package org.acme.controller;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.data.User;


@Path("/users")
public class UserController {

    @GET
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(){
        return new User("Defaut User", "1", 40);
    }
}