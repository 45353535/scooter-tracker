package yads;

import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zr2 implements zn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yn2 f118780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sj3 f118781b;

    public /* synthetic */ zr2(mr1 mr1Var) {
        this(p62.a(mr1Var), new sj3());
    }

    @Override // yads.zn2
    public final Object a(r62 r62Var) {
        this.f118781b.getClass();
        int i10 = r62Var.f115340a;
        sn2 sn2Var = new sn2(r62Var.f115341b);
        Map mapEmptyMap = r62Var.f115342c;
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        return (hr2) this.f118780a.a(new rn2(i10, sn2Var, mapEmptyMap));
    }

    public zr2(yn2 yn2Var, sj3 sj3Var) {
        this.f118780a = yn2Var;
        this.f118781b = sj3Var;
    }
}
