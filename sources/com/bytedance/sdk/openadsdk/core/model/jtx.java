package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.lnr.lnr;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class jtx implements com.bytedance.sdk.component.adexpress.lnr {
    public int bjy;
    public JSONObject exu;
    public int fs;
    public int jpc;
    public final float lnr;
    public final float mml;
    public final long mo;
    public final long mzz;
    public final float qdl;
    public boolean rdp;
    public final boolean rq;
    public SparseArray<lnr.qdl> to;
    public JSONObject tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public final float f17356ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    public final String f17357wd;

    public static class qdl {
        private boolean bjy;
        private JSONObject exu;
        private int fs;
        private int jpc;
        private long lnr;
        private float mml;
        private float mo;
        private float mzz;
        private JSONObject rq;
        private int to;
        private String tvp;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private long f17358ud;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        private float f17359wd;
        private boolean rdp = false;
        protected SparseArray<lnr.qdl> qdl = new SparseArray<>();

        public qdl lnr(int i10) {
            this.jpc = i10;
            return this;
        }

        public qdl mml(float f10) {
            this.f17359wd = f10;
            return this;
        }

        public qdl qdl(int i10) {
            this.fs = i10;
            return this;
        }

        public qdl ud(int i10) {
            this.to = i10;
            return this;
        }

        public qdl lnr(float f10) {
            this.mo = f10;
            return this;
        }

        public qdl qdl(JSONObject jSONObject) {
            this.rq = jSONObject;
            return this;
        }

        public qdl ud(long j10) {
            this.lnr = j10;
            return this;
        }

        public qdl qdl(boolean z10) {
            this.bjy = z10;
            return this;
        }

        public qdl ud(float f10) {
            this.mzz = f10;
            return this;
        }

        public qdl qdl(long j10) {
            this.f17358ud = j10;
            return this;
        }

        public qdl ud(JSONObject jSONObject) {
            this.exu = jSONObject;
            return this;
        }

        public qdl qdl(float f10) {
            this.mml = f10;
            return this;
        }

        public qdl ud(boolean z10) {
            this.rdp = z10;
            return this;
        }

        public qdl qdl(String str) {
            this.tvp = str;
            return this;
        }

        public qdl qdl(SparseArray<lnr.qdl> sparseArray) {
            this.qdl = sparseArray;
            return this;
        }

        public jtx qdl() {
            return new jtx(this);
        }
    }

    private jtx(@NonNull qdl qdlVar) {
        this.rdp = false;
        this.qdl = qdlVar.f17359wd;
        this.f17356ud = qdlVar.mo;
        this.lnr = qdlVar.mzz;
        this.mml = qdlVar.mml;
        this.mzz = qdlVar.lnr;
        this.mo = qdlVar.f17358ud;
        this.f17357wd = qdlVar.tvp;
        this.to = qdlVar.qdl;
        this.rq = qdlVar.bjy;
        this.jpc = qdlVar.to;
        this.tvp = qdlVar.rq;
        this.fs = qdlVar.fs;
        this.exu = qdlVar.exu;
        this.rdp = qdlVar.rdp;
        this.bjy = qdlVar.jpc;
    }
}
