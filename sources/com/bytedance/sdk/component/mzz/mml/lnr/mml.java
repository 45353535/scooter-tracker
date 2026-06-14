package com.bytedance.sdk.component.mzz.mml.lnr;

import com.bytedance.sdk.component.mzz.rq;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class mml<T> implements rq {
    private boolean jpc;
    private T lnr;
    private T mml;
    private int mo;
    private int mzz;
    private String qdl;
    private int rq;
    private com.bytedance.sdk.component.mzz.wd to;
    private boolean tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f16612ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private Map<String, String> f16613wd;

    @Override // com.bytedance.sdk.component.mzz.rq
    public T lnr() {
        return this.mml;
    }

    @Override // com.bytedance.sdk.component.mzz.rq
    public Map<String, String> mml() {
        return this.f16613wd;
    }

    @Override // com.bytedance.sdk.component.mzz.rq
    public boolean mo() {
        return this.tvp;
    }

    @Override // com.bytedance.sdk.component.mzz.rq
    public boolean mzz() {
        return this.jpc;
    }

    public mml qdl(lnr lnrVar, T t10) {
        this.lnr = t10;
        this.qdl = lnrVar.to();
        this.f16612ud = lnrVar.qdl();
        this.mzz = lnrVar.ud();
        this.mo = lnrVar.lnr();
        this.tvp = lnrVar.exu();
        this.to = lnrVar.bjy();
        this.rq = lnrVar.jtx();
        return this;
    }

    @Override // com.bytedance.sdk.component.mzz.rq
    public T ud() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.component.mzz.rq
    public int wd() {
        return this.rq;
    }

    public mml qdl(lnr lnrVar, T t10, Map<String, String> map, boolean z10) {
        this.f16613wd = map;
        this.jpc = z10;
        return qdl(lnrVar, t10);
    }

    @Override // com.bytedance.sdk.component.mzz.rq
    public String qdl() {
        return this.f16612ud;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.mzz.rq
    public void qdl(Object obj) {
        this.mml = this.lnr;
        this.lnr = obj;
    }
}
