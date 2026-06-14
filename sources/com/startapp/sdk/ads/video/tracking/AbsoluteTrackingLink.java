package com.startapp.sdk.ads.video.tracking;

import com.startapp.json.TypeClassInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
@TypeClassInfo(extendsClass = true)
public class AbsoluteTrackingLink extends VideoTrackingLink implements Serializable {
    private static final long serialVersionUID = 6710863919461399416L;
    private int videoOffsetMillis;

    public final void a(int i10) {
        this.videoOffsetMillis = i10;
    }

    public final int g() {
        return this.videoOffsetMillis;
    }
}
