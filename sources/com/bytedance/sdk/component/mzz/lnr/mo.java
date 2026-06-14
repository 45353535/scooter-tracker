package com.bytedance.sdk.component.mzz.lnr;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.mzz.aaj;
import com.bytedance.sdk.component.mzz.exu;
import com.bytedance.sdk.component.mzz.fs;
import com.bytedance.sdk.component.mzz.jl;
import com.bytedance.sdk.component.mzz.jyq;
import com.bytedance.sdk.component.mzz.yt;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    private ExecutorService jpc;
    private com.bytedance.sdk.component.mzz.mml mo;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final exu f16580ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private fs f16581wd;
    private Map<String, List<lnr>> qdl = new ConcurrentHashMap();
    private Map<String, yt> lnr = new HashMap();
    private Map<String, jl> mml = new HashMap();
    private Map<String, com.bytedance.sdk.component.mzz.lnr> mzz = new HashMap();

    public mo(Context context, exu exuVar) {
        this.f16580ud = (exu) wd.qdl(exuVar);
        com.bytedance.sdk.component.mzz.lnr.qdl.qdl.qdl(context, exuVar.jpc());
    }

    private yt mml(com.bytedance.sdk.component.mzz.ud udVar) {
        yt ytVarMzz = this.f16580ud.mzz();
        return ytVarMzz != null ? com.bytedance.sdk.component.mzz.lnr.qdl.ud.qdl.qdl(ytVarMzz) : com.bytedance.sdk.component.mzz.lnr.qdl.ud.qdl.qdl(udVar.ud());
    }

    private com.bytedance.sdk.component.mzz.lnr mo(com.bytedance.sdk.component.mzz.ud udVar) {
        com.bytedance.sdk.component.mzz.lnr lnrVarWd = this.f16580ud.wd();
        return lnrVarWd != null ? lnrVarWd : new com.bytedance.sdk.component.mzz.lnr.qdl.qdl.ud(udVar.jpc(), udVar.qdl(), wd());
    }

    private jl mzz(com.bytedance.sdk.component.mzz.ud udVar) {
        jl jlVarMo = this.f16580ud.mo();
        return jlVarMo != null ? jlVarMo : com.bytedance.sdk.component.mzz.lnr.qdl.ud.mzz.qdl(udVar.ud());
    }

    private ExecutorService rq() {
        ExecutorService executorServiceUd = this.f16580ud.ud();
        return executorServiceUd != null ? executorServiceUd : com.bytedance.sdk.component.mzz.qdl.lnr.qdl();
    }

    private fs to() {
        fs fsVarQdl = this.f16580ud.qdl();
        return fsVarQdl != null ? fsVarQdl : com.bytedance.sdk.component.mzz.qdl.ud.qdl();
    }

    private com.bytedance.sdk.component.mzz.mml tvp() {
        com.bytedance.sdk.component.mzz.mml mmlVarMml = this.f16580ud.mml();
        return mmlVarMml == null ? new com.bytedance.sdk.component.mzz.ud.qdl() : mmlVarMml;
    }

    public Map<String, List<lnr>> jpc() {
        return this.qdl;
    }

    public Collection<com.bytedance.sdk.component.mzz.lnr> lnr() {
        return this.mzz.values();
    }

    public Collection<yt> qdl() {
        return this.lnr.values();
    }

    public Collection<jl> ud() {
        return this.mml.values();
    }

    public ExecutorService wd() {
        ExecutorService executorServiceQdl;
        aaj aajVarLnr = this.f16580ud.lnr();
        if (aajVarLnr != null && (executorServiceQdl = aajVarLnr.qdl()) != null) {
            return executorServiceQdl;
        }
        if (this.jpc == null) {
            this.jpc = rq();
        }
        return this.jpc;
    }

    public com.bytedance.sdk.component.mzz.lnr lnr(com.bytedance.sdk.component.mzz.ud udVar) {
        if (udVar == null) {
            udVar = com.bytedance.sdk.component.mzz.lnr.qdl.qdl.to();
        }
        String string = udVar.jpc().toString();
        com.bytedance.sdk.component.mzz.lnr lnrVar = this.mzz.get(string);
        if (lnrVar != null) {
            return lnrVar;
        }
        com.bytedance.sdk.component.mzz.lnr lnrVarMo = mo(udVar);
        this.mzz.put(string, lnrVarMo);
        return lnrVarMo;
    }

    public yt qdl(com.bytedance.sdk.component.mzz.ud udVar) {
        if (udVar == null) {
            udVar = com.bytedance.sdk.component.mzz.lnr.qdl.qdl.to();
        }
        String string = udVar.jpc().toString();
        yt ytVar = this.lnr.get(string);
        if (ytVar != null) {
            return ytVar;
        }
        yt ytVarMml = mml(udVar);
        this.lnr.put(string, ytVarMml);
        return ytVarMml;
    }

    public jl ud(com.bytedance.sdk.component.mzz.ud udVar) {
        if (udVar == null) {
            udVar = com.bytedance.sdk.component.mzz.lnr.qdl.qdl.to();
        }
        String string = udVar.jpc().toString();
        jl jlVar = this.mml.get(string);
        if (jlVar != null) {
            return jlVar;
        }
        jl jlVarMzz = mzz(udVar);
        this.mml.put(string, jlVarMzz);
        return jlVarMzz;
    }

    public fs mo() {
        if (this.f16581wd == null) {
            this.f16581wd = to();
        }
        return this.f16581wd;
    }

    public jyq mzz() {
        exu exuVar = this.f16580ud;
        if (exuVar != null) {
            return exuVar.tvp();
        }
        return null;
    }

    public com.bytedance.sdk.component.mzz.mml mml() {
        if (this.mo == null) {
            this.mo = tvp();
        }
        return this.mo;
    }

    public com.bytedance.sdk.component.mzz.lnr qdl(String str) {
        return lnr(com.bytedance.sdk.component.mzz.lnr.qdl.qdl.qdl(new File(str)));
    }

    public com.bytedance.sdk.component.mzz.lnr.ud.qdl qdl(lnr lnrVar) {
        ImageView.ScaleType scaleTypeMml = lnrVar.mml();
        if (scaleTypeMml == null) {
            scaleTypeMml = com.bytedance.sdk.component.mzz.lnr.ud.qdl.qdl;
        }
        ImageView.ScaleType scaleType = scaleTypeMml;
        Bitmap.Config configRq = lnrVar.rq();
        if (configRq == null) {
            configRq = com.bytedance.sdk.component.mzz.lnr.ud.qdl.f16601ud;
        }
        return new com.bytedance.sdk.component.mzz.lnr.ud.qdl(lnrVar.ud(), lnrVar.lnr(), scaleType, configRq, lnrVar.mo(), lnrVar.wd());
    }
}
