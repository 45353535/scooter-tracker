package yads;

import java.util.LinkedHashMap;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class iy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k92 f112182a;

    public /* synthetic */ iy() {
        this(new k92());
    }

    public final am2 a(c4 c4Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!kotlin.jvm.internal.b1.q(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        k92 k92Var = this.f112182a;
        int i10 = c4Var.f109208o;
        k92Var.getClass();
        linkedHashMap.put("orientation", i10 != 1 ? i10 != 2 ? "undefined" : "landscape" : "portrait");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!kotlin.jvm.internal.b1.q(linkedHashMap2)) {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        linkedHashMap2.put("image_loading_automatically", Boolean.valueOf(c4Var.f109207n));
        return new am2(MapsKt.plus(linkedHashMap, linkedHashMap2), (c) null);
    }

    public iy(k92 k92Var) {
        this.f112182a = k92Var;
    }
}
