package exercicios04;

public class Teste extends AnimalAB {

    public Teste(double comIn, double camPer, double horSo) {
        super(comIn, camPer, horSo);

    }

    public static void main(String[] args) {

        // Atributos
        Cachorro cao = new Cachorro(5, 10, 20);
        cao.comeu = 2.5;
        cao.mover = 6;
        cao.dormiu = 8;
        cao.nome = "Rex";
        cao.tipo = "canino";
        cao.habitat = "quintal";
        cao.altura = 1;
        cao.peso = 3.5;
        cao.setQuantPatas(4);

        Gato pet = new Gato(3, 8, 7);
        pet.comeu = 2;
        pet.mover = 6;
        pet.dormiu = 5;
        pet.nome = "Fido";
        pet.tipo = "felino";
        pet.habitat = "quintal";
        pet.altura = 0.8;
        pet.peso = 2.35;
        pet.setQuantPatas(4);

        Elefante dumbo = new Elefante(200, 12, 4);
        dumbo.comeu = 150;
        dumbo.mover = 7;
        dumbo.dormiu = 6;
        dumbo.nome = "Tita";
        dumbo.tipo = "selvagem";
        dumbo.habitat = "floresta";
        dumbo.altura = 2.8;
        dumbo.peso = 5;
        dumbo.setQuantPatas(4);

        Leao leo = new Leao(15, 6, 12);
        leo.comeu = 23;
        leo.mover = 9;
        leo.dormiu = 7;
        leo.nome = "Simba";
        leo.tipo = "selvagem";
        leo.habitat = "floresta";
        leo.altura = 2.6;
        leo.peso = 190;
        leo.setQuantPatas(4);

        Pombo dud = new Pombo(0.4, 5, 3);
        dud.comeu = 0.5;
        dud.mover = 6;
        dud.dormiu = 4;
        dud.nome = "Dudle";
        dud.tipo = "ave";
        dud.habitat = "mata";
        dud.altura = 0.4;
        dud.peso = 1.65;
        dud.setQuantAsas(2);
        dud.setEnvergAsas(0.8);

        Peixe aqua = new Peixe(0.75, 3, 4);
        aqua.comeu = 0.8;
        aqua.mover = 10;
        aqua.dormiu = 5;
        aqua.nome = "Nemo";
        aqua.tipo = "marinho";
        aqua.habitat = "recifes";
        aqua.altura = 0.25;
        aqua.peso = 0.45;
        aqua.setQuantNadadeiras(5);

        // Chamando metodo
        cao.comer();
        cao.dormir();
        cao.moverse();
        System.out.println(cao);
        System.out.println();

        pet.comer();
        pet.dormir();
        pet.moverse();
        System.out.println(pet);
        System.out.println();

        dud.comer();
        dud.dormir();
        dud.moverse();
        System.out.println(dud);
        System.out.println();

        aqua.comer();
        aqua.dormir();
        aqua.moverse();
        System.out.println(aqua);
        System.out.println();

        dumbo.comer();
        dumbo.dormir();
        dumbo.moverse();
        System.out.println(dumbo);
        System.out.println();

        leo.comer();
        leo.dormir();
        leo.moverse();
        System.out.println(leo);
        System.out.println();

    }

}
