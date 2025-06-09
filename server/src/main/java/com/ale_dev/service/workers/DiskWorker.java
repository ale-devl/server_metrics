package com.ale_dev.service.workers;

import java.io.File;

import com.ale_dev.data.DiskData;

public class DiskWorker {
    private File root;

    public DiskWorker() {
        this.root = new File("/");
    }

    public DiskData getData() {
        double totalSpace = getTotalSpaceInGB();
        double freeSpace = getFreeSpaceInGB();
        double usedSpace = totalSpace - freeSpace;
        double usableSpace = getUsableSpaceInGB();

        return new DiskData(totalSpace, freeSpace, usedSpace, usableSpace);
    }

    private double getTotalSpaceInGB() {
        return root.getTotalSpace() / 1e9;
    }

    private double getFreeSpaceInGB() {
        return root.getFreeSpace() / 1e9;
    }

    private double getUsableSpaceInGB() {
        return root.getUsableSpace() / 1e9;
    }
}