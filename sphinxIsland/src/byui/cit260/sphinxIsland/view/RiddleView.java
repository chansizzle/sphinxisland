/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

/**
 *
 * @author chansizzle
 */
public class RiddleView extends View {

    public RiddleView() {

        super("\nSome spiel about the riddles here");
    }

    @Override
    public Double getDoubleNumber() {
        Double number = null;

        while (number == null) { // while a valid name has not been retrieved

            String value = this.getInput();
            value = value.trim().toUpperCase();

            if (value.equals("Q")) {
                break; // exit the repetition
            }
            try {
                number = Double.parseDouble(value);
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number. Try again or hit 'Q' to quit.");
            }
        }
        return number;
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
