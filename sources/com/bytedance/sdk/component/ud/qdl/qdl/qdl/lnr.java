package com.bytedance.sdk.component.ud.qdl.qdl.qdl;

import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.jpc;
import com.bytedance.sdk.component.ud.qdl.rdp;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class lnr implements jpc.qdl {
    int lnr = 0;
    List<com.bytedance.sdk.component.ud.qdl.jpc> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    fs f16696ud;

    lnr(List<com.bytedance.sdk.component.ud.qdl.jpc> list, fs fsVar) {
        this.qdl = list;
        this.f16696ud = fsVar;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.jpc.qdl
    public fs qdl() {
        return this.f16696ud;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.jpc.qdl
    public rdp qdl(fs fsVar) throws IOException {
        this.f16696ud = fsVar;
        int i10 = this.lnr + 1;
        this.lnr = i10;
        if (i10 >= this.qdl.size()) {
            return null;
        }
        return this.qdl.get(this.lnr).qdl(this);
    }
}
