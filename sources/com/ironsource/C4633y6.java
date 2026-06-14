package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4633y6 implements B6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4599w6 f45872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4498q6 f45873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private C4498q6 f45874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f45875d;

    public C4633y6(@NotNull C4599w6 strategy, @NotNull C4498q6 currentAdUnit, @Nullable C4498q6 c4498q6, boolean z10) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f45872a = strategy;
        this.f45873b = currentAdUnit;
        this.f45874c = c4498q6;
        this.f45875d = z10;
    }

    @Override // com.ironsource.B6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f45872a.a(new A6(this.f45872a, this.f45873b, this.f45874c));
        this.f45873b.a(activity, this.f45872a);
    }

    @Override // com.ironsource.B6
    public void b(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(this.f45873b, adUnit)) {
            this.f45872a.a("load success after current ad is loaded");
        }
    }

    @Override // com.ironsource.B6
    public void c(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.f45873b)) {
            this.f45872a.d().onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.B6
    public void loadAd() {
        Unit unit;
        if (this.f45875d) {
            this.f45872a.a("load called while current ad is loaded");
            return;
        }
        this.f45875d = true;
        LevelPlayAdInfo levelPlayAdInfoE = this.f45873b.e();
        if (levelPlayAdInfoE != null) {
            this.f45872a.d().b(levelPlayAdInfoE);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f45872a.a("current ad is loaded without ad info");
        } else if (this.f45874c == null) {
            C4498q6 c4498q6A = this.f45872a.b().a(false, this.f45872a.c());
            this.f45874c = c4498q6A;
            c4498q6A.a(this.f45872a);
        }
    }

    @Override // com.ironsource.B6
    public void b(@NotNull C4498q6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.f45874c)) {
            this.f45874c = null;
        } else {
            this.f45872a.a("load failed after current ad is loaded");
        }
    }

    @Override // com.ironsource.B6
    public void a(@NotNull C4498q6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.f45873b)) {
            this.f45872a.a("show success when loaded");
        } else {
            this.f45872a.a("progressive show success while current ad is loaded");
        }
    }

    public /* synthetic */ C4633y6(C4599w6 c4599w6, C4498q6 c4498q6, C4498q6 c4498q62, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4599w6, c4498q6, c4498q62, (i10 & 8) != 0 ? false : z10);
    }

    @Override // com.ironsource.B6
    public void a(@NotNull C4498q6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.f45873b)) {
            this.f45872a.a("show failed when loaded");
        } else {
            this.f45872a.a("progressive show failed while current ad is loaded");
        }
    }

    @Override // com.ironsource.B6
    public void a(@NotNull C4498q6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.f45874c)) {
            this.f45874c = null;
        } else if (Intrinsics.areEqual(adUnit, this.f45873b)) {
            a();
        }
    }

    private final void a() {
        B6 c4650z6;
        C4498q6 c4498q6 = this.f45874c;
        if (c4498q6 == null) {
            C4599w6 c4599w6 = this.f45872a;
            c4599w6.a(new C4616x6(c4599w6));
        } else {
            if (c4498q6.e() != null) {
                C4599w6 c4599w62 = this.f45872a;
                C4498q6 c4498q62 = this.f45874c;
                Intrinsics.checkNotNull(c4498q62);
                c4650z6 = new C4633y6(c4599w62, c4498q62, null, false, 8, null);
            } else {
                C4599w6 c4599w63 = this.f45872a;
                C4498q6 c4498q63 = this.f45874c;
                Intrinsics.checkNotNull(c4498q63);
                c4650z6 = new C4650z6(c4599w63, c4498q63, false);
            }
            this.f45872a.a(c4650z6);
        }
        this.f45872a.d().a();
    }
}
