package yads;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class ik1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f112033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f112034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b41 f112035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f112036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f112037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f112038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y31 f112039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f112040h;

    public ik1(hk1 hk1Var) {
        fi.b((hk1Var.f111621f && hk1Var.f111617b == null) ? false : true);
        this.f112033a = (UUID) fi.a(hk1Var.f111616a);
        this.f112034b = hk1Var.f111617b;
        this.f112035c = hk1Var.f111618c;
        this.f112036d = hk1Var.f111619d;
        this.f112038f = hk1Var.f111621f;
        this.f112037e = hk1Var.f111620e;
        this.f112039g = hk1Var.f111622g;
        byte[] bArr = hk1Var.f111623h;
        this.f112040h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final byte[] a() {
        byte[] bArr = this.f112040h;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik1)) {
            return false;
        }
        ik1 ik1Var = (ik1) obj;
        return this.f112033a.equals(ik1Var.f112033a) && w83.a(this.f112034b, ik1Var.f112034b) && w83.a(this.f112035c, ik1Var.f112035c) && this.f112036d == ik1Var.f112036d && this.f112038f == ik1Var.f112038f && this.f112037e == ik1Var.f112037e && this.f112039g.equals(ik1Var.f112039g) && Arrays.equals(this.f112040h, ik1Var.f112040h);
    }

    public final int hashCode() {
        int iHashCode = this.f112033a.hashCode() * 31;
        Uri uri = this.f112034b;
        return Arrays.hashCode(this.f112040h) + ((this.f112039g.hashCode() + ((((((((yv2.a(this.f112035c.entrySet()) + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f112036d ? 1 : 0)) * 31) + (this.f112038f ? 1 : 0)) * 31) + (this.f112037e ? 1 : 0)) * 31)) * 31);
    }
}
