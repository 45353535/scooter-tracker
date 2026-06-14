package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Map;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.in, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5179in implements InterfaceC5432t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5482v f77442b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5457u f77441a = new C5457u();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f77443c = lf.i.a(new C5154hn(this));

    public C5179in(@NotNull Context context) {
        this.f77442b = new C5482v(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5432t
    @NotNull
    public final Map<String, String> a(@NotNull Map<String, String> map) {
        map.putAll((Map) this.f77443c.getValue());
        return map;
    }
}
