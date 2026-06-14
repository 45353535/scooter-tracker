package com.appodeal.ads.utils;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f15047a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Handler f15048b = new Handler(Looper.getMainLooper());

    public static void a(View view) {
        HashMap map = f15047a;
        synchronized (map) {
            try {
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((o) entry.getValue()).f15034b == view) {
                        ((o) entry.getValue()).e();
                        f15047a.remove(entry.getKey());
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(Object obj) {
        HashMap map = f15047a;
        synchronized (map) {
            try {
                o oVar = (o) map.get(obj);
                if (oVar != null) {
                    oVar.e();
                    map.remove(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(Object obj, View view, long j10, p pVar) {
        HashMap map = f15047a;
        synchronized (map) {
            b(obj);
            o oVar = new o(view, j10, pVar);
            map.put(obj, oVar);
            oVar.f();
        }
    }
}
