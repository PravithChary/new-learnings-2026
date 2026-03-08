package com.pluralsight.behavioral.visitor.visitorgood;

public interface AtvPartVisitor {
    void visit(Wheel wheel);
    void visit(Fender fender);
    void visit(Oil oil);
    void visit(PartsOrder partsOrder);
}
