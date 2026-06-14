package com.appodeal.ads.segments;

import android.content.Context;
import com.appodeal.ads.db;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f14510a = lf.i.a(new Function0() { // from class: com.appodeal.ads.segments.n0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return s0.f();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f14511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f14512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArrayList f14513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static j0 f14514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static j0 f14515f;

    static {
        j0 j0Var = new j0(new JSONObject());
        f14511b = j0Var;
        f14512c = new LinkedHashSet();
        f14513d = new CopyOnWriteArrayList();
        f14514e = j0Var;
        g0.f14473e.add(new s() { // from class: com.appodeal.ads.segments.o0
            @Override // com.appodeal.ads.segments.s
            public final void a() {
                s0.a();
            }
        });
        t0.a(g());
    }

    public static final void a() {
        b(((ContextProvider) f14510a.getValue()).getApplicationContextOrNull());
    }

    public static /* synthetic */ void b(Context context) {
        c(context, new Function0() { // from class: com.appodeal.ads.segments.p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s0.h();
            }
        });
    }

    public static final void c(Context context, Function0 onUpdated) {
        Object next;
        Intrinsics.checkNotNullParameter(onUpdated, "onUpdated");
        if (f14515f != null) {
            return;
        }
        Iterator it = f14512c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            j0 j0Var = (j0) next;
            if (g0.c(context, j0Var.f14485c, j0Var.f14486d)) {
                break;
            }
        }
        j0 j0Var2 = (j0) next;
        if (j0Var2 == null) {
            j0Var2 = f14511b;
        }
        if (j0Var2.f14483a != f14514e.f14483a) {
            j0Var2.a();
            f14514e = j0Var2;
            t0.a(g());
            onUpdated.invoke();
        }
    }

    public static final void d(Context context, JSONArray jSONArray) {
        if (context == null || jSONArray == null) {
            return;
        }
        f14512c.clear();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                f14512c.add(new j0(jSONObjectOptJSONObject));
            }
        }
        c(context, new Function0() { // from class: com.appodeal.ads.segments.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s0.i();
            }
        });
    }

    public static void e(Context context, JSONObject jSONObject) {
        Function0 onUpdated = new Function0() { // from class: com.appodeal.ads.segments.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s0.j();
            }
        };
        Intrinsics.checkNotNullParameter(onUpdated, "onUpdated");
        if (context == null || jSONObject == null) {
            return;
        }
        f14512c.clear();
        j0 j0Var = new j0(jSONObject);
        j0 j0Var2 = f14515f;
        if (j0Var2 == null || j0Var.f14483a != j0Var2.f14483a) {
            j0Var.a();
            f14515f = j0Var;
            t0.a(g());
            onUpdated.invoke();
        }
    }

    public static final com.appodeal.ads.context.o f() {
        return com.appodeal.ads.context.o.f13205b;
    }

    public static final j0 g() {
        j0 j0Var = f14515f;
        return j0Var == null ? f14514e : j0Var;
    }

    public static final Unit h() {
        db.g();
        Iterator it = f14513d.iterator();
        while (it.hasNext()) {
            ((m0) it.next()).a();
        }
        return Unit.f93236a;
    }

    public static final Unit i() {
        return Unit.f93236a;
    }

    public static final Unit j() {
        db.g();
        Iterator it = f14513d.iterator();
        while (it.hasNext()) {
            ((m0) it.next()).a();
        }
        return Unit.f93236a;
    }
}
