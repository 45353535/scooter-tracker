package com.bytedance.sdk.openadsdk.ud;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends qdl {
    private int lnr;
    private volatile boolean mml;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f17834ud;

    public ud(int i10, int i11) {
        this.f17834ud = 15;
        this.lnr = 3;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.f17834ud = i10;
        this.lnr = i11;
    }

    private void lnr(List<File> list) {
        long jUd = ud(list);
        int size = list.size();
        if (qdl(jUd, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                jUd -= length;
            }
            if (qdl(file, jUd, size)) {
                return;
            }
        }
    }

    private void mml(List<File> list) {
        long jUd;
        int size;
        boolean zQdl;
        if (list != null) {
            try {
                if (list.size() != 0 && !(zQdl = qdl((jUd = ud(list)), (size = list.size())))) {
                    TreeMap treeMap = new TreeMap();
                    for (File file : list) {
                        treeMap.put(Long.valueOf(file.lastModified()), file);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null && !zQdl) {
                            ((Long) entry.getKey()).getClass();
                            File file2 = (File) entry.getValue();
                            long length = file2.length();
                            if (file2.delete()) {
                                size--;
                                jUd -= length;
                            }
                            if (qdl(file2, jUd, size)) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ud.qdl
    protected boolean qdl(long j10, int i10) {
        return i10 <= this.f17834ud;
    }

    @Override // com.bytedance.sdk.openadsdk.ud.qdl
    protected boolean qdl(File file, long j10, int i10) {
        return i10 <= this.lnr;
    }

    @Override // com.bytedance.sdk.openadsdk.ud.qdl
    protected void qdl(List<File> list) {
        if (this.mml) {
            mml(list);
            this.mml = false;
        } else {
            lnr(list);
        }
    }

    public ud(int i10, int i11, boolean z10) {
        this.f17834ud = 15;
        this.lnr = 3;
        if (i10 > 0) {
            this.f17834ud = i10;
            this.lnr = i11;
            this.mml = z10;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}
