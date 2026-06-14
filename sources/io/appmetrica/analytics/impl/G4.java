package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class G4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mb f75809a;

    public G4() {
        this(C5468ua.k().l());
    }

    public static L4 a(E4 e42) {
        return new L4(new J4(e42), e42);
    }

    public G4(Mb mb2) {
        this.f75809a = mb2;
    }

    public final C5332on a(E4 e42, Em em) {
        C5332on c5332on = new C5332on(e42, new Ng(em));
        Mb mb2 = this.f75809a;
        synchronized (mb2) {
            mb2.f76124c.add(c5332on);
        }
        return c5332on;
    }
}
