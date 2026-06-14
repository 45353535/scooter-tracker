package com.android.volley.toolbox;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f7570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f7572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f7573e;

    public f(int i10, List list) {
        this(i10, list, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.f7572d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f7573e != null) {
            return new ByteArrayInputStream(this.f7573e);
        }
        return null;
    }

    public final int b() {
        return this.f7571c;
    }

    public final List c() {
        return DesugarCollections.unmodifiableList(this.f7570b);
    }

    public final int d() {
        return this.f7569a;
    }

    public f(int i10, List list, int i11, InputStream inputStream) {
        this.f7569a = i10;
        this.f7570b = list;
        this.f7571c = i11;
        this.f7572d = inputStream;
        this.f7573e = null;
    }
}
