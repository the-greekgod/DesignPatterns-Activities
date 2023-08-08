
public class GREEval implements Criteria {
    private Criteria decoratedCriteria;

    public GREEval(Criteria decoratedCriteria) {
        this.decoratedCriteria = decoratedCriteria;
    }

    @Override
    public boolean evaluate(Application theApp) {
        return theApp.getGre() > 1450 && decoratedCriteria.evaluate(theApp);
    }
}