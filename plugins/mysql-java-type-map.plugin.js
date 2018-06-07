'use strict';
var gcoder = require('gcoder');

var MysqlJavaTypeMapFilterPlugin = module.exports = gcoder.Plugin.extend({
    constructor: function () {
    }
});

MysqlJavaTypeMapFilterPlugin.prototype.do = function (tables,config) {
    MysqlJavaTypeMapFilterPlugin.__super__.do();
    let tsTypeMap = {
        "int":"Long",
        "tinyint":"Integer",
        "smallint":"Integer",
        "bigint":"Long",
        "int unsigned":"Long",
        "varchar":"String",
        "float":"Float",
        "double":"Double",
        "date":"Date",
        "datetime":"Date",
        "decimal":"BigDecimal",
        "text":"String",
    }
    for(let table of tables){
        let splitArray = table.tableName.split("_");
        let abbr = "";
        for(let splitStr of splitArray){
            abbr+=splitStr.substr(0,1);
        }
        table.abbr = abbr;
        table.prefix = table.tableName.split("_")[0];
        for(let field of table.fieldArray){
            let fieldType = field.fieldType.replace(/\(\d+,\d\)/,"");
            field.javaType = tsTypeMap[fieldType];
            if(!field.javaType){
                console.log(`${field.fieldType} not map javaType`);
            }
        }
    }
};
