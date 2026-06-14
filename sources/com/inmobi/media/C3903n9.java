package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3903n9 implements InterfaceC3878m9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Gh f39085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mj f39086b;

    public C3903n9(Context context, double d10, Ab logLevel, boolean z10, int i10, long j10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.f39086b = new Mj();
        if (z10) {
            return;
        }
        Gh gh2 = new Gh(context, d10, logLevel, j10, i10);
        this.f39085a = gh2;
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f37360a;
        Intrinsics.checkNotNull(gh2);
        Lb.b(gh2);
    }

    public final void a(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Gh gh2 = this.f39085a;
        if (gh2 != null) {
            gh2.a(Ab.f36562b, tag, message);
        }
        if (this.f39086b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public final void b(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Gh gh2 = this.f39085a;
        if (gh2 != null) {
            gh2.a(Ab.f36563c, tag, message);
        }
        if (this.f39086b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public final void c(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Gh gh2 = this.f39085a;
        if (gh2 != null) {
            gh2.a(Ab.f36561a, tag, message);
        }
        if (this.f39086b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public final void d(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Gh gh2 = this.f39085a;
        if (gh2 != null) {
            gh2.a(Ab.f36564d, tag, message);
        }
        if (this.f39086b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter("STATE_CHANGE: " + message, "message");
        }
    }

    public final void a(String tag, String message, Exception error) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        Gh gh2 = this.f39085a;
        if (gh2 != null) {
            gh2.a(Ab.f36563c, tag, message + "\nError: " + lf.c.b(error));
        }
        if (this.f39086b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    public final void a(boolean z10) {
        Gh gh2 = this.f39085a;
        if (gh2 != null) {
            gh2.b(z10);
        }
        if (z10) {
            return;
        }
        Gh gh3 = this.f39085a;
        if (gh3 == null || !gh3.f36947f.a()) {
            CopyOnWriteArrayList copyOnWriteArrayList = Mb.f37360a;
            Lb.a(this.f39085a);
            this.f39085a = null;
        }
    }

    public final void a() {
        Gh gh2 = this.f39085a;
        if (gh2 != null) {
            gh2.b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f37360a;
        Lb.a(this.f39085a);
    }
}
