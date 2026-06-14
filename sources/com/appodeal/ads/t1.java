package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes6.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l2 f14851a = new l2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static NativeMediaViewContentType f14852b = NativeMediaViewContentType.Auto;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TreeSet f14853c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f14854d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f14855e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f14856f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static u f14857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static n f14858h;

    public static n a() {
        n nVar;
        n nVar2 = f14858h;
        if (nVar2 != null) {
            return nVar2;
        }
        synchronized (l0.class) {
            try {
                nVar = f14858h;
                if (nVar == null) {
                    nVar = new n(d());
                    f14858h = nVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    public static ArrayList b(int i10) {
        ArrayList arrayList;
        synchronized (f14853c) {
            try {
                int iMin = Math.min(i10, e());
                arrayList = new ArrayList(iMin);
                for (int i11 = 0; i11 < iMin; i11++) {
                    com.appodeal.ads.nativead.e eVar = (com.appodeal.ads.nativead.e) f14853c.pollFirst();
                    if (eVar != null) {
                        arrayList.add(eVar);
                    }
                }
                Locale locale = Locale.ENGLISH;
                Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_GET_ADS, "available count of Native Ads: " + iMin);
                if (e() == 0) {
                    f14855e = false;
                    f14856f = false;
                }
                c(com.appodeal.ads.context.o.f13205b.f13206a.f13214b, a().f13572l);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public static void c(Context context, boolean z10) {
        if (z10 && f14858h.f13570j) {
            if (f14854d - e() <= 0) {
                if (f14855e) {
                    return;
                }
                f14855e = true;
                f14851a.j();
                return;
            }
            r3 r3Var = (r3) f14858h.A();
            if ((r3Var == null || !r3Var.w()) && context != null) {
                f14858h.t(context);
            }
        }
    }

    public static u d() {
        if (f14857g == null) {
            f14857g = new u();
        }
        return f14857g;
    }

    public static int e() {
        int size;
        TreeSet treeSet = f14853c;
        synchronized (treeSet) {
            size = treeSet.size();
        }
        return size;
    }
}
