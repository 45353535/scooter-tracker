package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5582z extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5407s f78598a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5582z(C5407s c5407s) {
        super(1);
        this.f78598a = c5407s;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f78598a.f78193i = (byte[]) obj;
        return Unit.f93236a;
    }
}
