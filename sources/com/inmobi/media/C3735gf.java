package com.inmobi.media;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3735gf extends AbstractC3846l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3683ef f38632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3903n9 f38633c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3735gf(SignalsConfig.NovatiqConfig mConfig, C3683ef data, C3903n9 c3903n9) {
        super(mConfig.getBeaconUrl());
        Intrinsics.checkNotNullParameter(mConfig, "mConfig");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f38632b = data;
        this.f38633c = c3903n9;
    }

    public final Je a() {
        C3903n9 c3903n9 = this.f38633c;
        if (c3903n9 != null) {
            C3683ef c3683ef = this.f38632b;
            c3903n9.a("Novatiq", "preparing Novatiq request with data - hyperId - " + c3683ef.f38517a + " - sspHost - " + c3683ef.f38518b + " - pubId - inmobi");
        }
        String str = this.f38941a;
        Pair pair = TuplesKt.to("sptoken", this.f38632b.f38517a);
        this.f38632b.getClass();
        Pair pair2 = TuplesKt.to("sspid", "i6i");
        Pair pair3 = TuplesKt.to("ssphost", this.f38632b.f38518b);
        this.f38632b.getClass();
        return new Je(str, null, null, MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "inmobi")), null, false, 54);
    }
}
