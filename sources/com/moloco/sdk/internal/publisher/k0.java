package com.moloco.sdk.internal.publisher;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u f54785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.internal.ortb.model.z f54786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f54787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Job f54788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s0 f54789e;

    public k0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar, com.moloco.sdk.internal.ortb.model.z zVar, w wVar, Job job, s0 s0Var) {
        this.f54785a = uVar;
        this.f54786b = zVar;
        this.f54787c = wVar;
        this.f54788d = job;
        this.f54789e = s0Var;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u a() {
        return this.f54785a;
    }

    public final void b(com.moloco.sdk.internal.ortb.model.z zVar) {
        this.f54786b = zVar;
    }

    public final void c(w wVar) {
        this.f54787c = wVar;
    }

    public final void d(s0 s0Var) {
        this.f54789e = s0Var;
    }

    public final void e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar) {
        this.f54785a = uVar;
    }

    public final void f(Job job) {
        this.f54788d = job;
    }

    public final Job g() {
        return this.f54788d;
    }

    public final w h() {
        return this.f54787c;
    }

    public final s0 i() {
        return this.f54789e;
    }

    public final com.moloco.sdk.internal.ortb.model.z j() {
        return this.f54786b;
    }

    public /* synthetic */ k0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar, com.moloco.sdk.internal.ortb.model.z zVar, w wVar, Job job, s0 s0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : uVar, (i10 & 2) != 0 ? null : zVar, (i10 & 4) != 0 ? null : wVar, (i10 & 8) != 0 ? null : job, (i10 & 16) != 0 ? null : s0Var);
    }
}
