package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4046t3 implements InterfaceC3847l3 {
    @Override // com.inmobi.media.InterfaceC3847l3
    public final void a(S2 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        C4121w3 c4121w3 = C4121w3.f39816a;
        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
        String str = click.f37685b;
        LinkedHashMap linkedHashMap = C4121w3.f39825j;
        C3565a0 c3565a0 = (C3565a0) linkedHashMap.get(Integer.valueOf(click.f37684a));
        if (c3565a0 != null) {
            Intrinsics.checkNotNullParameter(click, "click");
            c3565a0.f38138a.a(c3565a0.f38139b);
        }
        linkedHashMap.remove(Integer.valueOf(click.f37684a));
        eg.h.b(null, new C4021s3(click, null), 1, null);
    }

    @Override // com.inmobi.media.InterfaceC3847l3
    public final void a(S2 click, EnumC3571a6 errorCode) {
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        C4121w3 c4121w3 = C4121w3.f39816a;
        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
        String str = click.f37685b;
        if (click.f37689f == 0) {
            C4121w3.a(click, errorCode.name());
        }
        C4121w3.b(click);
        C4121w3.f();
    }
}
