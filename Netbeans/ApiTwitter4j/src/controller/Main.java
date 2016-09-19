package controller;

import java.util.List;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Main {

    public static void main(String[] args) throws TwitterException {
      
        ConfigurationBuilder ob = new ConfigurationBuilder();
        
    //  Chaves de Autenticação 
          ob.setDebugEnabled(true)
            .setOAuthConsumerKey("6y2K7WKmyUf1wKiQzVZYmK2oI")
            .setOAuthConsumerSecret("ejeXfe4UV9HePneepx4YQwIF0MTtIjN7rQqeg8Jbg6uZ9gVOh6")
            .setOAuthAccessToken("4187574207-Dpz1UxWn8Y3z1mMCFP15DklnGf3YuucU4ymWlBK")
            .setOAuthAccessTokenSecret("WbZaq1On8KXo6MdJDoUruORPfsJtkwelmR1QSL4dTHsTI");
        
        TwitterFactory tf = new TwitterFactory(ob.build());
        twitter4j.Twitter tw = tf.getInstance();
        
    //  Poster na Time Line do Twitter
    //  Status Stat = tw.updateStatus("Bem Vindo ao Twitter @@@");
        System.out.println("Twitter Atualizado");
        
    //  Ler a Time Line do Twitter
        List<Status> Statuss = tw.getHomeTimeline();
        
            for(Status status1: Statuss){  
                
            System.out.println(status1.getUser().getName()+":"+status1.getText());
            
            }
    }    
}
