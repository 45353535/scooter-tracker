package com.moloco.sdk.internal.publisher;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes10.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j f55241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.internal.ortb.model.z f55242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f55243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Job f55244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f55245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f55246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f55247g;

    public x(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar, com.moloco.sdk.internal.ortb.model.z zVar, w wVar, Job job, String str, String str2, boolean z10) {
        this.f55241a = jVar;
        this.f55242b = zVar;
        this.f55243c = wVar;
        this.f55244d = job;
        this.f55245e = str;
        this.f55246f = str2;
        this.f55247g = z10;
    }

    public final Job a() {
        return this.f55244d;
    }

    public final void b(com.moloco.sdk.internal.ortb.model.z zVar) {
        this.f55242b = zVar;
    }

    public final void c(w wVar) {
        this.f55243c = wVar;
    }

    public final void d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar) {
        this.f55241a = jVar;
    }

    public final void e(String str) {
        this.f55246f = str;
    }

    public final void f(Job job) {
        this.f55244d = job;
    }

    public final void g(boolean z10) {
        this.f55247g = z10;
    }

    public final w h() {
        return this.f55243c;
    }

    public final void i(String str) {
        this.f55245e = str;
    }

    public final String j() {
        return this.f55246f;
    }

    public final String k() {
        return this.f55245e;
    }

    public final com.moloco.sdk.internal.ortb.model.z l() {
        return this.f55242b;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j m() {
        return this.f55241a;
    }

    public final boolean n() {
        return this.f55247g;
    }

    public /* synthetic */ x(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar, com.moloco.sdk.internal.ortb.model.z zVar, w wVar, Job job, String str, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : jVar, (i10 & 2) != 0 ? null : zVar, (i10 & 4) != 0 ? null : wVar, (i10 & 8) != 0 ? null : job, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? false : z10);
    }
}
