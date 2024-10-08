package br.com.fiap.checkpoint.dois.model.student;

public enum CoursesList {

    SYSTEM_ANALYSIS_AND_DEVELOPMENT("System Analysis And Development", "Technologist", "2 Years", "2500.00"),
    SOFTWARE_ENGINEERING("Software Engineering", "Bachelor's", "4 Years", "6000.00"),
    ADVANCED_DATA_SCIENCE("Advanced Data Sciente", "Technologist", "2 Years", "5000.00"),
    MACHINE_LEARNING_FUNDAMENTALS("Machine Learning Fundamentals", "Bachelor's", "4 Years", "5000.00"),
    CLOUD_COMPUTING_WITH_AZURE("Cloud Computing With Azure", "Technologist", "2 Years", "5500.00"),
    CYBERSECURITY_ESSENTIALS("Cybersecurity Essentials", "Technologist", "2 Years", "6800.00"),
    PROJECT_MANAGEMENT_AND_LEADERSHIP("Project Management And Leadership", "Technologist", "2 Years", "3800.00");

    private String label;
    private String degree;
    private String time;
    private String price;

    CoursesList(String label, String degree, String time, String price) {
        this.label = label;
        this.degree = degree;
        this.time = time;
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public String getTime() {
        return time;
    }

    public String getPrice() {
        return price;
    }

    public String getDegree() {
        return degree;
    }
}
