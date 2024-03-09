import java.util.ArrayList;
import java.util.List;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SuppressWarnings("deprecation")
public class Bot extends TelegramLongPollingBot {

    private SendMessage sendMessage ;

    @Override
    public String getBotUsername() {
        // TODO
        return "jrktunotesbot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "6947476591:AAGrmnCvegH7AaVU8ZqTZCAo7eccooI6ET0";
    }

     @Override
    public void onUpdateReceived(Update update) {

        long chatId = update.getMessage().getChatId();

        // TODO
        System.out.println(update.getMessage().getText());
        System.out.println("{"+update.getMessage().getFrom().getFirstName()+"}");


        String coures= update.getMessage().getText();

        keyboardMarkup keyboard= new keyboardMarkup();

        switch (coures) {
            case "/start":
            sendMessage = setWelcomeMessage(chatId);
            sendMessage.setReplyMarkup(keyboard.selecourseskeyboard());
                System.out.println("start");
                break;
        case "CSE":
        sendMessage.setReplyMarkup(keyboard.selesemkeyboard());
        System.out.println("start");
        break;
        case "HOME":
        sendMessage.setReplyMarkup(keyboard.selecourseskeyboard());
        System.out.println("back to start");
        break;
            default:
                break;
        }

        try {

                execute(sendMessage);
            
        } catch (Exception e) {
            // TODO: handle exception

            e.printStackTrace();
        }
    }

    

    // Welcome message---------------------------

    private SendMessage setWelcomeMessage( long chatId ){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Welcome !");

        return sendMessage;
    }

     //end Welcome message---------------------------
    
}
    // {Class}  Couress ---------------------
class Courses extends Bot {

    void CSE(Update  update){

        String Messagerespose="CSE";

        SendMessage response =new SendMessage();

        response.setChatId(update.getMessage().getChatId().toString());
        response.setText(Messagerespose);

        try {
            execute(response);
        } catch (TelegramApiException e) {
            // TODO: handle exception
           e.printStackTrace();
        }

    }
    
}
// end {Class}  Couress ---------------------

class keyboardMarkup{

    //home replayKeybordMarkup-------------------------------

    public ReplyKeyboardMarkup selecourseskeyboard(){
        
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
       List<KeyboardRow> rowList = new ArrayList<>();
       KeyboardRow row = new KeyboardRow();

       row = new KeyboardRow();
       row.add("CSE");
       rowList.add(row);
       row = new KeyboardRow();
       row.add("CSE AI");
       rowList.add(row);
       row = new KeyboardRow();
       row.add("CSE Cyber Security");
       rowList.add(row);

       keyboardMarkup.setKeyboard(rowList);
       keyboardMarkup.setResizeKeyboard(true);

       return keyboardMarkup;

   }

   //end home replayKeybordMarkup-------------------------------

    //home replayKeybordMarkup-------------------------------

    public ReplyKeyboardMarkup selesemkeyboard(){
       
       ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
      List<KeyboardRow> rowList = new ArrayList<>();
      KeyboardRow row = new KeyboardRow();

      row = new KeyboardRow();
      row.add("S1");
      rowList.add(row);
      row = new KeyboardRow();
      row.add("S2");
      rowList.add(row);
      row = new KeyboardRow();
      row.add("S3");
      rowList.add(row);
      row = new KeyboardRow();
      row.add("S4");
      rowList.add(row);
      row = new KeyboardRow();
      row.add("S5");
      rowList.add(row);
      row = new KeyboardRow();
      row.add("S6");
      rowList.add(row);
      row = new KeyboardRow();
      row.add("S7");
      rowList.add(row);
      row = new KeyboardRow();
      row.add("S8");
      rowList.add(row);
      row = new KeyboardRow();
      row.add("HOME");
      rowList.add(row);

      keyboardMarkup.setKeyboard(rowList);
      keyboardMarkup.setResizeKeyboard(true);

      return keyboardMarkup;

  }

  //end home replayKeybordMarkup-------------------------------

}