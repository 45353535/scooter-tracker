package com.inmobi.media;

import com.inmobi.media.Ic;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4142x f37065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f37066b;

    public Ic(C4142x adComponent) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        this.f37065a = adComponent;
        this.f37066b = lf.i.a(new Function0() { // from class: w3.x1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ic.a(this.f107373b);
            }
        });
    }

    public static final Dc a(Ic ic2) {
        C4142x c4142x = ic2.f37065a;
        return new Dc(c4142x.f39883b, c4142x.f39882a.f39146d);
    }
}
