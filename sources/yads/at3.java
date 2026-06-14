package yads;

import android.view.View;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class at3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f108805a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f108806b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f108807c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f108808d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f108809e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f108810f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f108811g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashSet f108812h = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakHashMap f108813i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f108814j;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        Boolean bool;
        String str;
        ut3 ut3Var = ut3.f116776c;
        if (ut3Var != null) {
            for (dt3 dt3Var : DesugarCollections.unmodifiableCollection(ut3Var.f116778b)) {
                View view = (View) dt3Var.f110064d.get();
                if (dt3Var.f110066f && !dt3Var.f110067g) {
                    String str2 = dt3Var.f110068h;
                    if (view != null) {
                        boolean zC = ou3.c(view);
                        if (zC) {
                            this.f108812h.add(str2);
                        }
                        if (view.isAttachedToWindow()) {
                            if (view.hasWindowFocus()) {
                                this.f108813i.remove(view);
                                bool = Boolean.FALSE;
                            } else if (this.f108813i.containsKey(view)) {
                                bool = (Boolean) this.f108813i.get(view);
                            } else {
                                WeakHashMap weakHashMap = this.f108813i;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(view, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue() || zC) {
                                HashSet hashSet = new HashSet();
                                View view2 = view;
                                while (true) {
                                    if (view2 == null) {
                                        this.f108808d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String strA = ou3.a(view2);
                                    if (strA != null) {
                                        str = strA;
                                        break;
                                    } else {
                                        hashSet.add(view2);
                                        Object parent = view2.getParent();
                                        view2 = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f108809e.add(str2);
                            this.f108805a.put(view, str2);
                            for (eu3 eu3Var : dt3Var.f110063c.f112866a) {
                                View view3 = (View) eu3Var.f110463a.get();
                                if (view3 != null) {
                                    ts3 ts3Var = (ts3) this.f108806b.get(view3);
                                    if (ts3Var != null) {
                                        ts3Var.f116362b.add(dt3Var.f110068h);
                                    } else {
                                        this.f108806b.put(view3, new ts3(eu3Var, dt3Var.f110068h));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f108810f.add(str2);
                            this.f108807c.put(str2, view);
                            this.f108811g.put(str2, str);
                        }
                    } else {
                        this.f108810f.add(str2);
                        this.f108811g.put(str2, "noAdView");
                    }
                }
            }
        }
    }
}
