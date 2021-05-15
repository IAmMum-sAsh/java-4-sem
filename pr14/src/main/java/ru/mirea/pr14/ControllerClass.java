package ru.mirea.pr14;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControllerClass {
    List<BaseClass> list = new ArrayList<BaseClass>();

    @RequestMapping(value = "/home")
    public String getHtmlPage() {
        return "index.html";
    }

    @RequestMapping(value = "/home/add_author", method = RequestMethod.POST)
    @ResponseBody
    public void addAuthor(@RequestBody Author author) {
        list.add(author);
    }

    @RequestMapping(value = "/home/add_book", method = RequestMethod.POST)
    @ResponseBody
    public void addBook(@RequestBody Book book) {
        list.add(book);
    }

    @RequestMapping(value = "/home/delete_all", method = RequestMethod.GET)
    @ResponseBody
    public void delete() {
        list = new ArrayList<BaseClass>();
    }

    @RequestMapping(value = "/home/get_all", method = RequestMethod.GET)
    @ResponseBody
    public List<BaseClass> getAll() {
        return list;
    }
}
