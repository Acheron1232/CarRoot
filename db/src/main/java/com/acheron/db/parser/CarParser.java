package com.acheron.db.parser;

import com.acheron.db.model.Brand;
import com.acheron.db.model.Model;
import com.acheron.db.repository.BrandRepository;
import com.acheron.db.repository.ModelRepository;
import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarParser{
    @Autowired
    ModelRepository modelRepository;
    @Autowired
    BrandRepository brandRepository;

    @SneakyThrows
    public void parse() {
        var connect = Jsoup.connect("https://www.autoevolution.com/cars/");
        var document = connect.get();
        var elements = document.getElementsByClass("col2width fl bcol-white carman");
        for(Element element : elements){
            var href = element.getElementsByTag("a").get(0).attr("href");
            var name1 = element.getElementsByTag("span").get(0).text();
            var img = element.getElementsByTag("a").get(0).getElementsByTag("img").get(0).attr("src");
            var brand = Brand.builder().name(name1).image(img).build();
            var brand1 = brandRepository.saveAndFlush(brand);
            var connect1 = Jsoup.connect(href);
            var document1 = connect1.get();
            var elements1 = document1.getElementsByClass("col2width bcol-white fl");
            for (Element element1 : elements1){
                var name = element1.getElementsByTag("a").get(0).getElementsByTag("h4").get(0).text();
                var body = element1.getElementsByClass("body").get(0).text();
                var img1 = element1.getElementsByTag("img").get(0).attr("src");
                modelRepository.saveAndFlush(Model.builder().img(img1).bodyType(body).name(name).brand(brand1).build());
            }
            System.out.println(brand1.getId());
        }
    }
}