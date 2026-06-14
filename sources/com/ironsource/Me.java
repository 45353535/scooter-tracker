package com.ironsource;

import com.ironsource.C4240b4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Ne f41330a;

    public Me(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f41330a = Ne.f41466b.a(config.optInt(C4240b4.a.f42515t, Ne.CurrentlyLoadedAds.b()));
    }

    @NotNull
    public final Ne a() {
        return this.f41330a;
    }
}
