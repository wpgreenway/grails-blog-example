databaseChangeLog = {

    changeSet(author: "wpgreenway", id: "add-date-created-to-post") {
        addColumn(tableName: "post") {
            column(name: "date_created", type: "timestamp")
        }

        grailsChange {
            change {
                sql.execute("UPDATE post SET date_created = NOW()")
            }
            rollback {
            }
        }

        addNotNullConstraint(tableName: "post", columnName: "date_created")
    }
}