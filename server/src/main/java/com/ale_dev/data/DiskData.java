package com.ale_dev.data;

public class DiskData {
    public final double totalDiskSpace;
    public final double freeDiskSpace;
    public final double usedDiskSpace;
    public final double usableDiskSpace;

    public DiskData(double totalDiskSpace, double freeDiskSpace, double usedDiskSpace, double usableDiskSpace) {
        this.totalDiskSpace = totalDiskSpace;
        this.freeDiskSpace = freeDiskSpace;
        this.usedDiskSpace = usedDiskSpace;
        this.usableDiskSpace = usableDiskSpace;
    }
}