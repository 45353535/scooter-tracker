package com.mobilefuse.sdk.identity;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J$\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR.\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidDataUpdateDispatcher;", "", "()V", "eidDataUpdateListeners", "", "Lcom/mobilefuse/sdk/identity/EidDataUpdateListener;", "getEidDataUpdateListeners$mobilefuse_sdk_core_release$annotations", "getEidDataUpdateListeners$mobilefuse_sdk_core_release", "()Ljava/util/Set;", "eidOverridesFactory", "Lkotlin/Function0;", "", "", "getEidOverridesFactory", "()Lkotlin/jvm/functions/Function0;", "setEidOverridesFactory", "(Lkotlin/jvm/functions/Function0;)V", "addEidDataUpdateListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "dispatchUpdatedEidData", "eidData", "Lcom/mobilefuse/sdk/identity/EidSdkData;", "alteredEids", "", "isOverride", "", "removeEidDataUpdateListener", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class EidDataUpdateDispatcher {

    @NotNull
    private final Set<EidDataUpdateListener> eidDataUpdateListeners = new LinkedHashSet();

    @Nullable
    private Function0<? extends Map<String, String>> eidOverridesFactory;

    @VisibleForTesting
    public static /* synthetic */ void getEidDataUpdateListeners$mobilefuse_sdk_core_release$annotations() {
    }

    public final void addEidDataUpdateListener(@NotNull EidDataUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.eidDataUpdateListeners.add(listener);
    }

    public final void dispatchUpdatedEidData(@NotNull EidSdkData eidData, @NotNull Set<String> alteredEids, boolean isOverride) {
        Map<String, String> mapEmptyMap;
        Intrinsics.checkNotNullParameter(eidData, "eidData");
        Intrinsics.checkNotNullParameter(alteredEids, "alteredEids");
        if (alteredEids.isEmpty()) {
            return;
        }
        Function0<? extends Map<String, String>> function0 = this.eidOverridesFactory;
        if (function0 == null || (mapEmptyMap = function0.invoke()) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        for (String str : alteredEids) {
            if (isOverride || !mapEmptyMap.containsKey(str)) {
                Pair pair = mapEmptyMap.containsKey(str) ? TuplesKt.to(mapEmptyMap.get(str), Boolean.FALSE) : eidData.getSdkEids().containsKey(str) ? TuplesKt.to(eidData.getSdkEids().get(str), Boolean.TRUE) : TuplesKt.to(null, Boolean.FALSE);
                String str2 = (String) pair.component1();
                boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
                Iterator<T> it = this.eidDataUpdateListeners.iterator();
                while (it.hasNext()) {
                    ((EidDataUpdateListener) it.next()).onEidUpdate(str, str2, zBooleanValue);
                }
            }
        }
    }

    @NotNull
    public final Set<EidDataUpdateListener> getEidDataUpdateListeners$mobilefuse_sdk_core_release() {
        return this.eidDataUpdateListeners;
    }

    @Nullable
    public final Function0<Map<String, String>> getEidOverridesFactory() {
        return this.eidOverridesFactory;
    }

    public final void removeEidDataUpdateListener(@NotNull EidDataUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.eidDataUpdateListeners.remove(listener);
    }

    public final void setEidOverridesFactory(@Nullable Function0<? extends Map<String, String>> function0) {
        this.eidOverridesFactory = function0;
    }
}
