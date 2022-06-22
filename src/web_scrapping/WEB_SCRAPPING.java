package web_scrapping;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class WEB_SCRAPPING {
    static int i = 0;
    public static void main(String[] args) {
        try {
            for(int p =1;p<215;p++){
            org.jsoup.nodes.Document doc = Jsoup.connect("https://coinranking.com/?sorton=market-cap&page="+p).userAgent("Mozilla/17.0").get();
           for (int l = 0; l < 10676; l++) {
                Elements temp = doc.select("#__layout > div > section > table > tbody > tr:nth-child(" + l + ") > td.table__cell.table__cell--3-of-8.table__cell--s-5-of-10 > div.profile.profile--light > span.profile__name > a");
                for (Element text : temp) {
                    System.out.println(i + "  " + text.getElementsByTag("a").first().text());                   
                    i++;
                }
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
