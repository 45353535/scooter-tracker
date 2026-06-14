package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public abstract class N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Kf f76150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final La f76151b;

    public N2(Kf kf2, La la2) {
        this.f76150a = kf2;
        this.f76151b = la2;
    }

    public final boolean a(@NonNull W5 w52, @NonNull M2 m22) {
        Iterator it = ((C5011c9) this.f76150a.a(w52.f76617d)).f76959a.iterator();
        while (it.hasNext()) {
            if (m22.a(it.next(), w52)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting(otherwise = 5)
    public final Kf b() {
        return this.f76150a;
    }

    public final La a() {
        return this.f76151b;
    }
}
