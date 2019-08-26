package com.zzj.designer.decorator;

public class DBHelper implements HelperEntry {

    private String dbname;

    private DotEntity dot;

    public DBHelper(String dbname) {
        this.dbname = dbname;
    }

    public DBHelper(String dbname, DotEntity dot) {
        this.dbname = dbname;
        this.dot = dot;
    }

    @Override
    public void doInit() {
        System.out.println(this.dbname + " doInit: "+ this.dot.getId() );
    }

    @Override
    public void doSave() {
        System.out.println(this.dbname + " doSave: " + this.dot.getId() );
    }
}
