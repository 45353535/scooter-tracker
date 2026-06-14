package yads;

import android.graphics.Bitmap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class f21 implements u21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h21 f110583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f110584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d21 f110585c;

    public f21(h21 h21Var, String str, g21 g21Var) {
        this.f110583a = h21Var;
        this.f110584b = str;
        this.f110585c = g21Var;
    }

    @Override // yads.on2
    public final void a(oj3 oj3Var) {
    }

    @Override // yads.u21
    public final void a(t21 t21Var, boolean z10) {
        Bitmap bitmap = t21Var.f116034a;
        if (bitmap != null) {
            h21 h21Var = this.f110583a;
            String str = this.f110584b;
            d21 d21Var = this.f110585c;
            hg2 hg2Var = h21Var.f111445b;
            hg2Var.f111585b.putAll(MapsKt.mapOf(TuplesKt.to(str, bitmap)));
            ((g21) d21Var).a(bitmap);
        }
    }
}
