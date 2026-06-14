package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5532x extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5407s f78543a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5532x(C5407s c5407s) {
        super(1);
        this.f78543a = c5407s;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f78543a.f78189e = (byte[]) obj;
        return Unit.f93236a;
    }
}
