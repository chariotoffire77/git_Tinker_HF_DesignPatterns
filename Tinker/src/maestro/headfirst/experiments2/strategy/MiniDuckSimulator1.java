package maestro.headfirst.experiments2.strategy;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.display();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
