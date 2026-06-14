package com.bytedance.sdk.component.mzz.ud;

import com.bytedance.sdk.component.mzz.mzz;
import com.bytedance.sdk.component.mzz.rdp;

/* JADX INFO: loaded from: classes6.dex */
public class ud implements mzz {
    private boolean lnr;
    private rdp mml;
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private boolean f16645ud;

    public ud(String str, boolean z10, boolean z11, rdp rdpVar) {
        this.qdl = str;
        this.f16645ud = z10;
        this.lnr = z11;
        this.mml = rdpVar;
    }

    @Override // com.bytedance.sdk.component.mzz.mzz
    public boolean lnr() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.component.mzz.mzz
    public String qdl() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.mzz.mzz
    public boolean ud() {
        return this.f16645ud;
    }
}
