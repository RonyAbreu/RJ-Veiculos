package db.factory;

import db.impl.AluguelDB;
import db.DB;
import db.impl.CarrosDB;
import db.impl.CompraDB;
import db.impl.PessoasDB;

public abstract class DBFactory {

    public static DB createAluguelDB(){
        return new AluguelDB();
    }

    public static DB createCompraDB(){
        return new CompraDB();
    }

    public static DB createCarrosDB(){
        return new CarrosDB();
    }

    public static DB createPessoasDB(){
        return new PessoasDB();
    }
}
