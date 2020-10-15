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
public class ${table.upperCamelName}GetCmd extends ACmd {

    @Override
    public CmdSign execute(HttpServletRequest request, CmdSign sign) throws Exception {
        CmdSign respSign = new CmdSign(sign);
        HashMap params = super.getData(sign, HashMap.class);
        ${table.upperCamelName}BO ${table.lowerCamelName}BO = this.${table.lowerCamelName}Service.get(params);
        respSign.setSource(super.getSource(${table.lowerCamelName}BO,sign));
        return respSign;
    }

    @Override
    public String getCmdCode() {
        return CmdCode.${table.upperTableName}_GET;
    }

    @Autowired
    private I${table.upperCamelName}Service ${table.lowerCamelName}Service;
}
