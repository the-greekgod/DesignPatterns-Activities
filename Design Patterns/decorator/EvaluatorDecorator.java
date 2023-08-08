

public class EvaluatorDecorator implements Criteria {
    @Override
    public boolean evaluate(Application theApp) {
        return true;  // Basic criteria always evaluates to true
    }
}