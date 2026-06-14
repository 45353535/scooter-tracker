package com.appodeal.ads.regulator.shared;

import com.mobilefuse.sdk.privacy.IabString;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f14386a = lf.i.a(new Function0() { // from class: com.appodeal.ads.regulator.shared.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return i.a();
        }
    });

    public static final Pair[] a() {
        return new Pair[]{TuplesKt.to("IAB_TCF_V1.1", "IABConsent_"), TuplesKt.to("IAB_TCF_V2.2", "IABTCF_"), TuplesKt.to("IAB_US_PRIVACY", IabString.IAB_US_PRIVACY_STRING)};
    }
}
