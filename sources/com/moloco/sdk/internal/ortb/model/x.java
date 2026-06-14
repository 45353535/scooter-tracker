package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.internal.ortb.model.B;
import com.moloco.sdk.internal.ortb.model.C;
import com.moloco.sdk.internal.ortb.model.C4724a;
import com.moloco.sdk.internal.ortb.model.C4725b;
import com.moloco.sdk.internal.ortb.model.C4726c;
import com.moloco.sdk.internal.ortb.model.i;
import com.moloco.sdk.internal.ortb.model.k;
import com.moloco.sdk.internal.ortb.model.l;
import com.moloco.sdk.internal.ortb.model.w;
import com.moloco.sdk.internal.ortb.model.y;
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
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b-\b\u0001\u0018\u0000 Q2\u00020\u0001:\u0002(&B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u0091\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ'\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010)\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010+R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010-\u001a\u0004\b2\u00103R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010-\u001a\u0004\b7\u00108R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010:\u0012\u0004\b=\u0010-\u001a\u0004\b;\u0010<R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010-\u001a\u0004\b@\u0010AR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010C\u0012\u0004\b>\u0010-\u001a\u0004\b5\u0010DR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010E\u0012\u0004\bG\u0010-\u001a\u0004\b=\u0010FR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010H\u0012\u0004\bJ\u0010-\u001a\u0004\b/\u0010IR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010K\u0012\u0004\b2\u0010-\u001a\u0004\b>\u0010LR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010M\u0012\u0004\b&\u0010-\u001a\u0004\b(\u0010NR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010O\u0012\u0004\b5\u0010-\u001a\u0004\b0\u0010P¨\u0006R"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/x;", "", "Lcom/moloco/sdk/internal/ortb/model/B;", "skip", "close", "Lcom/moloco/sdk/internal/ortb/model/y;", "progressBar", "Lcom/moloco/sdk/internal/ortb/model/w;", "mute", "Lcom/moloco/sdk/internal/ortb/model/i;", "cta", "", "isAllAreaClickable", "Lcom/moloco/sdk/internal/ortb/model/c;", "autoStore", "Lcom/moloco/sdk/internal/ortb/model/C;", "vastPrivacyIcon", "Lcom/moloco/sdk/internal/ortb/model/l;", "dec", "Lcom/moloco/sdk/internal/ortb/model/k;", "countDownTimer", "Lcom/moloco/sdk/internal/ortb/model/a;", "androidInline", "Lcom/moloco/sdk/internal/ortb/model/b;", "autoInline", "<init>", "(Lcom/moloco/sdk/internal/ortb/model/B;Lcom/moloco/sdk/internal/ortb/model/B;Lcom/moloco/sdk/internal/ortb/model/y;Lcom/moloco/sdk/internal/ortb/model/w;Lcom/moloco/sdk/internal/ortb/model/i;ZLcom/moloco/sdk/internal/ortb/model/c;Lcom/moloco/sdk/internal/ortb/model/C;Lcom/moloco/sdk/internal/ortb/model/l;Lcom/moloco/sdk/internal/ortb/model/k;Lcom/moloco/sdk/internal/ortb/model/a;Lcom/moloco/sdk/internal/ortb/model/b;)V", "", "seen0", "Lyg/t2;", "serializationConstructorMarker", "(ILcom/moloco/sdk/internal/ortb/model/B;Lcom/moloco/sdk/internal/ortb/model/B;Lcom/moloco/sdk/internal/ortb/model/y;Lcom/moloco/sdk/internal/ortb/model/w;Lcom/moloco/sdk/internal/ortb/model/i;ZLcom/moloco/sdk/internal/ortb/model/c;Lcom/moloco/sdk/internal/ortb/model/C;Lcom/moloco/sdk/internal/ortb/model/l;Lcom/moloco/sdk/internal/ortb/model/k;Lcom/moloco/sdk/internal/ortb/model/a;Lcom/moloco/sdk/internal/ortb/model/b;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "b", "(Lcom/moloco/sdk/internal/ortb/model/x;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "Lcom/moloco/sdk/internal/ortb/model/B;", CampaignEx.JSON_KEY_AD_K, "()Lcom/moloco/sdk/internal/ortb/model/B;", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "()V", EidRequestBuilder.REQUEST_FIELD_EMAIL, "h", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/moloco/sdk/internal/ortb/model/y;", "j", "()Lcom/moloco/sdk/internal/ortb/model/y;", "r", "d", "Lcom/moloco/sdk/internal/ortb/model/w;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "()Lcom/moloco/sdk/internal/ortb/model/w;", "p", "Lcom/moloco/sdk/internal/ortb/model/i;", "g", "()Lcom/moloco/sdk/internal/ortb/model/i;", CmcdData.Factory.STREAM_TYPE_LIVE, InneractiveMediationDefs.GENDER_FEMALE, "Z", "m", "()Z", "x", "Lcom/moloco/sdk/internal/ortb/model/c;", "()Lcom/moloco/sdk/internal/ortb/model/c;", "Lcom/moloco/sdk/internal/ortb/model/C;", "()Lcom/moloco/sdk/internal/ortb/model/C;", "v", "Lcom/moloco/sdk/internal/ortb/model/l;", "()Lcom/moloco/sdk/internal/ortb/model/l;", "n", "Lcom/moloco/sdk/internal/ortb/model/k;", "()Lcom/moloco/sdk/internal/ortb/model/k;", "Lcom/moloco/sdk/internal/ortb/model/a;", "()Lcom/moloco/sdk/internal/ortb/model/a;", "Lcom/moloco/sdk/internal/ortb/model/b;", "()Lcom/moloco/sdk/internal/ortb/model/b;", com.taurusx.tax.f.y.f66058y, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class x {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f54654m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final B skip;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final B close;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final y progressBar;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final w mute;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final i cta;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean isAllAreaClickable;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final C4726c autoStore;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final C vastPrivacyIcon;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final l dec;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final k countDownTimer;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final C4724a androidInline;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final C4725b autoInline;

    public /* synthetic */ class a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final SerialDescriptor f54668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f54669c;

        static {
            a aVar = new a();
            f54667a = aVar;
            f54669c = 8;
            i2 i2Var = new i2("com.moloco.sdk.internal.ortb.model.Player", aVar, 12);
            i2Var.n("skip", true);
            i2Var.n("close", false);
            i2Var.n("progress_bar", true);
            i2Var.n("mute", false);
            i2Var.n("cta", true);
            i2Var.n("is_all_area_clickable", false);
            i2Var.n("auto_store", true);
            i2Var.n("vast_privacy_icon", true);
            i2Var.n("dec", true);
            i2Var.n("countdown_timer", true);
            i2Var.n("android_inline", true);
            i2Var.n("auto_inline", true);
            f54668b = i2Var;
        }

        @Override // ug.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x deserialize(Decoder decoder) {
            boolean z10;
            B b10;
            C4725b c4725b;
            k kVar;
            l lVar;
            C c10;
            i iVar;
            C4724a c4724a;
            C4726c c4726c;
            w wVar;
            y yVar;
            B b11;
            int i10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = f54668b;
            xg.d dVarB = decoder.b(serialDescriptor);
            int i11 = 11;
            if (dVarB.j()) {
                B.a aVar = B.a.f54480a;
                B b12 = (B) dVarB.p(serialDescriptor, 0, aVar, null);
                B b13 = (B) dVarB.s(serialDescriptor, 1, aVar, null);
                y yVar2 = (y) dVarB.p(serialDescriptor, 2, y.a.f54675a, null);
                w wVar2 = (w) dVarB.s(serialDescriptor, 3, w.a.f54651a, null);
                i iVar2 = (i) dVarB.p(serialDescriptor, 4, i.a.f54553a, null);
                boolean zD = dVarB.D(serialDescriptor, 5);
                C4726c c4726c2 = (C4726c) dVarB.p(serialDescriptor, 6, C4726c.C0668c.f54512a, null);
                C c11 = (C) dVarB.p(serialDescriptor, 7, C.a.f54487a, null);
                l lVar2 = (l) dVarB.p(serialDescriptor, 8, l.a.f54578a, null);
                k kVar2 = (k) dVarB.p(serialDescriptor, 9, k.a.f54565a, null);
                C4724a c4724a2 = (C4724a) dVarB.p(serialDescriptor, 10, C4724a.c.f54498a, null);
                b11 = b13;
                c4725b = (C4725b) dVarB.p(serialDescriptor, 11, C4725b.c.f54506a, null);
                c4724a = c4724a2;
                kVar = kVar2;
                c10 = c11;
                c4726c = c4726c2;
                z10 = zD;
                wVar = wVar2;
                lVar = lVar2;
                iVar = iVar2;
                yVar = yVar2;
                i10 = 4095;
                b10 = b12;
            } else {
                boolean z11 = true;
                boolean zD2 = false;
                C4725b c4725b2 = null;
                k kVar3 = null;
                l lVar3 = null;
                C c12 = null;
                i iVar3 = null;
                C4724a c4724a3 = null;
                C4726c c4726c3 = null;
                w wVar3 = null;
                y yVar3 = null;
                B b14 = null;
                int i12 = 0;
                B b15 = null;
                while (z11) {
                    int iX = dVarB.x(serialDescriptor);
                    switch (iX) {
                        case -1:
                            z11 = false;
                            zD2 = zD2;
                            break;
                        case 0:
                            b14 = (B) dVarB.p(serialDescriptor, 0, B.a.f54480a, b14);
                            i12 |= 1;
                            zD2 = zD2;
                            i11 = 11;
                            break;
                        case 1:
                            b15 = (B) dVarB.s(serialDescriptor, 1, B.a.f54480a, b15);
                            i12 |= 2;
                            i11 = 11;
                            break;
                        case 2:
                            yVar3 = (y) dVarB.p(serialDescriptor, 2, y.a.f54675a, yVar3);
                            i12 |= 4;
                            i11 = 11;
                            break;
                        case 3:
                            wVar3 = (w) dVarB.s(serialDescriptor, 3, w.a.f54651a, wVar3);
                            i12 |= 8;
                            i11 = 11;
                            break;
                        case 4:
                            iVar3 = (i) dVarB.p(serialDescriptor, 4, i.a.f54553a, iVar3);
                            i12 |= 16;
                            i11 = 11;
                            break;
                        case 5:
                            zD2 = dVarB.D(serialDescriptor, 5);
                            i12 |= 32;
                            i11 = 11;
                            break;
                        case 6:
                            c4726c3 = (C4726c) dVarB.p(serialDescriptor, 6, C4726c.C0668c.f54512a, c4726c3);
                            i12 |= 64;
                            i11 = 11;
                            break;
                        case 7:
                            c12 = (C) dVarB.p(serialDescriptor, 7, C.a.f54487a, c12);
                            i12 |= 128;
                            i11 = 11;
                            break;
                        case 8:
                            lVar3 = (l) dVarB.p(serialDescriptor, 8, l.a.f54578a, lVar3);
                            i12 |= 256;
                            i11 = 11;
                            break;
                        case 9:
                            kVar3 = (k) dVarB.p(serialDescriptor, 9, k.a.f54565a, kVar3);
                            i12 |= 512;
                            i11 = 11;
                            break;
                        case 10:
                            c4724a3 = (C4724a) dVarB.p(serialDescriptor, 10, C4724a.c.f54498a, c4724a3);
                            i12 |= 1024;
                            i11 = 11;
                            break;
                        case 11:
                            c4725b2 = (C4725b) dVarB.p(serialDescriptor, i11, C4725b.c.f54506a, c4725b2);
                            i12 |= 2048;
                            break;
                        default:
                            throw new ug.z(iX);
                    }
                }
                z10 = zD2;
                b10 = b14;
                c4725b = c4725b2;
                kVar = kVar3;
                lVar = lVar3;
                c10 = c12;
                iVar = iVar3;
                c4724a = c4724a3;
                c4726c = c4726c3;
                wVar = wVar3;
                yVar = yVar3;
                b11 = b15;
                i10 = i12;
            }
            dVarB.c(serialDescriptor);
            return new x(i10, b10, b11, yVar, wVar, iVar, z10, c4726c, c10, lVar, kVar, c4724a, c4725b, (t2) null);
        }

        @Override // ug.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, x value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = f54668b;
            xg.f fVarB = encoder.b(serialDescriptor);
            x.b(value, fVarB, serialDescriptor);
            fVarB.c(serialDescriptor);
        }

        @Override // yg.o0
        public final KSerializer[] childSerializers() {
            B.a aVar = B.a.f54480a;
            return new KSerializer[]{vg.a.t(aVar), aVar, vg.a.t(y.a.f54675a), w.a.f54651a, vg.a.t(i.a.f54553a), yg.i.f118983a, vg.a.t(C4726c.C0668c.f54512a), vg.a.t(C.a.f54487a), vg.a.t(l.a.f54578a), vg.a.t(k.a.f54565a), vg.a.t(C4724a.c.f54498a), vg.a.t(C4725b.c.f54506a)};
        }

        @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
        public final SerialDescriptor getDescriptor() {
            return f54668b;
        }

        @Override // yg.o0
        public /* synthetic */ KSerializer[] typeParametersSerializers() {
            return n0.a(this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.x$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f54667a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ x(int i10, B b10, B b11, y yVar, w wVar, i iVar, boolean z10, C4726c c4726c, C c10, l lVar, k kVar, C4724a c4724a, C4725b c4725b, t2 t2Var) {
        if (42 != (i10 & 42)) {
            e2.a(i10, 42, a.f54667a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.skip = null;
        } else {
            this.skip = b10;
        }
        this.close = b11;
        if ((i10 & 4) == 0) {
            this.progressBar = null;
        } else {
            this.progressBar = yVar;
        }
        this.mute = wVar;
        if ((i10 & 16) == 0) {
            this.cta = null;
        } else {
            this.cta = iVar;
        }
        this.isAllAreaClickable = z10;
        if ((i10 & 64) == 0) {
            this.autoStore = null;
        } else {
            this.autoStore = c4726c;
        }
        if ((i10 & 128) == 0) {
            this.vastPrivacyIcon = null;
        } else {
            this.vastPrivacyIcon = c10;
        }
        if ((i10 & 256) == 0) {
            this.dec = null;
        } else {
            this.dec = lVar;
        }
        if ((i10 & 512) == 0) {
            this.countDownTimer = null;
        } else {
            this.countDownTimer = kVar;
        }
        if ((i10 & 1024) == 0) {
            this.androidInline = null;
        } else {
            this.androidInline = c4724a;
        }
        if ((i10 & 2048) == 0) {
            this.autoInline = null;
        } else {
            this.autoInline = c4725b;
        }
    }

    public static final /* synthetic */ void b(x self, xg.f output, SerialDescriptor serialDesc) {
        if (output.r(serialDesc, 0) || self.skip != null) {
            output.h(serialDesc, 0, B.a.f54480a, self.skip);
        }
        output.F(serialDesc, 1, B.a.f54480a, self.close);
        if (output.r(serialDesc, 2) || self.progressBar != null) {
            output.h(serialDesc, 2, y.a.f54675a, self.progressBar);
        }
        output.F(serialDesc, 3, w.a.f54651a, self.mute);
        if (output.r(serialDesc, 4) || self.cta != null) {
            output.h(serialDesc, 4, i.a.f54553a, self.cta);
        }
        output.p(serialDesc, 5, self.isAllAreaClickable);
        if (output.r(serialDesc, 6) || self.autoStore != null) {
            output.h(serialDesc, 6, C4726c.C0668c.f54512a, self.autoStore);
        }
        if (output.r(serialDesc, 7) || self.vastPrivacyIcon != null) {
            output.h(serialDesc, 7, C.a.f54487a, self.vastPrivacyIcon);
        }
        if (output.r(serialDesc, 8) || self.dec != null) {
            output.h(serialDesc, 8, l.a.f54578a, self.dec);
        }
        if (output.r(serialDesc, 9) || self.countDownTimer != null) {
            output.h(serialDesc, 9, k.a.f54565a, self.countDownTimer);
        }
        if (output.r(serialDesc, 10) || self.androidInline != null) {
            output.h(serialDesc, 10, C4724a.c.f54498a, self.androidInline);
        }
        if (!output.r(serialDesc, 11) && self.autoInline == null) {
            return;
        }
        output.h(serialDesc, 11, C4725b.c.f54506a, self.autoInline);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C4724a getAndroidInline() {
        return this.androidInline;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C4725b getAutoInline() {
        return this.autoInline;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C4726c getAutoStore() {
        return this.autoStore;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final B getClose() {
        return this.close;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final k getCountDownTimer() {
        return this.countDownTimer;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final i getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final l getDec() {
        return this.dec;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final w getMute() {
        return this.mute;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final y getProgressBar() {
        return this.progressBar;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final B getSkip() {
        return this.skip;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C getVastPrivacyIcon() {
        return this.vastPrivacyIcon;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsAllAreaClickable() {
        return this.isAllAreaClickable;
    }

    public x(B b10, B close, y yVar, w mute, i iVar, boolean z10, C4726c c4726c, C c10, l lVar, k kVar, C4724a c4724a, C4725b c4725b) {
        Intrinsics.checkNotNullParameter(close, "close");
        Intrinsics.checkNotNullParameter(mute, "mute");
        this.skip = b10;
        this.close = close;
        this.progressBar = yVar;
        this.mute = mute;
        this.cta = iVar;
        this.isAllAreaClickable = z10;
        this.autoStore = c4726c;
        this.vastPrivacyIcon = c10;
        this.dec = lVar;
        this.countDownTimer = kVar;
        this.androidInline = c4724a;
        this.autoInline = c4725b;
    }

    public /* synthetic */ x(B b10, B b11, y yVar, w wVar, i iVar, boolean z10, C4726c c4726c, C c10, l lVar, k kVar, C4724a c4724a, C4725b c4725b, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : b10, b11, (i10 & 4) != 0 ? null : yVar, wVar, (i10 & 16) != 0 ? null : iVar, z10, (i10 & 64) != 0 ? null : c4726c, (i10 & 128) != 0 ? null : c10, (i10 & 256) != 0 ? null : lVar, (i10 & 512) != 0 ? null : kVar, (i10 & 1024) != 0 ? null : c4724a, (i10 & 2048) != 0 ? null : c4725b);
    }
}
