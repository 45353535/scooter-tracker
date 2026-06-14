package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4247bb implements ImpressionDataListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final LevelPlayImpressionDataListener f42764a;

    public C4247bb(@NotNull LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f42764a = listener;
    }

    @NotNull
    public final LevelPlayImpressionDataListener a() {
        return this.f42764a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4247bb) {
            return Intrinsics.areEqual(this.f42764a, ((C4247bb) obj).f42764a);
        }
        return false;
    }

    public int hashCode() {
        return this.f42764a.hashCode();
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(@NotNull W8 impressionData) {
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        this.f42764a.onImpressionSuccess(new LevelPlayImpressionData(impressionData.d()));
    }
}
