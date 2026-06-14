package com.mobilefuse.sdk.video;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000b\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;", "", "()V", "cachedValue", "Lcom/mobilefuse/sdk/video/AdmClickInfo;", "producer", "Lkotlin/Function0;", "destroyProducer", "", "admClickInfoToCache", "getAdmClickInfo", "registerProducer", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class AdmClickInfoProvider {
    private AdmClickInfo cachedValue;
    private Function0<AdmClickInfo> producer;

    public final void destroyProducer(@Nullable AdmClickInfo admClickInfoToCache) {
        this.cachedValue = admClickInfoToCache;
        this.producer = null;
    }

    @Nullable
    public final AdmClickInfo getAdmClickInfo() {
        AdmClickInfo admClickInfoInvoke;
        Function0<AdmClickInfo> function0 = this.producer;
        return (function0 == null || (admClickInfoInvoke = function0.invoke()) == null) ? this.cachedValue : admClickInfoInvoke;
    }

    public final void registerProducer(@NotNull Function0<AdmClickInfo> producer) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        this.producer = producer;
        this.cachedValue = null;
    }
}
