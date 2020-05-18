/**
 * Author : DKSilverX
 * Date : 12/04/2020
 */
package io.methea.metheahost.controller;

import io.methea.utils.SystemUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WebClientController {
    @RequestMapping(value = {"/"})
    public String home(Model model, HttpServletRequest request){
        model.addAttribute("contextPath", SystemUtils.getBaseUrl(request));
        return "web/web-host";
    }
}
