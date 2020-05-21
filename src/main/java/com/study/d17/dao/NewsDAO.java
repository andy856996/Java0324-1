package com.study.d17.dao;

import com.google.gson.Gson;
import com.study.d17.entity.Data;
import com.study.d17.entity.News;
import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.lang.StringEscapeUtils;

public class NewsDAO {
    private static News news;
    static {
        try {
            File file = new File("src\\main\\java\\com\\study\\d17\\db\\news.link");
            String url_string = new Scanner(file).useDelimiter("\\A").next();
            URL url = new URL(url_string);
            String json = new Scanner(url.openStream()).useDelimiter("\\A").next();
            json = StringEscapeUtils.unescapeJava(json);
            news = new Gson().fromJson(json, News.class);
        } catch (Exception e) {
        }
    }
    
    public News getNews() {
        return news;
    }
    
    public Data getDataByDate(String date) {
        return news.getData().stream()
                .filter(d -> d.getTitle().contains(date))
                .findFirst()
                .get();
    }
    
}
