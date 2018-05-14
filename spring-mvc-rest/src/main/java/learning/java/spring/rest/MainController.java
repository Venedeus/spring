package learning.java.spring.rest;

import learning.java.spring.beans.MyDataObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

@Controller
@RequestMapping(value = "/myservice")
public class MainController {
    @RequestMapping(value = "/{time}", method = RequestMethod.GET)
    @ResponseBody
    public MyDataObject getMyData(@PathVariable long time){
        return new MyDataObject(Calendar.getInstance(), "This is an answer of GET method.");
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public MyDataObject putMyData(@RequestBody MyDataObject md){
        return md;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public MyDataObject postMyData(){
        return new MyDataObject(Calendar.getInstance(), "This is an answer of POST method.");
    }

    @RequestMapping(value = "/{time}", method = RequestMethod.DELETE)
    @ResponseBody
    public MyDataObject deleteMyData(@PathVariable long time){
        return new MyDataObject(Calendar.getInstance(), "This is an answer of DELETE method.");
    }
}
