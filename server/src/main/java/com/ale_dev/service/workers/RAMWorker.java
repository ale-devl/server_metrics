package com.ale_dev.service.workers;

import com.ale_dev.data.RAMData;
import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;

public class RAMWorker {
    private OperatingSystemMXBean osBean;

    public RAMWorker() {
        this.osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
    }

    public RAMData getData() {
        double totalRAM = this.getTotalRAM();
        double freeRAM = this.getFreeRAM();
        double usedRAM = totalRAM - freeRAM;
        return new RAMData(totalRAM, freeRAM, usedRAM);
    }

    private double getTotalRAM() {
        return this.osBean.getTotalMemorySize() / (1024.0f* 1024);
    }

    private double getFreeRAM() {
        return this.osBean.getFreeMemorySize() / (1024.0f* 1024);
    }
}