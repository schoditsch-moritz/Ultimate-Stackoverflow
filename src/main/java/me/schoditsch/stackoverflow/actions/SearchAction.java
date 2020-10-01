package me.schoditsch.stackoverflow.actions;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;

public class SearchAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        PsiFile psiFile = event.getData(CommonDataKeys.PSI_FILE);
        Editor editor = event.getData(CommonDataKeys.EDITOR);

        String langTag = "";
        if(psiFile != null)
            langTag = "+[" + psiFile.getLanguage().getDisplayName().toLowerCase() + "]";

        String search = editor.getSelectionModel().getSelectedText().replaceAll("^[( )]*", "+")  + langTag;

        System.out.println(search);
        BrowserUtil.browse("https://stackoverflow.com/search?q=" + search);
    }
}
