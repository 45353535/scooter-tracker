package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Ih implements InterfaceC4022s4 {
    @Override // com.inmobi.media.InterfaceC4022s4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Jb jb2 = Jh.f37149b;
        if (jb2 != null) {
            jb2.f37129g.set(true);
        }
        Jh.f37149b = null;
        AbstractC3790il.a(new Hh(null));
    }
}
