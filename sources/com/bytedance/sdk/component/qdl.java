package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private static ArrayMap<File, qdl> exu;

    @GuardedBy("TTPropHelper.class")
    private static ArrayMap<String, File> fs;
    protected static InterfaceC0235qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static boolean f16647ud;

    @GuardedBy("this")
    private long jpc;
    private final Object lnr;
    private final Object mml;
    private volatile boolean mo;

    @GuardedBy("mLoadLock")
    private Properties mzz;
    private final File rq;
    private final File to;

    @GuardedBy("mWriteLock")
    private long tvp;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    @GuardedBy("mLoadLock")
    private int f16648wd;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0235qdl {
        ExecutorService getExecutorService();

        HandlerThread getSafeHandlerThread(String str, int i10);
    }

    private static class ud {
        final CountDownLatch lnr;

        @GuardedBy("mWritingToDiskLock")
        volatile boolean mml;
        boolean mzz;
        final long qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        final Properties f16651ud;

        void qdl(boolean z10, boolean z11) {
            this.mzz = z10;
            this.mml = z11;
            this.lnr.countDown();
        }

        private ud(long j10, Properties properties) {
            this.lnr = new CountDownLatch(1);
            this.mml = false;
            this.mzz = false;
            this.qdl = j10;
            this.f16651ud = properties;
        }
    }

    private qdl(File file) {
        Object obj = new Object();
        this.lnr = obj;
        this.mml = new Object();
        this.mzz = new Properties();
        this.mo = false;
        this.f16648wd = 0;
        this.to = file;
        this.rq = qdl(file);
        synchronized (obj) {
            this.mo = false;
        }
        InterfaceC0235qdl interfaceC0235qdl = qdl;
        if (interfaceC0235qdl == null || interfaceC0235qdl.getExecutorService() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.qdl.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    qdl.this.qdl();
                }
            }.start();
        } else {
            qdl.getExecutorService().execute(new Runnable() { // from class: com.bytedance.sdk.component.qdl.2
                @Override // java.lang.Runnable
                public void run() {
                    qdl.this.qdl();
                }
            });
        }
    }

    static /* synthetic */ long mo(qdl qdlVar) {
        long j10 = qdlVar.jpc;
        qdlVar.jpc = 1 + j10;
        return j10;
    }

    static /* synthetic */ int mzz(qdl qdlVar) {
        int i10 = qdlVar.f16648wd;
        qdlVar.f16648wd = i10 + 1;
        return i10;
    }

    static /* synthetic */ int tvp(qdl qdlVar) {
        int i10 = qdlVar.f16648wd;
        qdlVar.f16648wd = i10 - 1;
        return i10;
    }

    private void mml() {
        while (!this.mo) {
            try {
                this.lnr.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public lnr ud() {
        return new lnr();
    }

    public class lnr implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final Object f16650ud = new Object();

        @GuardedBy("mEditorLock")
        private final Map<String, Object> lnr = new HashMap();

        @GuardedBy("mEditorLock")
        private boolean mml = false;

        public lnr() {
        }

        private ud ud() {
            Properties properties;
            long j10;
            Object obj;
            boolean z10;
            synchronized (qdl.this.lnr) {
                try {
                    if (qdl.this.f16648wd > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(qdl.this.mzz);
                        qdl.this.mzz = properties2;
                    }
                    properties = qdl.this.mzz;
                    qdl.mzz(qdl.this);
                    synchronized (this.f16650ud) {
                        try {
                            boolean z11 = false;
                            if (this.mml) {
                                if (properties.isEmpty()) {
                                    z10 = false;
                                } else {
                                    properties.clear();
                                    z10 = true;
                                }
                                this.mml = false;
                                z11 = z10;
                            }
                            for (Map.Entry<String, Object> entry : this.lnr.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == this || value == null) {
                                    if (properties.containsKey(key)) {
                                        properties.remove(key);
                                        z11 = true;
                                    }
                                } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                    properties.put(key, String.valueOf(value));
                                    z11 = true;
                                }
                            }
                            this.lnr.clear();
                            if (z11) {
                                qdl.mo(qdl.this);
                            }
                            j10 = qdl.this.jpc;
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new ud(j10, properties);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            qdl.this.qdl(ud(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long jCurrentTimeMillis = qdl.f16647ud ? System.currentTimeMillis() : 0L;
            ud udVarUd = ud();
            qdl.this.qdl(udVarUd, true);
            try {
                udVarUd.lnr.await();
                if (qdl.f16647ud) {
                    Log.d("TTPropHelper", qdl.this.to.getName() + StringUtils.PROCESS_POSTFIX_DELIMITER + udVarUd.qdl + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                return udVarUd.mml;
            } catch (InterruptedException unused) {
                if (!qdl.f16647ud) {
                    return false;
                }
                Log.d("TTPropHelper", qdl.this.to.getName() + StringUtils.PROCESS_POSTFIX_DELIMITER + udVarUd.qdl + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                return false;
            } catch (Throwable th2) {
                if (qdl.f16647ud) {
                    Log.d("TTPropHelper", qdl.this.to.getName() + StringUtils.PROCESS_POSTFIX_DELIMITER + udVarUd.qdl + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                throw th2;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return qdl(str, (Set<String>) set);
        }

        public lnr qdl(String str, Set<String> set) {
            synchronized (this.f16650ud) {
                this.lnr.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public lnr putInt(String str, int i10) {
            synchronized (this.f16650ud) {
                this.lnr.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public lnr putLong(String str, long j10) {
            synchronized (this.f16650ud) {
                this.lnr.put(str, Long.valueOf(j10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public lnr putFloat(String str, float f10) {
            synchronized (this.f16650ud) {
                this.lnr.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public lnr putString(String str, String str2) {
            synchronized (this.f16650ud) {
                this.lnr.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public lnr putBoolean(String str, boolean z10) {
            synchronized (this.f16650ud) {
                this.lnr.put(str, Boolean.valueOf(z10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public lnr remove(String str) {
            synchronized (this.f16650ud) {
                this.lnr.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public lnr clear() {
            synchronized (this.f16650ud) {
                this.mml = true;
            }
            return this;
        }
    }

    public static void qdl(@NotNull InterfaceC0235qdl interfaceC0235qdl) {
        qdl = interfaceC0235qdl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126 A[Catch: all -> 0x012b, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0138 A[Catch: all -> 0x012b, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014c A[Catch: all -> 0x012b, TRY_LEAVE, TryCatch #8 {all -> 0x012b, blocks: (B:39:0x0090, B:40:0x0092, B:78:0x0122, B:80:0x0126, B:84:0x012f, B:86:0x0138, B:88:0x0140, B:90:0x014c, B:98:0x0197, B:99:0x0198, B:59:0x00f0, B:77:0x0121, B:62:0x00f5, B:63:0x00fb, B:76:0x011a, B:97:0x0196, B:96:0x018d), top: B:121:0x0090, inners: #3, #10 }] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.FileOutputStream] */
    @androidx.annotation.GuardedBy("mWriteLock")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ud(com.bytedance.sdk.component.qdl.ud r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.qdl.ud(com.bytedance.sdk.component.qdl$ud, boolean):void");
    }

    @RequiresApi(api = 19)
    public static qdl qdl(@NotNull Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (qdl.class) {
            try {
                if (fs == null) {
                    fs = new ArrayMap<>();
                }
                File file = fs.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    fs.put(str, file);
                }
                if (exu == null) {
                    exu = new ArrayMap<>();
                }
                qdl qdlVar = exu.get(file);
                if (qdlVar != null) {
                    return qdlVar;
                }
                qdl qdlVar2 = new qdl(file);
                exu.put(file, qdlVar2);
                return qdlVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static File qdl(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a1 -> B:62:0x00bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void qdl() {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.qdl.qdl():void");
    }

    public String qdl(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.lnr) {
            mml();
            property = this.mzz.getProperty(str, str2);
        }
        return property;
    }

    public int qdl(String str, int i10) {
        int i11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.lnr) {
                try {
                    try {
                        mml();
                        i11 = Integer.parseInt(this.mzz.getProperty(str, String.valueOf(i10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i11;
        }
        return i10;
    }

    public long qdl(String str, long j10) {
        long j11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.lnr) {
                try {
                    try {
                        mml();
                        j11 = Long.parseLong(this.mzz.getProperty(str, String.valueOf(j10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return j11;
        }
        return j10;
    }

    public float qdl(String str, float f10) {
        float f11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.lnr) {
                try {
                    try {
                        mml();
                        f11 = Float.parseFloat(this.mzz.getProperty(str, String.valueOf(f10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return f11;
        }
        return f10;
    }

    public boolean qdl(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.lnr) {
                try {
                    try {
                        mml();
                        z11 = Boolean.parseBoolean(this.mzz.getProperty(str, String.valueOf(z10)));
                    } catch (NumberFormatException e10) {
                        Log.e("TTPropHelper", e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z11;
        }
        return z10;
    }

    public boolean qdl(String str) {
        boolean zContainsKey;
        synchronized (this.lnr) {
            try {
                try {
                    mml();
                    zContainsKey = this.mzz.containsKey(str);
                } catch (NumberFormatException e10) {
                    Log.e("TTPropHelper", e10.getMessage());
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zContainsKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final ud udVar, final boolean z10) {
        boolean z11;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.qdl.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (qdl.this.mml) {
                    try {
                        qdl.this.ud(udVar, z10);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (qdl.this.lnr) {
                    qdl.tvp(qdl.this);
                }
            }
        };
        if (z10) {
            synchronized (this.lnr) {
                z11 = this.f16648wd == 1;
            }
            if (z11) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.ud.qdl(runnable, true ^ z10);
    }
}
