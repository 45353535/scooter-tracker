package com.appodeal.ads.analytics.breadcrumbs;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.LogConstants;
import eg.m1;
import eg.o0;
import hg.l0;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f12676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f12677b;

    public m() {
        CoroutineScope scope = kotlinx.coroutines.i.a(m1.b(null, 1, null).plus(o0.a()));
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f12676a = scope;
        this.f12677b = l0.a(SetsKt.emptySet());
    }

    @Override // com.appodeal.ads.analytics.breadcrumbs.f
    public final void a(ArrayList services) {
        Object objB;
        Object value;
        Intrinsics.checkNotNullParameter(services, "services");
        try {
            Result.Companion companion = Result.f93230c;
            MutableStateFlow mutableStateFlow = this.f12677b;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.b(value, SetsKt.plus((Set) value, (Iterable) services)));
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            LogExtKt.logInternal$default(LogConstants.KEY_SDK, "Error during crash analytics initialization: " + thG.getMessage(), null, 4, null);
        }
    }
}
