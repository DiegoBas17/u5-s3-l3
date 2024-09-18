package diegobasili.u5_s3_l3.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info info = new Info("gabriel", "azamfiri", new Date(97, 9, 16));
        DataSource dataSource = new Adapter(info);
        UserData userData = new UserData();
        userData.getData(dataSource);
        System.out.println("il nome completo è: "+ userData.getNomeCompleto());
        System.out.println("la sua eta è: " + userData.getEta());
    }
}
