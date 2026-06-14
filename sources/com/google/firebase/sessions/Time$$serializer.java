package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import ug.z;
import yg.i1;
import yg.i2;
import yg.o0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/Time.$serializer", "Lyg/o0;", "Lcom/google/firebase/sessions/Time;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/google/firebase/sessions/Time;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/google/firebase/sessions/Time;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class Time$$serializer implements o0 {

    @NotNull
    public static final Time$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Time$$serializer time$$serializer = new Time$$serializer();
        INSTANCE = time$$serializer;
        i2 i2Var = new i2("com.google.firebase.sessions.Time", time$$serializer, 3);
        i2Var.n("ms", false);
        i2Var.n("us", true);
        i2Var.n("seconds", true);
        descriptor = i2Var;
    }

    private Time$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public final KSerializer[] childSerializers() {
        i1 i1Var = i1.f118988a;
        return new KSerializer[]{i1Var, i1Var, i1Var};
    }

    @Override // ug.c
    @NotNull
    public final Time deserialize(@NotNull Decoder decoder) {
        int i10;
        long jE;
        long j10;
        long j11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        xg.d dVarB = decoder.b(serialDescriptor);
        if (dVarB.j()) {
            long jE2 = dVarB.e(serialDescriptor, 0);
            long jE3 = dVarB.e(serialDescriptor, 1);
            jE = dVarB.e(serialDescriptor, 2);
            i10 = 7;
            j10 = jE2;
            j11 = jE3;
        } else {
            long jE4 = 0;
            boolean z10 = true;
            int i11 = 0;
            long jE5 = 0;
            long jE6 = 0;
            while (z10) {
                int iX = dVarB.x(serialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    jE5 = dVarB.e(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    jE6 = dVarB.e(serialDescriptor, 1);
                    i11 |= 2;
                } else {
                    if (iX != 2) {
                        throw new z(iX);
                    }
                    jE4 = dVarB.e(serialDescriptor, 2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            jE = jE4;
            j10 = jE5;
            j11 = jE6;
        }
        dVarB.c(serialDescriptor);
        return new Time(i10, j10, j11, jE, null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public final void serialize(@NotNull Encoder encoder, @NotNull Time value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        xg.f fVarB = encoder.b(serialDescriptor);
        Time.write$Self$com_google_firebase_firebase_sessions(value, fVarB, serialDescriptor);
        fVarB.c(serialDescriptor);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
