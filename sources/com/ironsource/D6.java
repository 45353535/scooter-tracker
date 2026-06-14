package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class D6 implements I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6 f40580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final C4498q6 f40581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f40582c;

    public D6(@NotNull C6 strategy, @Nullable C4498q6 c4498q6, boolean z10) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f40580a = strategy;
        this.f40581b = c4498q6;
        this.f40582c = z10;
    }

    @Override // com.ironsource.I6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f40580a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.f40582c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.I6
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40580a.a(this.f40582c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }

    @Override // com.ironsource.I6
    public void c(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40580a.a(this.f40582c ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.ironsource.I6
    public void loadAd() {
        C4498q6 c4498q6A = this.f40580a.b().a(true, this.f40580a.c());
        C6 c62 = this.f40580a;
        c62.a(new H6(c62, c4498q6A));
        c4498q6A.a(this.f40580a);
    }

    @Override // com.ironsource.I6
    public void c(@Nullable IronSourceError ironSourceError) {
        this.f40580a.a(this.f40582c ? "show failed on expired ad" : "show failed before load called");
    }

    public /* synthetic */ D6(C6 c62, C4498q6 c4498q6, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c62, c4498q6, (i10 & 4) != 0 ? false : z10);
    }

    @Override // com.ironsource.I6
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f40580a.a(this.f40582c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.I6
    public void a() {
        this.f40580a.a(this.f40582c ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.ironsource.I6
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f40580a.a(this.f40582c ? "show success on expired ad" : "show success before load called");
    }
}
