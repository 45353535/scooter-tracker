package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import com.moloco.sdk.service_locator.b;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f58970a = lf.i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return k.a();
        }
    });

    public static final i a() {
        return new i(b.i.f55834a.a());
    }

    public static final h b() {
        return c();
    }

    public static final i c() {
        return (i) f58970a.getValue();
    }
}
