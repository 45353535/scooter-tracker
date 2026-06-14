package com.appodeal.ads.storage;

import android.content.SharedPreferences;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f14786a;

    public b(final String name, final com.appodeal.ads.context.o contextProvider) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f14786a = lf.i.a(new Function0() { // from class: com.appodeal.ads.storage.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.b(contextProvider, name);
            }
        });
    }

    public static final SharedPreferences b(ContextProvider contextProvider, String str) {
        return contextProvider.getApplicationContext().getSharedPreferences(str, 0);
    }

    public final SharedPreferences a() {
        Object value = this.f14786a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }
}
