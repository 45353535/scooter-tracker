package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.j;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f21402m;

    public c(String str, j jVar, String str2) {
        super(str, jVar, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(j jVar, String str) {
        return jVar.b(str, this.f21401l);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(j jVar, String str) {
        String str2 = this.f21401l;
        jVar.getClass();
        String strA = j.a(str, "min", "rat", "bidding", j.e(str2));
        String strA2 = j.a(str, "min", "rat", "bidding", "all_mediators");
        "read".equalsIgnoreCase(str);
        Integer numA = jVar.a(strA2);
        int iIntValue = numA != null ? numA.intValue() : 5000;
        Integer numA2 = jVar.a(strA);
        return numA2 != null ? numA2.intValue() : iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(j jVar, String str) {
        String str2 = this.f21401l;
        jVar.getClass();
        String strA = j.a(str, "rat", "bidding", "perc", j.e(str2));
        String strA2 = j.a(str, "rat", "bidding", "perc", "all_mediators");
        "read".equalsIgnoreCase(str);
        Integer numA = jVar.a(strA2);
        int iIntValue = numA != null ? numA.intValue() : 15;
        Integer numA2 = jVar.a(strA);
        return numA2 != null ? numA2.intValue() : iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final void d(j jVar, String str) {
        super.d(jVar, str);
        Boolean boolC = jVar.c("reverse_retries");
        this.f21395g = boolC != null ? boolC.booleanValue() : true;
        String strA = j.a("retry_interval", "rat", "bidding");
        Integer numA = jVar.a(j.a("retry_interval", "all_mediators"));
        int iIntValue = numA != null ? numA.intValue() : 100;
        Integer numA2 = jVar.a(strA);
        if (numA2 != null) {
            iIntValue = numA2.intValue();
        }
        this.f21393e = iIntValue;
        this.f21391c = (this.f21398i + this.f21397h) - (iIntValue + this.f21394f);
        String strA2 = j.a("bidding", "irat", j.e(this.f21401l));
        Integer numA3 = jVar.a(j.a("bidding", "irat", "all_mediators"));
        int iIntValue2 = numA3 != null ? numA3.intValue() : 10000;
        Integer numA4 = jVar.a(strA2);
        if (numA4 != null) {
            iIntValue2 = numA4.intValue();
        }
        this.f21392d = iIntValue2;
        this.f21402m = ((double) Math.min(this.f21400k, this.f21399j)) / ((double) Math.max(this.f21400k, this.f21399j));
        b(this.f21392d);
        this.f21389a = Math.max(0, a());
        if (this.f21395g) {
            IAlog.a("%s : RequestBiddingAdTimeout shouldReverseRetries - reversing timeouts", IAlog.a(this));
            a(0);
        }
        IAlog.a("%s : RequestBiddingAdTimeout init timeouts, total retries: %d", IAlog.a(this), Integer.valueOf(this.f21389a));
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(j jVar) {
        String str = this.f21401l;
        jVar.getClass();
        String strA = j.a("timeout", "threshold", "rat", "bidding", j.e(str));
        Integer numA = jVar.a(j.a("timeout", "threshold", "rat", "bidding", "all_mediators"));
        int iIntValue = numA != null ? numA.intValue() : 300;
        Integer numA2 = jVar.a(strA);
        return numA2 != null ? numA2.intValue() : iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c() {
        return this.f21393e;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(int i10) {
        if (this.f21395g) {
            i10 = this.f21389a - i10;
        }
        int i11 = (this.f21390b * i10) + this.f21392d;
        IAlog.a("%s : RequestBiddingAdTimeout resolveTimeoutForRetry, timeout: %d ms for retry: %d", IAlog.a(this), Integer.valueOf(i11), Integer.valueOf(i10));
        b(i11);
        return i11;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b() {
        return this.f21389a;
    }

    public final void b(int i10) {
        double d10 = this.f21402m;
        if (d10 == 1.0d || d10 == 0.0d) {
            IAlog.a("%s : RequestBiddingAdTimeout Ratio: %f, connection and read timeouts should be divided in equal proportions", IAlog.a(this), Double.valueOf(this.f21402m));
            this.f21402m = 0.5d;
        }
        int i11 = (int) (((double) i10) * this.f21402m);
        this.f21397h = i11;
        this.f21398i = i10 - i11;
        IAlog.a("%s : RequestBiddingAdTimeout Update timeouts connection: %d read: %d", IAlog.a(this), Integer.valueOf(this.f21398i), Integer.valueOf(this.f21397h));
    }
}
