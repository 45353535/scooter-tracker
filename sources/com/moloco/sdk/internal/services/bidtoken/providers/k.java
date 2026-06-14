package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MolocoPrivacy.PrivacySettings f55412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f55413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f55414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f55415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f55416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.n f55417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f55418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f55419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f55420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q f55421k;

    public k(boolean z10, MolocoPrivacy.PrivacySettings privacySettings, s memoryInfo, d appDirInfo, u networkInfoSignal, h batteryInfoSignal, com.moloco.sdk.internal.services.n adDataSignal, o deviceSignal, f audioSignal, a accessibilitySignal, q ilrdSignal) {
        Intrinsics.checkNotNullParameter(privacySettings, "privacySettings");
        Intrinsics.checkNotNullParameter(memoryInfo, "memoryInfo");
        Intrinsics.checkNotNullParameter(appDirInfo, "appDirInfo");
        Intrinsics.checkNotNullParameter(networkInfoSignal, "networkInfoSignal");
        Intrinsics.checkNotNullParameter(batteryInfoSignal, "batteryInfoSignal");
        Intrinsics.checkNotNullParameter(adDataSignal, "adDataSignal");
        Intrinsics.checkNotNullParameter(deviceSignal, "deviceSignal");
        Intrinsics.checkNotNullParameter(audioSignal, "audioSignal");
        Intrinsics.checkNotNullParameter(accessibilitySignal, "accessibilitySignal");
        Intrinsics.checkNotNullParameter(ilrdSignal, "ilrdSignal");
        this.f55411a = z10;
        this.f55412b = privacySettings;
        this.f55413c = memoryInfo;
        this.f55414d = appDirInfo;
        this.f55415e = networkInfoSignal;
        this.f55416f = batteryInfoSignal;
        this.f55417g = adDataSignal;
        this.f55418h = deviceSignal;
        this.f55419i = audioSignal;
        this.f55420j = accessibilitySignal;
        this.f55421k = ilrdSignal;
    }

    public final a a() {
        return this.f55420j;
    }

    public final com.moloco.sdk.internal.services.n b() {
        return this.f55417g;
    }

    public final d c() {
        return this.f55414d;
    }

    public final f d() {
        return this.f55419i;
    }

    public final h e() {
        return this.f55416f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f55411a == kVar.f55411a && Intrinsics.areEqual(this.f55412b, kVar.f55412b) && Intrinsics.areEqual(this.f55413c, kVar.f55413c) && Intrinsics.areEqual(this.f55414d, kVar.f55414d) && Intrinsics.areEqual(this.f55415e, kVar.f55415e) && Intrinsics.areEqual(this.f55416f, kVar.f55416f) && Intrinsics.areEqual(this.f55417g, kVar.f55417g) && Intrinsics.areEqual(this.f55418h, kVar.f55418h) && Intrinsics.areEqual(this.f55419i, kVar.f55419i) && Intrinsics.areEqual(this.f55420j, kVar.f55420j) && Intrinsics.areEqual(this.f55421k, kVar.f55421k);
    }

    public final o f() {
        return this.f55418h;
    }

    public final q g() {
        return this.f55421k;
    }

    public final s h() {
        return this.f55413c;
    }

    public int hashCode() {
        return (((((((((((((((((((androidx.compose.foundation.c.a(this.f55411a) * 31) + this.f55412b.hashCode()) * 31) + this.f55413c.hashCode()) * 31) + this.f55414d.hashCode()) * 31) + this.f55415e.hashCode()) * 31) + this.f55416f.hashCode()) * 31) + this.f55417g.hashCode()) * 31) + this.f55418h.hashCode()) * 31) + this.f55419i.hashCode()) * 31) + this.f55420j.hashCode()) * 31) + this.f55421k.hashCode();
    }

    public final u i() {
        return this.f55415e;
    }

    public final MolocoPrivacy.PrivacySettings j() {
        return this.f55412b;
    }

    public final boolean k() {
        return this.f55411a;
    }

    public String toString() {
        return "ClientSignals(sdkInitialized=" + this.f55411a + ", privacySettings=" + this.f55412b + ", memoryInfo=" + this.f55413c + ", appDirInfo=" + this.f55414d + ", networkInfoSignal=" + this.f55415e + ", batteryInfoSignal=" + this.f55416f + ", adDataSignal=" + this.f55417g + ", deviceSignal=" + this.f55418h + ", audioSignal=" + this.f55419i + ", accessibilitySignal=" + this.f55420j + ", ilrdSignal=" + this.f55421k + ')';
    }
}
