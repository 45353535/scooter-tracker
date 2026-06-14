package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5546xd extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5270mb f78556a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5546xd(C5270mb c5270mb) {
        super(1);
        this.f78556a = c5270mb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C5092fd c5092fd = (C5092fd) ((Map.Entry) obj).getValue();
        return c5092fd.f77161b.parse(this.f78556a);
    }
}
