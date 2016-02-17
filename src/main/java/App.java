import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {

    String layout = "templates/layout.vtl";

    get("/", (request,response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model,layout);
    }, new VelocityTemplateEngine());

    get("/artists", (request,response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("artists", Artist.all());
      model.put("template", "templates/artists");
      return new ModelAndView(model,layout);
    }, new VelocityTemplateEngine());

    post("/artists", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      String artist = request.queryParams("artist");
      Artist newArtist = new Artist(artist);
      model.put("template", "templates/confirmation.vtl");
      return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

    get("/artists/:id", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      Artist artist = Artist.find(Integer.parseInt(request.params(":id")));
      model.put("artist", artist);
      model.put("template", "templates/artists.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
