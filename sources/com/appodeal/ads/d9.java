package com.appodeal.ads;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class d9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f13236a = lf.i.a(new Function0() { // from class: com.appodeal.ads.c9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d9.a();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppodealRequestCallbacks f13237b;

    public static final CoroutineScope a() {
        return kotlinx.coroutines.i.a(eg.o0.c().plus(new eg.e0("ApdRequestCallbacks")));
    }
}
