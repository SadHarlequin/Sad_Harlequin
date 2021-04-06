package DZ_8.visitor;

public class Car extends Auto{
    public Car(String modelTitle) {
        super(modelTitle);
    }
    @Override
    public void Accept(Visitor visitor) {
        visitor.visit(this);
    }
}
