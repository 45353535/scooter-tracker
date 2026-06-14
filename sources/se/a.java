package se;

import cf.GMTDate;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import re.h;
import ve.b0;
import ve.c0;
import ve.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final je.b f100006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineContext f100007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c0 f100008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0 f100009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final GMTDate f100010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final GMTDate f100011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.ktor.utils.io.e f100012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o f100013i;

    public a(je.b call, h responseData) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        this.f100006b = call;
        this.f100007c = responseData.b();
        this.f100008d = responseData.f();
        this.f100009e = responseData.g();
        this.f100010f = responseData.d();
        this.f100011g = responseData.e();
        Object objA = responseData.a();
        io.ktor.utils.io.e eVar = objA instanceof io.ktor.utils.io.e ? (io.ktor.utils.io.e) objA : null;
        this.f100012h = eVar == null ? io.ktor.utils.io.e.f82096a.a() : eVar;
        this.f100013i = responseData.c();
    }

    @Override // se.c
    public io.ktor.utils.io.e a() {
        return this.f100012h;
    }

    @Override // se.c
    public GMTDate b() {
        return this.f100010f;
    }

    @Override // se.c
    public GMTDate c() {
        return this.f100011g;
    }

    @Override // se.c
    public c0 d() {
        return this.f100008d;
    }

    @Override // se.c
    public b0 e() {
        return this.f100009e;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f100007c;
    }

    @Override // ve.w
    public o getHeaders() {
        return this.f100013i;
    }

    @Override // se.c
    public je.b p() {
        return this.f100006b;
    }
}
