package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import com.inmobi.media.W;
import com.inmobi.media.Z;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3920o1 f38080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f38081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3945p1 f38082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdConfig f38083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3658df f38084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3964pk f38085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f38086g;

    public Z(C3920o1 adManagerComponent, C3906nc mediationSpecificConfig) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(mediationSpecificConfig, "mediationSpecificConfig");
        this.f38080a = adManagerComponent;
        this.f38081b = new X(adManagerComponent.f39146d, adManagerComponent.f39148f);
        C3945p1 c3945p1 = adManagerComponent.f39143a;
        this.f38082c = c3945p1;
        AdConfig adConfig = c3945p1.f39234b;
        this.f38083d = adConfig;
        this.f38084e = new C3709ff(adManagerComponent.f39144b, adManagerComponent.f39145c).a();
        Integer num = mediationSpecificConfig.f39097d;
        long jIntValue = num != null ? num.intValue() : 15000;
        Integer num2 = mediationSpecificConfig.f39097d;
        this.f38085f = new C3964pk(jIntValue, num2 != null ? num2.intValue() : 15000, mediationSpecificConfig.f39097d != null ? r9.intValue() : 15000);
        this.f38086g = adConfig.getApplyGzipReq();
    }

    public final Object a(P6 p62) {
        C3903n9 c3903n9 = this.f38080a.f39145c;
        if (c3903n9 != null) {
            c3903n9.a("AdFetchManager", "fetchAd Called");
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Jg jg2 = this.f38082c.f39233a;
        Map map = jg2.f37143c;
        long j10 = jg2.f37141a;
        Context context = this.f38080a.f39144b;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = context instanceof Activity ? "activity" : "others";
        this.f38082c.getClass();
        return new Yn(new C3944p0(this.f38083d.getUrl(), new Ak(this.f38083d.getIncludeIds()), new C3894n0(string, map, j10, str, "native", MapsKt.emptyMap(), this.f38082c.f39233a.f37142b, this.f38083d.getRendering().getEnablePubMuteControl() && Ji.f37162f), this.f38085f, this.f38084e, this.f38080a.f39145c, this.f38086g).a(), this.f38080a.f39145c).a(new Function1() { // from class: w3.n5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Z.a(this.f107204b, (W) obj);
            }
        }, p62);
    }

    public static final Unit a(Z z10, W adFetchEvent) {
        Intrinsics.checkNotNullParameter(adFetchEvent, "adFetchEvent");
        C3903n9 c3903n9 = z10.f38080a.f39145c;
        if (c3903n9 != null) {
            c3903n9.a("AdFetchManager", "adFetchEvent " + adFetchEvent);
        }
        z10.f38081b.a(adFetchEvent);
        return Unit.f93236a;
    }
}
