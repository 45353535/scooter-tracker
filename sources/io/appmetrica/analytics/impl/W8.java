package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class W8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U8 f76630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V8 f76631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinaryDataHelper f76632c;

    public W8(Context context, X4 x42) {
        this(new V8(), new U8(), C5112g7.a(context).a(x42));
    }

    public W8(V8 v82, U8 u82, IBinaryDataHelper iBinaryDataHelper) {
        this.f76631b = v82;
        this.f76630a = u82;
        this.f76632c = iBinaryDataHelper;
    }
}
