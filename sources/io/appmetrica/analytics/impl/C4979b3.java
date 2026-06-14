package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4979b3 implements IBinaryDataHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinaryDataHelper f76878a;

    public C4979b3(IBinaryDataHelper iBinaryDataHelper) {
        this.f76878a = iBinaryDataHelper;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final byte[] get(String str) {
        return this.f76878a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void insert(String str, byte[] bArr) {
        this.f76878a.insert(str, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void remove(String str) {
        this.f76878a.remove(str);
    }
}
