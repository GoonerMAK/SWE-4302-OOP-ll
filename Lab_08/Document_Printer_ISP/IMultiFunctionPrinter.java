package org.example;

public interface IMultiFunctionPrinter extends IBasicPrinter {

    public Document scan();

    public void Fax(Document d);
}
