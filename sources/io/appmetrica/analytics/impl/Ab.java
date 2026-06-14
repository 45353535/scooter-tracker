package io.appmetrica.analytics.impl;

import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class Ab implements Oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Oa f75516a;

    public Ab(Oa oa2) {
        this.f75516a = oa2;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, String str2) {
        this.f75516a.a(str, str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void b() {
        this.f75516a.b();
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final boolean getBoolean(String str, boolean z10) {
        return this.f75516a.getBoolean(str, z10);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final int getInt(String str, int i10) {
        return this.f75516a.getInt(str, i10);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final long getLong(String str, long j10) {
        return this.f75516a.getLong(str, j10);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final String getString(String str, String str2) {
        return this.f75516a.getString(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa remove(String str) {
        this.f75516a.remove(str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, long j10) {
        this.f75516a.a(str, j10);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(int i10, String str) {
        this.f75516a.a(i10, str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, boolean z10) {
        this.f75516a.a(str, z10);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Oa a(String str, float f10) {
        this.f75516a.a(str, f10);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final boolean a(String str) {
        return this.f75516a.a(str);
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final Set a() {
        return this.f75516a.a();
    }
}
