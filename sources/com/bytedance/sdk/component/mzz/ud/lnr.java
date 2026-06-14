package com.bytedance.sdk.component.mzz.ud;

import com.bytedance.sdk.component.mzz.mo;
import com.bytedance.sdk.component.mzz.wd;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class lnr<T> implements mo {
    private T lnr;
    private String mml;
    private wd mzz;
    Map<String, String> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16643ud;

    public lnr(int i10, T t10, String str) {
        this.f16643ud = i10;
        this.lnr = t10;
        this.mml = str;
    }

    @Override // com.bytedance.sdk.component.mzz.mo
    public T lnr() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.component.mzz.mo
    public String mml() {
        return this.mml;
    }

    @Override // com.bytedance.sdk.component.mzz.mo
    public Map<String, String> mzz() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.mzz.mo
    public wd qdl() {
        return this.mzz;
    }

    @Override // com.bytedance.sdk.component.mzz.mo
    public int ud() {
        return this.f16643ud;
    }

    public void qdl(wd wdVar) {
        this.mzz = wdVar;
    }

    public lnr(int i10, T t10, String str, Map<String, String> map) {
        this(i10, t10, str);
        this.qdl = map;
    }
}
