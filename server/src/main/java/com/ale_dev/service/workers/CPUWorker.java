package com.ale_dev.service.workers;

import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class CPUWorker {
    private OperatingSystemMXBean osBean;

    public CPUWorker() {
        this.osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
    }

    public double getData() {
        double cpuLoad = this.osBean.getCpuLoad();
        return cpuLoad * 100;
    }
}
