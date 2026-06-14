package com.appodeal.ads.adapters.mytarget;

import com.appodeal.ads.AdUnitParams;
import com.my.target.common.CustomParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12541b;

    public a(int i10, String str) {
        this.f12540a = i10;
        this.f12541b = str;
    }

    public final void a(CustomParams customParams) {
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        String str = this.f12541b;
        if (str == null || str.length() == 0) {
            return;
        }
        customParams.setCustomParam("mediation", this.f12541b);
    }

    public final String toString() {
        return "MyTargetAdUnitParams(slotId=" + this.f12540a + ", mediatorName='" + this.f12541b + "')";
    }
}
