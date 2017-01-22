#include "validacion.h"

//variables globares
int i =0;
char pal[];
char rest[];

//Despliega el menu de opciones
int menu_principal(){
	int op;
	//printf("\nCadenas validas (x){c}, (){}\n");
	printf("\nMetodo de validacion:\n");
	printf("1.- LL(1)\n");
	printf("2.- Descenso Recursivo\n");
	printf("3.- LR0\n");
	scanf("%d", &op);
	return op;
}

//Predicado que te indica si una palabra es reservada
void metodos (int op){

	if (pal[0] == 'i' && pal[1] == 'f'){
		printf("\nLa palabra reservada es correcta: %c%c\n\n", pal[0], pal[1]);
		for (int j = 2; j <= strlen(pal) ; j++, i++)
			rest[i] = pal[j];
		inicio_if(pal, op);
		return;
	}

	if (pal[0] == 'f' && pal[1] == 'o' && pal[2] == 'r'){
		printf("\nLa palabra reservada es correcta: %c%c%c\n\n", pal[0], pal[1], pal[2]);
		for (int j = 2; j <= strlen(pal) ; j++, i++)
			rest[i] = pal[j];
		inicio_for(pal, op);
		return ;
	}

	if (pal[0] == 'i' && pal[1] == 'n' && pal[2] == 't'){
		printf("\nLa palabra reservada es correcta: %c%c%c\n\n", pal[0], pal[1], pal[2]);
		for (int j = 3; j <= strlen(pal) ; j++, i++)
			rest[i] = pal[j];
		inicio_int(pal, op);
		return ;
	}

	if(pal[0] == 'g' && pal[1] == 'e' && pal[2] == 't'){
		printf("\nLa palabra reservada es correcta: %c%c%c\n\n", pal[0], pal[1], pal[2]);
		for (int j = 3; j <= strlen(pal) ; j++, i++)
			rest[i] = pal[j];
		inicio_get(pal, op);
		return ;
	}


	if (pal[0] == 'p' && pal[1] == 'u' && pal[2] == 't'){
		printf("\nLa palabra reservada es correcta: %c%c%c\n\n", pal[0], pal[1], pal[2]);
		for (int j = 3; j <= strlen(pal) ; j++, i++)
			rest[i] = pal[j];
		inicio_put(pal, op);
		return ;
	}

	if (pal[0] == 'v' && pal[1] == 'o' && pal[2] == 'i' && pal[3] == 'd'){
		printf("\nLa palabra reservada es correcta: %c%c%c\n\n", pal[0], pal[1], pal[2]);
		for (int j = 3; j <= strlen(pal) ; j++, i++)
			rest[i] = pal[j];
		inicio_void(pal, op);
		return ;
	}

	if (pal[0] == 'e' && pal[1] == 'x' && pal[2] == 'i' && pal[3] == 't'){
		printf("\nLa palabra reservada es correcta: %c%c%c\n\n", pal[0], pal[1], pal[2]);
		for (int j = 3; j <= strlen(pal) ; j++, i++)
			rest[i] = pal[j];
		inicio_exit(pal, op);
		return ;
	}

	if (pal[0] == 'e' && pal[1] == 'l' && pal[2] == 's' && pal[3] == 'e'){
		printf("\nLa palabra reservada es correcta: %c%c%c\n\n", pal[0], pal[1], pal[2]);
		for (int j = 3; j <= strlen(pal) ; j++, i++)
			rest[i] = pal[j];
		inicio_else(pal, op);
		return ;
	}

	if (pal[0] == 'l' && pal[1] == 'o' && pal[2] == 'n' && pal[3] == 'g'){
		printf("\nLa palabra reservada es correcta: %c%c%c\n\n", pal[0], pal[1], pal[2]);
		for (int j = 3; j <= strlen(pal) ; j++, i++)
			rest[i] = pal[j];
		inicio_long(pal, op);
		return ;
	}
		
	if (pal[0] == 'm' && pal[1] == 'a' && pal[2] == 'i' && pal[3] == 'n'){
		printf("\nLa palabra reservada es correcta: %c%c%c%c\n\n", pal[0], pal[1], pal[2], pal[3]);
		for (int j = 4; j <= strlen(pal) ; j++, i++)
			rest[i] = pal[j];
		inicio_main(pal, op);
		return ;
	}

	if(pal[0] == 'w' && pal[1] == 'h' && pal[2] == 'i' && pal[3] == 'l' && pal[4] == 'e'){
		printf("\nLa palabra reservada es correcta: %c%c%c%c%c\n\n", pal[0], pal[1], pal[2], pal[3], pal[4]);
		for (int j = 5; j <= strlen(pal) ; j++, i++)
			rest[i] = pal[j];
		inicio_while(pal, op);
		return;
	}

	else
		printf("Cadena Invalida\n");
}

// Funcion proncipal
int main(){
	int op;
	op = menu_principal();
	printf("\nIntroduce la cadena a validar:\n");
	scanf("%s", &pal);
	metodos(op);
	return 0;
}