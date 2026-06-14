package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class e7 implements bx0, qx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f110218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2 f110219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wy f110220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a7 f110221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExtendedNativeAdView f110222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s2 f110223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nh2 f110224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vv f110225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final po2 f110226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f110227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f110228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f110229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f110230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f110231n;

    public e7(Context context, jz1 jz1Var, l00 l00Var, dp2 dp2Var, ArrayList arrayList, oh0 oh0Var, ViewGroup viewGroup, t2 t2Var, wy wyVar, jd1 jd1Var, a7 a7Var, ExtendedNativeAdView extendedNativeAdView, s2 s2Var, nh2 nh2Var, vv vvVar, po2 po2Var) {
        this.f110218a = viewGroup;
        this.f110219b = t2Var;
        this.f110220c = wyVar;
        this.f110221d = a7Var;
        this.f110222e = extendedNativeAdView;
        this.f110223f = s2Var;
        this.f110224g = nh2Var;
        this.f110225h = vvVar;
        this.f110226i = po2Var;
        List listA = a7Var.a();
        this.f110228k = listA;
        Iterator it = listA.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((h7) it.next()).a();
        }
        this.f110229l = jA;
        this.f110227j = jd1Var.a(context, this.f110222e, jz1Var, l00Var, new d7(this), dp2Var, this.f110224g, new g7(this), arrayList, oh0Var, this.f110221d, this.f110225h);
    }

    public final void a() {
        this.f110218a.setContentDescription("pageIndex: " + this.f110230m);
    }

    public final void b() {
        h7 h7Var = (h7) CollectionsKt.getOrNull(this.f110228k, this.f110230m - 1);
        long j10 = h7Var != null ? h7Var.f111499a : 0L;
        this.f110224g.f113910a += j10;
        vv vvVar = this.f110225h;
        vvVar.f117208a += vvVar.f117209b;
        vvVar.f117209b = 0L;
        if (this.f110230m < this.f110227j.size()) {
            int i10 = this.f110230m;
            this.f110230m = i10 + 1;
            if (!((id1) this.f110227j.get(i10)).a()) {
                d();
            } else {
                a();
                this.f110226i.a(this.f110222e, this.f110229l, this.f110224g.f113910a);
            }
        }
    }

    @Override // yads.bx0
    public final void c() {
        ViewGroup viewGroup = this.f110218a;
        ExtendedNativeAdView extendedNativeAdView = this.f110222e;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        viewGroup.removeAllViews();
        viewGroup.addView(extendedNativeAdView, layoutParams);
        s2 s2Var = this.f110223f;
        ExtendedNativeAdView extendedNativeAdView2 = this.f110222e;
        s2Var.getClass();
        try {
            if (s2Var.f115667a instanceof i12) {
                e02 e02VarA = s2Var.f115671e.a(extendedNativeAdView2, s2Var.f115670d);
                i12 i12Var = (i12) s2Var.f115667a;
                i12Var.getClass();
                View view = e02VarA.f110133c;
                m02 m02Var = new m02(e02VarA);
                hg2 hg2Var = i12Var.Q;
                su.f115947a.getClass();
                i12Var.a(view, hg2Var, m02Var, ru.f115596b);
                ((i12) s2Var.f115667a).b(s2Var.f115669c);
            }
            this.f110230m = 1;
            this.f110231n = false;
            id1 id1Var = (id1) CollectionsKt.firstOrNull((List) this.f110227j);
            if (id1Var != null && id1Var.a()) {
                a();
                this.f110226i.a(this.f110222e, this.f110229l, this.f110224g.f113910a);
            } else if (this.f110230m >= this.f110227j.size()) {
                this.f110220c.e();
            } else {
                b();
            }
        } catch (wy1 unused) {
            s2Var.f115668b.e();
        }
    }

    public final void d() {
        if (this.f110230m >= this.f110227j.size()) {
            this.f110220c.e();
        } else {
            b();
        }
    }

    @Override // yads.bx0
    public final void invalidate() {
        Iterator it = this.f110227j.iterator();
        while (it.hasNext()) {
            ((id1) it.next()).b();
        }
        jz1 jz1Var = this.f110223f.f115667a;
        if (jz1Var instanceof i12) {
            ((i12) jz1Var).b((l00) null);
        }
    }
}
