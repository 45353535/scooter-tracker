package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class J2 implements ExternalAttribution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H9 f75984a;

    public J2(@NotNull H9 h92) {
        this.f75984a = h92;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    @NotNull
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f75984a);
    }

    @NotNull
    public final String toString() {
        return "ExternalAttribution(type=`" + R9.a(this.f75984a.f75853a) + "`value=`" + new String(this.f75984a.f75854b, Charsets.UTF_8) + "`)";
    }
}
