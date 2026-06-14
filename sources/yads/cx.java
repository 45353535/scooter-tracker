package yads;

import java.util.LinkedHashMap;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class cx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vn2 f109629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l9 f109630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iy f109631c;

    public /* synthetic */ cx() {
        this(new vn2(), new l9(), new iy());
    }

    public final am2 a(t9 t9Var, c4 c4Var) {
        am2 am2VarB = this.f109629a.b(t9Var, c4Var);
        am2 am2VarA = this.f109630b.a(c4Var.f109198e);
        iy iyVar = this.f109631c;
        iyVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!kotlin.jvm.internal.b1.q(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        k92 k92Var = iyVar.f112182a;
        int i10 = c4Var.f109208o;
        k92Var.getClass();
        linkedHashMap.put("orientation", i10 != 1 ? i10 != 2 ? "undefined" : "landscape" : "portrait");
        am2 am2VarA2 = bm2.a(am2VarB, am2VarA);
        c cVar = am2VarA2.f108723b;
        return new am2(MapsKt.plus(am2VarA2.f108722a, linkedHashMap), cVar != null ? cVar : null);
    }

    public cx(vn2 vn2Var, l9 l9Var, iy iyVar) {
        this.f109629a = vn2Var;
        this.f109630b = l9Var;
        this.f109631c = iyVar;
    }
}
