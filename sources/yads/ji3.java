package yads;

import android.content.Context;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ji3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9 f112358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm2 f112359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k92 f112360c;

    public /* synthetic */ ji3(Context context, es2 es2Var) {
        l9 l9Var = new l9();
        pr3 pr3Var = (pr3) es2Var;
        pr3Var.d();
        wr3 wr3Var = wr3.f117545a;
        this(l9Var, ve.a(context, pr3Var.b()), new k92());
    }

    public final void a(hi3 hi3Var, c4 c4Var) {
        lx2 lx2VarA;
        e9 e9Var = c4Var.f109198e;
        am2 am2VarA = e9Var != null ? this.f112358a.a(e9Var) : new am2((Map) null, 3);
        e9 e9Var2 = c4Var.f109198e;
        if (e9Var2 != null) {
            bm2.a(am2VarA, this.f112358a.a(e9Var2));
        }
        am2VarA.b(c4Var.f109196c.f110681a, "ad_unit_id");
        k92 k92Var = this.f112360c;
        int i10 = c4Var.f109208o;
        k92Var.getClass();
        am2VarA.b(i10 != 1 ? i10 != 2 ? "undefined" : "landscape" : "portrait", "orientation");
        mx2 mx2Var = c4Var.f109197d.f114071a;
        am2VarA.a((mx2Var == null || (lx2VarA = mx2Var.a()) == null) ? null : lx2VarA.f113267b, "size_type");
        mx2 mx2Var2 = c4Var.f109197d.f114071a;
        am2VarA.a(mx2Var2 != null ? Integer.valueOf(mx2Var2.getWidth()) : null, "size_info_width");
        mx2 mx2Var3 = c4Var.f109197d.f114071a;
        am2VarA.a(mx2Var3 != null ? Integer.valueOf(mx2Var3.getHeight()) : null, "size_info_height");
        am2VarA.b(Integer.valueOf(hi3Var.f111599a.f111224a), "view_width");
        am2VarA.b(Integer.valueOf(hi3Var.f111599a.f111225b), "view_height");
        am2VarA.a(hi3Var.f111600b.f113046a, "layout_width");
        am2VarA.a(hi3Var.f111600b.f113047b, "layout_height");
        am2VarA.b(Integer.valueOf(hi3Var.f111601c.f117816a.f118183a), "measured_width");
        String strName = hi3Var.f111601c.f117816a.f118184b.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        am2VarA.b(lowerCase, "measured_width_mode");
        am2VarA.b(Integer.valueOf(hi3Var.f111601c.f117817b.f118183a), "measured_height");
        String lowerCase2 = hi3Var.f111601c.f117817b.f118184b.name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        am2VarA.b(lowerCase2, "measured_height_mode");
        xl2 xl2Var = xl2.f117866c;
        this.f112359b.a(new zl2("ad_view_size_info", MapsKt.toMutableMap(am2VarA.f108722a), am2VarA.f108723b));
    }

    public ji3(l9 l9Var, dm2 dm2Var, k92 k92Var) {
        this.f112358a = l9Var;
        this.f112359b = dm2Var;
        this.f112360c = k92Var;
    }
}
