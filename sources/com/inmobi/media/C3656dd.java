package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiNative;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3656dd implements ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jg f38440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rg f38441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Hc f38442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gc f38443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3605be f38444e;

    public C3656dd(InMobiNative inMobiNative, Context context, long j10) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        Intrinsics.checkNotNullParameter(context, "context");
        Jg jg2 = new Jg();
        jg2.f37141a = j10;
        this.f38440a = jg2;
        C3630cd c3630cd = new C3630cd(this);
        Rg rg2 = new Rg();
        this.f38441b = rg2;
        Hc hc2 = new Hc(inMobiNative, rg2, c3630cd);
        this.f38442c = hc2;
        this.f38443d = new Gc(context, jg2, hc2);
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        return this.f38443d.a(d10);
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        return this.f38443d.a(i10, d10);
    }
}
