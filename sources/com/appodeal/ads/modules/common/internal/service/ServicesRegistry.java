package com.appodeal.ads.modules.common.internal.service;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H¦@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H¦@¢\u0006\u0004\b\f\u0010\nJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServicesRegistry;", "", "preInitialize", "Lkotlin/Result;", "Lcom/appodeal/ads/modules/common/internal/service/Service;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "serviceVariant", "Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant;", "serviceOptions", "preInitialize-0E7RQCE", "(Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant;Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MobileAdsBridgeBase.initializeMethodName, "initialize-0E7RQCE", "getAvailableServicesInfo", "", "Lcom/appodeal/ads/modules/common/internal/service/ServiceInfo;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ServicesRegistry {
    List<ServiceInfo> getAvailableServicesInfo();

    /* JADX INFO: renamed from: initialize-0E7RQCE, reason: not valid java name */
    Object mo4431initialize0E7RQCE(ServiceVariant serviceVariant, ServiceOptions serviceOptions, Continuation continuation);

    /* JADX INFO: renamed from: preInitialize-0E7RQCE, reason: not valid java name */
    Object mo4432preInitialize0E7RQCE(ServiceVariant serviceVariant, ServiceOptions serviceOptions, Continuation continuation);
}
