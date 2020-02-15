public class DragonStateContext {

    private DragonDispenser currentState;

    public DragonStateContext() {
        currentState = new Roar();
    }

    public void action() {
        currentState.dragonAction(this);
    }

    public void setState(DragonDispenser aState) {
        currentState = aState;
    }
}
