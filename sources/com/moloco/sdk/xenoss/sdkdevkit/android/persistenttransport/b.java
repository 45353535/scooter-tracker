package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f58942b;

    public b(e delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f58942b = delegate;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f58942b.a(url);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public void a(String url, byte[] body, ve.g contentType, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        e.a.a(this.f58942b, url, body, contentType, null, 8, null);
    }
}
