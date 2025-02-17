package com.ensa.gi4.modele;

public abstract class  Materiel {
    private int idMateriel;


    private String materielCode;
    private String materielName;
    private String materielType;
    private boolean isDisponible;
    private boolean isAllocated;

    public int getIdMateriel() {
        return idMateriel;
    }

    public void setIdMateriel(int idMateriel) {
        this.idMateriel = idMateriel;
    }

    public String getMaterielCode() {
        return materielCode;
    }

    public void setMaterielCode(String materielCode) {
        this.materielCode = materielCode;
    }

    public String getMaterielName() {
        return materielName;
    }

    public void setMaterielName(String materielName) {
        this.materielName = materielName;
    }

    public String getMaterielType() {
        return materielType;
    }

    public void setMaterielType(String materielType) {
        this.materielType = materielType;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean disponible) {
        isDisponible = disponible;
    }
    public boolean isAllocated() {
        return isAllocated;
    }

    public void setAllocated(boolean allocated) {
        isAllocated = allocated;
    }
    @Override
    public String toString() {
        return "\n Materiel N° " + idMateriel +
                "\n Code : " + materielCode +
                "\n Name : " + materielName +
                "\n Type : " + materielType +
                "\n Disponibility : " + isDisponible +
                "\n Allocation : " + isAllocated +
                "\n ------------------";
    }

}

