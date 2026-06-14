package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.InterfaceC2062Ej;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC2059Eg<T extends InterfaceC2062Ej> {
    void ADx(T t10, long j10, long j11, boolean z10);

    void ADz(T t10, long j10, long j11);

    C2060Eh AE0(T t10, long j10, long j11, IOException iOException, int i10);

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "For Media3 Migration Backward Compatibility")
    void AE3(T t10, long j10, long j11, int i10);
}
