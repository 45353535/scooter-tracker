package com.mbridge.msdk.tracker.network.toolbox;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.tracker.network.g> f51957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f51959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f51960e;

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list) {
        this(i10, list, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.f51959d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f51960e != null) {
            return new ByteArrayInputStream(this.f51960e);
        }
        return null;
    }

    public final int b() {
        return this.f51958c;
    }

    public final List<com.mbridge.msdk.tracker.network.g> c() {
        return DesugarCollections.unmodifiableList(this.f51957b);
    }

    public final int d() {
        return this.f51956a;
    }

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list, int i11, InputStream inputStream) {
        this.f51956a = i10;
        this.f51957b = list;
        this.f51958c = i11;
        this.f51959d = inputStream;
        this.f51960e = null;
    }
}
