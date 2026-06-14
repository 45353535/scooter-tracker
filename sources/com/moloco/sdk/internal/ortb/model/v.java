package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import yg.i2;
import yg.n0;
import yg.o0;
import yg.t2;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@ug.l
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0002\u0012\u0010B%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/v;", "", "", "seen0", "", "serverRenderingEnabled", "Lyg/t2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "b", "(Lcom/moloco/sdk/internal/ortb/model/v;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "()V", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class v {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Boolean serverRenderingEnabled;

    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54642c;

        static {
            a aVar = new a();
            f54640a = aVar;
            f54642c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.MolocoSDKConfigs", aVar, 1);
            i2Var.n("server_rendering_enabled", true);
            f54641b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v deserialize(Decoder decoder) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54641b;
            xg.d dVarB = decoder.b(serialDescriptor);
            int i10 = 1;
            t2 t2Var = null;
            if (dVarB.j()) {
                bool = (Boolean) dVarB.p(serialDescriptor, 0, yg.i.f118983a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                bool = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    if (iX == -1) {
                        z10 = false;
                    } else {
                        if (iX != 0) {
                            throw new ug.z(iX);
                        }
                        bool = (Boolean) dVarB.p(serialDescriptor, 0, yg.i.f118983a, bool);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            dVarB.c(serialDescriptor);
            return new v(i10, bool, t2Var);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, v value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54641b;
            xg.f fVarB = encoder.b(serialDescriptor);
            v.b(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{vg.a.t(yg.i.f118983a)};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54641b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.v$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54640a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ v(int i10, Boolean bool, t2 t2Var) {
        if ((i10 & 1) == 0) {
            this.serverRenderingEnabled = null;
        } else {
            this.serverRenderingEnabled = bool;
        }
    }

    public static final /* synthetic */ void b(v self, xg.f output, SerialDescriptor serialDesc) {
        if (!output.r(serialDesc, 0) && self.serverRenderingEnabled == null) {
            return;
        }
        output.h(serialDesc, 0, yg.i.f118983a, self.serverRenderingEnabled);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getServerRenderingEnabled() {
        return this.serverRenderingEnabled;
    }
}
