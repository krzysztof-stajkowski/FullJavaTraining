package org.example.InterfaceExample.ButtonExample.app;

import org.example.InterfaceExample.ButtonExample.framework.Button;
import org.example.InterfaceExample.ButtonExample.framework.OnClickListener;

public class Screen1 {

    private final Button button;
    public Screen1() {

        button = new Button();
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ktoś kliknął w przycisk");
            }
        });
    }

    public Button getButton(){
        return button;
    }

}
