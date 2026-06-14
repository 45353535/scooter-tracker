package nh;

import hh.c0;
import hh.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f96166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f96167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vh.g f96168d;

    public h(String str, long j10, vh.g source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f96166b = str;
        this.f96167c = j10;
        this.f96168d = source;
    }

    @Override // hh.c0
    public long contentLength() {
        return this.f96167c;
    }

    @Override // hh.c0
    public w contentType() {
        String str = this.f96166b;
        if (str != null) {
            return w.f73770e.b(str);
        }
        return null;
    }

    @Override // hh.c0
    public vh.g source() {
        return this.f96168d;
    }
}
