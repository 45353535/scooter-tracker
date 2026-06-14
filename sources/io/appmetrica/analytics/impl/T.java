package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class T extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f76473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Li f76474b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u10, Li li) {
        super(0);
        this.f76473a = u10;
        this.f76474b = li;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        U u10 = this.f76473a;
        N n10 = u10.f76537h;
        Context context = u10.f76530a;
        Li li = this.f76474b;
        n10.getClass();
        return N.a(new M(n10, context, li));
    }
}
