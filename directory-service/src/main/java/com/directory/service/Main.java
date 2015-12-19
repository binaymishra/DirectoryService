package com.directory.service;

import static spark.Spark.*;

public class Main {

	public static void main(String[] args) {
        port(getHerokuAssignedPort());
        get("/", (request, response) -> "");
    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 8080; 
    }

}
