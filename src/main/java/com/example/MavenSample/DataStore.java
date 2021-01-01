/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 31-Dec-20
 *   Time: 3:18 PM
 *   File: DataStore.java
 */

package com.example.MavenSample;

import java.util.HashMap;

public class DataStore {
    public static HashMap<String, String> Datastore = new HashMap();

    public DataStore(){
        Datastore.put("Sachin","A great Cricketer");
        Datastore.put("Dhoni","A great Captain");
    }
    public String getFromDB(String word){
        return DataStore.Datastore.get(word);

    }

}

