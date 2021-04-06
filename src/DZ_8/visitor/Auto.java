package DZ_8.visitor;

public abstract class Auto {
    private String modelTitle;
    public Auto(String modelTitle) {
        this.modelTitle = modelTitle;
    }
    public abstract void Accept(Visitor visitor);
    public String getModelTitle() {
        return modelTitle;
    }
    public void setModelTitle(String modelTitle) {
        this.modelTitle = modelTitle;
    }
}
