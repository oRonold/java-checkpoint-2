package br.com.fiap.checkpoint.dois.model.course;

public enum CoursesList {

    SYSTEM_ANALYSIS_AND_DEVELOPMENT("System Analysis And Development"),
    SOFTWARE_ENGINEERING("Software Engineering"),
    ADVANCED_DATA_SCIENCE("Advanced Data Sciente"),
    MACHINE_LEARNING_FUNDAMENTALS("Machine Learning Fundamentals"),
    CLOUD_COMPUTING_WITH_AZURE("Cloud Computing With Azure"),
    CYBERSECURITY_ESSENTIALS("Cybersecurity Essentials"),
    PROJECT_MANAGEMENT_AND_LEADERSHIP("Project Management And Leadership");

    private String label;

    CoursesList(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
