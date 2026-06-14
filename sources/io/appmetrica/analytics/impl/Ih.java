package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* JADX INFO: loaded from: classes12.dex */
public final class Ih extends C5058e5 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f75945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final L6 f75946x;

    public Ih(@NonNull Context context, @NonNull X4 x42, @NonNull C5487v4 c5487v4, @NonNull L6 l62, @NonNull C5204jm c5204jm, @NonNull AbstractC5007c5 abstractC5007c5, @NonNull InterfaceC5592z9 interfaceC5592z9) {
        this(context, x42, new C5208k0(), new TimePassedChecker(), new C5187j5(context, x42, c5487v4, abstractC5007c5, c5204jm, new Dh(l62), C5468ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C5468ua.k().l(), interfaceC5592z9), l62, c5487v4);
    }

    @Override // io.appmetrica.analytics.impl.C5058e5, io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.La
    public final synchronized void a(@NonNull C5487v4 c5487v4) {
        super.a(c5487v4);
        this.f75946x.a(this.f75945w, c5487v4.f78417i);
    }

    public Ih(Context context, X4 x42, C5208k0 c5208k0, TimePassedChecker timePassedChecker, C5187j5 c5187j5, L6 l62, C5487v4 c5487v4) {
        super(context, x42, c5208k0, timePassedChecker, c5187j5, c5487v4);
        this.f75945w = x42.b();
        this.f75946x = l62;
    }
}
