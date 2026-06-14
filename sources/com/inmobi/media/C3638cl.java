package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3638cl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hh.e f38407a;

    public C3638cl(hh.e eVar) {
        this.f38407a = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f38407a.cancel();
        return Unit.f93236a;
    }
}
