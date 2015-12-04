/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editorframework;

import editorframework.interfaces.ICore;
import editorframework.interfaces.IPlugin;
import javax.swing.JMenuItem;

/**
 *
 * @author aluno
 */
public class TestPlugin implements IPlugin {

    @Override
    public boolean initialize(ICore core) {
        JMenuItem newItem = core.getUIController().addMenuItem("File", "Quit");
        if (newItem != null)
            newItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    System.out.println("Voce clicou em File->Quit");
                }
            });

        core.getUIController().addMenuItem("Help", "About");
        System.out.println(core.getUIController().addMenuItem("Help", "About"));        return true;
    }
    
}
