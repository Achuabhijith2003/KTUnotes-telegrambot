import java.util.ArrayList;
import java.util.List;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;




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
    int semsub=0;
    int mod=0;
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
            sendMessage = setWelcomeMessage(chatId,"Select the courese");
            sendMessage.setReplyMarkup(keyboard.selecourseskeyboard());
                System.out.println("start");
                break;
        case "CSE":
        sem=1;
       sendMessage = setWelcomeMessage(chatId,"Select the semester");
        sendMessage.setReplyMarkup(keyboard.selesemkeyboard());
        System.out.println("CSE"+sem);
        break;
        case "CSE AI":
        sem=2;
       sendMessage = setWelcomeMessage(chatId,"Select the semester");
        sendMessage.setReplyMarkup(keyboard.selesemkeyboard());
        System.out.println("Ai"+sem);
        break;
        case "CSE Cyber Security":
        sem=3;
       sendMessage = setWelcomeMessage(chatId,"Select the semester");
        sendMessage.setReplyMarkup(keyboard.selesemkeyboard());
        System.out.println("CSE Cyber Security"+sem);
        break;
        case "S1":
        semsub=1;
        System.out.println(sem);
            if (sem==1) {// CSE
            sendMessage = setWelcomeMessage(chatId,"CSE S1");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==2) {// CSE AI
            sendMessage = setWelcomeMessage(chatId,"AI S1");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==3) {// CSE Cybersecurity
            sendMessage = setWelcomeMessage(chatId,"Cyber security S1");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else{

            }
        
        break;
        case "S2":
        semsub=2;
        System.out.println(sem);
            if (sem==1) {// CSE
                sendMessage = setWelcomeMessage(chatId,"CSE S2");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==2) {// CSE AI
                sendMessage = setWelcomeMessage(chatId,"AI S2");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==3) {// CSE Cybersecurity
                sendMessage = setWelcomeMessage(chatId,"Cyber security S2");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
               
            }else{

            }
        
        break;
        case "S3":
        semsub=3;
        System.out.println(sem);
            if (sem==1) {// CSE
                sendMessage = setWelcomeMessage(chatId,"CSE S3");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==2) {// CSE AI
                sendMessage = setWelcomeMessage(chatId,"AI S3");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==3) {// CSE Cybersecurity
                sendMessage = setWelcomeMessage(chatId,"Cyber security S3");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else{

            }
        
        break;
        case "S4":
        semsub=4;
        System.out.println(sem);
            if (sem==1) {// CSE
                sendMessage = setWelcomeMessage(chatId,"CSE S4");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==2) {// CSE AI
                sendMessage = setWelcomeMessage(chatId,"AI S4");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==3) {// CSE Cybersecurity
                sendMessage = setWelcomeMessage(chatId,"Cyber security S4");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else{

            }
        
        break;
        case "S5":
        semsub=5;
        System.out.println(sem);
            if (sem==1) {// CSE
                sendMessage = setWelcomeMessage(chatId,"CSE S5");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==2) {// CSE AI
                sendMessage = setWelcomeMessage(chatId,"AI S5");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==3) {// CSE Cybersecurity
                sendMessage = setWelcomeMessage(chatId,"Cyber security S5");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else{

            }
        
        break;
        case "S6":
        semsub=6;
        System.out.println(sem);
            if (sem==1) {// CSE
                sendMessage = setWelcomeMessage(chatId,"CSE S6");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==2) {// CSE AI
                sendMessage = setWelcomeMessage(chatId,"AI S6");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==3) {// CSE Cybersecurity
                sendMessage = setWelcomeMessage(chatId,"Cyber security S6");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else{

            }
        
        break;
        case "S7":
        semsub=7;
        System.out.println(sem);
            if (sem==1) {// CSE
                sendMessage = setWelcomeMessage(chatId,"CSE S7");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==2) {// CSE AI
                sendMessage = setWelcomeMessage(chatId,"AI S7");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==3) {// CSE Cybersecurity
                sendMessage = setWelcomeMessage(chatId,"Cyber security S7");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else{

            }
        
        break;
        case "S8":
        semsub=8;
        System.out.println(sem);
            if (sem==1) {// CSE
                sendMessage = setWelcomeMessage(chatId,"CSE S8");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==2) {// CSE AI
                sendMessage = setWelcomeMessage(chatId,"AI S8");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else if (sem==3) {// CSE Cybersecurity
                sendMessage = setWelcomeMessage(chatId,"Cyber security S8");
                sendMessage.setReplyMarkup(keyboard.selesubjectkeyboard(semsub,sem));
                
            }else{

            }
        
        break;
        case "Linear Algebra and Calculus":
            mod=1;
        sendMessage = setWelcomeMessage(chatId,"Select the Options");
                sendMessage.setReplyMarkup(keyboard.selemodkeyboard());
        
        break;
        case "MODULE 1":
           if (sem==1 && semsub==1) {
            sendMessage = setWelcomeMessage(chatId,"t.me/bottutobot/abs");
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

class keyboardMarkup {

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

   public ReplyKeyboardMarkup selesubjectkeyboard(int semsub,int sem){
       
    ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
   List<KeyboardRow> rowList = new ArrayList<>();
   KeyboardRow row = new KeyboardRow();

switch (sem) {
    case 1:
        if (semsub==1) { // s1 subjects CSE
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
        }else if (semsub==2) {  //s2 subjects CSE
            row = new KeyboardRow();
            row.add("MAT102 VECTOR CALCULUS, DIFFERENTIAL EQUATIONS AND TRANSFORMS");
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
        }
        else if (semsub==3) { //S3 subject in CSE
            row = new KeyboardRow();
            row.add("DISCRETE MATHEMATICAL STRUCTURES");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("DATA STRUCTURES");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("OBJECT-ORIENTED PROGRAMMING USING JAVA");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("SUSTAINABLE ENGINEERING");
            rowList.add(row); 
            row = new KeyboardRow();
            row.add("PROFESSIONAL ETHICS");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("DESIGN AND ENGINEERING");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("DATA STRUCTURE LAB");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("OBJECT-ORIENTED PROGRAMMING LAB (IN JAVA)");
            rowList.add(row);
            
        }
        else if (semsub==4) { // s4 subject in CSE
            row = new KeyboardRow();
            row.add("GRAPH THEORY");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("COMPUTER ORGANIZATION & ARCHITECTURE");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("DATABASE MANAGEMENT SYSTEMS");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("OPERATING SYSTEM (OS)");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("DESIGN & ENGINEERING");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("PROFESSIONAL ETHICS");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("CONSTITUTION OF INDIA");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("DIGITAL LAB");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("OPERATING SYSTEMS LAB");
            rowList.add(row);
        }
        else if (semsub==5) { //S5  Subject CSE
            row = new KeyboardRow();
            row.add("FLAT (Formal Languages and Automata Theory)");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Computer Networks");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("System Software");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Microprocessors and Microcontrollers");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Disaster Management");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Database Management Systems Lab");
            rowList.add(row);
        }
        else if (semsub==6) {// S6 subject in CSE
            row = new KeyboardRow();
            row.add("Compiler Design");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Computer Graphics And Image Processing");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Algorithm Analysis And Design");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Elective - I");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Industrial Economics And Foreign Trade");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Comprehensive Course Work");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Networking Lab");
            rowList.add(row);
        }
        else if (semsub==7) {
            row = new KeyboardRow();
            row.add("Computer Graphics");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Programming Paradigms");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Computer System Architecture");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Distributed Computing");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Cryptography and Network Security");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Computational Geometry");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Digital Image Processing");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Bio-Informatics");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Machine Learning");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Computational Complexity");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Seminar & Project Preliminary");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Compiler Design Lab");
            rowList.add(row);
        }
        else if (semsub==8) { //s8 Subject in CSE
            row = new KeyboardRow();
            row.add("Data Mining and Warehousing");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Embedded Systems");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Fuzzy Set Theory and Applications");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Artificial Intelligence");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Data Science");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Cloud Computing");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Principles of Information Security");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Project");
            rowList.add(row);
        }
        break;
        case 2:
        if (semsub==1) { //s1 subjects in AI
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
        }else if (semsub==2) {  // s2 subjects in AI
            row = new KeyboardRow();
            row.add("MAT102 VECTOR CALCULUS, DIFFERENTIAL EQUATIONS AND TRANSFORMS");
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
        }
        else if (semsub==3) { //s3 subject in AI
            
        }
        else if (semsub==4) {
            
        }
        else if (semsub==5) {
            
        }
        else if (semsub==6) {
            
        }
        else if (semsub==7) {
            
        }
        else if (semsub==8) {
            
        }
        break;
        case 3:
        if (semsub==1) {
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
        }else if (semsub==2) {
            row = new KeyboardRow();
            row.add("MAT102 VECTOR CALCULUS, DIFFERENTIAL EQUATIONS AND TRANSFORMS");
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
        }
        else if (semsub==3) {
            
        }
        else if (semsub==4) {
            
        }
        else if (semsub==5) {
            
        }
        else if (semsub==6) {
            
        }
        else if (semsub==7) {
            
        }
        else if (semsub==8) {
            
        }
        break;


    default:
        break;
}
   
   keyboardMarkup.setKeyboard(rowList);
   keyboardMarkup.setResizeKeyboard(true);

   return keyboardMarkup;

}

//end home selesubjectkeyboard-------------------------------

public ReplyKeyboardMarkup selemodkeyboard(){

    ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
    List<KeyboardRow> rowList = new ArrayList<>();
    KeyboardRow row = new KeyboardRow();
    

    row = new KeyboardRow();
            row.add("MODULE 1");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("MODULE 2");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("MODULE 3");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("MODULE 4");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("MODULE 5");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Syllabus");
            rowList.add(row);
            row = new KeyboardRow();
            row.add("Previous  Year Papers");
            rowList.add(row);



    keyboardMarkup.setKeyboard(rowList);
    keyboardMarkup.setResizeKeyboard(true);
 
    return keyboardMarkup;

}

}
// end {Class}  keyboardMarkup---------------------