package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class R8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W8 f76343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T8 f76344c;

    public R8(W8 w82, int i10) {
        this.f76342a = i10;
        this.f76343b = w82;
    }

    public final void a() {
        T8 t82;
        W8 w82 = this.f76343b;
        w82.getClass();
        try {
            byte[] bArr = w82.f76632c.get("event_hashes");
            if (bArr == null || bArr.length == 0) {
                U8 u82 = w82.f76630a;
                w82.f76631b.getClass();
                B9 b92 = new B9();
                u82.getClass();
                t82 = new T8(b92.f75579a, b92.f75580b, b92.f75581c, CollectionUtils.hashSetFromIntArray(b92.f75582d));
            } else {
                U8 u83 = w82.f76630a;
                B9 state = w82.f76631b.toState(bArr);
                u83.getClass();
                t82 = new T8(state.f75579a, state.f75580b, state.f75581c, CollectionUtils.hashSetFromIntArray(state.f75582d));
            }
        } catch (Throwable unused) {
            U8 u84 = w82.f76630a;
            w82.f76631b.getClass();
            B9 b93 = new B9();
            u84.getClass();
            t82 = new T8(b93.f75579a, b93.f75580b, b93.f75581c, CollectionUtils.hashSetFromIntArray(b93.f75582d));
        }
        this.f76344c = t82;
        int i10 = t82.f76492c;
        int i11 = this.f76342a;
        if (i10 != i11) {
            t82.f76492c = i11;
            t82.f76493d = 0;
            W8 w83 = this.f76343b;
            IBinaryDataHelper iBinaryDataHelper = w83.f76632c;
            V8 v82 = w83.f76631b;
            w83.f76630a.getClass();
            iBinaryDataHelper.insert("event_hashes", v82.toByteArray(U8.a(t82)));
        }
    }
}
