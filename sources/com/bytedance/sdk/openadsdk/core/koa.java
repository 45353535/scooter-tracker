package com.bytedance.sdk.openadsdk.core;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class koa {
    private static koa qdl;
    private com.bytedance.sdk.openadsdk.qdl.lnr.ud mo;
    private com.bytedance.sdk.openadsdk.qdl.mzz.qdl mzz;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.qdl.mml.ud f17278wd;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final AtomicInteger f17277ud = new AtomicInteger(0);
    private Map<Integer, com.bytedance.sdk.openadsdk.core.model.qdl> lnr = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, qdl<?>> mml = new ConcurrentHashMap<>();
    private final Map<String, ud> jpc = new HashMap();

    public static class qdl<T> {
        public final long lnr = System.currentTimeMillis();
        public final T qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public final String f17279ud;

        public qdl(T t10, String str) {
            this.qdl = t10;
            this.f17279ud = str;
        }
    }

    public interface ud {
        void qdl();
    }

    private koa() {
    }

    public com.bytedance.sdk.openadsdk.qdl.lnr.ud lnr() {
        return this.mo;
    }

    public com.bytedance.sdk.openadsdk.qdl.mml.ud mml() {
        return this.f17278wd;
    }

    public void mzz() {
        this.mzz = null;
        this.mo = null;
        this.f17278wd = null;
    }

    public <T> void qdl(String str, T t10) {
        if (TextUtils.isEmpty(str) || t10 == null) {
            return;
        }
        this.mml.put(str, new qdl<>(t10, str));
    }

    public com.bytedance.sdk.openadsdk.qdl.mzz.qdl ud() {
        return this.mzz;
    }

    private static String mml(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (ljhVar == null) {
            return null;
        }
        String strCev = ljhVar.cev();
        return TextUtils.isEmpty(strCev) ? String.valueOf(ljhVar.hashCode()) : strCev;
    }

    public void lnr(int i10) {
        this.lnr.remove(Integer.valueOf(i10));
    }

    public com.bytedance.sdk.openadsdk.core.model.qdl ud(int i10) {
        return this.lnr.remove(Integer.valueOf(i10));
    }

    public void lnr(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        String strMml = mml(ljhVar);
        if (TextUtils.isEmpty(strMml)) {
            return;
        }
        this.jpc.remove(strMml);
    }

    public <T> T qdl(String str, Class<T> cls) {
        qdl<?> qdlVar;
        if (TextUtils.isEmpty(str) || cls == null || (qdlVar = this.mml.get(str)) == null || !cls.isInstance(qdlVar.qdl)) {
            return null;
        }
        return cls.cast(qdlVar.qdl);
    }

    public void ud(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        ud udVar;
        if (ljhVar == null) {
            return;
        }
        String strMml = mml(ljhVar);
        if (TextUtils.isEmpty(strMml) || (udVar = this.jpc.get(strMml)) == null) {
            return;
        }
        udVar.qdl();
    }

    public qdl<?> qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mml.remove(str);
    }

    @MainThread
    public static koa qdl() {
        if (qdl == null) {
            qdl = new koa();
        }
        return qdl;
    }

    public com.bytedance.sdk.openadsdk.core.model.ljh qdl(int i10) {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVarRemove = this.lnr.remove(Integer.valueOf(i10));
        if (qdlVarRemove != null) {
            return qdlVarRemove.bjy();
        }
        return null;
    }

    public int qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar = new com.bytedance.sdk.openadsdk.core.model.qdl();
        qdlVar.ud(ljhVar);
        return qdl(qdlVar);
    }

    public void qdl(com.bytedance.sdk.openadsdk.qdl.lnr.ud udVar) {
        this.mo = udVar;
    }

    public void qdl(com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar) {
        this.mzz = qdlVar;
    }

    public void qdl(com.bytedance.sdk.openadsdk.qdl.mml.ud udVar) {
        this.f17278wd = udVar;
    }

    public int qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        int iIncrementAndGet = this.f17277ud.incrementAndGet();
        this.lnr.put(Integer.valueOf(iIncrementAndGet), qdlVar);
        return iIncrementAndGet;
    }

    public static int qdl(Intent intent) {
        if (intent != null) {
            return intent.getIntExtra("meta_index", -1);
        }
        return -1;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, ud udVar) {
        if (ljhVar == null || udVar == null) {
            return;
        }
        String strMml = mml(ljhVar);
        if (TextUtils.isEmpty(strMml)) {
            return;
        }
        this.jpc.put(strMml, udVar);
    }

    public void qdl(String str, boolean z10, boolean z11) {
        boolean z12 = z10 || !z11;
        boolean zYt = tvp.ud().yt();
        if (zYt) {
            com.bytedance.sdk.component.utils.aaj.qdl("BVA", "cleanListener: isFinish = " + z10 + ",isConfigChange = " + z11);
        }
        if (z12) {
            qdl(str, zYt);
        } else if (z10 || !z11) {
            qdl(str, zYt);
        }
    }

    private void qdl(String str, boolean z10) {
        qdl<?> qdlVarQdl = qdl(str);
        if (z10) {
            if (qdlVarQdl == null) {
                com.bytedance.sdk.component.utils.aaj.qdl("BVA", "cleanListener: removeCallback failed,listenerKey=".concat(String.valueOf(str)));
                return;
            }
            com.bytedance.sdk.component.utils.aaj.qdl("BVA", "cleanListener: removeCallback success,listenerKey=" + str + ",callback=" + qdlVarQdl.qdl);
        }
    }
}
