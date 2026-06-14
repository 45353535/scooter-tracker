package yads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class p20 implements ot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f114526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f114527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f114528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f114529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f114530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f114531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f114532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f114533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v83 f114534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mv2 f114535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f114536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final yg2 f114537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f114538m;

    public p20(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, yg2 yg2Var, v83 v83Var, mv2 mv2Var, Uri uri, ArrayList arrayList) {
        this.f114526a = j10;
        this.f114527b = j11;
        this.f114528c = j12;
        this.f114529d = z10;
        this.f114530e = j13;
        this.f114531f = j14;
        this.f114532g = j15;
        this.f114533h = j16;
        this.f114537l = yg2Var;
        this.f114534i = v83Var;
        this.f114536k = uri;
        this.f114535j = mv2Var;
        this.f114538m = arrayList;
    }

    public final sa2 a(int i10) {
        return (sa2) this.f114538m.get(i10);
    }

    public final long b(int i10) {
        long j10;
        long j11;
        if (i10 == this.f114538m.size() - 1) {
            j10 = this.f114527b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((sa2) this.f114538m.get(i10)).f115731b;
        } else {
            j10 = ((sa2) this.f114538m.get(i10 + 1)).f115731b;
            j11 = ((sa2) this.f114538m.get(i10)).f115731b;
        }
        return j10 - j11;
    }

    public final long c(int i10) {
        return w83.a(b(i10));
    }
}
