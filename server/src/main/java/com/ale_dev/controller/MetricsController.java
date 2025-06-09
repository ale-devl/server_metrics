package com.ale_dev.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ale_dev.data.AllData;
import com.ale_dev.data.DiskData;
import com.ale_dev.data.RAMData;
import com.ale_dev.service.MetricsService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MetricsController {
    private MetricsService metricsService;

    public MetricsController() {
        metricsService = new MetricsService();
    }

    @GetMapping("/cpuLoad")
    public double getCpuLoad() {
        return this.metricsService.getCPUUsage();
    }

    @GetMapping("/diskUsage")
    public DiskData getDiskUsage() {
        return this.metricsService.getDiskData();
    }

    @GetMapping("/RAMUsage")
    public RAMData getRAMUsage() {
        return this.metricsService.getRAMData();
    }

    @GetMapping("/AllData")
    public AllData getAllData() {
        return this.metricsService.getAllData();
    }
}