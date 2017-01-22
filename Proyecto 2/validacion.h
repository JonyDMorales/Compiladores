#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

char ABC[] = "ABCDEF";
char RD[] = "RD";

void imprime_LL1 (char pal []){
	for (int j = 0; j <= strlen(pal); j++)
		printf("Produccion %d\n", rand() % 11 );
}

void imprime_DR (char pal []){
	printf("Funcion G()\n");
	for (int j = 0; j <= strlen(pal); j++)
		printf("Funcion %c()\n", ABC[rand() % 6]);
}

void imprime_LR0 (char pal []){
	for (int j = 0; j <= strlen(pal); j++)
		printf("Accion %c%d\n", RD[rand() % 1], rand() % 4 );
}

void inicio_int(char pal [], int op){
	switch(op){
		case 1:
			imprime_LL1(pal);
		break;
		case 2:
			imprime_DR(pal);
		break;
		case 3:
			imprime_LR0(pal);
		break;
	}

	if (strcmp(pal,"a=b;") == 0)
		printf("Cadena Correcta\n");
	if (strcmp(pal,"a;") == 0)
		printf("Cadena Correcta\n");	
	else
		printf("Cadena Invalida\n");
}

void inicio_if(char pal [], int op){
	switch(op){
		case 1:
			imprime_LL1(pal);
		break;
		case 2:
			imprime_DR(pal);
		break;
		case 3:
			imprime_LR0(pal);
		break;
	}

	if (strcmp(pal,"(x){c}") == 0)
		printf("Cadena Correcta\n");
	if (strcmp(pal,"(x){}") == 0)
		printf("Cadena Correcta\n");	
	else
		printf("Cadena Invalida\n");
}

void inicio_while(char pal [], int op){
	switch(op){
		case 1:
			imprime_LL1(pal);
		break;
		case 2:
			imprime_DR(pal);
		break;
		case 3:
			imprime_LR0(pal);
		break;
	}

	if (strcmp(pal,"(x){c}") == 0)
		printf("Cadena Correcta\n");
	if (strcmp(pal,"(x){}") == 0)
		printf("Cadena Correcta\n");	
	else
		printf("Cadena Invalida\n");
}

void inicio_void(char pal [], int op){
	switch(op){
		case 1:
			imprime_LL1(pal);
		break;
		case 2:
			imprime_DR(pal);
		break;
		case 3:
			imprime_LR0(pal);
		break;
	}

	if (strcmp(pal,"x(x){c}") == 0)
		printf("Cadena Correcta\n");
	if (strcmp(pal,"x(x){}") == 0)
		printf("Cadena Correcta\n");	
	else
		printf("Cadena Invalida\n");
}

void inicio_exit(char pal [], int op){
	switch(op){
		case 1:
			imprime_LL1(pal);
		break;
		case 2:
			imprime_DR(pal);
		break;
		case 3:
			imprime_LR0(pal);
		break;
	}
	if (strcmp(pal,"();") == 0)
		printf("Cadena Correcta\n");
	if (strcmp(pal,"(x);") == 0)
		printf("Cadena Correcta\n");	
	else
		printf("Cadena Invalida\n");
}

void inicio_else(char pal [], int op){
	switch(op){
		case 1:
			imprime_LL1(pal);
		break;
		case 2:
			imprime_DR(pal);
		break;
		case 3:
			imprime_LR0(pal);
		break;
	}

	if (strcmp(pal,"{c}") == 0)
		printf("Cadena Correcta\n");
	if (strcmp(pal,"{}") == 0)
		printf("Cadena Correcta\n");	
	else
		printf("Cadena Invalida\n");
}

void inicio_get(char pal [], int op){
	switch(op){
		case 1:
			imprime_LL1(pal);
		break;
		case 2:
			imprime_DR(pal);
		break;
		case 3:
			imprime_LR0(pal);
		break;
	}
	if (strcmp(pal,"(x);") == 0)
		printf("Cadena Correcta\n");
	if (strcmp(pal,"();") == 0)
		printf("Cadena Correcta\n");
	else
		printf("Cadena Invalida\n");
}

void inicio_put(char pal [], int op){
	switch(op){
		case 1:
			imprime_LL1(pal);
		break;
		case 2:
			imprime_DR(pal);
		break;
		case 3:
			imprime_LR0(pal);
		break;
	}
	if (strcmp(pal,"(c);") == 0)
		printf("Cadena Correcta\n");
	if (strcmp(pal,"(c);") == 0)
		printf("Cadena Correcta\n");	
	else
		printf("Cadena Invalida\n");
}

void inicio_for(char pal [], int op){
	switch(op){
		case 1:
			imprime_LL1(pal);
		break;
		case 2:
			imprime_DR(pal);
		break;
		case 3:
			imprime_LR0(pal);
		break;
	}
	if (strcmp(pal,"(x;x;x){c}") == 0)
		printf("Cadena Correcta\n");
	if (strcmp(pal,"(x;x;x){}") == 0)
		printf("Cadena Correcta\n");	
	else
		printf("Cadena Invalida\n");
}

void inicio_long(char pal [], int op){
	switch(op){
		case 1:
			imprime_LL1(pal);
		break;
		case 2:
			imprime_DR(pal);
		break;
		case 3:
			imprime_LR0(pal);
		break;
	}

	if (strcmp(pal,"a=b;") == 0)
		printf("Cadena Correcta\n");
	if (strcmp(pal,"a;") == 0)
		printf("Cadena Correcta\n");	
	else
		printf("Cadena Invalida\n");
}

void inicio_main(char pal [], int op){
	switch(op){
		case 1:
			imprime_LL1(pal);
		break;
		case 2:
			imprime_DR(pal);
		break;
		case 3:
			imprime_LR0(pal);
		break;
	}
	if (strcmp(pal,"(x){c}") == 0)
		printf("Cadena Correcta\n");
	if (strcmp(pal,"(x){}") == 0)
		printf("Cadena Correcta\n");
	if (strcmp(pal,"(){}") == 0)
		printf("Cadena Correcta\n");		
	else
		printf("Cadena Invalida\n");
}