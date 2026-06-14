package com.mobilefuse.sdk.ad.rendering.splashad;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
final /* synthetic */ class SplashAdController$onAdCloseRequested$1$2$1 extends y implements Function0<Unit> {
    SplashAdController$onAdCloseRequested$1$2$1(SplashAdController splashAdController) {
        super(0, splashAdController, SplashAdController.class, "onAdReadyToClose", "onAdReadyToClose()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
        invoke2();
        return Unit.f93236a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws Throwable {
        ((SplashAdController) this.receiver).onAdReadyToClose();
    }
}
