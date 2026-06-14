package yads;

import android.net.Uri;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g7 implements xg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx2 f111089a;

    public g7(qx2 qx2Var) {
        this.f111089a = qx2Var;
    }

    @Override // yads.xg0
    public final boolean a(Uri uri) {
        i7 i7Var;
        if (!Intrinsics.areEqual(uri.getHost(), "showNextAd")) {
            return false;
        }
        e7 e7Var = (e7) this.f111089a;
        int i10 = e7Var.f110230m - 1;
        if (i10 == e7Var.f110221d.f108588c && !e7Var.f110231n) {
            e7Var.f110231n = true;
            e7Var.f110219b.b();
        }
        if (e7Var.f110230m < e7Var.f110227j.size()) {
            id1 id1Var = (id1) CollectionsKt.getOrNull(e7Var.f110227j, i10);
            if (id1Var != null) {
                id1Var.b();
            }
            h7 h7Var = (h7) CollectionsKt.getOrNull(e7Var.f110228k, i10);
            if (((h7Var == null || (i7Var = h7Var.f111500b) == null) ? null : i7Var.f111882a) == by2.f109145c) {
                int size = e7Var.f110227j.size() - 1;
                e7Var.f110230m = size;
                Iterator it = e7Var.f110228k.subList(i10, size).iterator();
                long j10 = 0;
                while (it.hasNext()) {
                    j10 += ((h7) it.next()).f111499a;
                }
                e7Var.f110224g.f113910a += j10;
                vv vvVar = e7Var.f110225h;
                vvVar.f117208a += vvVar.f117209b;
                vvVar.f117209b = 0L;
                int i11 = e7Var.f110230m;
                e7Var.f110230m = i11 + 1;
                if (((id1) e7Var.f110227j.get(i11)).a()) {
                    e7Var.a();
                    e7Var.f110226i.a(e7Var.f110222e, e7Var.f110229l, e7Var.f110224g.f113910a);
                } else if (e7Var.f110230m >= e7Var.f110227j.size()) {
                    e7Var.f110220c.e();
                } else {
                    e7Var.b();
                }
            } else {
                e7Var.b();
            }
        }
        return true;
    }
}
