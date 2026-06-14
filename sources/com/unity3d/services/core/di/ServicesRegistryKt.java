package com.unity3d.services.core.di;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function1;", "Lcom/unity3d/services/core/di/ServicesRegistry;", "", "registry", "(Lkotlin/jvm/functions/Function1;)Lcom/unity3d/services/core/di/ServicesRegistry;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ServicesRegistryKt {
    @NotNull
    public static final ServicesRegistry registry(@NotNull Function1<? super ServicesRegistry, Unit> registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        ServicesRegistry servicesRegistry = new ServicesRegistry();
        registry.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
