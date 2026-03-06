package com.pluralsight.creational.prototype;

import java.util.List;

public class Statement implements Cloneable{
    private String sql;
    private List<String> parameters;
    private Record record;

    public Statement(String sql, List<String> parameters, Record record) {
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    // clone() method has to be implemented because the object is implementing Cloneable interface
    public Statement clone() {
        try {
            // this is deep copy -> i.e. copies only the parameters but not the references of the instance
            Statement cloned = (Statement) super.clone(); // calling the parent clone method;
            cloned.setRecord(this.record.clone());
            return cloned;
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void setRecord(Record record) {
        this.record = record;
    }

    public String getSql() {
        return sql;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Record getRecord() {
        return record;
    }
}
