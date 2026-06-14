package com.appodeal.ads;

import com.ironsource.C4240b4;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class za extends ed implements com.appodeal.ads.networking.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f15316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15318e = "iap";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.appodeal.ads.networking.binders.s[] f15319f;

    public za(double d10, String str) {
        this.f15316c = d10;
        this.f15317d = str;
        com.appodeal.ads.networking.binders.s.f14082b.getClass();
        this.f15319f = (com.appodeal.ads.networking.binders.s[]) com.appodeal.ads.networking.binders.s.f14083c.toArray(new com.appodeal.ads.networking.binders.s[0]);
    }

    @Override // com.appodeal.ads.ed
    public final Object a(Continuation continuation) throws JSONException {
        z8 z8Var = new z8();
        Double dB = kotlin.coroutines.jvm.internal.b.b(this.f15316c);
        Intrinsics.checkNotNullParameter("amount", C4240b4.i.W);
        ((JSONObject) z8Var.f15309b.getValue()).put("amount", dB);
        String str = this.f15317d;
        Intrinsics.checkNotNullParameter("currency", C4240b4.i.W);
        ((JSONObject) z8Var.f15309b.getValue()).put("currency", str);
        com.appodeal.ads.networking.binders.s[] sVarArr = this.f15319f;
        return z8Var.a((com.appodeal.ads.networking.binders.s[]) Arrays.copyOf(sVarArr, sVarArr.length), (kotlin.coroutines.jvm.internal.d) continuation);
    }

    @Override // com.appodeal.ads.networking.b0
    public final String c() {
        return this.f15318e;
    }

    @Override // com.appodeal.ads.ed
    public final com.appodeal.ads.networking.binders.s[] d() {
        return this.f15319f;
    }
}
