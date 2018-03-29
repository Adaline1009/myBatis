import com.alt.hrm.model.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@MappedTypes(User.class)
@MapperScan("com.alt.hrm.mappers")
@SpringBootApplication
@ComponentScan(value = "com.alt.hrm")

public class Application {

   /* @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(new PooledDataSource("org.postgresql.Driver",
                "jdbc:postgresql://localhost:5432/users", "postgres", "11"));
        Resource mapperResource = new ClassPathResource("com/alt/hrm/mappers");
        sqlSessionFactory.setMapperLocations(new Resource[] {mapperResource});
        sqlSessionFactory.setTypeAliasesPackage("com/alt/hrm/model");
        return (SqlSessionFactory) sqlSessionFactory.getObject();
    }
*/
  /*  @Bean
    public UserMapper userMapper() throws Exception {
        SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sessionTemplate.getMapper(UserMapper.class);
    }
*/



    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}