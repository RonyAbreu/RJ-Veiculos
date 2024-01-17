package db;

import entidade.Aluguel;
import entidade.Carro;
import entidade.Compra;
import entidade.Pessoa;

import java.io.*;
import java.util.List;

public class DB {

    public void salvarPessoas(List<Pessoa> pessoas){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pessoas.dat"))){
            oos.writeObject(pessoas);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void salvarCarro(List<Carro> carros){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("carros.dat"))){
            oos.writeObject(carros);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void salvarAluguel(List<Aluguel> alugueis){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("alugueis.dat"))){
            oos.writeObject(alugueis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void salvarCompra(List<Compra> compras){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("compras.dat"))){
            oos.writeObject(compras);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Pessoa> retornarPessoas(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pessoas.dat"))){
            return (List<Pessoa>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Carro> retornarCarros(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("carros.dat"))){
            return (List<Carro>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Aluguel> retornarAlugueis(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alugueis.dat"))){
            return (List<Aluguel>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Compra> retornarCompras(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("compra.dat"))){
            return (List<Compra>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
