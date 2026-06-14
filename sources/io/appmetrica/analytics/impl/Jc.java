package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes12.dex */
public final class Jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4973an f75990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4973an f75991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5437t4 f75992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PublicLogger f75993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f75994e;

    public Jc(String str, PublicLogger publicLogger) {
        this(new C5437t4(30), new C4973an(50, str.concat("map key"), publicLogger), new C4973an(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Jc(C5437t4 c5437t4, C4973an c4973an, C4973an c4973an2, String str, PublicLogger publicLogger) {
        this.f75992c = c5437t4;
        this.f75990a = c4973an;
        this.f75991b = c4973an2;
        this.f75994e = str;
        this.f75993d = publicLogger;
    }
}
