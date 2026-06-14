package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4475p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<String, R0> f44588a = new HashMap<>();

    /* JADX INFO: renamed from: com.ironsource.p0$a */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    @NotNull
    public final R0 a(@NotNull String adUnitId, @NotNull List<? extends NetworkSettings> providers, int i10) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(providers, "providers");
        R0 r02 = this.f44588a.get(adUnitId);
        if (r02 != null) {
            return r02;
        }
        R0 r03 = new R0(providers, i10);
        this.f44588a.put(adUnitId, r03);
        return r03;
    }
}
