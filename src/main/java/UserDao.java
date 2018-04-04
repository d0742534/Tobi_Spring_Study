import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


/**
 * Created by Dell on 2016-04-30.
 */
public class UserDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void add(User user){
        jdbcTemplate.update("insert into users (id, name, password) values(?, ?, ?)"
                ,user.getId()
                ,user.getName()
                ,user.getPassword());
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
}