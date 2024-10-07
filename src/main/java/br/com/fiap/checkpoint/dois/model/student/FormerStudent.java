package br.com.fiap.checkpoint.dois.model.student;

public enum FormerStudent {

    FRESHMAN("Freshman"),
    VETERAN("Veteran");

    private String label;

    FormerStudent(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
