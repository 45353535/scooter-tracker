package io.appmetrica.analytics.screenshot.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5624s extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5627v f79042a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5624s(C5627v c5627v) {
        super(0);
        this.f79042a = c5627v;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((C5629x) this.f79042a.f79046b).a("ContentObserverScreenshotCaptor");
        return Unit.f93236a;
    }
}
