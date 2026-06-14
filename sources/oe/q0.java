package oe;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends IOException implements eg.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f96872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f96873c;

    public /* synthetic */ q0(String str, Long l10, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l10, (i10 & 4) != 0 ? null : th2);
    }

    @Override // eg.w
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public q0 d() {
        return new q0(this.f96872b, this.f96873c, getCause());
    }

    public q0(String url, Long l10, Throwable th2) {
        Intrinsics.checkNotNullParameter(url, "url");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request timeout has expired [url=");
        sb2.append(url);
        sb2.append(", request_timeout=");
        sb2.append(l10 == null ? "unknown" : l10);
        sb2.append(" ms]");
        super(sb2.toString(), th2);
        this.f96872b = url;
        this.f96873c = l10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q0(re.d request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String strC = request.i().c();
        x0 x0Var = (x0) request.f(w0.f96943a);
        this(strC, x0Var != null ? x0Var.c() : null, null, 4, null);
    }
}
