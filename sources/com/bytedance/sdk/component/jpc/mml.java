package com.bytedance.sdk.component.jpc;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.bjy;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    private static AtomicInteger lnr = new AtomicInteger(0);
    public static final String[] qdl = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static final String[] f16495ud = {"tt_pangle", "bd_tracker"};
    private static int mml = 0;
    private static int mzz = 0;

    public static class qdl {
        public String lnr;
        public String mml;
        public int qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public String f16496ud;

        public qdl(String str, int i10, String str2, String str3) {
            this.lnr = str;
            this.qdl = i10;
            this.mml = str2;
            this.f16496ud = str3;
        }

        public void qdl(int i10) {
            this.qdl = i10;
        }

        public String toString() {
            return "ThreadModel{times=" + this.qdl + ", name='" + this.f16496ud + "', lastStackStack='" + this.lnr + "'}";
        }

        public int qdl() {
            return this.qdl;
        }
    }

    public static void qdl() {
        try {
            ud();
        } catch (Throwable unused) {
        }
    }

    private static void ud() {
        int i10;
        String str;
        lnr lnrVarTvp = mo.tvp();
        if (lnrVarTvp == null) {
            return;
        }
        int i11 = 1;
        int iAddAndGet = lnr.addAndGet(1);
        int i12 = mo.lnr;
        if (i12 < 0 || iAddAndGet % i12 != 0 || Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        HashMap map = new HashMap();
        if (allStackTraces == null) {
            return;
        }
        boolean zQdl = bjy.qdl();
        int size = allStackTraces.size();
        if (size > mzz) {
            mzz = size;
        }
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            Map.Entry<Thread, StackTraceElement[]> next = it.next();
            i14 += i11;
            Thread key = next.getKey();
            StackTraceElement[] value = next.getValue();
            StringBuilder sb2 = new StringBuilder(IOUtils.LINE_SEPARATOR_UNIX);
            if (zQdl) {
                sb2.append("Thread Name is : " + key.getName());
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            int length = value.length;
            String str2 = null;
            int i15 = 0;
            while (i15 < length) {
                int i16 = i11;
                String string = value[i15].toString();
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                if (zQdl) {
                    sb2.append(string + IOUtils.LINE_SEPARATOR_UNIX);
                }
                if (TextUtils.isEmpty(str2)) {
                    if (qdl(string, qdl)) {
                        str = string;
                    } else {
                        str = string;
                        if (qdl(key.getName(), f16495ud)) {
                        }
                    }
                    i13++;
                    str2 = str;
                }
                i15++;
                it = it2;
                i11 = i16;
            }
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
            int i17 = i11;
            if (zQdl) {
                if (TextUtils.isEmpty(str2)) {
                    i10 = i17;
                } else {
                    String str3 = str2 + C4240b4.j.f42670c + key.getName();
                    qdl qdlVar = (qdl) map.get(str3);
                    if (qdlVar != null) {
                        qdlVar.qdl(qdlVar.qdl() + 1);
                        i10 = i17;
                    } else {
                        String string2 = sb2.toString();
                        String name = key.getName();
                        i10 = i17;
                        qdlVar = new qdl(str3, i10, string2, name);
                    }
                    map.put(str3, qdlVar);
                }
                if (!TextUtils.isEmpty(sb2.toString())) {
                    Log.e("PoolTaskStatistics", "Thread index = " + i14 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    Log.w("PoolTaskStatistics", sb2.toString());
                }
            } else {
                i10 = i17;
            }
            i11 = i10;
            it = it3;
        }
        if (i13 > mml) {
            mml = i13;
        }
        if (zQdl) {
            Log.e("PoolTaskStatistics", "SDK current threads=" + i13 + ", SDK Max threads=" + mml + ", Application threads = " + size + ", Application max threads = " + mzz);
            Iterator it4 = map.entrySet().iterator();
            while (it4.hasNext()) {
                Log.i("PoolTaskStatistics", ((qdl) ((Map.Entry) it4.next()).getValue()).toString());
            }
        }
        lnrVarTvp.qdl(new com.bytedance.sdk.component.jpc.ud.qdl(i13, mml, size, mzz));
    }

    private static boolean qdl(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
