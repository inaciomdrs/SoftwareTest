package br.ufrn.imd.defuse;

public class Academico {
	/* 1 */public String calcularStatus(float nota1, float nota2, float nota3, int frequencia) {
		/* 2 */ float media = (nota1 + nota2 + nota3) / 3;
		/* 3 */ String result;
		/* 4 */ if (frequencia < 75) {
			/* 5 */ if (media < 3) {
				/* 6 */ result = "REMF";
				/* 7 */ } else {
				/* 8 */ result = "REPF";
						}
			/* 9 */} else if (media >= 7) {
			/* 10 */ result = "APR";
			/* 11 */ } else if (media >= 5 && media < 7) {
			/* 12 */ if (nota1 >= 3 && nota2 >= 3 && nota3 >= 3) {
				/* 13 */ result = "APRN";
				/* 14 */ } else {
				/* 15 */ result = "REC";
			}
			/* 16 */ } else if (media >= 3 && media < 5) {
			/* 17 */ result = "REC";
			/* 18 */ } else {
			/* 19 */ result = "REP";
					}
		/* 20 */ return result;
	}
}
