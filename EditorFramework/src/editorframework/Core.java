/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editorframework;

import editorframework.interfaces.ICore;
import editorframework.interfaces.IDocumentController;
import editorframework.interfaces.IPluginController;
import editorframework.interfaces.IUIController;

/**
 *
 * @author aluno
 */
public class Core implements ICore {
    public Core() throws Exception {
        uiController = new UIController();
        documentController = new DocumentController();
        pluginController = new PluginController(this);
    }

    @Override
    public IUIController getUIController() {
        return uiController;
    }

    @Override
    public IDocumentController getDocumentController() {
        return documentController;
    }

    @Override
    public IPluginController getPluginController() {
        return pluginController;
    }
    
    private IUIController uiController;
    private IDocumentController documentController;
    private IPluginController pluginController;
}
