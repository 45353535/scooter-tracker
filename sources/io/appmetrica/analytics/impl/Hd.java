package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Hd implements InterfaceC5129go, InterfaceC5385r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo f75864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R2 f75865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PublicLogger f75866e = PublicLogger.getAnonymousInstance();

    public Hd(int i10, String str, uo uoVar, R2 r22) {
        this.f75863b = i10;
        this.f75862a = str;
        this.f75864c = uoVar;
        this.f75865d = r22;
    }

    @NonNull
    public final C5155ho a() {
        C5155ho c5155ho = new C5155ho();
        c5155ho.f77356b = this.f75863b;
        c5155ho.f77355a = this.f75862a.getBytes();
        c5155ho.f77358d = new C5206jo();
        c5155ho.f77357c = new C5180io();
        return c5155ho;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5129go
    public abstract /* synthetic */ void a(@NonNull C5103fo c5103fo);

    @NonNull
    public final R2 b() {
        return this.f75865d;
    }

    @NonNull
    public final String c() {
        return this.f75862a;
    }

    @NonNull
    @VisibleForTesting
    public final uo d() {
        return this.f75864c;
    }

    public final int e() {
        return this.f75863b;
    }

    public final boolean f() {
        so soVarA = this.f75864c.a(this.f75862a);
        if (soVarA.f78248a) {
            return true;
        }
        this.f75866e.warning("Attribute " + this.f75862a + " of type " + ((String) Qn.f76329a.get(this.f75863b)) + " is skipped because " + soVarA.f78249b, new Object[0]);
        return false;
    }

    public final void a(@NonNull PublicLogger publicLogger) {
        this.f75866e = publicLogger;
    }
}
