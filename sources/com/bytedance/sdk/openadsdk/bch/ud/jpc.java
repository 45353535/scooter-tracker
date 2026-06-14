package com.bytedance.sdk.openadsdk.bch.ud;

import android.view.View;
import com.bytedance.sdk.openadsdk.bch.ud.mzz;
import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes6.dex */
public class jpc extends ud {
    private int mml;

    public jpc(Integer num, View view, ljh ljhVar, mzz.qdl qdlVar) {
        super(num, view, ljhVar, 2000, qdlVar);
        this.mml = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    public boolean fs() {
        int i10 = this.mml;
        boolean z10 = i10 == 2 || i10 == 0;
        if (z10) {
            this.lnr.set(false);
        }
        return !z10 || super.fs();
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    protected boolean lnr() {
        return mo.qdl(this.qdl.get(), this.f16939ud.ok()) && this.mml == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    protected void mml() {
        super.mml();
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    public int mo() {
        return 200;
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    public void qdl() {
        if (this.mml != 1) {
            return;
        }
        super.qdl();
    }

    @Override // com.bytedance.sdk.openadsdk.bch.ud.ud
    protected void ud(int i10) {
        if (tvp()) {
            return;
        }
        if (i10 == 6 || i10 == 5) {
            this.mml = 0;
            jpc();
        }
        if (i10 == 3 || i10 == 2) {
            this.mml = 2;
            jpc();
        }
        if (this.mml == 1 || i10 != 0) {
            return;
        }
        this.mml = 1;
        qdl();
    }
}
