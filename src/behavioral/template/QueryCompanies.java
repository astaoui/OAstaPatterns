package behavioral.template;

/**
 * Created by medasta on 06/11/2016.
 */
public class QueryCompanies extends AbstractQuery {
    @Override
    protected String getQuery() {

        return "select * from Companies";
    }
}
