package com.my.tracker.obfuscated;

import j$.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class z0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z0 f61984g = new z0(-1, 0.0d, 0.0d, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f61986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f61987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f61988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f61989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f61990f;

    public z0(int i10, double d10, double d11, float f10, float f11, long j10) {
        this.f61985a = i10;
        this.f61986b = d10;
        this.f61987c = d11;
        this.f61988d = f10;
        this.f61989e = f11;
        this.f61990f = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            z0 z0Var = (z0) obj;
            if (this.f61985a == z0Var.f61985a && Double.compare(z0Var.f61986b, this.f61986b) == 0 && Double.compare(z0Var.f61987c, this.f61987c) == 0 && Float.compare(z0Var.f61988d, this.f61988d) == 0 && Float.compare(z0Var.f61989e, this.f61989e) == 0 && this.f61990f == z0Var.f61990f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f61985a), Double.valueOf(this.f61986b), Double.valueOf(this.f61987c), Float.valueOf(this.f61988d), Float.valueOf(this.f61989e), Long.valueOf(this.f61990f));
    }
}
