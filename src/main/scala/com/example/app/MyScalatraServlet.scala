package com.example.app

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {

  post("/users") {
    "POST => users => create"
  }

  get("/users") {
    "GET => users => list"
  }

  get("/users/:id") {
    "GET => users => index"
  }

  patch("/users/:id") {
    "PATCH => users => update"
  }

  put("/users/:id") {
    "PUT => users => replace"
  }

  delete("/users/:id") {
    "DELETE => users => destroy"
  }
}