package jp.toppers.ui.highliting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

public class SgoilLexicalTokenToAttributeIdMapper extends
		DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		final String result;

		switch (tokenName) {
		case "RULE_T_NUMBER":
		case "RULE_T_FLOAT":
			result = DefaultHighlightingConfiguration.NUMBER_ID;
			break;
		case "RULE_T_OBJECT":
			result = DefaultHighlightingConfiguration.KEYWORD_ID;
			break;
		default:
			result = super.calculateId(tokenName, tokenType);
		}
		return result;
	}
}
