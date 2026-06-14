package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4424m2;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.internal.ortb.model.f;
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
import yg.m0;
import yg.n0;
import yg.o0;
import yg.t2;
import yg.y2;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@ug.l
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 *2\u00020\u0001:\u0002\u001a\u0018BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u001e\u0012\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u0012\u0004\b$\u0010\u001d\u001a\u0004\b#\u0010\u001cR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010%\u0012\u0004\b'\u0010\u001d\u001a\u0004\b$\u0010&R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010\u001b\u0012\u0004\b)\u0010\u001d\u001a\u0004\b(\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001b\u0012\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010\u001c¨\u0006+"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/e;", "", "", "adm", "", "price", C4424m2.f43626y, "Lcom/moloco/sdk/internal/ortb/model/f;", "ext", "crid", "bundle", "<init>", "(Ljava/lang/String;FLjava/lang/String;Lcom/moloco/sdk/internal/ortb/model/f;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;FLjava/lang/String;Lcom/moloco/sdk/internal/ortb/model/f;Ljava/lang/String;Ljava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "b", "(Lcom/moloco/sdk/internal/ortb/model/e;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "()V", "F", "g", "()F", CmcdData.Factory.STREAM_TYPE_LIVE, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "d", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/moloco/sdk/internal/ortb/model/f;", "()Lcom/moloco/sdk/internal/ortb/model/f;", "j", EidRequestBuilder.REQUEST_FIELD_EMAIL, "h", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f54520g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String adm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float price;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String burl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final f ext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String crid;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String bundle;

    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54529c;

        static {
            a aVar = new a();
            f54527a = aVar;
            f54529c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.Bid", aVar, 6);
            i2Var.n("adm", false);
            i2Var.n("price", false);
            i2Var.n(C4424m2.f43626y, true);
            i2Var.n("ext", false);
            i2Var.n("crid", true);
            i2Var.n("bundle", true);
            f54528b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e deserialize(Decoder decoder) {
            float f10;
            int i10;
            String str;
            String str2;
            f fVar;
            String str3;
            String str4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54528b;
            xg.d dVarB = decoder.b(serialDescriptor);
            if (dVarB.j()) {
                String strI = dVarB.i(serialDescriptor, 0);
                float fA = dVarB.A(serialDescriptor, 1);
                y2 y2Var = y2.f119104a;
                String str5 = (String) dVarB.p(serialDescriptor, 2, y2Var, null);
                f fVar2 = (f) dVarB.s(serialDescriptor, 3, f.a.f54536a, null);
                String str6 = (String) dVarB.p(serialDescriptor, 4, y2Var, null);
                str = strI;
                str4 = (String) dVarB.p(serialDescriptor, 5, y2Var, null);
                fVar = fVar2;
                str3 = str6;
                str2 = str5;
                f10 = fA;
                i10 = 63;
            } else {
                float fA2 = 0.0f;
                boolean z10 = true;
                String strI2 = null;
                String str7 = null;
                f fVar3 = null;
                String str8 = null;
                String str9 = null;
                int i11 = 0;
                while (z10) {
                    int iX = dVarB.x(serialDescriptor);
                    switch (iX) {
                        case -1:
                            z10 = false;
                            continue;
                        case 0:
                            strI2 = dVarB.i(serialDescriptor, 0);
                            i11 |= 1;
                            continue;
                        case 1:
                            fA2 = dVarB.A(serialDescriptor, 1);
                            i11 |= 2;
                            break;
                        case 2:
                            str7 = (String) dVarB.p(serialDescriptor, 2, y2.f119104a, str7);
                            i11 |= 4;
                            break;
                        case 3:
                            fVar3 = (f) dVarB.s(serialDescriptor, 3, f.a.f54536a, fVar3);
                            i11 |= 8;
                            break;
                        case 4:
                            str8 = (String) dVarB.p(serialDescriptor, 4, y2.f119104a, str8);
                            i11 |= 16;
                            break;
                        case 5:
                            str9 = (String) dVarB.p(serialDescriptor, 5, y2.f119104a, str9);
                            i11 |= 32;
                            break;
                        default:
                            throw new ug.z(iX);
                    }
                }
                f10 = fA2;
                i10 = i11;
                str = strI2;
                str2 = str7;
                fVar = fVar3;
                str3 = str8;
                str4 = str9;
            }
            dVarB.c(serialDescriptor);
            return new e(i10, str, f10, str2, fVar, str3, str4, null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, e value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54528b;
            xg.f fVarB = encoder.b(serialDescriptor);
            e.b(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            y2 y2Var = y2.f119104a;
            return new KSerializer[]{y2Var, m0.f119029a, vg.a.t(y2Var), f.a.f54536a, vg.a.t(y2Var), vg.a.t(y2Var)};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54528b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.e$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54527a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ e(int i10, String str, float f10, String str2, f fVar, String str3, String str4, t2 t2Var) {
        if (11 != (i10 & 11)) {
            e2.a(i10, 11, a.f54527a.getDescriptor());
        }
        this.adm = str;
        this.price = f10;
        if ((i10 & 4) == 0) {
            this.burl = null;
        } else {
            this.burl = str2;
        }
        this.ext = fVar;
        if ((i10 & 16) == 0) {
            this.crid = null;
        } else {
            this.crid = str3;
        }
        if ((i10 & 32) == 0) {
            this.bundle = null;
        } else {
            this.bundle = str4;
        }
    }

    public static final /* synthetic */ void b(e self, xg.f output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.adm);
        output.C(serialDesc, 1, self.price);
        if (output.r(serialDesc, 2) || self.burl != null) {
            output.h(serialDesc, 2, y2.f119104a, self.burl);
        }
        output.F(serialDesc, 3, f.a.f54536a, self.ext);
        if (output.r(serialDesc, 4) || self.crid != null) {
            output.h(serialDesc, 4, y2.f119104a, self.crid);
        }
        if (!output.r(serialDesc, 5) && self.bundle == null) {
            return;
        }
        output.h(serialDesc, 5, y2.f119104a, self.bundle);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdm() {
        return this.adm;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBundle() {
        return this.bundle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBurl() {
        return this.burl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCrid() {
        return this.crid;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final f getExt() {
        return this.ext;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getPrice() {
        return this.price;
    }

    public e(String adm, float f10, String str, f ext, String str2, String str3) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(ext, "ext");
        this.adm = adm;
        this.price = f10;
        this.burl = str;
        this.ext = ext;
        this.crid = str2;
        this.bundle = str3;
    }
}
