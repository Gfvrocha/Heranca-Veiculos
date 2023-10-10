package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Moto extends Veiculos {

    Scanner scanner = new Scanner(System.in);

    boolean bau, antena;

    public Moto(String marca){
        super(marca);
    }

    public void cadastrarMoto(){

        System.out.println("=0=0= --||-- Cadastrar Moto --||-- =0=0=");
        System.out.println("Informe a marca: ");
        super.setMarca(scanner.nextLine());
        System.out.println("Informe o modelo: ");
        super.setModelo(scanner.nextLine());
        System.out.println("Informe o ano: ");
        super.setAno(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Informe se a moto tem bau: [true - false] ");
        bau = scanner.nextBoolean();
        System.out.println("Informe se a moto tem antena: [true - false] ");
        antena = scanner.nextBoolean();
        System.out.println("Informe a placa da moto: ");
        super.setPlaca(scanner.nextLine());
        scanner.nextLine();
        System.out.println("=0=0= --||-- =0=0= --||-- =0=0= --||-- =0=0= ");


    }





}
