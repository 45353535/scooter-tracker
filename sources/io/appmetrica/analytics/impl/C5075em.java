package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.em, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5075em extends T5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H3 f77134b;

    public C5075em(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager(), C5468ua.k().f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.T5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5101fm load(@NonNull S5 s52) {
        C5101fm c5101fm = (C5101fm) super.load(s52);
        C5204jm c5204jm = s52.f76392a;
        c5101fm.f77173d = c5204jm.f77545f;
        c5101fm.f77174e = c5204jm.f77546g;
        C5050dm c5050dm = (C5050dm) s52.componentArguments;
        String str = c5050dm.f77028a;
        if (str != null) {
            c5101fm.f77175f = str;
            c5101fm.f77176g = c5050dm.f77029b;
        }
        Map<String, String> map = c5050dm.f77030c;
        c5101fm.f77177h = map;
        c5101fm.f77178i = (C5586z3) this.f77134b.a(new C5586z3(map, Y7.f76695c));
        C5050dm c5050dm2 = (C5050dm) s52.componentArguments;
        c5101fm.f77180k = c5050dm2.f77031d;
        c5101fm.f77179j = c5050dm2.f77032e;
        C5204jm c5204jm2 = s52.f76392a;
        c5101fm.f77181l = c5204jm2.f77555p;
        c5101fm.f77182m = c5204jm2.f77557r;
        long j10 = c5204jm2.f77561v;
        if (c5101fm.f77183n == 0) {
            c5101fm.f77183n = j10;
        }
        return c5101fm;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C5101fm();
    }

    public C5075em(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager, @NonNull H3 h32) {
        super(context, str, safePackageManager);
        this.f77134b = h32;
    }

    @NonNull
    public final C5101fm a() {
        return new C5101fm();
    }
}
