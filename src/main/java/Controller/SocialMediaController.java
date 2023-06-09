package Controller;

import io.javalin.Javalin;
import io.javalin.http.Context;

/**
 * TODO: You will need to write your own endpoints and handlers for your controller. The endpoints you will need can be
 * found in readme.md as well as the test cases. You should
 * refer to prior mini-project labs and lecture materials for guidance on how a controller may be built.
 */
public class SocialMediaController {
    /**
     * In order for the test cases to work, you will need to write the endpoints in the startAPI() method, as the test
     * suite must receive a Javalin object from this method.
     * @return a Javalin app object which defines the behavior of the Javalin controller.
     */
    public Javalin startAPI() {
        Javalin app = Javalin.create();
        app.post("/register", this::registerSocialMediaController);
        app.post"/login", this::loginSocialMediaController);
        app.post("messages", this::postMessagesSocialMediaController);
        app.get("/messages/,{message_id}",this::messagesByIDSocaialMediaController);
        app.get("/messages",this::getAllMessagesSocialMediaController);
        app.delete("messages/{mesage_id}",this::deleteMessageByIDSocialMediaController);
        app.(patch("messages/{message_id}", this::updateMessageSocialMediaController);
        app.get("accounts/{account_id}/messages", this::getMessageByUserSocialMediaController);
        app.start(8080);

        return app;
    }

    /**
     * This is an example handler for an example endpoint.
     * @param context The Javalin Context object manages information about both the HTTP request and response.
     */
    private void exampleHandler(Context context) {
        context.json("sample text");
    }


}