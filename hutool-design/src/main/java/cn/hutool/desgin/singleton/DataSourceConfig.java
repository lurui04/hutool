package cn.hutool.desgin.singleton;

/**
 * @author lurui04
 * @Package cn.hutool.desgin.singleton
 * @ClassName DataSource
 * @Description TODO 类描述
 * @Date 2020/3/12 13:30
 */
public class DataSourceConfig {

    private static final DataSourceConfig config = new DataSourceConfig();

    private DataSourceConfig() {
    }

    public static DataSourceConfig getInstance() {
        return config;
    }


    public String getConfig() {
        return "read data success";
    }
}
