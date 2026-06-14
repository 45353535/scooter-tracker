package com.moloco.sdk.internal.ortb.model;

import android.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.e;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f54501a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SerialDescriptor f54502b = wg.k.b("Color", e.i.f107986a);

    public long a(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return ColorKt.Color(Color.parseColor(decoder.q()));
    }

    public void b(Encoder encoder, long j10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        throw new lf.n("Color encoding is not supported");
    }

    @Override // ug.c
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return androidx.compose.ui.graphics.Color.m1594boximpl(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return f54502b;
    }

    @Override // ug.n
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, ((androidx.compose.ui.graphics.Color) obj).m1614unboximpl());
    }
}
