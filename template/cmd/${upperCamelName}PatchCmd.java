package ${config.java.package.cmd}.${table.prefix};

import ${config.java.package.cmd}.CmdSign;
import ${config.java.package.code}.CmdCode;
import ${config.java.package.bo}.${table.prefix}.${table.upperCamelName}BO;
import ${config.java.package.service}.${table.prefix}.service.I${table.upperCamelName}Service;
import ${config.java.package.cmd}.ACmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ${table.upperCamelName}PatchCmd extends ACmd {

    @Override
    public CmdSign execute(HttpServletRequest request, CmdSign sign) throws Exception {
        CmdSign respSign = new CmdSign(sign);
        ${table.upperCamelName}VO ${table.lowerCamelName}VO = super.getData(sign, ${table.upperCamelName}VO.class);
        this.${table.lowerCamelName}Service.update(${table.lowerCamelName}VO);
        return respSign;
    }

    @Override
    public String getCmdCode() {
        return CmdCode.${table.upperTableName}_PATCH;
    }

    @Autowired
    private I${table.upperCamelName}Service ${table.lowerCamelName}Service;
}
