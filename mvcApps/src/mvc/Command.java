package mvc;


/*
 * Edits:
 *   Xuefeng     3/8/21: create file
 *   Xuefeng     3/10/21: edit  file
 * */


public abstract class Command {
    public Model model;
    public Command (Model model) {this.model = model;}
    public abstract void execute();
}
