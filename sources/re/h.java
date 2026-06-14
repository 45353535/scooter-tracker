package re;

import cf.GMTDate;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ve.b0;
import ve.c0;
import ve.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f99447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GMTDate f99448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f99449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b0 f99450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f99451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CoroutineContext f99452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final GMTDate f99453g;

    public h(c0 statusCode, GMTDate requestTime, o headers, b0 version, Object body, CoroutineContext callContext) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(requestTime, "requestTime");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        this.f99447a = statusCode;
        this.f99448b = requestTime;
        this.f99449c = headers;
        this.f99450d = version;
        this.f99451e = body;
        this.f99452f = callContext;
        this.f99453g = cf.a.b(null, 1, null);
    }

    public final Object a() {
        return this.f99451e;
    }

    public final CoroutineContext b() {
        return this.f99452f;
    }

    public final o c() {
        return this.f99449c;
    }

    public final GMTDate d() {
        return this.f99448b;
    }

    public final GMTDate e() {
        return this.f99453g;
    }

    public final c0 f() {
        return this.f99447a;
    }

    public final b0 g() {
        return this.f99450d;
    }

    public String toString() {
        return "HttpResponseData=(statusCode=" + this.f99447a + ')';
    }
}
