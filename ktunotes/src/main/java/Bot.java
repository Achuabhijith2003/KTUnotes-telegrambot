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
    int sem=0;
     @Override
    public void onUpdateReceived(Update update) {

        long chatId = update.getMessage().getChatId();
       
        // TODO
        System.out.println(update.getMessage().getText());
        System.out.println("{"+update.getMessage().getFrom().getFirstName()+"}");


        String coures= update.getMessage().getText();

        keyboardMarkup keyboard= new keyboardMarkup();
       // Courses Courses= new Courses();

        switch (coures) {
            case "/start":
            sendMessage = setWelcomeMessage(chatId,"");
            sendMessage.setReplyMarkup(keyboard.selecourseskeyboard());
                System.out.println("start");
                break;
        case "CSE":
        sem=1;
       sendMessage = setWelcomeMessage(chatId,"");
        sendMessage.setReplyMarkup(keyboard.selesemkeyboard());
        System.out.println("CSE");
        break;
        case "AI":
        sem=2;
       sendMessage = setWelcomeMessage(chatId,"");
        sendMessage.setReplyMarkup(keyboard.selesemkeyboard());
        System.out.println("CSE");
        break;
        case "CSE Cyber Security":
        sem=3;
       sendMessage = setWelcomeMessage(chatId,"");
        sendMessage.setReplyMarkup(keyboard.selesemkeyboard());
        System.out.println("CSE");
        break;
        case "S1":
        System.out.println(sem);
            if (sem==1) {// CSE
            sendMessage = setWelcomeMessage(chatId,"CSE S1");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("CSE S1");
            }else if (sem==2) {// CSE AI
            sendMessage = setWelcomeMessage(chatId,"AI S1");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("AI S1");
            }else if (sem==3) {// CSE Cybersecurity
            sendMessage = setWelcomeMessage(chatId,"Cyber security S1");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("Cyber security S1");
            }else{

            }
        
        break;
        case "S2":
        System.out.println(sem);
            if (sem==1) {// CSE
                sendMessage = setWelcomeMessage(chatId,"CSE S2");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("CSE S2");
            }else if (sem==2) {// CSE AI
                sendMessage = setWelcomeMessage(chatId,"AI S2");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("AI S1");
            }else if (sem==3) {// CSE Cybersecurity
                sendMessage = setWelcomeMessage(chatId,"Cyber security S2");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("Cyber security S2");
            }else{

            }
        
        break;
        case "S3":
        System.out.println(sem);
            if (sem==1) {// CSE
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("CSE S1");
            }else if (sem==2) {// CSE AI
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("AI S1");
            }else if (sem==3) {// CSE Cybersecurity
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("Cyber security S1");
            }else{

            }
        
        break;
        case "S4":
        System.out.println(sem);
            if (sem==1) {// CSE
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("CSE S1");
            }else if (sem==2) {// CSE AI
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("AI S1");
            }else if (sem==3) {// CSE Cybersecurity
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("Cyber security S1");
            }else{

            }
        
        break;
        case "S5":
        System.out.println(sem);
            if (sem==1) {// CSE
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("CSE S1");
            }else if (sem==2) {// CSE AI
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("AI S1");
            }else if (sem==3) {// CSE Cybersecurity
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("Cyber security S1");
            }else{

            }
        
        break;
        case "S6":
        System.out.println(sem);
            if (sem==1) {// CSE
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("CSE S1");
            }else if (sem==2) {// CSE AI
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("AI S1");
            }else if (sem==3) {// CSE Cybersecurity
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("Cyber security S1");
            }else{

            }
        
        break;
        case "S7":
        System.out.println(sem);
            if (sem==1) {// CSE
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("CSE S1");
            }else if (sem==2) {// CSE AI
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("AI S1");
            }else if (sem==3) {// CSE Cybersecurity
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("Cyber security S1");
            }else{

            }
        
        break;
        case "S8":
        System.out.println(sem);
            if (sem==1) {// CSE
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("CSE S1");
            }else if (sem==2) {// CSE AI
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("AI S1");
            }else if (sem==3) {// CSE Cybersecurity
                sendMessage = setWelcomeMessage(chatId,"");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard());
                System.out.println("Cyber security S1");
            }else{

            }
        
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

    public SendMessage setWelcomeMessage( long chatId,String message ){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);
      return sendMessage;
    }

     //end Welcome message---------------------------
    
}

// {Class}  keyboardMarkup---------------------

class keyboardMarkup{

    //home selecourseskeyboard-------------------------------

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

   //end home selecourseskeyboard-------------------------------

    //home selesemkeyboard-------------------------------

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

  //end home selesemkeyboard-------------------------------

   //home selesubjectkeyboard-------------------------------

   public ReplyKeyboardMarkup selesubjectkeyboard(){
       
    ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
   List<KeyboardRow> rowList = new ArrayList<>();
   KeyboardRow row = new KeyboardRow();

   row = new KeyboardRow();
   row.add("Linear Algebra and Calculus");
   rowList.add(row);
   row = new KeyboardRow();
   row.add("Engineering Physics A");
   rowList.add(row);
   row = new KeyboardRow();
   row.add("Engineering Physics B");
   rowList.add(row);
   row = new KeyboardRow();
   row.add("Engineering Chemistry");
   rowList.add(row);
   row = new KeyboardRow();
   row.add("Engineering Mechanics");
   rowList.add(row);
   row = new KeyboardRow();
   row.add("Engineering Graphics");
   rowList.add(row);
   row = new KeyboardRow();
   row.add("Basics of Civil & Mechanical Engineering");
   rowList.add(row);
   row = new KeyboardRow();
   row.add("Basics of Electrical & Electronics Engineering");
   rowList.add(row);
   row = new KeyboardRow();
   row.add("Engineering Physics Lab");
   rowList.add(row);
   row = new KeyboardRow();
   row.add("Engineering Chemistry Lab");
   rowList.add(row);
   row = new KeyboardRow();
   row.add("Civil & Mechanical Workshop");
   rowList.add(row);
   row = new KeyboardRow();
   row.add("Electrical & Electronics Workshop");
   rowList.add(row);
   
   keyboardMarkup.setKeyboard(rowList);
   keyboardMarkup.setResizeKeyboard(true);

   return keyboardMarkup;

}

//end home selesubjectkeyboard-------------------------------

}
// end {Class}  keyboardMarkup---------------------