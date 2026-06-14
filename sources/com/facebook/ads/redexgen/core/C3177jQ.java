package com.facebook.ads.redexgen.core;

import java.io.File;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3177jQ implements InterfaceC2226Ks<File> {
    @Override // com.facebook.ads.redexgen.core.InterfaceC2226Ks
    public final C2225Kr<File> A3p(File file, LA la2) {
        if (file.exists()) {
            return new C2225Kr<>(true, file);
        }
        return new C2225Kr<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2226Ks
    public final void A55(File file, LA la2) {
    }
}
