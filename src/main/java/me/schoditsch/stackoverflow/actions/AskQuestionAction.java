package me.schoditsch.stackoverflow.actions;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

/**
 * @author Schoditsch Moritz
 */
public class AskQuestionAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        BrowserUtil.browse("https://stackoverflow.com/questions/ask");
    }
}
