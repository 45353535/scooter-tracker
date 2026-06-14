package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ym1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f118299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qn1 f118300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dn1 f118301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sm1 f118302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f118303e;

    public ym1(List list, qn1 qn1Var, dn1 dn1Var, sm1 sm1Var) {
        this.f118299a = list;
        this.f118300b = qn1Var;
        this.f118301c = dn1Var;
        this.f118302d = sm1Var;
    }

    public final om1 a(Context context, Class cls) {
        while (this.f118303e < this.f118299a.size()) {
            List list = this.f118299a;
            int i10 = this.f118303e;
            this.f118303e = i10 + 1;
            this.f118301c.a(context, (cp1) list.get(i10), cls);
        }
        return null;
    }

    public /* synthetic */ ym1(List list, qn1 qn1Var, jn1 jn1Var) {
        this(list, qn1Var, new dn1(jn1Var), new sm1());
    }
}
