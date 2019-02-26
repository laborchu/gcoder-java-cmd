package ${config.java.package.cmd}.${table.prefix};

import ${config.java.package.cmd}.CmdSign;
import ${config.java.package.code}.CmdCode;
import ${config.java.package.vo}.${table.prefix}.${table.upperCamelName}VO;
import ${config.java.package.test}.ACmdTest;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ${table.upperCamelName}PatchCmdTest extends ACmdTest {

    @InjectMocks
    private ${table.upperCamelName}PatchCmd ${table.lowerCamelName}PatchCmd;

    @BeforeClass
    public void setUp() throws Exception {
        //初始化测试用例类中由Mockito的注解标注的所有模拟对象
        MockitoAnnotations.initMocks(this);
    }

    @BeforeMethod
    public void resetScheduler() {
        Mockito.reset(this.scheduler);
    }

    @Test
    public void testExecuteApp() throws Exception {
        CmdSign sign = CmdSign.Builder.newBuild(null)
                .setCmdCode(SysConstants.CMD_APP_SCOPE, CmdCode.${table.upperTableName}_PATCH)
                .build();
        this.${table.lowerCamelName}PatchCmd.executeApp(null, sign);
    }

    @Test
    public void testExecuteServer() throws Exception {
        CmdSign sign = CmdSign.Builder.newBuild(null)
                .setCmdCode(SysConstants.CMD_SERVER_SCOPE, CmdCode.${table.upperTableName}_PATCH)
                .build();
        this.${table.lowerCamelName}PatchCmd.executeServer(null, sign);
    }

    @Test
    public void testExecute() throws Exception {
        CmdSign sign = CmdSign.Builder.newBuild(null)
                .setCmdCode(CmdCode.${table.upperTableName}_PATCH)
                .build();
        this.${table.lowerCamelName}PatchCmd.execute(null, sign);
    }

    @Test
    public void testExecuteMop() throws Exception {
        CmdSign sign = CmdSign.Builder.newBuild(null)
                .setCmdCode(SysConstants.CMD_MOP_SCOPE, CmdCode.${table.upperTableName}_PATCH)
                .build();
        this.${table.lowerCamelName}PatchCmd.executeMop(null, sign);
    }

    @Test
    public void testVerify() throws Exception {
        CmdSign sign = CmdSign.Builder.newBuild(null)
                .setCmdCode(CmdCode.${table.upperTableName}_PATCH)
                .build();
        this.${table.lowerCamelName}PatchCmd.verify(null, sign);
    }
}
