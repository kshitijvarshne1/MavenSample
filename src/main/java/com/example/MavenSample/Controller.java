/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 31-Dec-20
 *   Time: 3:12 PM
 *   File: Controller.java
 */

package com.example.MavenSample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/Hi")
    public String sayHi(){
        return "Hello I am from Mars";
    }
    @GetMapping("/search")
    public String searchWord(@RequestParam String q)
    {
        DataStore db = new DataStore();
        return db.getFromDB(q);
    }

}

