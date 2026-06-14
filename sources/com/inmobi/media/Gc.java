package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Gc implements InterfaceC4010rh, Ck, ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3903n9 f36937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ac f36938b;

    public Gc(Context context, Jg pubSettings, Hc nativeCallbacks) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(nativeCallbacks, "nativeCallbacks");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("native", "logType");
        Intrinsics.checkNotNullParameter("native", "adType");
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Ab ab2 = Jh.f37148a;
        this.f36937a = Jh.a("native", pubSettings.f37147g);
        this.f36938b = new Ac(new C3920o1(context, this, new C3945p1(this, pubSettings)), nativeCallbacks);
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        return this.f36938b.a(i10, d10);
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        this.f36938b.d();
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        return this.f36938b.a(d10);
    }

    @Override // com.inmobi.media.InterfaceC4010rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        this.f36938b.a(inMobiNativeViewData);
    }
}
