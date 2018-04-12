'use strict';
var gcoder = require('gcoder');

var FilterFieldPlugin = module.exports = gcoder.Plugin.extend({
    constructor: function () {
    }
});

FilterFieldPlugin.prototype.do = function (tables,config) {
    FilterFieldPlugin.__super__.do();
    let splitChat = config.splitChat || "_";
    let filterField = ["id","data_status","created_date","created_by","modified_date","modified_by"]
    for(let table of tables){
        for(let field of table.fieldArray){
            if(filterField.indexOf(field.fieldName)!=-1){
                field.ignore = true;
            }
            if(field.fieldName=="id"){
                field.sqIgnore = true;                
            }
        }
    }
};
