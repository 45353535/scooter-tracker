package com.bytedance.sdk.openadsdk.core.exu.lnr;

import com.bytedance.sdk.component.utils.wd;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class lnr extends com.bytedance.sdk.openadsdk.ud.ud {
    public lnr(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.bytedance.sdk.openadsdk.ud.ud, com.bytedance.sdk.openadsdk.ud.qdl
    protected void qdl(List<File> list) {
        int size = list.size();
        if (qdl(0L, size)) {
            return;
        }
        for (File file : list) {
            wd.lnr(file);
            size--;
            if (qdl(file, 0L, size)) {
                return;
            }
        }
    }

    public lnr(int i10, int i11, boolean z10) {
        super(i10, i11);
        this.qdl = z10;
    }
}
