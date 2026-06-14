package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.moloco.sdk.internal.ortb.model.A;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import yg.e2;
import yg.i2;
import yg.n0;
import yg.o0;
import yg.t2;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@ug.l
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0002\u0012\u0019B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0014\u0012\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/g;", "", "", "Lcom/moloco/sdk/internal/ortb/model/A;", "seatBid", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/util/List;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/g;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "()Ljava/util/List;", "()V", com.taurusx.tax.f.y.f66058y, "b", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f54539b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KSerializer[] f54540c = {new yg.f(A.a.f54469a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final List seatBid;

    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54544c;

        static {
            a aVar = new a();
            f54542a = aVar;
            f54544c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.BidResponse", aVar, 1);
            i2Var.n("seatbid", false);
            f54543b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g deserialize(Decoder decoder) {
            List list;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54543b;
            xg.d dVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = g.f54540c;
            int i10 = 1;
            t2 t2Var = null;
            if (dVarB.j()) {
                list = (List) dVarB.s(serialDescriptor, 0, kSerializerArr[0], null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list2 = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    if (iX == -1) {
                        z10 = false;
                    } else {
                        if (iX != 0) {
                            throw new ug.z(iX);
                        }
                        list2 = (List) dVarB.s(serialDescriptor, 0, kSerializerArr[0], list2);
                        i11 = 1;
                    }
                }
                list = list2;
                i10 = i11;
            }
            dVarB.c(serialDescriptor);
            return new g(i10, list, t2Var);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, g value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54543b;
            xg.f fVarB = encoder.b(serialDescriptor);
            g.a(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{g.f54540c[0]};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54543b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.g$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54542a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ g(int i10, List list, t2 t2Var) {
        if (1 != (i10 & 1)) {
            e2.a(i10, 1, a.f54542a.getDescriptor());
        }
        this.seatBid = list;
    }

    public static final /* synthetic */ void a(g self, xg.f output, SerialDescriptor serialDesc) {
        output.F(serialDesc, 0, f54540c[0], self.seatBid);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getSeatBid() {
        return this.seatBid;
    }

    public g(List seatBid) {
        Intrinsics.checkNotNullParameter(seatBid, "seatBid");
        this.seatBid = seatBid;
    }
}
