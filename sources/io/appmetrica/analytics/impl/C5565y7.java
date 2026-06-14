package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5565y7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5540x7 f78575a;

    public C5565y7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final byte[] a(@NotNull C5590z7 c5590z7) {
        return MessageNano.toByteArray(this.f78575a.fromModel(c5590z7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f78575a.fromModel((C5590z7) obj));
    }

    public C5565y7(@NotNull C5540x7 c5540x7) {
        this.f78575a = c5540x7;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f A[Catch: InvalidProtocolBufferNanoException -> 0x0015, TRY_LEAVE, TryCatch #0 {InvalidProtocolBufferNanoException -> 0x0015, blocks: (B:3:0x0002, B:5:0x000f), top: B:10:0x0002 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C5590z7 toModel(@org.jetbrains.annotations.Nullable byte[] r2) {
        /*
            r1 = this;
            if (r2 == 0) goto Lf
            io.appmetrica.analytics.impl.w7 r0 = new io.appmetrica.analytics.impl.w7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r0.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.protobuf.nano.MessageNano r2 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r0, r2)     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.impl.w7 r2 = (io.appmetrica.analytics.impl.C5515w7) r2     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            if (r2 != 0) goto L1a
        Lf:
            io.appmetrica.analytics.impl.w7 r2 = new io.appmetrica.analytics.impl.w7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r2.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            goto L1a
        L15:
            io.appmetrica.analytics.impl.w7 r2 = new io.appmetrica.analytics.impl.w7
            r2.<init>()
        L1a:
            io.appmetrica.analytics.impl.x7 r0 = r1.f78575a
            io.appmetrica.analytics.impl.z7 r2 = r0.toModel(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5565y7.toModel(byte[]):io.appmetrica.analytics.impl.z7");
    }

    public /* synthetic */ C5565y7(C5540x7 c5540x7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C5540x7(null, 1, null) : c5540x7);
    }
}
