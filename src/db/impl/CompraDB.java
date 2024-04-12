package db.impl;

import db.DB;
import entidade.Compra;

import java.io.*;
import java.util.List;

public class CompraDB implements DB<Compra> {
    private final String PATH = "compras.dat";

    public CompraDB() {
    }

    @Override
    public void salvarDados(List<Compra> compras) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))){
            oos.writeObject(compras);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Compra> listarDados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))){
            return (List<Compra>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
