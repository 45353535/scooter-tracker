package com.inmobi.media;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final class N8 extends kotlin.properties.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O8 f37428a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N8(Df df2, O8 o82) {
        super(df2);
        this.f37428a = o82;
    }

    @Override // kotlin.properties.c
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        Df df2 = (Df) obj2;
        if (Ef.a((Df) obj) == Ef.a(df2)) {
            return;
        }
        Iterator it = this.f37428a.f37484b.iterator();
        while (it.hasNext()) {
            ((Gf) it.next()).a(df2);
        }
    }
}
