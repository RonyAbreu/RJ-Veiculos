package db.impl;

import db.DB;
import entidade.Carro;

import java.io.*;
import java.util.List;

public class CarrosDB implements DB<Carro> {
    private final String PATH = "carros.dat";

    public CarrosDB() {
    }

    @Override
    public void salvarDados(List<Carro> carros) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))){
            oos.writeObject(carros);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Carro> listarDados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))){
            return (List<Carro>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
