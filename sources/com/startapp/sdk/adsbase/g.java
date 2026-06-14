package com.startapp.sdk.adsbase;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.i6;
import com.startapp.sdk.internal.q0;
import com.startapp.sdk.internal.uf;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.vg;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.wg;
import com.startapp.sdk.internal.x0;
import com.startapp.sdk.internal.xg;
import com.startapp.sdk.internal.yg;
import com.startapp.simple.bloomfilter.api.BloomFilterCreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List f64051a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List f64052b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f64053c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Pair f64054d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Pair f64055e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f64056f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f64057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static SimpleTokenUtils$TokenType f64058h = SimpleTokenUtils$TokenType.UNDEFINED;

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair a() {
        return f64054d != null ? new Pair(((SimpleTokenUtils$TokenType) f64054d.first).toString(), (String) f64054d.second) : new Pair(SimpleTokenUtils$TokenType.T1.toString(), "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair b() {
        return f64055e != null ? new Pair(((SimpleTokenUtils$TokenType) f64055e.first).toString(), (String) f64055e.second) : new Pair(SimpleTokenUtils$TokenType.T2.toString(), "");
    }

    public static void c(Context context) {
        Context contextA = x0.a(context);
        if (contextA != null) {
            context = contextA;
        }
        f(context);
        f64056f = true;
        f64057g = false;
        f64058h = SimpleTokenUtils$TokenType.UNDEFINED;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        context.registerReceiver(new vg(), intentFilter);
        MetaData.E().a(new wg(context));
    }

    public static void d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Set setD = MetaData.E().D();
        Set setP = MetaData.E().P();
        f64051a = new CopyOnWriteArrayList();
        f64052b = new CopyOnWriteArrayList();
        try {
            int i10 = q0.f65128a;
            List<PackageInfo> list = (List) packageManager.getClass().getMethod("getInstalledPackages", Integer.TYPE).invoke(packageManager, 8192);
            f64053c = System.currentTimeMillis();
            PackageInfo packageInfo = null;
            for (PackageInfo packageInfo2 : list) {
                int i11 = packageInfo2.applicationInfo.flags;
                if ((i11 & 1) == 0 && (i11 & 128) == 0) {
                    long j10 = packageInfo2.firstInstallTime;
                    if (j10 < f64053c && j10 >= 1291593600000L) {
                        f64053c = j10;
                    }
                    f64051a.add(packageInfo2);
                    try {
                        String strB = vi.b(context);
                        if (setD != null && setD.contains(strB)) {
                            f64052b.add(packageInfo2);
                        }
                    } catch (Throwable th2) {
                        g9.a(th2);
                    }
                } else if (setP.contains(packageInfo2.packageName)) {
                    f64051a.add(packageInfo2);
                } else if (packageInfo2.packageName.equals(i6.f64678a)) {
                    packageInfo = packageInfo2;
                }
            }
            List listSubList = f64051a;
            if (listSubList.size() > 100) {
                ArrayList arrayList = new ArrayList(listSubList);
                Collections.sort(arrayList, new yg());
                listSubList = arrayList.subList(0, 100);
            }
            f64051a = listSubList;
            List listSubList2 = f64052b;
            if (listSubList2.size() > 100) {
                ArrayList arrayList2 = new ArrayList(listSubList2);
                Collections.sort(arrayList2, new yg());
                listSubList2 = arrayList2.subList(0, 100);
            }
            f64052b = listSubList2;
            if (packageInfo != null) {
                f64051a.add(0, packageInfo);
            }
        } catch (Throwable th3) {
            if (vi.a(th3, RemoteException.class)) {
                return;
            }
            g9.a(th3);
        }
    }

    public static void e(Context context) {
        boolean zA = MetaData.E().W().a(context);
        synchronized (g.class) {
            if ((f64054d == null || f64055e == null) && zA) {
                try {
                    d(context);
                    SimpleTokenUtils$TokenType simpleTokenUtils$TokenType = SimpleTokenUtils$TokenType.T1;
                    List list = f64051a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PackageInfo) it.next()).packageName);
                    }
                    f64054d = new Pair(simpleTokenUtils$TokenType, new BloomFilterCreator().fromKeys(arrayList));
                    SimpleTokenUtils$TokenType simpleTokenUtils$TokenType2 = SimpleTokenUtils$TokenType.T2;
                    List list2 = f64052b;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PackageInfo) it2.next()).packageName);
                    }
                    f64055e = new Pair(simpleTokenUtils$TokenType2, new BloomFilterCreator().fromKeys(arrayList2));
                } catch (Throwable th2) {
                    g9.a(th2);
                }
            }
        }
    }

    public static void f(Context context) {
        Context contextA = x0.a(context);
        if (contextA != null) {
            context = contextA;
        }
        try {
            if ((f64054d == null || f64055e == null) && MetaData.E().W().a(context)) {
                ((Executor) com.startapp.sdk.components.a.a(context).D.a()).execute(new xg(context));
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair a(Context context) {
        if (f64054d == null) {
            e(context);
        }
        uf ufVarEdit = ((vf) com.startapp.sdk.components.a.a(context).G.a()).edit();
        String str = (String) f64054d.second;
        ufVarEdit.a("shared_prefs_simple_token", str);
        ufVarEdit.f65346a.putString("shared_prefs_simple_token", str);
        ufVarEdit.apply();
        f64056f = false;
        f64058h = SimpleTokenUtils$TokenType.UNDEFINED;
        return new Pair(SimpleTokenUtils$TokenType.T1, (String) f64054d.second);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair b(Context context) {
        if (f64055e == null) {
            e(context);
        }
        uf ufVarEdit = ((vf) com.startapp.sdk.components.a.a(context).G.a()).edit();
        String str = (String) f64055e.second;
        ufVarEdit.a("shared_prefs_simple_token2", str);
        ufVarEdit.f65346a.putString("shared_prefs_simple_token2", str);
        ufVarEdit.apply();
        f64056f = false;
        f64058h = SimpleTokenUtils$TokenType.UNDEFINED;
        return new Pair(SimpleTokenUtils$TokenType.T2, (String) f64055e.second);
    }
}
