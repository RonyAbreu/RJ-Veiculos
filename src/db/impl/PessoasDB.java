package db.impl;

import db.DB;
import entidade.Pessoa;

import java.io.*;
import java.util.List;

public class PessoasDB implements DB<Pessoa> {
    private final String PATH = "pessoas.dat";

    public PessoasDB() {
    }

    @Override
    public void salvarDados(List<Pessoa> pessoas) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))){
            oos.writeObject(pessoas);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Pessoa> listarDados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))){
            return (List<Pessoa>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
