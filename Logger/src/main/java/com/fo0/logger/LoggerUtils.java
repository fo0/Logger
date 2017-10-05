package com.fo0.logger;

public class LoggerUtils {
	private static final String SPACE = "";
	private static final String DELIMITER = "|";

	private static final String EMPTY = "Empty";

	private static final String HIGHLIGHT_BRACKETS_BEGIN = "[" + SPACE;
	private static final String HIGHLIGHT_BRACKETS_END = SPACE + "]";

	public static String highlight(String... strings) {

		if (strings == null) {
			return HIGHLIGHT_BRACKETS_BEGIN + EMPTY + HIGHLIGHT_BRACKETS_END;
		}

		StringBuilder b = new StringBuilder();
		b.append(HIGHLIGHT_BRACKETS_BEGIN);

		for (int i = 0; i < strings.length; i++) {
			if (i < strings.length - 1) {
				b.append(strings[i] + DELIMITER);
			} else {
				b.append(strings[i]);
			}
		}
		b.append(HIGHLIGHT_BRACKETS_END);
		return b.toString();
	}

}
