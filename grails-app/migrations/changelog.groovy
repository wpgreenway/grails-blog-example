databaseChangeLog = {

    changeSet(author: "wpgreenway (generated)", id: "1336436810786-1") {
        createTable(tableName: "post") {
            column(name: "id", type: "int8") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "postPK")
            }

            column(name: "version", type: "int8") {
                constraints(nullable: "false")
            }

            column(name: "body", type: "text")

            column(name: "title", type: "varchar(255)")
        }
    }

    changeSet(author: "wpgreenway (generated)", id: "1336436810786-2") {
        createSequence(sequenceName: "hibernate_sequence")
    }
}
