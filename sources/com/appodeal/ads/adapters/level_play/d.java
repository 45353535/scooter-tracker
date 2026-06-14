package com.appodeal.ads.adapters.level_play;

import com.appodeal.ads.ext.LogExtKt;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements LevelPlayInitListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12395a;

    public d(f fVar) {
        this.f12395a = fVar;
    }

    @Override // com.unity3d.mediation.LevelPlayInitListener
    public final void onInitFailed(LevelPlayInitError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        LogExtKt.logInternal$default("LevelPlayInitializer", "onInitFailed. Message: " + error.getErrorMessage() + ", code: " + error.getErrorCode(), null, 4, null);
        this.f12395a.b(false);
    }

    @Override // com.unity3d.mediation.LevelPlayInitListener
    public final void onInitSuccess(LevelPlayConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        LogExtKt.logInternal$default("LevelPlayInitializer", "onInitSuccess", null, 4, null);
        this.f12395a.b(true);
    }
}
