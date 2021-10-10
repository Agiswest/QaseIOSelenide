package models;

public class Project {
    String projectName;
    String projectCode;
    String description;
    String accessType;

    public Project(String projectName, String projectCode, String description, String accessType) {
        this.projectName = projectName;
        this.projectCode = projectCode;
        this.description = description;
        this.accessType = accessType;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }
}
