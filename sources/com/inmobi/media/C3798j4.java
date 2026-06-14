package com.inmobi.media;

import com.inmobi.media.C3798j4;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3798j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f38790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f38791b;

    public C3798j4(CoroutineScope configScope) {
        Intrinsics.checkNotNullParameter(configScope, "configScope");
        this.f38790a = configScope;
        this.f38791b = lf.i.a(new Function0() { // from class: w3.i8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3798j4.a();
            }
        });
    }

    public static final C3569a4 a() {
        return new C3569a4(AbstractC3754h9.b());
    }
}
