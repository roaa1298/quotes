package quotes;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class QuotesAPI {
    private String quoteText;
    private String quoteAuthor;
//    ArrayList<QuotesAPI> quoteApiList=new ArrayList<>();

    public QuotesAPI(String quoteText, String quoteAuthor){
        this.quoteText=quoteText;
        this.quoteAuthor=quoteAuthor;
    }

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public String getQuoteText() {
        return quoteText;
    }

//    public void getQuoteAPI() throws IOException {
//        URL quotUrl = new URL("http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en");
//        HttpURLConnection quotHttpURLConnection = (HttpURLConnection) quotUrl.openConnection();
//        quotHttpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
//        quotHttpURLConnection.setRequestMethod("GET");
//        InputStreamReader quotInputStreamReader = new InputStreamReader(quotHttpURLConnection.getInputStream());
//        BufferedReader quotBufferedReader = new BufferedReader(quotInputStreamReader);
//        String quotData = quotBufferedReader.readLine();
//        System.out.println(quotData);
//
//        Gson gson = new Gson();
//        QuotesAPI quoteObj=gson.fromJson(quotData,QuotesAPI.class);
//        quoteApiList.add(quoteObj);
//
//        System.out.println(quoteApiList);
//        System.out.println(quoteApiList.size());
//
//        File quoteFile = new File("./dailyQuote.json");
//        try (FileWriter quoteFileWriter = new FileWriter(quoteFile)) {
//            gson.toJson(quoteApiList, quoteFileWriter);
//        }
//    }

    @Override
    public String toString() {
        return "QuotesAPI{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                '}';
    }
}
