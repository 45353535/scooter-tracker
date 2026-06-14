package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class g {
    public static Long a(File file) {
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.utils.g.1
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        Long l10 = null;
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                try {
                    Long lValueOf = Long.valueOf(file2.getName());
                    long jLongValue = lValueOf.longValue();
                    if (l10 == null || jLongValue > l10.longValue()) {
                        l10 = lValueOf;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return l10;
    }

    public static List<Long> b(File file) {
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.utils.g.2
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            try {
                Long lValueOf = Long.valueOf(file2.getName());
                lValueOf.longValue();
                arrayList.add(lValueOf);
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }
}
