package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5394rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5311o2 f78140a = new C5311o2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5389r6 f78141b = new C5389r6();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bn f78142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f78144e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC4961ab interfaceC4961ab) {
        if (this.f78144e) {
            return;
        }
        CollectionsKt.addAll(this.f78141b.f78122a, new Ma[]{this.f78140a.a(context, appMetricaConfig, interfaceC4961ab)});
        this.f78144e = true;
    }

    public final synchronized void b() {
        if (this.f78143d) {
            return;
        }
        C5389r6 c5389r6 = this.f78141b;
        ArrayList arrayList = C5186j4.l().f77473i.f78010a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c5389r6.f78122a.addAll(arrayList2);
        this.f78143d = true;
    }

    public final synchronized void c() {
        try {
            if (this.f78142c != null) {
                return;
            }
            X1 x12 = new X1(this.f78141b);
            this.f78142c = new Bn(x12);
            An an = new An();
            an.f75559a.add(x12);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                an.f75559a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(an);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a() {
        this.f78141b.f78122a.clear();
        this.f78143d = false;
        this.f78144e = false;
    }
}
