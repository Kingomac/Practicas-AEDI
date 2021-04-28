package ej5;

/**
 *
 * @author Mario
 */
public class AlmacenExtintores {

    private Extintor[] almacen;

    public AlmacenExtintores(int numExtintores) {
        double extra = numExtintores * 0.1;
        almacen = new Extintor[(int) (numExtintores + extra)];
    }

    private int funcionHashing(int numRefer) {
        return numRefer % almacen.length;
    }

    public boolean insertarExtintor(Extintor ext) {
        final int tam = almacen.length;
        int dirHash = funcionHashing(ext.getNumReferencia());
        if (almacen[dirHash] == null) {
            almacen[dirHash] = ext;
            return true;
        }
        int dirReh = (dirHash + 1) % tam;
        while (almacen[dirReh] != null && dirReh != dirHash) {
            dirReh = (dirReh + 1) % tam;
        }
        if (almacen[dirReh] == null) {
            almacen[dirReh] = ext;
            return true;
        }
        return false;
    }

    public Extintor buscarExtintor(int numRefer) {
        final int tam = almacen.length;
        int dirHash = funcionHashing(numRefer);
        if (almacen[dirHash] == null) {
            return null;
        } else if (almacen[dirHash].getNumReferencia() == numRefer) {
            return almacen[dirHash];
        } else {

        }
    }
}
