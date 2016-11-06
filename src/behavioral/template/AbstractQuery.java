package behavioral.template;

/**
 * Created by medasta on 06/11/2016.
 */
public abstract class AbstractQuery implements Query {



    @Override
    public Result execute() {

        Connection connection=new Connection();
        Result r=connection.ecexuteQuery(this.getQuery());
        connection.close();
        return r;
    }

    abstract protected String getQuery();
}
