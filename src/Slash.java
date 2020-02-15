public class Slash implements DragonDispenser{
    @Override
    public void dragonAction(DragonStateContext context) {
        System.out.println("Slash slash, cut cut!");
    }
}


class Testers {
    public static void main(String[] asdasdasd) {
        DragonStateContext state = new DragonStateContext();

        state.action();
        state.setState(new Slash());
        state.action();
    }
}