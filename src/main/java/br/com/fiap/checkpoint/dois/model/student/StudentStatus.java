package br.com.fiap.checkpoint.dois.model.student;

public enum StudentStatus {

    ACTIVE("Active"),
    INACTIVE("Inactive");

    private String label;

    StudentStatus(String label){
        this.label = label;
    }

    public String getLabel(){
        return label;
    }
}
