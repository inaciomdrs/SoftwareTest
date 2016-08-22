package br.ufrn.imd.password;

public class PasswordChecker implements IPasswordChecker {

	@Override
	public Boolean isStrong(String password) {
		boolean passStrong;

		boolean sizeLargerThan8Chars = password.length() >= 8;
		boolean hasNumericChar = false;
		boolean hasUppercaseLetter = false;
		boolean hasSpecialChar = false;

		int length = password.length();

		char c;
		for (int i = 0; i < length; i++) {
			c = password.charAt(i);

			if (isNumeric(c)) {
				hasNumericChar = true;
			} else if (isUppercaseLetter(c)) {
				hasUppercaseLetter = true;
			} else if (isSpecialCharacter(c)) {
				hasSpecialChar = true;
			}

			passStrong = hasNumericChar && hasSpecialChar && hasUppercaseLetter && sizeLargerThan8Chars;

			if (passStrong) {
				return true;
			}
		}

		return false;
	}

	public boolean isNumeric(char c) {
		return (c >= '0') && (c <= '9');
	}

	public boolean isUppercaseLetter(char c) {
		return (c >= 'A') && (c <= 'Z');
	}

	public boolean isSpecialCharacter(char c) {
		return (((c < 'a') || (c > 'z')) && !isUppercaseLetter(c));
	}

}
