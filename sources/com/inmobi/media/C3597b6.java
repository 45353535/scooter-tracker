package com.inmobi.media;

import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3597b6 implements Ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC3571a6 f38245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vh.h f38246b;

    public C3597b6(String url, EnumC3571a6 errorCode) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f38245a = errorCode;
        this.f38246b = vh.h.f106841f;
    }

    @Override // com.inmobi.media.Ne
    public final Object a() {
        return null;
    }

    @Override // com.inmobi.media.Ne
    public final Ie b() {
        return new Ie(0L, MapsKt.emptyMap(), 0, "");
    }

    @Override // com.inmobi.media.Ne
    public final int c() {
        return this.f38245a.f38169a;
    }

    @Override // com.inmobi.media.Ne
    public final vh.h d() {
        return this.f38246b;
    }

    @Override // com.inmobi.media.Ne
    public final String e() {
        return this.f38245a.name();
    }
}
