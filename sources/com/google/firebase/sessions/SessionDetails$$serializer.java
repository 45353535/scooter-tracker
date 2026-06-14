package com.google.firebase.sessions;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
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
import yg.x0;
import yg.y2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/SessionDetails.$serializer", "Lyg/o0;", "Lcom/google/firebase/sessions/SessionDetails;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/google/firebase/sessions/SessionDetails;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/google/firebase/sessions/SessionDetails;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class SessionDetails$$serializer implements o0 {

    @NotNull
    public static final SessionDetails$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SessionDetails$$serializer sessionDetails$$serializer = new SessionDetails$$serializer();
        INSTANCE = sessionDetails$$serializer;
        i2 i2Var = new i2("com.google.firebase.sessions.SessionDetails", sessionDetails$$serializer, 4);
        i2Var.n(JsonStorageKeyNames.SESSION_ID_KEY, false);
        i2Var.n("firstSessionId", false);
        i2Var.n("sessionIndex", false);
        i2Var.n("sessionStartTimestampUs", false);
        descriptor = i2Var;
    }

    private SessionDetails$$serializer() {
    }

    @Override // yg.o0
    @NotNull
    public final KSerializer[] childSerializers() {
        y2 y2Var = y2.f119104a;
        return new KSerializer[]{y2Var, y2Var, x0.f119093a, i1.f118988a};
    }

    @Override // ug.c
    @NotNull
    public final SessionDetails deserialize(@NotNull Decoder decoder) {
        String strI;
        int i10;
        int iF;
        String str;
        long jE;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        xg.d dVarB = decoder.b(serialDescriptor);
        if (dVarB.j()) {
            strI = dVarB.i(serialDescriptor, 0);
            String strI2 = dVarB.i(serialDescriptor, 1);
            i10 = 15;
            iF = dVarB.f(serialDescriptor, 2);
            str = strI2;
            jE = dVarB.e(serialDescriptor, 3);
        } else {
            strI = null;
            String strI3 = null;
            boolean z10 = true;
            long jE2 = 0;
            int i11 = 0;
            int iF2 = 0;
            while (z10) {
                int iX = dVarB.x(serialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI = dVarB.i(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI3 = dVarB.i(serialDescriptor, 1);
                    i11 |= 2;
                } else if (iX == 2) {
                    iF2 = dVarB.f(serialDescriptor, 2);
                    i11 |= 4;
                } else {
                    if (iX != 3) {
                        throw new z(iX);
                    }
                    jE2 = dVarB.e(serialDescriptor, 3);
                    i11 |= 8;
                }
            }
            i10 = i11;
            iF = iF2;
            str = strI3;
            jE = jE2;
        }
        String str2 = strI;
        dVarB.c(serialDescriptor);
        return new SessionDetails(i10, str2, str, iF, jE, null);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ug.n
    public final void serialize(@NotNull Encoder encoder, @NotNull SessionDetails value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        xg.f fVarB = encoder.b(serialDescriptor);
        SessionDetails.write$Self$com_google_firebase_firebase_sessions(value, fVarB, serialDescriptor);
        fVarB.c(serialDescriptor);
    }

    @Override // yg.o0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return o0.a.a(this);
    }
}
