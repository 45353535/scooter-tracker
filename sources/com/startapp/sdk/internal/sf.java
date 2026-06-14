package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class sf {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f65258k = {"getSupportFragmentManager", "getFragmentManager"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f65260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f65261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n4 f65262d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f65266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f65267i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f65264f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f65265g = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lf f65268j = new lf(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nf f65263e = new nf(this);

    public sf(Context context, lb lbVar, n4 n4Var) {
        this.f65259a = context;
        this.f65260b = lbVar;
        this.f65261c = new lb(new mf(lbVar));
        this.f65262d = n4Var;
    }

    public final boolean a() {
        Boolean boolValueOf = this.f65266h;
        if (boolValueOf == null) {
            this.f65262d.getClass();
            RcdMetadata rcdMetadataR = MetaData.E().R();
            if (rcdMetadataR == null || !rcdMetadataR.c()) {
                rcdMetadataR = null;
            }
            boolValueOf = Boolean.valueOf(rcdMetadataR == null || Math.random() >= rcdMetadataR.a());
            this.f65266h = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public final void b(Activity activity) {
        this.f65262d.getClass();
        RcdMetadata rcdMetadataR = MetaData.E().R();
        if (rcdMetadataR == null || !rcdMetadataR.c()) {
            rcdMetadataR = null;
        }
        RcdTargets rcdTargetsB = rcdMetadataR != null ? rcdMetadataR.b() : null;
        if (rcdTargetsB == null) {
            return;
        }
        try {
            Collection collectionA = rcdTargetsB.a(8);
            String name = activity.getClass().getName();
            if (collectionA.contains(name)) {
                a(name, 8);
                return;
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
        try {
            a(rcdTargetsB, activity, 16, 32);
        } catch (Throwable th3) {
            g9.a(th3);
        }
        String[] strArr = f65258k;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                Object objInvoke = activity.getClass().getMethod(strArr[i10], null).invoke(activity, null);
                if (objInvoke != null) {
                    Object objInvoke2 = objInvoke.getClass().getMethod("getFragments", null).invoke(objInvoke, null);
                    if (objInvoke2 instanceof Collection) {
                        for (Object obj : (Collection) objInvoke2) {
                            if (obj != null) {
                                a(rcdTargetsB, obj, 64, 128);
                            }
                        }
                    }
                }
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th4) {
                g9.a(th4);
            }
        }
        ((Executor) this.f65261c.a()).execute(this.f65268j);
    }

    public final void c() {
        HashMap map;
        this.f65262d.getClass();
        RcdMetadata rcdMetadataR = MetaData.E().R();
        if (rcdMetadataR == null || !rcdMetadataR.c()) {
            rcdMetadataR = null;
        }
        RcdTargets rcdTargetsB = rcdMetadataR != null ? rcdMetadataR.b() : null;
        if (rcdTargetsB == null) {
            return;
        }
        synchronized (this.f65264f) {
            map = new HashMap(this.f65264f);
        }
        String strA = rcdTargetsB.a(map);
        if (strA.equals(this.f65267i)) {
            return;
        }
        this.f65267i = strA;
        g9 g9Var = new g9(h9.f64609d);
        g9Var.f64553d = "RCD.results";
        g9Var.f64554e = strA;
        g9Var.a();
    }

    public final void a(Activity activity) {
        Window window;
        View decorView;
        if (a()) {
            return;
        }
        String name = activity.getClass().getName();
        WeakHashMap weakHashMap = vi.f65408a;
        if (name.startsWith("com.startapp.")) {
            return;
        }
        List arrayList = (List) this.f65265g.get(name);
        if (arrayList == null) {
            arrayList = new ArrayList(2);
            this.f65265g.put(name, arrayList);
            ((Executor) this.f65260b.a()).execute(new of(this, activity));
        }
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                it.remove();
            } else if (weakReference.get() == activity) {
                z10 = true;
            }
        }
        if (z10 || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        arrayList.add(new WeakReference(activity));
        ((Executor) this.f65260b.a()).execute(new pf(this, activity, decorView));
    }

    public final void b() {
        this.f65262d.getClass();
        RcdMetadata rcdMetadataR = MetaData.E().R();
        if (rcdMetadataR == null || !rcdMetadataR.c()) {
            rcdMetadataR = null;
        }
        RcdTargets rcdTargetsB = rcdMetadataR != null ? rcdMetadataR.b() : null;
        if (rcdTargetsB == null) {
            return;
        }
        for (String str : rcdTargetsB.a(1)) {
            try {
                Class.forName(str, false, sf.class.getClassLoader());
                a(str, 1);
            } catch (ClassNotFoundException unused) {
            } catch (Throwable th2) {
                g9.a(th2);
            }
        }
        try {
            String packageName = this.f65259a.getPackageName();
            PackageInfo packageInfo = this.f65259a.getPackageManager().getPackageInfo(packageName, 15);
            if (packageInfo != null) {
                a(rcdTargetsB, packageName, packageInfo.activities);
                a(rcdTargetsB, packageName, packageInfo.receivers);
                a(rcdTargetsB, packageName, packageInfo.services);
                a(rcdTargetsB, packageName, packageInfo.providers);
            }
        } catch (Throwable th3) {
            g9.a(th3);
        }
        ((Executor) this.f65261c.a()).execute(this.f65268j);
    }

    public final void a(RcdTargets rcdTargets, String str, ComponentInfo[] componentInfoArr) {
        if (componentInfoArr == null) {
            return;
        }
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (componentInfo != null) {
                String str2 = componentInfo.name;
                if (str2.startsWith(".")) {
                    a(rcdTargets, str + str2, 2);
                } else {
                    a(rcdTargets, str2, 2);
                }
            }
        }
    }

    public final void a(int i10) {
        try {
            if (a()) {
                return;
            }
            ((Executor) this.f65260b.a()).execute(new rf(this, Thread.currentThread().getStackTrace(), i10));
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }

    public final void a(RcdTargets rcdTargets, View view) {
        if (view == null) {
            return;
        }
        a(rcdTargets, view.getClass().getName(), 4);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                a(rcdTargets, viewGroup.getChildAt(i10));
            }
        }
    }

    public final void a(RcdTargets rcdTargets, Object obj, int i10, int i11) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            String name = superclass.getName();
            if (name.startsWith("android") || name.startsWith("java.")) {
                return;
            }
            for (Field field : superclass.getDeclaredFields()) {
                if (i10 != 0) {
                    a(rcdTargets, field.getType().getName(), i10);
                }
                try {
                    field.setAccessible(true);
                    if (field.get(obj) != null && i11 != 0) {
                        a(rcdTargets, field.getType().getName(), i11);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void a(String str, int i10) {
        synchronized (this.f65264f) {
            try {
                Integer num = (Integer) this.f65264f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f65264f.put(str, Integer.valueOf(i10 | num.intValue()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(RcdTargets rcdTargets, String str, int i10) {
        if (str.startsWith("android") || str.startsWith("java.")) {
            return;
        }
        WeakHashMap weakHashMap = vi.f65408a;
        if (str.startsWith("com.startapp.")) {
            return;
        }
        for (String str2 : rcdTargets.a(i10)) {
            if (str2.length() > 0 && str.startsWith(str2)) {
                if (str2.charAt(str2.length() - 1) == '.') {
                    a(str2, i10);
                } else if (str.length() > str2.length()) {
                    if (str.charAt(str2.length()) == '$') {
                        a(str2, i10);
                    }
                } else {
                    a(str2, i10);
                    return;
                }
            }
        }
    }
}
