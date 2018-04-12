package ${config.java.package.service}.${table.prefix};

import ${config.java.package.vo}.${table.prefix}.${table.upperCamelName}VO;
import com.value.mybatis.Pagination;

import java.util.List;
import java.util.Map;

public interface I${table.upperCamelName}Service {

    ${table.upperCamelName}VO get(Map params);

    List<${table.upperCamelName}VO> load(Map params);

    List<${table.upperCamelName}VO> loadForPage(Pagination pagination);

    void insert(${table.upperCamelName}VO ${table.lowerCamelName}VO);

    void update(${table.upperCamelName}VO ${table.lowerCamelName}VO);

    void delete(${table.upperCamelName}VO ${table.lowerCamelName}VO);

}