package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization("Should be package private once we migrate to Factory pattern")
public interface InterfaceC2002Cb {
    void A5q();

    long A7S();

    void AA3(InterfaceC3432nl interfaceC3432nl, Uri uri, Map<String, List<String>> map, long j10, long j11, GY gy) throws IOException;

    int AGc(C2124Gt c2124Gt) throws IOException;

    void AGr();

    void AIM(long j10, long j11);
}
