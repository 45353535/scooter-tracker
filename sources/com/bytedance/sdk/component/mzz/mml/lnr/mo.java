package com.bytedance.sdk.component.mzz.mml.lnr;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.mzz.aaj;
import com.bytedance.sdk.component.mzz.exu;
import com.bytedance.sdk.component.mzz.jl;
import com.bytedance.sdk.component.mzz.jyq;
import com.bytedance.sdk.component.mzz.yt;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    private ExecutorService jpc;
    private volatile yt lnr;
    private volatile jl mml;
    private com.bytedance.sdk.component.mzz.mml mo;
    private Context tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final exu f16614ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private ExecutorService f16615wd;
    private Map<String, List<lnr>> qdl = new ConcurrentHashMap();
    private Map<String, com.bytedance.sdk.component.mzz.lnr> mzz = new ConcurrentHashMap();

    public mo(Context context, exu exuVar) {
        this.f16614ud = (exu) wd.qdl(exuVar);
        this.tvp = context;
        com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud.qdl(context, exuVar.jpc());
    }

    private com.bytedance.sdk.component.mzz.lnr mml(com.bytedance.sdk.component.mzz.ud udVar) {
        com.bytedance.sdk.component.mzz.lnr lnrVarWd = this.f16614ud.wd();
        return lnrVarWd != null ? lnrVarWd : new com.bytedance.sdk.component.mzz.mml.lnr.qdl.qdl.ud(udVar.jpc(), udVar.qdl());
    }

    private ExecutorService rq() {
        ExecutorService executorServiceUd = this.f16614ud.ud();
        return executorServiceUd != null ? executorServiceUd : com.bytedance.sdk.component.mzz.mml.qdl.ud.qdl();
    }

    private com.bytedance.sdk.component.mzz.mml to() {
        com.bytedance.sdk.component.mzz.mml mmlVarMml = this.f16614ud.mml();
        return mmlVarMml == null ? new com.bytedance.sdk.component.mzz.ud.qdl() : mmlVarMml;
    }

    public ExecutorService jpc() {
        ExecutorService executorServiceUd;
        aaj aajVarLnr = this.f16614ud.lnr();
        if (aajVarLnr != null && (executorServiceUd = aajVarLnr.ud()) != null) {
            return executorServiceUd;
        }
        if (this.jpc == null) {
            this.jpc = com.bytedance.sdk.component.mzz.mml.qdl.ud.qdl();
        }
        return this.jpc;
    }

    public Collection<com.bytedance.sdk.component.mzz.lnr> lnr() {
        return this.mzz.values();
    }

    public jyq mo() {
        exu exuVar = this.f16614ud;
        if (exuVar != null) {
            return exuVar.tvp();
        }
        return null;
    }

    public ExecutorService mzz() {
        ExecutorService executorServiceQdl;
        aaj aajVarLnr = this.f16614ud.lnr();
        if (aajVarLnr != null && (executorServiceQdl = aajVarLnr.qdl()) != null) {
            return executorServiceQdl;
        }
        if (this.f16615wd == null) {
            this.f16615wd = rq();
        }
        return this.f16615wd;
    }

    public Context qdl() {
        return this.tvp;
    }

    public Map<String, List<lnr>> tvp() {
        return this.qdl;
    }

    public jl ud() {
        return this.mml;
    }

    public boolean wd() {
        exu exuVar = this.f16614ud;
        if (exuVar != null) {
            return exuVar.to();
        }
        return false;
    }

    public com.bytedance.sdk.component.mzz.lnr lnr(com.bytedance.sdk.component.mzz.ud udVar) {
        if (udVar == null) {
            udVar = com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud.to();
        }
        String string = udVar.jpc().toString();
        com.bytedance.sdk.component.mzz.lnr lnrVar = this.mzz.get(string);
        if (lnrVar != null) {
            return lnrVar;
        }
        com.bytedance.sdk.component.mzz.lnr lnrVarMml = mml(udVar);
        this.mzz.put(string, lnrVarMml);
        return lnrVarMml;
    }

    public yt qdl(com.bytedance.sdk.component.mzz.ud udVar) {
        if (udVar == null) {
            udVar = com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud.to();
        }
        if (this.lnr == null) {
            synchronized (com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud.lnr.class) {
                try {
                    if (this.lnr == null) {
                        this.lnr = new com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud.lnr(new com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud.qdl(udVar.ud(), udVar.lnr()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.lnr;
    }

    public jl ud(com.bytedance.sdk.component.mzz.ud udVar) {
        if (udVar == null) {
            udVar = com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud.to();
        }
        if (this.mml == null) {
            synchronized (com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud.ud.class) {
                try {
                    if (this.mml == null) {
                        this.mml = new com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud.ud(udVar.ud(), udVar.mml());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.mml;
    }

    public com.bytedance.sdk.component.mzz.mml mml() {
        if (this.mo == null) {
            this.mo = to();
        }
        return this.mo;
    }

    public com.bytedance.sdk.component.mzz.lnr qdl(String str) {
        return lnr(com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud.qdl(new File(str)));
    }

    public com.bytedance.sdk.component.mzz.mml.lnr.ud.ud qdl(lnr lnrVar) {
        ImageView.ScaleType scaleTypeMml = lnrVar.mml();
        if (scaleTypeMml == null) {
            scaleTypeMml = com.bytedance.sdk.component.mzz.mml.lnr.ud.ud.qdl;
        }
        ImageView.ScaleType scaleType = scaleTypeMml;
        Bitmap.Config configRq = lnrVar.rq();
        if (configRq == null) {
            configRq = com.bytedance.sdk.component.mzz.mml.lnr.ud.ud.f16631ud;
        }
        return new com.bytedance.sdk.component.mzz.mml.lnr.ud.ud(lnrVar.ud(), lnrVar.lnr(), scaleType, configRq, lnrVar.mo(), lnrVar.wd());
    }
}
