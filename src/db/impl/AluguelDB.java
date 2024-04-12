package db.impl;

import db.DB;
import entidade.Aluguel;

import java.io.*;
import java.util.List;

public class AluguelDB implements DB<Aluguel> {
    private final String PATH = "alugueis.dat";

    public AluguelDB() {
    }

    @Override
    public void salvarDados(List<Aluguel> alugueis) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))){
            oos.writeObject(alugueis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Aluguel> listarDados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))){
            return (List<Aluguel>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
