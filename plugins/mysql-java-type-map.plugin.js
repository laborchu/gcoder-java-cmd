'use strict';
var gcoder = require('gcoder');

var MysqlJavaTypeMapFilterPlugin = module.exports = gcoder.Plugin.extend({
    constructor: function () {
    }
});

MysqlJavaTypeMapFilterPlugin.prototype.do = function (tables,config) {
    MysqlJavaTypeMapFilterPlugin.__super__.do();
    let splitChat = config.splitChat || "_";
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
        "text":"String",
    }
    for(let table of tables){
        table.prefix = table.tableName.split("_")[0];
        for(let field of table.fieldArray){
            field.javaType = tsTypeMap[field.fieldType];
            if(!field.tsType){
                console.log(`${field.fieldType} not map tsType`);
            }
        }
    }
};
