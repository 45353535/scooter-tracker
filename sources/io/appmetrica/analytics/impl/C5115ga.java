package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5115ga {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C5115ga f77247c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f77249b = new HashMap();

    public C5115ga(Context context) {
        this.f77248a = context;
    }

    public static final C5115ga a(Context context) {
        if (f77247c == null) {
            synchronized (kotlin.jvm.internal.v0.b(C5115ga.class)) {
                try {
                    if (f77247c == null) {
                        f77247c = new C5115ga(context);
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C5115ga c5115ga = f77247c;
        if (c5115ga != null) {
            return c5115ga;
        }
        Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
        return null;
    }

    public final synchronized E9 b(String str) {
        Object e92;
        try {
            HashMap map = this.f77249b;
            e92 = map.get(str);
            if (e92 == null) {
                e92 = new E9(this.f77248a, str);
                map.put(str, e92);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (E9) e92;
    }

    public final synchronized void a(String str) {
        this.f77249b.remove(str);
    }
}
