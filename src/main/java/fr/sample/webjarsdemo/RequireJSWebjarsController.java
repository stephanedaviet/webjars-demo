package fr.sample.webjarsdemo;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.webjars.RequireJS;

@Controller
public class RequireJSWebjarsController {
    private final WebMvcProperties mvcProperties;

    public RequireJSWebjarsController(WebMvcProperties mvcProperties) {
        this.mvcProperties = mvcProperties;
    }

    @ResponseBody
    @GetMapping(value = "/webjars-requirejs-definition.js", produces = "application/javascript")
    public String webjarsRequireJSDefinition() {
        return RequireJS.getSetupJavaScript("/webjars/");
    }
}
