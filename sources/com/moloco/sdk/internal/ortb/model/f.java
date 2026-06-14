package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4329g8;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.internal.ortb.model.u;
import com.moloco.sdk.internal.ortb.model.v;
import com.moloco.sdk.internal.ortb.model.x;
import com.moloco.sdk.internal.ortb.model.z;
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
import yg.y2;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@ug.l
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0002\u001a\u0018BM\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010 \u0012\u0004\b#\u0010\u001f\u001a\u0004\b!\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u001a\u0010&R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010'\u0012\u0004\b)\u0010\u001f\u001a\u0004\b#\u0010(R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010*\u0012\u0004\b!\u0010\u001f\u001a\u0004\b$\u0010+¨\u0006-"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/f;", "", "", "seen0", "Lcom/moloco/sdk/internal/ortb/model/x;", "player", "", "mtid", "Lcom/moloco/sdk/internal/ortb/model/v;", C4329g8.f43171p, "Lcom/moloco/sdk/internal/ortb/model/z;", "sdkEvents", "Lcom/moloco/sdk/internal/ortb/model/u;", "molocoSdkClickMetaData", "Lyg/t2;", "serializationConstructorMarker", "<init>", "(ILcom/moloco/sdk/internal/ortb/model/x;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/v;Lcom/moloco/sdk/internal/ortb/model/z;Lcom/moloco/sdk/internal/ortb/model/u;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "b", "(Lcom/moloco/sdk/internal/ortb/model/f;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "Lcom/moloco/sdk/internal/ortb/model/x;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "()Lcom/moloco/sdk/internal/ortb/model/x;", "h", "()V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", InneractiveMediationDefs.GENDER_FEMALE, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/moloco/sdk/internal/ortb/model/v;", "()Lcom/moloco/sdk/internal/ortb/model/v;", "Lcom/moloco/sdk/internal/ortb/model/z;", "()Lcom/moloco/sdk/internal/ortb/model/z;", "j", "Lcom/moloco/sdk/internal/ortb/model/u;", "()Lcom/moloco/sdk/internal/ortb/model/u;", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f54530f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final x player;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String mtid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final v configs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z sdkEvents;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final u molocoSdkClickMetaData;

    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54538c;

        static {
            a aVar = new a();
            f54536a = aVar;
            f54538c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.BidExt", aVar, 5);
            i2Var.n("player", true);
            i2Var.n("mtid", true);
            i2Var.n("moloco_sdk_configs", true);
            i2Var.n("moloco_sdk_events", true);
            i2Var.n("moloco_sdk_click_metadata", true);
            f54537b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f deserialize(Decoder decoder) {
            int i10;
            x xVar;
            String str;
            v vVar;
            z zVar;
            u uVar;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54537b;
            xg.d dVarB = decoder.b(serialDescriptor);
            x xVar2 = null;
            if (dVarB.j()) {
                x xVar3 = (x) dVarB.p(serialDescriptor, 0, x.a.f54667a, null);
                String str2 = (String) dVarB.p(serialDescriptor, 1, y2.f119104a, null);
                v vVar2 = (v) dVarB.p(serialDescriptor, 2, v.a.f54640a, null);
                xVar = xVar3;
                zVar = (z) dVarB.p(serialDescriptor, 3, z.a.f54688a, null);
                uVar = (u) dVarB.p(serialDescriptor, 4, u.a.f54636a, null);
                vVar = vVar2;
                str = str2;
                i10 = 31;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str3 = null;
                v vVar3 = null;
                z zVar2 = null;
                u uVar2 = null;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        xVar2 = (x) dVarB.p(serialDescriptor, 0, x.a.f54667a, xVar2);
                        i11 |= 1;
                    } else if (iX == 1) {
                        str3 = (String) dVarB.p(serialDescriptor, 1, y2.f119104a, str3);
                        i11 |= 2;
                    } else if (iX == 2) {
                        vVar3 = (v) dVarB.p(serialDescriptor, 2, v.a.f54640a, vVar3);
                        i11 |= 4;
                    } else if (iX == 3) {
                        zVar2 = (z) dVarB.p(serialDescriptor, 3, z.a.f54688a, zVar2);
                        i11 |= 8;
                    } else {
                        if (iX != 4) {
                            throw new ug.z(iX);
                        }
                        uVar2 = (u) dVarB.p(serialDescriptor, 4, u.a.f54636a, uVar2);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                xVar = xVar2;
                str = str3;
                vVar = vVar3;
                zVar = zVar2;
                uVar = uVar2;
            }
            dVarB.c(serialDescriptor);
            return new f(i10, xVar, str, vVar, zVar, uVar, null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, f value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54537b;
            xg.f fVarB = encoder.b(serialDescriptor);
            f.b(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{vg.a.t(x.a.f54667a), vg.a.t(y2.f119104a), vg.a.t(v.a.f54640a), vg.a.t(z.a.f54688a), vg.a.t(u.a.f54636a)};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54537b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.f$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54536a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ f(int i10, x xVar, String str, v vVar, z zVar, u uVar, t2 t2Var) {
        if ((i10 & 1) == 0) {
            this.player = null;
        } else {
            this.player = xVar;
        }
        if ((i10 & 2) == 0) {
            this.mtid = null;
        } else {
            this.mtid = str;
        }
        if ((i10 & 4) == 0) {
            this.configs = null;
        } else {
            this.configs = vVar;
        }
        if ((i10 & 8) == 0) {
            this.sdkEvents = null;
        } else {
            this.sdkEvents = zVar;
        }
        if ((i10 & 16) == 0) {
            this.molocoSdkClickMetaData = null;
        } else {
            this.molocoSdkClickMetaData = uVar;
        }
    }

    public static final /* synthetic */ void b(f self, xg.f output, SerialDescriptor serialDesc) {
        if (output.r(serialDesc, 0) || self.player != null) {
            output.h(serialDesc, 0, x.a.f54667a, self.player);
        }
        if (output.r(serialDesc, 1) || self.mtid != null) {
            output.h(serialDesc, 1, y2.f119104a, self.mtid);
        }
        if (output.r(serialDesc, 2) || self.configs != null) {
            output.h(serialDesc, 2, v.a.f54640a, self.configs);
        }
        if (output.r(serialDesc, 3) || self.sdkEvents != null) {
            output.h(serialDesc, 3, z.a.f54688a, self.sdkEvents);
        }
        if (!output.r(serialDesc, 4) && self.molocoSdkClickMetaData == null) {
            return;
        }
        output.h(serialDesc, 4, u.a.f54636a, self.molocoSdkClickMetaData);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final v getConfigs() {
        return this.configs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final u getMolocoSdkClickMetaData() {
        return this.molocoSdkClickMetaData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMtid() {
        return this.mtid;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final x getPlayer() {
        return this.player;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final z getSdkEvents() {
        return this.sdkEvents;
    }
}
