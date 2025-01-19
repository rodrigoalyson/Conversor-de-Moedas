package ConversorDeMoedasAlysonRodrigo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.util.Scanner;

public class MainCambio {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("---------------------------------------------------------");
        System.out.println("===================CONVERSOR DE MOEDAS===================");
        System.out.println("Deseja saber quanto sua moeda vale no pais para onde");
        System.out.println("vai viajar?");
        System.out.println("Iremos te ajudar fornecendo o valor e outras informações. Vamos começar!?");
        System.out.println();

        CodigoPais codigoPais = new CodigoPais();
        ListaPaises lista = new ListaPaises();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Escolha o seu pais de origem: ");
        lista.listaPais();
        int pais = leitura.nextInt();
        String paisOrigem = codigoPais.converterCodPais(pais);

        System.out.println("Escolha o seu pais de destino: ");
        lista.listaPais();
        pais = leitura.nextInt();
        String paisDestino = codigoPais.converterCodPais(pais);

        System.out.println("Qual o valor que pretende levar para a viagem?");
        float valorViagem = leitura.nextFloat();

        // System.out.println("Origem: " + paisOrigem);
        // System.out.println("Destino: " + paisDestino);

        BuscaTaxaCambio consultaCambio = new BuscaTaxaCambio();
        TaxaCambio novaConsultaTaxa = consultaCambio.buscaTaxaCambio(paisOrigem,paisDestino,valorViagem);
        System.out.println(novaConsultaTaxa);

        ConversorApiJava convertorAPI = new ConversorApiJava(novaConsultaTaxa);
        System.out.println(convertorAPI);
    }
}
