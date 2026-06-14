package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5540x7 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5422se f78551a;

    public C5540x7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5515w7 fromModel(@NotNull C5590z7 c5590z7) {
        C5515w7 c5515w7 = new C5515w7();
        Long l10 = c5590z7.f78606a;
        if (l10 != null) {
            c5515w7.f78489a = l10.longValue();
        }
        Long l11 = c5590z7.f78607b;
        if (l11 != null) {
            c5515w7.f78490b = l11.longValue();
        }
        Boolean bool = c5590z7.f78608c;
        if (bool != null) {
            c5515w7.f78491c = this.f78551a.fromModel(bool).intValue();
        }
        return c5515w7;
    }

    public C5540x7(@NotNull C5422se c5422se) {
        this.f78551a = c5422se;
    }

    public /* synthetic */ C5540x7(C5422se c5422se, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C5422se() : c5422se);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5590z7 toModel(@NotNull C5515w7 c5515w7) {
        C5515w7 c5515w72 = new C5515w7();
        long j10 = c5515w7.f78489a;
        Long lValueOf = Long.valueOf(j10);
        if (j10 == c5515w72.f78489a) {
            lValueOf = null;
        }
        long j11 = c5515w7.f78490b;
        return new C5590z7(lValueOf, j11 != c5515w72.f78490b ? Long.valueOf(j11) : null, this.f78551a.a(c5515w7.f78491c));
    }
}
