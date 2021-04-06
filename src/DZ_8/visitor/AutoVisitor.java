package DZ_8.visitor;

public class AutoVisitor implements Visitor{
    @Override
    public void visit(Car car) {
        System.out.println("Легковой автомобиль модели: "+car.getModelTitle());
    }
    @Override
    public void visit(Track track) {
        System.out.println("Грузовой автомобиль модели: "+track.getModelTitle());
    }
}
