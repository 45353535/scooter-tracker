package id;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f74518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f74519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f74520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f74521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f74522e;

    public h(f event, i style, g gVar, long j10, e eVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f74518a = event;
        this.f74519b = style;
        this.f74520c = gVar;
        this.f74521d = j10;
        this.f74522e = eVar;
    }

    public final e a() {
        e eVar = this.f74522e;
        return eVar == null ? e.Left : eVar;
    }

    public final long b() {
        return this.f74521d;
    }

    public final g c() {
        return this.f74520c;
    }

    public final i d() {
        return this.f74519b;
    }
}
