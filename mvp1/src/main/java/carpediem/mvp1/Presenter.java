/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpediem.mvp1;

/**
 *
 * @author carlos
 */
public class Presenter {
    
    private final View view;
    private final Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }
    
    public void login(String password) {
        String result = "Incorrect password";
        
        if (model.getPassword().equals(password)) {
            result = "Correct password";
            view.hideInputField();
        }
        
        view.updateStatusLabel(result);
    }
    
}
