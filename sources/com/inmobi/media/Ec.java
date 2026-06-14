package com.inmobi.media;

import com.inmobi.media.Ec;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4142x f36789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InMobiJsonResponse f36790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ac f36791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ic f36792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3865ll f36793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f36794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f36795g;

    public Ec(C4142x adComponent, InMobiJsonResponse inMobiJsonResponse, Ac adUnitCallback) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(inMobiJsonResponse, "inMobiJsonResponse");
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f36789a = adComponent;
        this.f36790b = inMobiJsonResponse;
        this.f36791c = adUnitCallback;
        this.f36792d = new Ic(adComponent);
        this.f36794f = lf.i.a(new Function0() { // from class: w3.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ec.b(this.f107386b);
            }
        });
        this.f36795g = lf.i.a(new Function0() { // from class: w3.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ec.a(this.f107404b);
            }
        });
    }

    public static final C3856lc a(Ec ec2) {
        C3920o1 c3920o1 = ec2.f36792d.f37065a.f39882a;
        return new C3856lc(c3920o1.f39144b, c3920o1.f39147e, c3920o1.f39145c);
    }

    public static final Dc b(Ec ec2) {
        return (Dc) ec2.f36792d.f37066b.getValue();
    }
}
