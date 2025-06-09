package com.ale_dev.service;

import com.ale_dev.data.AllData;
import com.ale_dev.data.DiskData;
import com.ale_dev.data.RAMData;
import com.ale_dev.service.workers.CPUWorker;
import com.ale_dev.service.workers.DiskWorker;
import com.ale_dev.service.workers.RAMWorker;

public class MetricsService {
    RAMWorker ramWorker;
    DiskWorker diskWorker;
    CPUWorker cpuWorker;

    public MetricsService() {
        this.ramWorker = new RAMWorker();
        this.diskWorker = new DiskWorker();
        this.cpuWorker = new CPUWorker();
    }

    public RAMData getRAMData() {
        return ramWorker.getData();
    }

    public DiskData getDiskData() {
        return diskWorker.getData();
    }

    public double getCPUUsage() {
        return cpuWorker.getData();
    }

    // double totalDiskSpace, double freeDiskSpace, double usedDiskSpace, double usableDiskSpace, double totalRAM, double freeRAM, double usedRAM, double cpuLoad
    public AllData getAllData() {
        RAMData ramData = getRAMData();
        DiskData diskData = getDiskData();
        double cpuUsage = getCPUUsage();

        return new AllData(diskData.totalDiskSpace, diskData.freeDiskSpace, diskData.usedDiskSpace, diskData.usableDiskSpace, ramData.totalRAM, ramData.freeRAM, ramData.usedRAM, cpuUsage);
    }
}
