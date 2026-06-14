package com.appodeal.ads.modules.common.internal.service;

import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.ironsource.C4240b4;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u000f\u0010\rJ(\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0014H&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/Service;", "Options", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "", "info", "Lcom/appodeal/ads/modules/common/internal/service/ServiceInfo;", "getInfo", "()Lcom/appodeal/ads/modules/common/internal/service/ServiceInfo;", "preInitialize", "Lkotlin/Result;", "", "options", "preInitialize-gIAlu-s", "(Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MobileAdsBridgeBase.initializeMethodName, "initialize-gIAlu-s", "logEvent", C4240b4.i.f42633j0, "", "params", "", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Service<Options extends ServiceOptions> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: preInitialize-gIAlu-s, reason: not valid java name */
        public static <Options extends ServiceOptions> Object m4430preInitializegIAlus(Service<Options> service, Options options, Continuation continuation) {
            Result.Companion companion = Result.f93230c;
            return Result.b(Unit.f93236a);
        }
    }

    ServiceInfo getInfo();

    /* JADX INFO: renamed from: initialize-gIAlu-s, reason: not valid java name */
    Object mo4428initializegIAlus(Options options, Continuation continuation);

    void logEvent(String eventName, Map<String, ? extends Object> params);

    /* JADX INFO: renamed from: preInitialize-gIAlu-s, reason: not valid java name */
    Object mo4429preInitializegIAlus(Options options, Continuation continuation);
}
