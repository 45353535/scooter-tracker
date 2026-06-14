package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public class dl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f109962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f109965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f109966e;

    public dl1(int i10, long j10, Object obj) {
        this(obj, -1, -1, j10, i10);
    }

    public final boolean a() {
        return this.f109963b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl1)) {
            return false;
        }
        dl1 dl1Var = (dl1) obj;
        return this.f109962a.equals(dl1Var.f109962a) && this.f109963b == dl1Var.f109963b && this.f109964c == dl1Var.f109964c && this.f109965d == dl1Var.f109965d && this.f109966e == dl1Var.f109966e;
    }

    public final int hashCode() {
        return ((((((((this.f109962a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f109963b) * 31) + this.f109964c) * 31) + ((int) this.f109965d)) * 31) + this.f109966e;
    }

    public dl1(Object obj) {
        this(obj, -1L);
    }

    public dl1(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public dl1(Object obj, int i10, int i11, long j10, int i12) {
        this.f109962a = obj;
        this.f109963b = i10;
        this.f109964c = i11;
        this.f109965d = j10;
        this.f109966e = i12;
    }

    public dl1(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public dl1(dl1 dl1Var) {
        this.f109962a = dl1Var.f109962a;
        this.f109963b = dl1Var.f109963b;
        this.f109964c = dl1Var.f109964c;
        this.f109965d = dl1Var.f109965d;
        this.f109966e = dl1Var.f109966e;
    }
}
