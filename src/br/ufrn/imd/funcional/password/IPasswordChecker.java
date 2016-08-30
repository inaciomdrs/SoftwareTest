package br.ufrn.imd.funcional.password;

public interface IPasswordChecker {
	/**
	 * A given password is considered strong when all the following conditions are met:
	 * - It is at least 8 characters long
	 * - It has at least one numeric character
	 * - It has at least one non-alphanumeric character
	 * - It has at least one upper-case character
	 * @param password
	 * @return true if password is strong; false otherwise.
	 */
	Boolean isStrong(String password);
}
