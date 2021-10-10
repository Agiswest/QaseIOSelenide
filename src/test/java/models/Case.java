package models;

public class Case {
    String title;
    String status;
    String severity;
    String priority;
    String type;
    String layer;
    String isFlaky;
    String behavior;
    String automationStatus;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

    public String getIsFlaky() {
        return isFlaky;
    }

    public void setIsFlaky(String isFlaky) {
        this.isFlaky = isFlaky;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getAutomationStatus() {
        return automationStatus;
    }

    public void setAutomationStatus(String automationStatus) {
        this.automationStatus = automationStatus;
    }

    public Case(String title, String status,
                String severity, String priority,
                String type, String layer,
                String isFlaky, String behavior,
                String automationStatus) {
        this.title = title;
        this.status = status;
        this.severity = severity;
        this.priority = priority;
        this.type = type;
        this.layer = layer;
        this.isFlaky = isFlaky;
        this.behavior = behavior;
        this.automationStatus = automationStatus;


    }
}
