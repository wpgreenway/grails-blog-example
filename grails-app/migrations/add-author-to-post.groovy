databaseChangeLog = {

    changeSet(author: "wpgreenway (generated)", id: "1336437476874-1") {
        addColumn(tableName: "post") {
            column(name: "author", type: "varchar(255)")
        }
    }
}
