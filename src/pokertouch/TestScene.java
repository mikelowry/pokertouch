/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokertouch;

import org.mt4j.AbstractMTApplication;
import org.mt4j.components.visibleComponents.widgets.MTTextField;
import org.mt4j.sceneManagement.AbstractScene;
import org.mt4j.util.font.FontManager;
import org.mt4j.util.font.IFont;

/**
 *
 * @author Caliste
 */
public class TestScene extends AbstractScene
{
    public TestScene(AbstractMTApplication mtApplication, String name)
    {
        super(mtApplication, name);
        IFont font = FontManager.getInstance().createFont(mtApplication, "arial.ttf", 20);
        MTTextField textField = new MTTextField(mtApplication, 0, 0, 200, 40, font); 
        textField.setText("Hello World!");
        this.getCanvas().addChild(textField); 
    }
}
