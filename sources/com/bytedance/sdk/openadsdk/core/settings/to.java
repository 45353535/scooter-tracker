package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.jyq;
import com.bytedance.sdk.openadsdk.core.settings.mzz;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.exu;
import com.bytedance.sdk.openadsdk.utils.fco;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class to implements mzz {
    private boolean rq;
    private final qdl to;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final String f17478wd;
    private final ConcurrentHashMap<String, Object> lnr = new ConcurrentHashMap<>();
    private final Object mml = new Object();
    private final Object mzz = new Object();
    private final CountDownLatch mo = new CountDownLatch(1);
    private Properties jpc = new Properties();
    private volatile boolean tvp = false;

    public interface qdl {
        void qdl();

        void ud();
    }

    public to(String str, qdl qdlVar) {
        this.f17478wd = str;
        this.to = qdlVar;
        fco.qdl(new com.bytedance.sdk.component.jpc.jpc("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.to.1
            @Override // java.lang.Runnable
            public void run() {
                to.this.qdl(false);
            }
        });
    }

    @Nullable
    private File mo() {
        Context contextQdl = yt.qdl();
        if (contextQdl != null) {
            return new File(contextQdl.getFilesDir(), this.f17478wd);
        }
        return null;
    }

    private void mzz() {
        if (this.rq && yt.qdl() != null) {
            qdl(true);
        }
        if (this.tvp) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.mo.await(fco.mo() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            aaj.qdl("SdkSettings.Prop", "awaitLoadedLocked: ", e10);
        }
    }

    public void lnr() {
        File fileMo = mo();
        if (fileMo == null || !fileMo.exists()) {
            return;
        }
        fileMo.delete();
    }

    protected void mml() {
        qdl qdlVar = this.to;
        if (qdlVar != null) {
            qdlVar.ud();
        }
    }

    public boolean ud() {
        return this.tvp;
    }

    public String qdl(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        mzz();
        return this.jpc.getProperty(str, str2);
    }

    public int qdl(String str, int i10) {
        if (str != null && !str.isEmpty()) {
            mzz();
            try {
                return Integer.parseInt(this.jpc.getProperty(str, String.valueOf(i10)));
            } catch (NumberFormatException e10) {
                aaj.qdl("SdkSettings.Prop", "", e10);
            }
        }
        return i10;
    }

    public long qdl(String str, long j10) {
        if (str != null && !str.isEmpty()) {
            mzz();
            try {
                return Long.parseLong(this.jpc.getProperty(str, String.valueOf(j10)));
            } catch (NumberFormatException e10) {
                aaj.qdl("SdkSettings.Prop", "", e10);
            }
        }
        return j10;
    }

    public float qdl(String str, float f10) {
        if (str != null && !str.isEmpty()) {
            mzz();
            try {
                return Float.parseFloat(this.jpc.getProperty(str, String.valueOf(f10)));
            } catch (NumberFormatException e10) {
                aaj.qdl("SdkSettings.Prop", "", e10);
            }
        }
        return f10;
    }

    public class ud implements mzz.qdl {

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final Map<String, Object> f17479ud = new HashMap();
        private final Object lnr = new Object();

        public ud() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.qdl
        public void qdl() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.lnr) {
                try {
                    properties.putAll(to.this.jpc);
                    boolean z10 = false;
                    for (Map.Entry<String, Object> entry : this.f17479ud.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != this && value != null) {
                            if (properties.containsKey(key) && (obj = properties.get(key)) != null && obj.equals(value)) {
                            }
                            properties.put(key, String.valueOf(value));
                            z10 = true;
                        } else if (properties.containsKey(key)) {
                            properties.remove(key);
                            z10 = true;
                        }
                    }
                    this.f17479ud.clear();
                    if (z10) {
                        to.this.qdl(properties);
                        to.this.jpc = properties;
                        to.this.lnr.clear();
                        to.this.rq = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.qdl
        public mzz.qdl qdl(String str, String str2) {
            synchronized (this.lnr) {
                this.f17479ud.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.qdl
        public mzz.qdl qdl(String str, int i10) {
            synchronized (this.lnr) {
                this.f17479ud.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.qdl
        public mzz.qdl qdl(String str, long j10) {
            synchronized (this.lnr) {
                this.f17479ud.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.qdl
        public mzz.qdl qdl(String str) {
            synchronized (this.lnr) {
                this.f17479ud.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.qdl
        public mzz.qdl qdl(String str, float f10) {
            synchronized (this.lnr) {
                this.f17479ud.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.qdl
        public mzz.qdl qdl(String str, boolean z10) {
            synchronized (this.lnr) {
                this.f17479ud.put(str, Boolean.valueOf(z10));
            }
            return this;
        }
    }

    public boolean qdl(String str, boolean z10) {
        if (str != null && !str.isEmpty()) {
            mzz();
            try {
                return Boolean.parseBoolean(this.jpc.getProperty(str, String.valueOf(z10)));
            } catch (Exception e10) {
                aaj.qdl("SdkSettings.Prop", "", e10);
            }
        }
        return z10;
    }

    public void qdl(boolean z10) {
        qdl qdlVar;
        Object obj;
        synchronized (this.mml) {
            try {
                if (!this.tvp || z10) {
                    if (yt.qdl() != null) {
                        boolean z11 = false;
                        this.rq = false;
                        File fileMo = mo();
                        if (fileMo != null && fileMo.exists()) {
                            Properties properties = new Properties();
                            FileInputStream fileInputStream = null;
                            try {
                                try {
                                    FileInputStream fileInputStream2 = new FileInputStream(fileMo);
                                    try {
                                        properties.load(fileInputStream2);
                                        properties.size();
                                        new StringBuilder("items from ").append(fileMo.getAbsolutePath());
                                        if (!properties.isEmpty()) {
                                            this.jpc = properties;
                                            this.lnr.clear();
                                        }
                                        exu.qdl(fileInputStream2);
                                        obj = this.mml;
                                    } catch (OutOfMemoryError unused) {
                                        fileInputStream = fileInputStream2;
                                        try {
                                            com.bytedance.sdk.component.utils.wd.lnr(fileMo);
                                        } catch (Throwable th2) {
                                            aaj.qdl("SdkSettings.Prop", "delete: ", th2);
                                        }
                                        if (fileInputStream != null) {
                                            exu.qdl(fileInputStream);
                                        }
                                        obj = this.mml;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileInputStream = fileInputStream2;
                                        aaj.qdl("SdkSettings.Prop", "reload: ", th);
                                        if (fileInputStream != null) {
                                            exu.qdl(fileInputStream);
                                        }
                                        obj = this.mml;
                                    }
                                } catch (OutOfMemoryError unused2) {
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                obj.notifyAll();
                            } catch (Throwable th5) {
                                if (fileInputStream != null) {
                                    exu.qdl(fileInputStream);
                                }
                                this.mml.notifyAll();
                                throw th5;
                            }
                        } else if (jyq.qdl(yt.qdl()) && "tt_sdk_settings.prop".equals(this.f17478wd)) {
                            try {
                                SharedPreferences sharedPreferences = yt.qdl().getSharedPreferences("tt_sdk_settings", 0);
                                if (!sharedPreferences.getAll().isEmpty()) {
                                    mzz.qdl qdlVarQdl = qdl();
                                    for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                                        String key = entry.getKey();
                                        Object value = entry.getValue();
                                        if (key != null && !key.isEmpty() && value != null) {
                                            qdlVarQdl.qdl(key, value.toString());
                                            z11 = true;
                                        }
                                    }
                                    if (z11) {
                                        qdlVarQdl.qdl();
                                    }
                                    sharedPreferences.edit().clear().commit();
                                }
                            } catch (Exception unused3) {
                            }
                        }
                    } else {
                        this.rq = true;
                    }
                    if (!this.tvp && (qdlVar = this.to) != null) {
                        qdlVar.qdl();
                    }
                    this.tvp = true;
                    this.mo.countDown();
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    public mzz.qdl qdl() {
        return new ud();
    }

    public <T> T qdl(String str, T t10, mzz.ud<T> udVar) {
        T tUd;
        if (str != null && !str.isEmpty()) {
            T t11 = (T) this.lnr.get(str);
            if (t11 != null) {
                return t11;
            }
            mzz();
            String property = this.jpc.getProperty(str, null);
            if (property != null && udVar != null && (tUd = udVar.ud(property)) != null) {
                this.lnr.put(str, tUd);
                return tUd;
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(Properties properties) {
        synchronized (this.mzz) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(mo());
                    try {
                        properties.store(fileOutputStream2, (String) null);
                        exu.qdl(fileOutputStream2);
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        aaj.qdl("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            exu.qdl(fileOutputStream);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            exu.qdl(fileOutputStream);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        rq.ud();
    }
}
