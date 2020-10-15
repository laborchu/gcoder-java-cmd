package ${config.java.package.service}.${table.prefix};

import ${config.java.package.bo}.${table.prefix}.${table.upperCamelName}BO;
import com.value.mybatis.Pagination;

import java.util.List;
import java.util.Map;

public interface I${table.upperCamelName}Service {

    ${table.upperCamelName}BO get(Map params);

    List<${table.upperCamelName}BO> list(Map params);

    List<${table.upperCamelName}BO> listForPage(Pagination pagination);

    void insert(${table.upperCamelName}BO ${table.lowerCamelName}BO);

    void update(${table.upperCamelName}BO ${table.lowerCamelName}BO);

    void delete(${table.upperCamelName}BO ${table.lowerCamelName}BO);

}