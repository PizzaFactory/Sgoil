/*
 * generated by Xtext
 */
package jp.toppers.ui;

import jp.toppers.ui.highliting.SgoilLexicalTokenToAttributeIdMapper;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

/**
 * Use this class to register components to be used within the IDE.
 */
public class SgoilUiModule extends jp.toppers.ui.AbstractSgoilUiModule {
	public SgoilUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindTokenToAttributeIdMapper() {
		return SgoilLexicalTokenToAttributeIdMapper.class;
	}
}
