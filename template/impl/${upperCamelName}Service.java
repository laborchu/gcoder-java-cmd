package ${config.java.package.service}.${table.prefix};

import ${config.java.package.vo}.${table.prefix}.${table.upperCamelName}VO;
import ${config.java.package.service}.${table.prefix}.I${table.upperCamelName}Service;
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
    public ${table.upperCamelName}VO get(Map params){
        return this.daoRouter.queryForObject("${table.upperCamelName}.load${table.upperCamelName}",params);
    }

    @Override
    public List<${table.upperCamelName}VO> load(Map params){
        return this.daoRouter.query("${table.upperCamelName}.load${table.upperCamelName}",params);
    }

    @Override
    public List<${table.upperCamelName}VO> loadForPage(Pagination pagination) {
        return this.daoRouter.query("${table.upperCamelName}.load${table.upperCamelName}ForPage",pagination);
    }

    @Override
    public void insert(${table.upperCamelName}VO ${table.lowerCamelName}VO){
        this.daoRouter.insert("${table.upperCamelName}.insert${table.upperCamelName}", ${table.lowerCamelName}VO);
    }

    @Override
    public void update(${table.upperCamelName}VO ${table.lowerCamelName}VO){
        this.daoRouter.update("${table.upperCamelName}.update${table.upperCamelName}", ${table.lowerCamelName}VO);
    }

    @Override
    public void delete(${table.upperCamelName}VO ${table.lowerCamelName}VO){
        this.daoRouter.update("${table.upperCamelName}.delete${table.upperCamelName}", ${table.lowerCamelName}VO);
    }

    @Autowired
    private IDaoRouter daoRouter;
}