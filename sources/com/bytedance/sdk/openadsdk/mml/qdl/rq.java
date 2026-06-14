package com.bytedance.sdk.openadsdk.mml.qdl;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class rq {
    public static rq qdl = new rq();
    private final Map<String, qdl> lnr = new HashMap();
    private volatile boolean mml;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private qdl f17733ud;

    public static class qdl {
        private final int qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final int f17734ud;

        public qdl(int i10, int i11) {
            this.qdl = (i10 < 0 || i10 > 5) ? 3 : i10;
            this.f17734ud = i11 < 10 ? 30 : i11;
        }

        public int qdl() {
            return this.qdl;
        }

        public int ud() {
            return this.f17734ud;
        }
    }

    private int lnr() {
        qdl qdlVar = this.f17733ud;
        if (qdlVar != null) {
            return qdlVar.ud();
        }
        return 30;
    }

    private int ud() {
        qdl qdlVar = this.f17733ud;
        if (qdlVar != null) {
            return qdlVar.qdl();
        }
        return 3;
    }

    public void qdl(qdl qdlVar) {
        this.f17733ud = qdlVar;
    }

    public void qdl(String str, qdl qdlVar) {
        if (TextUtils.isEmpty(str) || qdlVar == null) {
            return;
        }
        this.lnr.put(str, qdlVar);
    }

    public int ud(String str) {
        qdl qdlVar = this.lnr.get(str);
        if (qdlVar == null) {
            return lnr();
        }
        return qdlVar.ud();
    }

    public int qdl(String str) {
        if (!qdl()) {
            return 4;
        }
        qdl qdlVar = this.lnr.get(str);
        if (qdlVar == null) {
            return ud();
        }
        return qdlVar.qdl();
    }

    public boolean qdl() {
        return this.mml;
    }

    public void qdl(boolean z10) {
        this.mml = z10;
    }
}
