package yads;

import java.util.HashMap;
import java.util.List;
import kotlin.collections.MapsKt;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes4.dex */
public final class pz1 implements an2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9 f114815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f114816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tz1 f114817c;

    public /* synthetic */ pz1() {
        this(new j32(), new tz1());
    }

    @Override // yads.an2
    public final zl2 a(Object obj) {
        c4 c4Var = (c4) obj;
        am2 am2Var = new am2(new HashMap(), 2);
        e9 e9Var = c4Var.f109198e;
        if (e9Var != null) {
            am2Var = bm2.a(am2Var, this.f114815a.a(e9Var));
        }
        am2Var.b(c4Var.f109196c.f110681a, "ad_unit_id");
        am2Var.b(c4Var.f109194a.f115230b, "ad_type");
        mx2 mx2Var = c4Var.f109197d.f114071a;
        if (mx2Var != null) {
            am2Var.b(mx2Var.a().f113267b, "size_type");
        }
        am2Var.b(Boolean.valueOf(c4Var.f109201h == d83.f109837c), "is_passback");
        am2Var.b(Boolean.valueOf(c4Var.f109207n), "image_loading_automatically");
        List list = c4Var.f109195b.f108852c;
        if (!list.isEmpty()) {
            am2Var.b(list, "image_sizes");
        }
        xl2 xl2Var = xl2.f117866c;
        return new zl2(Reporting.Key.AD_REQUEST, MapsKt.toMutableMap(am2Var.f108722a), am2Var.f108723b);
    }

    public pz1(j32 j32Var, tz1 tz1Var) {
        this.f114815a = new l9();
        this.f114816b = new v9(j32Var);
        this.f114817c = tz1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    @Override // yads.an2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.zl2 a(yads.qn2 r5, int r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.pz1.a(yads.qn2, int, java.lang.Object):yads.zl2");
    }
}
