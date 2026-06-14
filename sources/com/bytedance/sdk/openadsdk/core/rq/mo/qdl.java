package com.bytedance.sdk.openadsdk.core.rq.mo;

import com.bytedance.adsdk.ugeno.core.jl;
import com.bytedance.sdk.component.adexpress.ud.exu;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends exu {
    private float lnr;
    private float mml;
    private boolean mzz;
    private JSONObject qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private jl f17436ud;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.rq.mo.qdl$qdl, reason: collision with other inner class name */
    public static class C0270qdl extends exu.qdl {
        private float lnr;
        private float mml;
        private boolean mzz;
        private JSONObject qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private jl f17437ud;

        public C0270qdl mo(boolean z10) {
            this.mzz = z10;
            return this;
        }

        public C0270qdl ud(float f10) {
            this.mml = f10;
            return this;
        }

        public C0270qdl qdl(JSONObject jSONObject) {
            this.qdl = jSONObject;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.ud.exu.qdl
        /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
        public qdl qdl() {
            return new qdl(this);
        }

        public C0270qdl qdl(jl jlVar) {
            this.f17437ud = jlVar;
            return this;
        }

        public C0270qdl qdl(float f10) {
            this.lnr = f10;
            return this;
        }
    }

    public qdl(C0270qdl c0270qdl) {
        super(c0270qdl);
        this.qdl = c0270qdl.qdl;
        this.f17436ud = c0270qdl.f17437ud;
        this.lnr = c0270qdl.lnr;
        this.mml = c0270qdl.mml;
        this.mzz = c0270qdl.mzz;
    }

    public jl ekw() {
        return this.f17436ud;
    }

    public boolean hkc() {
        return this.mzz;
    }

    public JSONObject kdv() {
        return this.qdl;
    }

    public float rc() {
        return this.mml;
    }

    public float vu() {
        return this.lnr;
    }
}
