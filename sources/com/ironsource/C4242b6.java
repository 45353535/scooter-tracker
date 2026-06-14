package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4242b6 implements Hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private InterfaceC4259c6 f42713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private WeakReference<InterfaceC4276d6> f42714b = new WeakReference<>(null);

    /* JADX INFO: renamed from: com.ironsource.b6$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f42715a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f42716b = "impressions";

        private a() {
        }
    }

    public final void a(@NotNull InterfaceC4259c6 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.f42713a = loadListener;
    }

    @Override // com.ironsource.Hc
    public void onInterstitialAdRewarded(@Nullable String str, int i10) {
        InterfaceC4276d6 interfaceC4276d6 = this.f42714b.get();
        if (interfaceC4276d6 != null) {
            interfaceC4276d6.onAdInstanceDidReward(str, i10);
        }
    }

    @Override // com.ironsource.Hc
    public void onInterstitialClick() {
        InterfaceC4276d6 interfaceC4276d6 = this.f42714b.get();
        if (interfaceC4276d6 != null) {
            interfaceC4276d6.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.Hc
    public void onInterstitialClose() {
        InterfaceC4276d6 interfaceC4276d6 = this.f42714b.get();
        if (interfaceC4276d6 != null) {
            interfaceC4276d6.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.Hc
    public void onInterstitialEventNotificationReceived(@Nullable String str, @Nullable JSONObject jSONObject) {
        InterfaceC4276d6 interfaceC4276d6;
        if (!Intrinsics.areEqual(str, "impressions") || (interfaceC4276d6 = this.f42714b.get()) == null) {
            return;
        }
        interfaceC4276d6.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.Hc
    public void onInterstitialInitFailed(@Nullable String str) {
    }

    @Override // com.ironsource.Hc
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.Hc
    public void onInterstitialLoadFailed(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        InterfaceC4259c6 interfaceC4259c6 = this.f42713a;
        if (interfaceC4259c6 != null) {
            interfaceC4259c6.a(description);
        }
    }

    @Override // com.ironsource.Hc
    public void onInterstitialLoadSuccess(@NotNull L9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        InterfaceC4259c6 interfaceC4259c6 = this.f42713a;
        if (interfaceC4259c6 != null) {
            interfaceC4259c6.a(adInstance);
        }
    }

    @Override // com.ironsource.Hc
    public void onInterstitialOpen() {
        InterfaceC4276d6 interfaceC4276d6 = this.f42714b.get();
        if (interfaceC4276d6 != null) {
            interfaceC4276d6.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.Hc
    public void onInterstitialShowFailed(@Nullable String str) {
        InterfaceC4276d6 interfaceC4276d6 = this.f42714b.get();
        if (interfaceC4276d6 != null) {
            interfaceC4276d6.a(str);
        }
    }

    @Override // com.ironsource.Hc
    public void onInterstitialShowSuccess() {
    }

    public final void a(@NotNull InterfaceC4276d6 showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.f42714b = new WeakReference<>(showListener);
    }
}
