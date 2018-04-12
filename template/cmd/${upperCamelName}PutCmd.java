package ${config.java.package.cmd};

import ${config.java.package.cmd}.CmdSign;
import ${config.java.package.code}.CmdCode;
import ${config.java.package.vo}.${table.prefix}.${table.upperCamelName}VO;
import ${config.java.package.service}.${table.prefix}.I${table.upperCamelName}Service;
import ${config.java.package.cmd}.ACmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ${table.upperCamelName}PutCmd extends ACmd {

    @Override
    public CmdSign execute(HttpServletRequest request, CmdSign sign) throws Exception {
        CmdSign respSign = new CmdSign(sign);
        return respSign;
    }

    @Override
    public String getCmdCode() {
        return CmdCode.${table.upperTableName}_PUT;
    }

    @Autowired
    private I${table.upperCamelName}Service ${table.lowerCamelName}Service;
}
