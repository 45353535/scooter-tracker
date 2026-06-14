package je;

import cf.GMTDate;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ve.b0;
import ve.c0;
import ve.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends se.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f85844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f85845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c0 f85846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0 f85847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final GMTDate f85848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final GMTDate f85849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o f85850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CoroutineContext f85851i;

    public g(e call, byte[] body, se.c origin) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f85844b = call;
        this.f85845c = body;
        this.f85846d = origin.d();
        this.f85847e = origin.e();
        this.f85848f = origin.b();
        this.f85849g = origin.c();
        this.f85850h = origin.getHeaders();
        this.f85851i = origin.getCoroutineContext();
    }

    @Override // se.c
    public io.ktor.utils.io.e a() {
        return io.ktor.utils.io.b.c(this.f85845c, 0, 0, 6, null);
    }

    @Override // se.c
    public GMTDate b() {
        return this.f85848f;
    }

    @Override // se.c
    public GMTDate c() {
        return this.f85849g;
    }

    @Override // se.c
    public c0 d() {
        return this.f85846d;
    }

    @Override // se.c
    public b0 e() {
        return this.f85847e;
    }

    @Override // se.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e p() {
        return this.f85844b;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f85851i;
    }

    @Override // ve.w
    public o getHeaders() {
        return this.f85850h;
    }
}
