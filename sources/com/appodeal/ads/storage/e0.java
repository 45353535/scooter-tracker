package com.appodeal.ads.storage;

import com.appodeal.ads.f4;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f14799b = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f14800a = (a0) c0.f14787a.getValue();

    @Override // com.appodeal.ads.storage.c
    public final void a(long j10) {
        this.f14800a.a(j10);
    }

    @Override // com.appodeal.ads.storage.c
    public final int b() {
        return this.f14800a.b();
    }

    @Override // com.appodeal.ads.storage.c
    public final String c() {
        return this.f14800a.c();
    }

    @Override // com.appodeal.ads.storage.c
    public final void d(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f14800a.d(key);
    }

    @Override // com.appodeal.ads.storage.c
    public final Long e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f14800a.e(key);
    }

    public final String f() {
        a0 a0Var = this.f14800a;
        a0Var.getClass();
        return a0Var.c(d.f14788c).getString("sessions_array", null);
    }

    public final void g(String sessionsInfoJsonString) {
        Intrinsics.checkNotNullParameter(sessionsInfoJsonString, "sessionsInfoJsonString");
        this.f14800a.l(sessionsInfoJsonString);
    }

    @Override // com.appodeal.ads.storage.c
    public final void a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f14800a.a(key);
    }

    @Override // com.appodeal.ads.storage.c
    public final Triple b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f14800a.b(key);
    }

    @Override // com.appodeal.ads.storage.c
    public final void c(String userToken) {
        Intrinsics.checkNotNullParameter(userToken, "userToken");
        this.f14800a.c(userToken);
    }

    @Override // com.appodeal.ads.storage.c
    public final void d() {
        this.f14800a.d();
    }

    @Override // com.appodeal.ads.storage.c
    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        return this.f14800a.a(dVar);
    }

    @Override // com.appodeal.ads.storage.c
    public final void b(String key, String jsonString, long j10, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        this.f14800a.b(key, jsonString, j10, i10);
    }

    public final Object c(f4 f4Var) {
        a0 a0Var = this.f14800a;
        Object objG = eg.g.g((kotlinx.coroutines.s) a0Var.f14783a.getValue(), new x(a0Var, null), f4Var);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    public final Object d(String str, f4 f4Var) {
        a0 a0Var = this.f14800a;
        Object objG = eg.g.g((kotlinx.coroutines.s) a0Var.f14783a.getValue(), new n(a0Var, str, null), f4Var);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    @Override // com.appodeal.ads.storage.c
    public final String a() {
        return this.f14800a.a();
    }

    @Override // com.appodeal.ads.storage.c
    public final void a(int i10) {
        this.f14800a.a(i10);
    }

    @Override // com.appodeal.ads.storage.c
    public final void a(String key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f14800a.a(key, j10);
    }
}
