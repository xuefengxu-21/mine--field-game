package mvc;


/*
 * Edits:
 *   Xuefeng     3/8/21: create file
 *	 Mark        3/10/21: implement interface
 *	 Mark        3/14/21: Added getHelp()
 * */


public interface AppFactory {
    public Model makeModel();
    public View makeView(Model model);
    public String getTitle();
    public String[] getHelp();
    public String about();
    // public String getHelp();
    public String[] getEditCommands();
    public Command makeEditCommand(Model model, String type);
}