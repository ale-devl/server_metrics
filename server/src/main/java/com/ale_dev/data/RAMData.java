package com.ale_dev.data;

public class RAMData {
    public final double totalRAM;
    public final double freeRAM;
    public final double usedRAM;

    public RAMData(double totalRAM, double freeRAM, double usedRAM) {
        this.totalRAM = totalRAM;
        this.freeRAM = freeRAM;
        this.usedRAM = usedRAM;
    }
}