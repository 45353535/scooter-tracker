package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Gc implements Fc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private InterfaceC4646z2 f40984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private WeakReference<B2> f40985b = new WeakReference<>(null);

    public final void a(@NotNull InterfaceC4646z2 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.f40984a = loadListener;
    }

    @Override // com.ironsource.Fc
    public void onBannerClick() {
        B2 b22 = this.f40985b.get();
        if (b22 != null) {
            b22.onBannerClick();
        }
    }

    @Override // com.ironsource.Fc
    public void onBannerInitFailed(@Nullable String str) {
    }

    @Override // com.ironsource.Fc
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.Fc
    public void onBannerLoadFail(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        InterfaceC4646z2 interfaceC4646z2 = this.f40984a;
        if (interfaceC4646z2 != null) {
            interfaceC4646z2.onBannerLoadFail(description);
        }
    }

    @Override // com.ironsource.Fc
    public void onBannerLoadSuccess(@NotNull L9 adInstance, @NotNull C4346h8 adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        InterfaceC4646z2 interfaceC4646z2 = this.f40984a;
        if (interfaceC4646z2 != null) {
            interfaceC4646z2.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.ironsource.Fc
    public void onBannerShowSuccess() {
        B2 b22 = this.f40985b.get();
        if (b22 != null) {
            b22.onBannerShowSuccess();
        }
    }

    public final void a(@NotNull B2 showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.f40985b = new WeakReference<>(showListener);
    }
}
