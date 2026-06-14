package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.im, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5178im {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f77439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yo f77440b;

    public C5178im(ProtobufStateStorage protobufStateStorage, yo yoVar) {
        this.f77439a = protobufStateStorage;
        this.f77440b = yoVar;
    }

    public C5178im(Context context) {
        this(((Vm) Tm.a(C5306nm.class)).create(context), C5468ua.k().D().a());
    }
}
