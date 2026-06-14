package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Y6 extends AbstractC4086ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f38025a;

    public Y6(HashMap payload, int i10) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f38025a = payload;
    }

    @Override // com.inmobi.media.AbstractC4086ui
    public final void a(vh.f bufferedSink) {
        Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        bufferedSink.writeUtf8(F3.a(this.f38025a));
    }

    @Override // com.inmobi.media.AbstractC4086ui
    public final String a() {
        return ShareTarget.ENCODING_TYPE_URL_ENCODED;
    }

    public Y6(HashMap payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f38025a = payload;
    }
}
