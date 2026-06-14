package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class Ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sk f76207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f76208b;

    public Ok(Context context, X4 x42) {
        x42.a();
        Sk sk = new Sk(context, x42);
        this.f76207a = sk;
        this.f76208b = MapsKt.toMutableMap(sk.a());
    }
}
