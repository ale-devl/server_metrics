package com.ale_dev.data;

public class AllData {
    public final double totalDiskSpace;
    public final double freeDiskSpace;
    public final double usedDiskSpace;
    public final double usableDiskSpace;
    public final double totalRAM;
    public final double freeRAM;
    public final double usedRAM;
    public final double cpuLoad;

    public AllData(double totalDiskSpace, double freeDiskSpace, double usedDiskSpace, double usableDiskSpace, double totalRAM, double freeRAM, double usedRAM, double cpuLoad) {
        this.totalDiskSpace = totalDiskSpace;
        this.freeDiskSpace = freeDiskSpace;
        this.usedDiskSpace = usedDiskSpace;
        this.usableDiskSpace = usableDiskSpace;
        this.totalRAM = totalRAM;
        this.freeRAM = freeRAM;
        this.usedRAM = usedRAM;
        this.cpuLoad = cpuLoad;
    }
}