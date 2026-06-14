package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class V7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProtobufStateStorage f76584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X7 f76585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cdo f76586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Mm f76587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Zi f76588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Xi f76589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final G6 f76590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public W7 f76591i;

    public V7(Context context, ProtobufStateStorage protobufStateStorage, X7 x72, Cdo cdo, Mm mm, Zi zi, Xi xi, G6 g62, W7 w72) {
        this.f76583a = context;
        this.f76584b = protobufStateStorage;
        this.f76585c = x72;
        this.f76586d = cdo;
        this.f76587e = mm;
        this.f76588f = zi;
        this.f76589g = xi;
        this.f76590h = g62;
        this.f76591i = w72;
    }

    @NotNull
    public final synchronized W7 a() {
        return this.f76591i;
    }

    public final synchronized boolean b(@NotNull Z7 z72) {
        boolean z10;
        try {
            if (z72.a() == Y7.f76694b) {
                return false;
            }
            if (Intrinsics.areEqual(z72, this.f76591i.b())) {
                return false;
            }
            List listA = (List) this.f76586d.invoke(this.f76591i.a(), z72);
            boolean z11 = listA != null;
            if (listA == null) {
                listA = this.f76591i.a();
            }
            if (this.f76585c.a(z72, this.f76591i.b())) {
                z10 = true;
            } else {
                z72 = (Z7) this.f76591i.b();
                z10 = false;
            }
            if (z10 || z11) {
                W7 w72 = this.f76591i;
                W7 w73 = (W7) this.f76587e.invoke(z72, listA);
                this.f76591i = w73;
                this.f76584b.save(w73);
                AbstractC5227kj.a("Update distribution data: %s -> %s", w72, this.f76591i);
            }
            return z10;
        } finally {
        }
    }

    public final synchronized Z7 c() {
        try {
            if (!this.f76589g.a()) {
                Z7 z72 = (Z7) this.f76588f.invoke();
                this.f76589g.b();
                if (z72 != null) {
                    b(z72);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Z7) this.f76591i.b();
    }

    @NotNull
    public final Z7 a(@NotNull Z7 z72) {
        Z7 z7C;
        this.f76590h.a(this.f76583a);
        synchronized (this) {
            b(z72);
            z7C = c();
        }
        return z7C;
    }

    @NotNull
    public final Z7 b() {
        this.f76590h.a(this.f76583a);
        return c();
    }
}
