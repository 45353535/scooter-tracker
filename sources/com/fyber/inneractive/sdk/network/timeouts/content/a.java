package com.fyber.inneractive.sdk.network.timeouts.content;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.global.features.j;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends com.fyber.inneractive.sdk.network.timeouts.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21396h;

    public a(String str, String str2, int i10, boolean z10, String str3, r rVar) {
        int iIntValue;
        char c10;
        char c11;
        j jVar = (j) rVar.a(j.class);
        this.f21396h = 0;
        Boolean boolC = jVar.c("reverse_retries");
        this.f21395g = boolC != null ? boolC.booleanValue() : true;
        if (z10) {
            iIntValue = jVar.b(str, str3);
        } else if (TextUtils.isEmpty(str3)) {
            String str4 = str + "_global_timeout";
            int i11 = j.d(str) ? 30000 : 10000;
            Integer numA = jVar.a(str4);
            iIntValue = numA != null ? numA.intValue() : i11;
        } else {
            iIntValue = jVar.c(str, str3);
        }
        if (iIntValue > i10) {
            c10 = 2;
            c11 = 1;
            if (TextUtils.isEmpty(str3)) {
                Integer numA2 = jVar.a(j.a(str, str2, "retry_interval"));
                this.f21393e = numA2 != null ? numA2.intValue() : 100;
                Integer numA3 = jVar.a(j.a("timeout", "threshold"));
                this.f21394f = numA3 != null ? numA3.intValue() : 300;
                String strA = j.a(str, str2, "ilat");
                int i12 = j.d(str) ? 20000 : 10000;
                Integer numA4 = jVar.a(strA);
                this.f21392d = numA4 != null ? numA4.intValue() : i12;
            } else {
                String strA2 = j.a(str, str2, "retry_interval", j.e(str3));
                Integer numA5 = jVar.a(j.a("retry_interval", "all_mediators"));
                int iIntValue2 = numA5 != null ? numA5.intValue() : 100;
                Integer numA6 = jVar.a(strA2);
                this.f21393e = numA6 != null ? numA6.intValue() : iIntValue2;
                String strA3 = j.a("timeout", "threshold", j.e(str3));
                Integer numA7 = jVar.a(j.a("timeout", "threshold", "all_mediators"));
                int iIntValue3 = numA7 != null ? numA7.intValue() : 300;
                Integer numA8 = jVar.a(strA3);
                this.f21394f = numA8 != null ? numA8.intValue() : iIntValue3;
                String strA4 = j.a(str, str2, "ilat", j.e(str3));
                String strA5 = j.a(str, str2, "ilat", "all_mediators");
                int iIntValue4 = j.d(str) ? 20000 : 10000;
                Integer numA9 = jVar.a(strA5);
                iIntValue4 = numA9 != null ? numA9.intValue() : iIntValue4;
                Integer numA10 = jVar.a(strA4);
                this.f21392d = numA10 != null ? numA10.intValue() : iIntValue4;
            }
        } else {
            c10 = 2;
            c11 = 1;
        }
        int i13 = iIntValue - (this.f21394f + i10);
        String strA6 = IAlog.a(a.class);
        Integer numValueOf = Integer.valueOf(i10);
        Integer numValueOf2 = Integer.valueOf(iIntValue);
        Integer numValueOf3 = Integer.valueOf(i13);
        Object[] objArr = new Object[4];
        objArr[0] = strA6;
        objArr[c11] = numValueOf;
        objArr[c10] = numValueOf2;
        objArr[3] = numValueOf3;
        IAlog.a("%s : LoadAdContentTimeout resolveLoadAdTimeout : usedTime: %d, global timeout: %d, timeout: %d", objArr);
        this.f21391c = Math.max(i13, 0);
        int iA = a();
        this.f21389a = iA;
        if (iA == 0) {
            this.f21392d = this.f21391c;
        }
        String strA7 = IAlog.a(this);
        Integer numValueOf4 = Integer.valueOf(this.f21389a);
        Object[] objArr2 = new Object[3];
        objArr2[0] = strA7;
        objArr2[c11] = numValueOf4;
        objArr2[c10] = 0;
        IAlog.a("%s : LoadAdContentTimeout onFixedLoadAdTimeoutUpdated : Calculated: %d attempts with LeftoverTime: %d", objArr2);
        int i14 = this.f21389a;
        if (i14 > 0) {
            int i15 = this.f21391c;
            int i16 = this.f21394f;
            int i17 = this.f21393e;
            for (int i18 = 0; i18 <= i14; i18++) {
                i15 -= (this.f21390b * i18) + this.f21392d;
            }
            this.f21396h = Math.max(0, i15 - ((i17 * i14) + (i16 * i14)));
        }
    }
}
