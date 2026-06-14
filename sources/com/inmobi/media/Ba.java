package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Ba extends AbstractC4086ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f36617a;

    public Ba(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f36617a = jsonObject;
    }

    @Override // com.inmobi.media.AbstractC4086ui
    public final void a(vh.f bufferedSink) {
        Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        String string = this.f36617a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        bufferedSink.writeUtf8(string);
    }

    @Override // com.inmobi.media.AbstractC4086ui
    public final String a() {
        return com.ironsource.D5.L;
    }
}
