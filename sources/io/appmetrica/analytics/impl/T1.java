package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class T1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5518wa f76477a = new C5518wa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f76478b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f76479c = new LinkedHashMap();

    public final void a() {
    }

    public final void b() {
    }

    public final void c(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f76477a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f76478b.entrySet()) {
                S1 s12 = (S1) entry.getKey();
                if (((R1) entry.getValue()).a(intent)) {
                    s12.a(intent);
                }
            }
        }
    }

    public final void d(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                C5518wa c5518wa = this.f76477a;
                Integer numValueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) c5518wa.f78497a.get(action);
                if (collection != null && collection.remove(numValueOf)) {
                    if (collection.isEmpty() && c5518wa.f78498b) {
                        c5518wa.f78497a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f76479c.entrySet()) {
                S1 s12 = (S1) entry.getKey();
                if (((R1) entry.getValue()).a(intent)) {
                    s12.a(intent);
                }
            }
        }
    }

    public final void a(@NotNull Intent intent, int i10) {
    }

    public final void b(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f76477a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f76478b.entrySet()) {
                S1 s12 = (S1) entry.getKey();
                if (((R1) entry.getValue()).a(intent)) {
                    s12.a(intent);
                }
            }
        }
    }

    public final void a(@NotNull Intent intent, int i10, int i11) {
    }

    public final void a(@NotNull Configuration configuration) {
    }

    public final void a(@NotNull S1 s12) {
        this.f76479c.put(s12, new R1() { // from class: io.appmetrica.analytics.impl.rp
            @Override // io.appmetrica.analytics.impl.R1
            public final boolean a(Intent intent) {
                return T1.a(this.f78173a, intent);
            }
        });
    }

    public static final boolean a(T1 t12, Intent intent) {
        t12.getClass();
        if (!Intrinsics.areEqual("io.appmetrica.analytics.IAppMetricaService", intent.getAction())) {
            return false;
        }
        Collection collection = (Collection) t12.f76477a.f78497a.get("io.appmetrica.analytics.IAppMetricaService");
        return collection == null || collection.size() == 0;
    }

    public final void c(@NotNull S1 s12) {
        this.f76478b.put(s12, new R1() { // from class: io.appmetrica.analytics.impl.qp
            @Override // io.appmetrica.analytics.impl.R1
            public final boolean a(Intent intent) {
                return T1.c(this.f78098a, intent);
            }
        });
    }

    public static final boolean c(T1 t12, Intent intent) {
        t12.getClass();
        return Intrinsics.areEqual("io.appmetrica.analytics.IAppMetricaService", intent.getAction());
    }

    public final void b(@NotNull S1 s12) {
        this.f76478b.put(s12, new R1() { // from class: io.appmetrica.analytics.impl.pp
            @Override // io.appmetrica.analytics.impl.R1
            public final boolean a(Intent intent) {
                return T1.b(this.f78011a, intent);
            }
        });
    }

    public static final boolean b(T1 t12, Intent intent) {
        Collection collection;
        t12.getClass();
        return Intrinsics.areEqual("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && (collection = (Collection) t12.f76477a.f78497a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data == null || !Intrinsics.areEqual(data.getPath(), "/client")) {
            return -1;
        }
        try {
            String queryParameter = data.getQueryParameter("pid");
            Intrinsics.checkNotNull(queryParameter);
            return Integer.parseInt(queryParameter);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
