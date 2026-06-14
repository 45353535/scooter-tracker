package com.bytedance.sdk.component.wd.ud;

import android.text.TextUtils;
import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.rq;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lnr {
    protected rq lnr;
    int mo;
    String mzz;
    protected String mml = null;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    protected final Map<String, String> f16738wd = new HashMap();
    protected String jpc = null;
    protected boolean tvp = false;

    public lnr(rq rqVar) {
        this.lnr = rqVar;
        try {
            lnr(UUID.randomUUID().toString());
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void lnr(String str) {
        this.mml = str;
    }

    public void mml(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f16738wd.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void qdl(String str) {
        this.mzz = str;
    }

    public void ud(String str) {
        this.jpc = str;
    }

    public String lnr() {
        return this.mml;
    }

    public void qdl(int i10) {
        this.mo = i10;
    }

    public void ud(String str, String str2) {
        this.f16738wd.put(str, str2);
    }

    public String mml() {
        return this.jpc;
    }

    protected void qdl(fs.qdl qdlVar) {
        if (qdlVar != null && this.f16738wd.size() > 0) {
            for (Map.Entry<String, String> entry : this.f16738wd.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    qdlVar.ud(key, value);
                }
            }
        }
    }

    public void ud() {
        rq rqVar;
        if (this.mml == null || (rqVar = this.lnr) == null) {
            return;
        }
        com.bytedance.sdk.component.ud.qdl.mml mmlVarQdl = rqVar.qdl();
        synchronized (mmlVarQdl) {
            try {
                for (com.bytedance.sdk.component.ud.qdl.ud udVar : mmlVarQdl.lnr()) {
                    if (this.mml.equals(udVar.qdl().qdl())) {
                        udVar.lnr();
                    }
                }
                for (com.bytedance.sdk.component.ud.qdl.ud udVar2 : mmlVarQdl.mml()) {
                    if (this.mml.equals(udVar2.qdl().qdl())) {
                        udVar2.lnr();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
