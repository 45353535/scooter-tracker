package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class A extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5407s f75473a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C5407s c5407s) {
        super(1);
        this.f75473a = c5407s;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f75473a.f78190f = (byte[]) obj;
        return Unit.f93236a;
    }
}
