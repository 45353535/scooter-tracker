package com.facebook;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f20001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GraphRequest f20002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f20003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f20004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f20005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f20006f;

    public j0(Handler handler, GraphRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f20001a = handler;
        this.f20002b = request;
        this.f20003c = s.y();
    }

    public final void a(long j10) {
        long j11 = this.f20004d + j10;
        this.f20004d = j11;
        if (j11 >= this.f20005e + this.f20003c || j11 >= this.f20006f) {
            c();
        }
    }

    public final void b(long j10) {
        this.f20006f += j10;
    }

    public final void c() {
        if (this.f20004d > this.f20005e) {
            this.f20002b.o();
        }
    }
}
