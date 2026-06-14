package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: com.inmobi.media.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3564a extends R0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f38136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3564a(byte[] response, long j10, C3903n9 c3903n9) {
        super(c3903n9);
        Intrinsics.checkNotNullParameter(response, "response");
        this.f38136b = response;
        this.f38137c = j10;
    }

    @Override // com.inmobi.media.R0
    public final Unit a(AdResponse adResponse, Function1 function1) {
        C3903n9 c3903n9 = this.f37625a;
        if (c3903n9 != null) {
            c3903n9.a("ABAdResponseManager", "Instance PLId: " + this.f38137c + ", Response PLId: " + adResponse.getPlacementId());
        }
        V0.a(adResponse, this.f37625a, function1);
        return Unit.f93236a;
    }

    @Override // com.inmobi.media.R0
    public final Object a(Continuation continuation) {
        return new String(this.f38136b, Charsets.UTF_8);
    }
}
