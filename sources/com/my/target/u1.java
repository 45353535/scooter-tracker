package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class u1 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f60885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t1 f60886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f60887c;

    public t1 a() {
        return this.f60886b;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x009e A[EXC_TOP_SPLITTER, PHI: r0 r7
  0x009e: PHI (r0v16 boolean) = (r0v14 boolean), (r0v13 boolean) binds: [B:42:0x009c, B:39:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009e: PHI (r7v10 java.lang.Process) = (r7v9 java.lang.Process), (r7v11 java.lang.Process) binds: [B:42:0x009c, B:39:0x0098] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b() {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.u1.b():boolean");
    }

    public final void c(Map map, Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return;
        }
        map.put("rs", audioManager.getRingerMode() == 2 ? "1" : "0");
    }

    public String a(Context context) {
        if (f0.a()) {
            gb.a("DeviceParamsDataProvider: You must not call getInstanceId method from main thread");
            return "";
        }
        if (this.f60885a == null) {
            synchronized (this) {
                try {
                    if (this.f60885a == null) {
                        String strG = v8.a(context).g();
                        if (TextUtils.isEmpty(strG)) {
                            strG = UUID.randomUUID().toString();
                            v8.a(context).g(strG);
                        }
                        this.f60885a = strG;
                    }
                } finally {
                }
            }
        }
        String str = this.f60885a;
        return str == null ? "" : str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:11|12|(3:121|13|14)|(2:119|15)|16|22|(4:115|23|24|(10:113|25|26|134|27|28|138|(1:30)(1:32)|31|34))|(33:41|123|42|43|117|(1:45)(1:47)|46|49|52|(5:54|(1:56)(1:57)|58|(2:60|(1:62))(1:64)|65)(1:66)|63|67|(1:72)(1:71)|73|(1:75)(1:76)|77|(1:79)(1:80)|81|(7:125|83|(1:85)(1:86)|87|140|88|(1:90))|128|91|130|92|132|93|136|94|95|(2:98|96)|142|99|100|101)(1:50)|51|49|52|(0)(0)|63|67|(2:69|72)(0)|73|(0)(0)|77|(0)(0)|81|(0)|128|91|130|92|132|93|136|94|95|(1:96)|142|99|100|101) */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118 A[Catch: all -> 0x0012, TryCatch #7 {, blocks: (B:4:0x0005, B:6:0x0009, B:11:0x0015, B:22:0x00a7, B:52:0x010e, B:54:0x0118, B:56:0x0127, B:58:0x012e, B:60:0x0138, B:62:0x0143, B:67:0x0166, B:69:0x0170, B:73:0x0177, B:81:0x0197, B:95:0x01dc, B:96:0x0276, B:98:0x027c, B:99:0x02ab, B:21:0x008e), top: B:127:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027c A[Catch: all -> 0x0012, LOOP:0: B:96:0x0276->B:98:0x027c, LOOP_END, TryCatch #7 {, blocks: (B:4:0x0005, B:6:0x0009, B:11:0x0015, B:22:0x00a7, B:52:0x010e, B:54:0x0118, B:56:0x0127, B:58:0x012e, B:60:0x0138, B:62:0x0143, B:67:0x0166, B:69:0x0170, B:73:0x0177, B:81:0x0197, B:95:0x01dc, B:96:0x0276, B:98:0x027c, B:99:0x02ab, B:21:0x008e), top: B:127:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.Map a(com.my.target.common.MyTargetConfig r28, android.content.Context r29) {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.u1.a(com.my.target.common.MyTargetConfig, android.content.Context):java.util.Map");
    }

    public final void b(Map map, Context context) {
        List<InputMethodInfo> enabledInputMethodList;
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null || (enabledInputMethodList = inputMethodManager.getEnabledInputMethodList()) == null) {
            return;
        }
        Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
            if (enabledInputMethodSubtypeList != null) {
                for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                        String locale = inputMethodSubtype.getLocale();
                        if (!TextUtils.isEmpty(locale)) {
                            if (hashSet == null) {
                                hashSet = new HashSet();
                            }
                            hashSet.add(locale.split("_", 2)[0]);
                        }
                    }
                }
            }
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        String strJoin = TextUtils.join(StringUtils.COMMA, hashSet);
        if (TextUtils.isEmpty(strJoin)) {
            return;
        }
        map.put("kb_lang", strJoin);
    }

    public final /* synthetic */ void a(Map map) {
        boolean zB = b();
        synchronized (this) {
            try {
                map.put("rooted", zB ? "1" : "0");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Map map, Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return;
        }
        long totalSpace = filesDir.getTotalSpace();
        long freeSpace = filesDir.getFreeSpace();
        map.put("mm_tt", String.valueOf(totalSpace));
        map.put("mm_av", String.valueOf(freeSpace));
    }
}
