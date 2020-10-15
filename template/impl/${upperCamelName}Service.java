package ${config.java.package.service}.${table.prefix};

import ${config.java.package.bo}.${table.prefix}.${table.upperCamelName}BO;
import com.value.mybatis.IDaoRouter;
import com.value.mybatis.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ${table.upperCamelName}Service implements I${table.upperCamelName}Service {

    @Override
    public ${table.upperCamelName}BO get(Map params){
        return this.daoRouter.queryForObject("${table.upperCamelName}.load${table.upperCamelName}",params);
    }

    @Override
    public List<${table.upperCamelName}BO> list(Map params){
        return this.daoRouter.query("${table.upperCamelName}.load${table.upperCamelName}",params);
    }

    @Override
    public List<${table.upperCamelName}BO> listForPage(Pagination pagination) {
        return this.daoRouter.query("${table.upperCamelName}.load${table.upperCamelName}ForPage",pagination);
    }

    @Override
    public void insert(${table.upperCamelName}BO ${table.lowerCamelName}BO){
        this.daoRouter.insert("${table.upperCamelName}.insert${table.upperCamelName}", ${table.lowerCamelName}BO);
    }

    @Override
    public void update(${table.upperCamelName}BO ${table.lowerCamelName}BO){
        this.daoRouter.update("${table.upperCamelName}.update${table.upperCamelName}", ${table.lowerCamelName}BO);
    }

    @Override
    public void delete(${table.upperCamelName}BO ${table.lowerCamelName}BO){
        this.daoRouter.update("${table.upperCamelName}.delete${table.upperCamelName}", ${table.lowerCamelName}BO);
    }

    @Autowired
    private IDaoRouter daoRouter;
}