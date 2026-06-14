package com.vungle.ads.internal.model;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4240b4;
import com.ironsource.N6;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ug.l;
import xg.f;
import yg.e2;
import yg.i1;
import yg.t2;
import yg.x0;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@l
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0003ONPBs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0085\u0001\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0088\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001fJ\u0010\u00100\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b0\u0010%J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010\u001fR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010%\"\u0004\b=\u0010>R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010;\u001a\u0004\b?\u0010%\"\u0004\b@\u0010>R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00105\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010CR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00105\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010CR$\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010F\u001a\u0004\bG\u0010*\"\u0004\bH\u0010IR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010J\u001a\u0004\bK\u0010,\"\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode;", "", "", N6.f41422t, "model", N6.G, N6.Q0, "os", "", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "h", N6.f41375d0, EidRequestBuilder.REQUEST_FIELD_IFA, EidRequestBuilder.REQUEST_FIELD_LMT, "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "ext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;)V", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/DeviceNode;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "()Ljava/lang/Integer;", "component11", "()Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;)Lcom/vungle/ads/internal/model/DeviceNode;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMake", "getModel", "getOsv", "getCarrier", "getOs", "I", "getW", "setW", "(I)V", "getH", "setH", "getUa", "setUa", "(Ljava/lang/String;)V", "getIfa", "setIfa", "Ljava/lang/Integer;", "getLmt", "setLmt", "(Ljava/lang/Integer;)V", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "getExt", "setExt", "(Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;)V", y.f66058y, "$serializer", "VungleExt", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class DeviceNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String carrier;

    @Nullable
    private VungleExt ext;
    private int h;

    @Nullable
    private String ifa;

    @Nullable
    private Integer lmt;

    @NotNull
    private final String make;

    @NotNull
    private final String model;

    @NotNull
    private final String os;

    @NotNull
    private final String osv;

    @Nullable
    private String ua;
    private int w;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DeviceNode$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @l
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bt\b\u0087\b\u0018\u0000 \u009a\u00012\u00020\u0001:\u0004\u009b\u0001\u009a\u0001Bÿ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001d\u0010\u001eB\u0093\u0002\b\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0011\u001a\u00020\b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J(\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&HÇ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u0010.J\u0010\u00104\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b6\u0010.J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b7\u0010.J\u0012\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b8\u0010.J\u0012\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b9\u0010.J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b:\u0010.J\u0010\u0010;\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b;\u00102J\u0010\u0010<\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b<\u00105J\u0010\u0010=\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b=\u0010,J\u0010\u0010>\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b>\u00105J\u0010\u0010?\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b?\u0010,J\u0012\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b@\u0010.J\u0012\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bA\u0010.J\u0012\u0010B\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bD\u0010CJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bE\u0010CJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bF\u0010CJ\u0088\u0002\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bI\u0010.J\u0010\u0010J\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bJ\u00105J\u001a\u0010L\u001a\u00020\u00022\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bL\u0010MR(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010N\u0012\u0004\bQ\u0010R\u001a\u0004\b\u0003\u0010,\"\u0004\bO\u0010PR*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010S\u0012\u0004\bW\u0010R\u001a\u0004\bT\u0010.\"\u0004\bU\u0010VR*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010X\u0012\u0004\b\\\u0010R\u001a\u0004\bY\u00100\"\u0004\bZ\u0010[R(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010]\u0012\u0004\ba\u0010R\u001a\u0004\b^\u00102\"\u0004\b_\u0010`R*\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010S\u0012\u0004\bd\u0010R\u001a\u0004\bb\u0010.\"\u0004\bc\u0010VR(\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010e\u0012\u0004\bi\u0010R\u001a\u0004\bf\u00105\"\u0004\bg\u0010hR*\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u0010S\u0012\u0004\bl\u0010R\u001a\u0004\bj\u0010.\"\u0004\bk\u0010VR*\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010S\u0012\u0004\bo\u0010R\u001a\u0004\bm\u0010.\"\u0004\bn\u0010VR*\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010S\u0012\u0004\br\u0010R\u001a\u0004\bp\u0010.\"\u0004\bq\u0010VR*\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010S\u0012\u0004\bu\u0010R\u001a\u0004\bs\u0010.\"\u0004\bt\u0010VR*\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010S\u0012\u0004\bx\u0010R\u001a\u0004\bv\u0010.\"\u0004\bw\u0010VR(\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010]\u0012\u0004\b{\u0010R\u001a\u0004\by\u00102\"\u0004\bz\u0010`R(\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010e\u0012\u0004\b~\u0010R\u001a\u0004\b|\u00105\"\u0004\b}\u0010hR)\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0019\n\u0004\b\u0013\u0010N\u0012\u0005\b\u0080\u0001\u0010R\u001a\u0004\b\u0013\u0010,\"\u0004\b\u007f\u0010PR+\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0014\u0010e\u0012\u0005\b\u0083\u0001\u0010R\u001a\u0005\b\u0081\u0001\u00105\"\u0005\b\u0082\u0001\u0010hR*\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001a\n\u0004\b\u0015\u0010N\u0012\u0005\b\u0085\u0001\u0010R\u001a\u0004\b\u0015\u0010,\"\u0005\b\u0084\u0001\u0010PR-\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0016\u0010S\u0012\u0005\b\u0088\u0001\u0010R\u001a\u0005\b\u0086\u0001\u0010.\"\u0005\b\u0087\u0001\u0010VR-\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0017\u0010S\u0012\u0005\b\u008b\u0001\u0010R\u001a\u0005\b\u0089\u0001\u0010.\"\u0005\b\u008a\u0001\u0010VR/\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u0019\u0010\u008c\u0001\u0012\u0005\b\u0090\u0001\u0010R\u001a\u0005\b\u008d\u0001\u0010C\"\u0006\b\u008e\u0001\u0010\u008f\u0001R/\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u001a\u0010\u008c\u0001\u0012\u0005\b\u0093\u0001\u0010R\u001a\u0005\b\u0091\u0001\u0010C\"\u0006\b\u0092\u0001\u0010\u008f\u0001R/\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u001b\u0010\u008c\u0001\u0012\u0005\b\u0096\u0001\u0010R\u001a\u0005\b\u0094\u0001\u0010C\"\u0006\b\u0095\u0001\u0010\u008f\u0001R/\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u001c\u0010\u008c\u0001\u0012\u0005\b\u0099\u0001\u0010R\u001a\u0005\b\u0097\u0001\u0010C\"\u0006\b\u0098\u0001\u0010\u008f\u0001¨\u0006\u009c\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "", "", "isGooglePlayServicesAvailable", "", "appSetId", "", "appSetIdScope", "", C4240b4.j.Y, "batteryState", "batterySaverEnabled", "connectionType", "connectionTypeDetail", CommonUrlParts.LOCALE, "language", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "volumeLevel", "soundEnabled", "isTv", C4240b4.j.f42683i0, "isSideloadEnabled", N6.V0, "amazonAdvertisingId", "", "sit", "oit", "ort", "obt", "<init>", "(ZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()F", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Ljava/lang/Long;", "component20", "component21", "component22", MenuActionType.COPY, "(ZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "setGooglePlayServicesAvailable", "(Z)V", "isGooglePlayServicesAvailable$annotations", "()V", "Ljava/lang/String;", "getAppSetId", "setAppSetId", "(Ljava/lang/String;)V", "getAppSetId$annotations", "Ljava/lang/Integer;", "getAppSetIdScope", "setAppSetIdScope", "(Ljava/lang/Integer;)V", "getAppSetIdScope$annotations", "F", "getBatteryLevel", "setBatteryLevel", "(F)V", "getBatteryLevel$annotations", "getBatteryState", "setBatteryState", "getBatteryState$annotations", "I", "getBatterySaverEnabled", "setBatterySaverEnabled", "(I)V", "getBatterySaverEnabled$annotations", "getConnectionType", "setConnectionType", "getConnectionType$annotations", "getConnectionTypeDetail", "setConnectionTypeDetail", "getConnectionTypeDetail$annotations", "getLocale", "setLocale", "getLocale$annotations", "getLanguage", "setLanguage", "getLanguage$annotations", "getTimeZone", "setTimeZone", "getTimeZone$annotations", "getVolumeLevel", "setVolumeLevel", "getVolumeLevel$annotations", "getSoundEnabled", "setSoundEnabled", "getSoundEnabled$annotations", "setTv", "isTv$annotations", "getSdCardAvailable", "setSdCardAvailable", "getSdCardAvailable$annotations", "setSideloadEnabled", "isSideloadEnabled$annotations", "getGaid", "setGaid", "getGaid$annotations", "getAmazonAdvertisingId", "setAmazonAdvertisingId", "getAmazonAdvertisingId$annotations", "Ljava/lang/Long;", "getSit", "setSit", "(Ljava/lang/Long;)V", "getSit$annotations", "getOit", "setOit", "getOit$annotations", "getOrt", "setOrt", "getOrt$annotations", "getObt", "setObt", "getObt$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class VungleExt {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private String amazonAdvertisingId;

        @Nullable
        private String appSetId;

        @Nullable
        private Integer appSetIdScope;
        private float batteryLevel;
        private int batterySaverEnabled;

        @Nullable
        private String batteryState;

        @Nullable
        private String connectionType;

        @Nullable
        private String connectionTypeDetail;

        @Nullable
        private String gaid;
        private boolean isGooglePlayServicesAvailable;
        private boolean isSideloadEnabled;
        private boolean isTv;

        @Nullable
        private String language;

        @Nullable
        private String locale;

        @Nullable
        private Long obt;

        @Nullable
        private Long oit;

        @Nullable
        private Long ort;
        private int sdCardAvailable;

        @Nullable
        private Long sit;
        private int soundEnabled;

        @Nullable
        private String timeZone;
        private float volumeLevel;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$VungleExt$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return DeviceNode$VungleExt$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public VungleExt() {
            this(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, 4194303, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ VungleExt copy$default(VungleExt vungleExt, boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, int i13, Object obj) {
            Long l14;
            Long l15;
            boolean z13 = (i13 & 1) != 0 ? vungleExt.isGooglePlayServicesAvailable : z10;
            String str10 = (i13 & 2) != 0 ? vungleExt.appSetId : str;
            Integer num2 = (i13 & 4) != 0 ? vungleExt.appSetIdScope : num;
            float f12 = (i13 & 8) != 0 ? vungleExt.batteryLevel : f10;
            String str11 = (i13 & 16) != 0 ? vungleExt.batteryState : str2;
            int i14 = (i13 & 32) != 0 ? vungleExt.batterySaverEnabled : i10;
            String str12 = (i13 & 64) != 0 ? vungleExt.connectionType : str3;
            String str13 = (i13 & 128) != 0 ? vungleExt.connectionTypeDetail : str4;
            String str14 = (i13 & 256) != 0 ? vungleExt.locale : str5;
            String str15 = (i13 & 512) != 0 ? vungleExt.language : str6;
            String str16 = (i13 & 1024) != 0 ? vungleExt.timeZone : str7;
            float f13 = (i13 & 2048) != 0 ? vungleExt.volumeLevel : f11;
            int i15 = (i13 & 4096) != 0 ? vungleExt.soundEnabled : i11;
            boolean z14 = (i13 & 8192) != 0 ? vungleExt.isTv : z11;
            boolean z15 = z13;
            int i16 = (i13 & 16384) != 0 ? vungleExt.sdCardAvailable : i12;
            boolean z16 = (i13 & 32768) != 0 ? vungleExt.isSideloadEnabled : z12;
            String str17 = (i13 & 65536) != 0 ? vungleExt.gaid : str8;
            String str18 = (i13 & 131072) != 0 ? vungleExt.amazonAdvertisingId : str9;
            Long l16 = (i13 & 262144) != 0 ? vungleExt.sit : l10;
            Long l17 = (i13 & 524288) != 0 ? vungleExt.oit : l11;
            Long l18 = (i13 & 1048576) != 0 ? vungleExt.ort : l12;
            if ((i13 & 2097152) != 0) {
                l15 = l18;
                l14 = vungleExt.obt;
            } else {
                l14 = l13;
                l15 = l18;
            }
            return vungleExt.copy(z15, str10, num2, f12, str11, i14, str12, str13, str14, str15, str16, f13, i15, z14, i16, z16, str17, str18, l16, l17, l15, l14);
        }

        public static /* synthetic */ void getAmazonAdvertisingId$annotations() {
        }

        public static /* synthetic */ void getAppSetId$annotations() {
        }

        public static /* synthetic */ void getAppSetIdScope$annotations() {
        }

        public static /* synthetic */ void getBatteryLevel$annotations() {
        }

        public static /* synthetic */ void getBatterySaverEnabled$annotations() {
        }

        public static /* synthetic */ void getBatteryState$annotations() {
        }

        public static /* synthetic */ void getConnectionType$annotations() {
        }

        public static /* synthetic */ void getConnectionTypeDetail$annotations() {
        }

        public static /* synthetic */ void getGaid$annotations() {
        }

        public static /* synthetic */ void getLanguage$annotations() {
        }

        public static /* synthetic */ void getLocale$annotations() {
        }

        public static /* synthetic */ void getObt$annotations() {
        }

        public static /* synthetic */ void getOit$annotations() {
        }

        public static /* synthetic */ void getOrt$annotations() {
        }

        public static /* synthetic */ void getSdCardAvailable$annotations() {
        }

        public static /* synthetic */ void getSit$annotations() {
        }

        public static /* synthetic */ void getSoundEnabled$annotations() {
        }

        public static /* synthetic */ void getTimeZone$annotations() {
        }

        public static /* synthetic */ void getVolumeLevel$annotations() {
        }

        public static /* synthetic */ void isGooglePlayServicesAvailable$annotations() {
        }

        public static /* synthetic */ void isSideloadEnabled$annotations() {
        }

        public static /* synthetic */ void isTv$annotations() {
        }

        public static final void write$Self(@NotNull VungleExt self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || self.isGooglePlayServicesAvailable) {
                output.p(serialDesc, 0, self.isGooglePlayServicesAvailable);
            }
            if (output.r(serialDesc, 1) || self.appSetId != null) {
                output.h(serialDesc, 1, y2.f119104a, self.appSetId);
            }
            if (output.r(serialDesc, 2) || self.appSetIdScope != null) {
                output.h(serialDesc, 2, x0.f119093a, self.appSetIdScope);
            }
            if (output.r(serialDesc, 3) || !Intrinsics.areEqual((Object) Float.valueOf(self.batteryLevel), (Object) Float.valueOf(0.0f))) {
                output.C(serialDesc, 3, self.batteryLevel);
            }
            if (output.r(serialDesc, 4) || self.batteryState != null) {
                output.h(serialDesc, 4, y2.f119104a, self.batteryState);
            }
            if (output.r(serialDesc, 5) || self.batterySaverEnabled != 0) {
                output.o(serialDesc, 5, self.batterySaverEnabled);
            }
            if (output.r(serialDesc, 6) || self.connectionType != null) {
                output.h(serialDesc, 6, y2.f119104a, self.connectionType);
            }
            if (output.r(serialDesc, 7) || self.connectionTypeDetail != null) {
                output.h(serialDesc, 7, y2.f119104a, self.connectionTypeDetail);
            }
            if (output.r(serialDesc, 8) || self.locale != null) {
                output.h(serialDesc, 8, y2.f119104a, self.locale);
            }
            if (output.r(serialDesc, 9) || self.language != null) {
                output.h(serialDesc, 9, y2.f119104a, self.language);
            }
            if (output.r(serialDesc, 10) || self.timeZone != null) {
                output.h(serialDesc, 10, y2.f119104a, self.timeZone);
            }
            if (output.r(serialDesc, 11) || !Intrinsics.areEqual((Object) Float.valueOf(self.volumeLevel), (Object) Float.valueOf(0.0f))) {
                output.C(serialDesc, 11, self.volumeLevel);
            }
            if (output.r(serialDesc, 12) || self.soundEnabled != 1) {
                output.o(serialDesc, 12, self.soundEnabled);
            }
            if (output.r(serialDesc, 13) || self.isTv) {
                output.p(serialDesc, 13, self.isTv);
            }
            if (output.r(serialDesc, 14) || self.sdCardAvailable != 1) {
                output.o(serialDesc, 14, self.sdCardAvailable);
            }
            if (output.r(serialDesc, 15) || self.isSideloadEnabled) {
                output.p(serialDesc, 15, self.isSideloadEnabled);
            }
            if (output.r(serialDesc, 16) || self.gaid != null) {
                output.h(serialDesc, 16, y2.f119104a, self.gaid);
            }
            if (output.r(serialDesc, 17) || self.amazonAdvertisingId != null) {
                output.h(serialDesc, 17, y2.f119104a, self.amazonAdvertisingId);
            }
            if (output.r(serialDesc, 18) || self.sit != null) {
                output.h(serialDesc, 18, i1.f118988a, self.sit);
            }
            if (output.r(serialDesc, 19) || self.oit != null) {
                output.h(serialDesc, 19, i1.f118988a, self.oit);
            }
            if (output.r(serialDesc, 20) || self.ort != null) {
                output.h(serialDesc, 20, i1.f118988a, self.ort);
            }
            if (!output.r(serialDesc, 21) && self.obt == null) {
                return;
            }
            output.h(serialDesc, 21, i1.f118988a, self.obt);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getTimeZone() {
            return this.timeZone;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final boolean getIsTv() {
            return this.isTv;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final boolean getIsSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getGaid() {
            return this.gaid;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final Long getSit() {
            return this.sit;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAppSetId() {
            return this.appSetId;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final Long getOit() {
            return this.oit;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final Long getOrt() {
            return this.ort;
        }

        @Nullable
        /* JADX INFO: renamed from: component22, reason: from getter */
        public final Long getObt() {
            return this.obt;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getBatteryState() {
            return this.batteryState;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getConnectionType() {
            return this.connectionType;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        @NotNull
        public final VungleExt copy(boolean isGooglePlayServicesAvailable, @Nullable String appSetId, @Nullable Integer appSetIdScope, float batteryLevel, @Nullable String batteryState, int batterySaverEnabled, @Nullable String connectionType, @Nullable String connectionTypeDetail, @Nullable String locale, @Nullable String language, @Nullable String timeZone, float volumeLevel, int soundEnabled, boolean isTv, int sdCardAvailable, boolean isSideloadEnabled, @Nullable String gaid, @Nullable String amazonAdvertisingId, @Nullable Long sit, @Nullable Long oit, @Nullable Long ort, @Nullable Long obt) {
            return new VungleExt(isGooglePlayServicesAvailable, appSetId, appSetIdScope, batteryLevel, batteryState, batterySaverEnabled, connectionType, connectionTypeDetail, locale, language, timeZone, volumeLevel, soundEnabled, isTv, sdCardAvailable, isSideloadEnabled, gaid, amazonAdvertisingId, sit, oit, ort, obt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VungleExt)) {
                return false;
            }
            VungleExt vungleExt = (VungleExt) other;
            return this.isGooglePlayServicesAvailable == vungleExt.isGooglePlayServicesAvailable && Intrinsics.areEqual(this.appSetId, vungleExt.appSetId) && Intrinsics.areEqual(this.appSetIdScope, vungleExt.appSetIdScope) && Intrinsics.areEqual((Object) Float.valueOf(this.batteryLevel), (Object) Float.valueOf(vungleExt.batteryLevel)) && Intrinsics.areEqual(this.batteryState, vungleExt.batteryState) && this.batterySaverEnabled == vungleExt.batterySaverEnabled && Intrinsics.areEqual(this.connectionType, vungleExt.connectionType) && Intrinsics.areEqual(this.connectionTypeDetail, vungleExt.connectionTypeDetail) && Intrinsics.areEqual(this.locale, vungleExt.locale) && Intrinsics.areEqual(this.language, vungleExt.language) && Intrinsics.areEqual(this.timeZone, vungleExt.timeZone) && Intrinsics.areEqual((Object) Float.valueOf(this.volumeLevel), (Object) Float.valueOf(vungleExt.volumeLevel)) && this.soundEnabled == vungleExt.soundEnabled && this.isTv == vungleExt.isTv && this.sdCardAvailable == vungleExt.sdCardAvailable && this.isSideloadEnabled == vungleExt.isSideloadEnabled && Intrinsics.areEqual(this.gaid, vungleExt.gaid) && Intrinsics.areEqual(this.amazonAdvertisingId, vungleExt.amazonAdvertisingId) && Intrinsics.areEqual(this.sit, vungleExt.sit) && Intrinsics.areEqual(this.oit, vungleExt.oit) && Intrinsics.areEqual(this.ort, vungleExt.ort) && Intrinsics.areEqual(this.obt, vungleExt.obt);
        }

        @Nullable
        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        @Nullable
        public final String getAppSetId() {
            return this.appSetId;
        }

        @Nullable
        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        @Nullable
        public final String getBatteryState() {
            return this.batteryState;
        }

        @Nullable
        public final String getConnectionType() {
            return this.connectionType;
        }

        @Nullable
        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        @Nullable
        public final String getGaid() {
            return this.gaid;
        }

        @Nullable
        public final String getLanguage() {
            return this.language;
        }

        @Nullable
        public final String getLocale() {
            return this.locale;
        }

        @Nullable
        public final Long getObt() {
            return this.obt;
        }

        @Nullable
        public final Long getOit() {
            return this.oit;
        }

        @Nullable
        public final Long getOrt() {
            return this.ort;
        }

        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        @Nullable
        public final Long getSit() {
            return this.sit;
        }

        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        @Nullable
        public final String getTimeZone() {
            return this.timeZone;
        }

        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v44 */
        /* JADX WARN: Type inference failed for: r0v45 */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r2v31, types: [int] */
        /* JADX WARN: Type inference failed for: r2v34 */
        /* JADX WARN: Type inference failed for: r2v43 */
        public int hashCode() {
            boolean z10 = this.isGooglePlayServicesAvailable;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i10 = r02 * 31;
            String str = this.appSetId;
            int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.appSetIdScope;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Float.floatToIntBits(this.batteryLevel)) * 31;
            String str2 = this.batteryState;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.batterySaverEnabled) * 31;
            String str3 = this.connectionType;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.connectionTypeDetail;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.locale;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.language;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.timeZone;
            int iHashCode8 = (((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + Float.floatToIntBits(this.volumeLevel)) * 31) + this.soundEnabled) * 31;
            boolean z11 = this.isTv;
            ?? r22 = z11;
            if (z11) {
                r22 = 1;
            }
            int i11 = (((iHashCode8 + r22) * 31) + this.sdCardAvailable) * 31;
            boolean z12 = this.isSideloadEnabled;
            int i12 = (i11 + (z12 ? 1 : z12)) * 31;
            String str8 = this.gaid;
            int iHashCode9 = (i12 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.amazonAdvertisingId;
            int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Long l10 = this.sit;
            int iHashCode11 = (iHashCode10 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.oit;
            int iHashCode12 = (iHashCode11 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.ort;
            int iHashCode13 = (iHashCode12 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.obt;
            return iHashCode13 + (l13 != null ? l13.hashCode() : 0);
        }

        public final boolean isGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        public final boolean isSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        public final boolean isTv() {
            return this.isTv;
        }

        public final void setAmazonAdvertisingId(@Nullable String str) {
            this.amazonAdvertisingId = str;
        }

        public final void setAppSetId(@Nullable String str) {
            this.appSetId = str;
        }

        public final void setAppSetIdScope(@Nullable Integer num) {
            this.appSetIdScope = num;
        }

        public final void setBatteryLevel(float f10) {
            this.batteryLevel = f10;
        }

        public final void setBatterySaverEnabled(int i10) {
            this.batterySaverEnabled = i10;
        }

        public final void setBatteryState(@Nullable String str) {
            this.batteryState = str;
        }

        public final void setConnectionType(@Nullable String str) {
            this.connectionType = str;
        }

        public final void setConnectionTypeDetail(@Nullable String str) {
            this.connectionTypeDetail = str;
        }

        public final void setGaid(@Nullable String str) {
            this.gaid = str;
        }

        public final void setGooglePlayServicesAvailable(boolean z10) {
            this.isGooglePlayServicesAvailable = z10;
        }

        public final void setLanguage(@Nullable String str) {
            this.language = str;
        }

        public final void setLocale(@Nullable String str) {
            this.locale = str;
        }

        public final void setObt(@Nullable Long l10) {
            this.obt = l10;
        }

        public final void setOit(@Nullable Long l10) {
            this.oit = l10;
        }

        public final void setOrt(@Nullable Long l10) {
            this.ort = l10;
        }

        public final void setSdCardAvailable(int i10) {
            this.sdCardAvailable = i10;
        }

        public final void setSideloadEnabled(boolean z10) {
            this.isSideloadEnabled = z10;
        }

        public final void setSit(@Nullable Long l10) {
            this.sit = l10;
        }

        public final void setSoundEnabled(int i10) {
            this.soundEnabled = i10;
        }

        public final void setTimeZone(@Nullable String str) {
            this.timeZone = str;
        }

        public final void setTv(boolean z10) {
            this.isTv = z10;
        }

        public final void setVolumeLevel(float f10) {
            this.volumeLevel = f10;
        }

        @NotNull
        public String toString() {
            return "VungleExt(isGooglePlayServicesAvailable=" + this.isGooglePlayServicesAvailable + ", appSetId=" + this.appSetId + ", appSetIdScope=" + this.appSetIdScope + ", batteryLevel=" + this.batteryLevel + ", batteryState=" + this.batteryState + ", batterySaverEnabled=" + this.batterySaverEnabled + ", connectionType=" + this.connectionType + ", connectionTypeDetail=" + this.connectionTypeDetail + ", locale=" + this.locale + ", language=" + this.language + ", timeZone=" + this.timeZone + ", volumeLevel=" + this.volumeLevel + ", soundEnabled=" + this.soundEnabled + ", isTv=" + this.isTv + ", sdCardAvailable=" + this.sdCardAvailable + ", isSideloadEnabled=" + this.isSideloadEnabled + ", gaid=" + this.gaid + ", amazonAdvertisingId=" + this.amazonAdvertisingId + ", sit=" + this.sit + ", oit=" + this.oit + ", ort=" + this.ort + ", obt=" + this.obt + ')';
        }

        public /* synthetic */ VungleExt(int i10, boolean z10, String str, Integer num, float f10, String str2, int i11, String str3, String str4, String str5, String str6, String str7, float f11, int i12, boolean z11, int i13, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.isGooglePlayServicesAvailable = false;
            } else {
                this.isGooglePlayServicesAvailable = z10;
            }
            if ((i10 & 2) == 0) {
                this.appSetId = null;
            } else {
                this.appSetId = str;
            }
            if ((i10 & 4) == 0) {
                this.appSetIdScope = null;
            } else {
                this.appSetIdScope = num;
            }
            if ((i10 & 8) == 0) {
                this.batteryLevel = 0.0f;
            } else {
                this.batteryLevel = f10;
            }
            if ((i10 & 16) == 0) {
                this.batteryState = null;
            } else {
                this.batteryState = str2;
            }
            if ((i10 & 32) == 0) {
                this.batterySaverEnabled = 0;
            } else {
                this.batterySaverEnabled = i11;
            }
            if ((i10 & 64) == 0) {
                this.connectionType = null;
            } else {
                this.connectionType = str3;
            }
            if ((i10 & 128) == 0) {
                this.connectionTypeDetail = null;
            } else {
                this.connectionTypeDetail = str4;
            }
            if ((i10 & 256) == 0) {
                this.locale = null;
            } else {
                this.locale = str5;
            }
            if ((i10 & 512) == 0) {
                this.language = null;
            } else {
                this.language = str6;
            }
            if ((i10 & 1024) == 0) {
                this.timeZone = null;
            } else {
                this.timeZone = str7;
            }
            if ((i10 & 2048) == 0) {
                this.volumeLevel = 0.0f;
            } else {
                this.volumeLevel = f11;
            }
            if ((i10 & 4096) == 0) {
                this.soundEnabled = 1;
            } else {
                this.soundEnabled = i12;
            }
            if ((i10 & 8192) == 0) {
                this.isTv = false;
            } else {
                this.isTv = z11;
            }
            if ((i10 & 16384) == 0) {
                this.sdCardAvailable = 1;
            } else {
                this.sdCardAvailable = i13;
            }
            if ((32768 & i10) == 0) {
                this.isSideloadEnabled = false;
            } else {
                this.isSideloadEnabled = z12;
            }
            if ((65536 & i10) == 0) {
                this.gaid = null;
            } else {
                this.gaid = str8;
            }
            if ((131072 & i10) == 0) {
                this.amazonAdvertisingId = null;
            } else {
                this.amazonAdvertisingId = str9;
            }
            if ((262144 & i10) == 0) {
                this.sit = null;
            } else {
                this.sit = l10;
            }
            if ((524288 & i10) == 0) {
                this.oit = null;
            } else {
                this.oit = l11;
            }
            if ((1048576 & i10) == 0) {
                this.ort = null;
            } else {
                this.ort = l12;
            }
            if ((i10 & 2097152) == 0) {
                this.obt = null;
            } else {
                this.obt = l13;
            }
        }

        public VungleExt(boolean z10, @Nullable String str, @Nullable Integer num, float f10, @Nullable String str2, int i10, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, float f11, int i11, boolean z11, int i12, boolean z12, @Nullable String str8, @Nullable String str9, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13) {
            this.isGooglePlayServicesAvailable = z10;
            this.appSetId = str;
            this.appSetIdScope = num;
            this.batteryLevel = f10;
            this.batteryState = str2;
            this.batterySaverEnabled = i10;
            this.connectionType = str3;
            this.connectionTypeDetail = str4;
            this.locale = str5;
            this.language = str6;
            this.timeZone = str7;
            this.volumeLevel = f11;
            this.soundEnabled = i11;
            this.isTv = z11;
            this.sdCardAvailable = i12;
            this.isSideloadEnabled = z12;
            this.gaid = str8;
            this.amazonAdvertisingId = str9;
            this.sit = l10;
            this.oit = l11;
            this.ort = l12;
            this.obt = l13;
        }

        public /* synthetic */ VungleExt(boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? 0.0f : f10, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? 0 : i10, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? null : str4, (i13 & 256) != 0 ? null : str5, (i13 & 512) != 0 ? null : str6, (i13 & 1024) != 0 ? null : str7, (i13 & 2048) == 0 ? f11 : 0.0f, (i13 & 4096) != 0 ? 1 : i11, (i13 & 8192) != 0 ? false : z11, (i13 & 16384) == 0 ? i12 : 1, (32768 & i13) != 0 ? false : z12, (i13 & 65536) != 0 ? null : str8, (i13 & 131072) != 0 ? null : str9, (i13 & 262144) != 0 ? null : l10, (i13 & 524288) != 0 ? null : l11, (i13 & 1048576) != 0 ? null : l12, (i13 & 2097152) != 0 ? null : l13);
        }
    }

    public /* synthetic */ DeviceNode(int i10, String str, String str2, String str3, String str4, String str5, int i11, int i12, String str6, String str7, Integer num, VungleExt vungleExt, t2 t2Var) {
        if (119 != (i10 & 119)) {
            e2.a(i10, 119, DeviceNode$$serializer.INSTANCE.getDescriptor());
        }
        this.make = str;
        this.model = str2;
        this.osv = str3;
        if ((i10 & 8) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str4;
        }
        this.os = str5;
        this.w = i11;
        this.h = i12;
        if ((i10 & 128) == 0) {
            this.ua = null;
        } else {
            this.ua = str6;
        }
        if ((i10 & 256) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str7;
        }
        if ((i10 & 512) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i10 & 1024) == 0) {
            this.ext = null;
        } else {
            this.ext = vungleExt;
        }
    }

    public static /* synthetic */ DeviceNode copy$default(DeviceNode deviceNode, String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, VungleExt vungleExt, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = deviceNode.make;
        }
        if ((i12 & 2) != 0) {
            str2 = deviceNode.model;
        }
        if ((i12 & 4) != 0) {
            str3 = deviceNode.osv;
        }
        if ((i12 & 8) != 0) {
            str4 = deviceNode.carrier;
        }
        if ((i12 & 16) != 0) {
            str5 = deviceNode.os;
        }
        if ((i12 & 32) != 0) {
            i10 = deviceNode.w;
        }
        if ((i12 & 64) != 0) {
            i11 = deviceNode.h;
        }
        if ((i12 & 128) != 0) {
            str6 = deviceNode.ua;
        }
        if ((i12 & 256) != 0) {
            str7 = deviceNode.ifa;
        }
        if ((i12 & 512) != 0) {
            num = deviceNode.lmt;
        }
        if ((i12 & 1024) != 0) {
            vungleExt = deviceNode.ext;
        }
        Integer num2 = num;
        VungleExt vungleExt2 = vungleExt;
        String str8 = str6;
        String str9 = str7;
        int i13 = i10;
        int i14 = i11;
        String str10 = str5;
        String str11 = str3;
        return deviceNode.copy(str, str2, str11, str4, str10, i13, i14, str8, str9, num2, vungleExt2);
    }

    public static final void write$Self(@NotNull DeviceNode self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.q(serialDesc, 0, self.make);
        output.q(serialDesc, 1, self.model);
        output.q(serialDesc, 2, self.osv);
        if (output.r(serialDesc, 3) || self.carrier != null) {
            output.h(serialDesc, 3, y2.f119104a, self.carrier);
        }
        output.q(serialDesc, 4, self.os);
        output.o(serialDesc, 5, self.w);
        output.o(serialDesc, 6, self.h);
        if (output.r(serialDesc, 7) || self.ua != null) {
            output.h(serialDesc, 7, y2.f119104a, self.ua);
        }
        if (output.r(serialDesc, 8) || self.ifa != null) {
            output.h(serialDesc, 8, y2.f119104a, self.ifa);
        }
        if (output.r(serialDesc, 9) || self.lmt != null) {
            output.h(serialDesc, 9, x0.f119093a, self.lmt);
        }
        if (!output.r(serialDesc, 10) && self.ext == null) {
            return;
        }
        output.h(serialDesc, 10, DeviceNode$VungleExt$$serializer.INSTANCE, self.ext);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMake() {
        return this.make;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getLmt() {
        return this.lmt;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final VungleExt getExt() {
        return this.ext;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOsv() {
        return this.osv;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getW() {
        return this.w;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getH() {
        return this.h;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUa() {
        return this.ua;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIfa() {
        return this.ifa;
    }

    @NotNull
    public final DeviceNode copy(@NotNull String make, @NotNull String model, @NotNull String osv, @Nullable String carrier, @NotNull String os, int w10, int h10, @Nullable String ua2, @Nullable String ifa, @Nullable Integer lmt, @Nullable VungleExt ext) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(osv, "osv");
        Intrinsics.checkNotNullParameter(os, "os");
        return new DeviceNode(make, model, osv, carrier, os, w10, h10, ua2, ifa, lmt, ext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceNode)) {
            return false;
        }
        DeviceNode deviceNode = (DeviceNode) other;
        return Intrinsics.areEqual(this.make, deviceNode.make) && Intrinsics.areEqual(this.model, deviceNode.model) && Intrinsics.areEqual(this.osv, deviceNode.osv) && Intrinsics.areEqual(this.carrier, deviceNode.carrier) && Intrinsics.areEqual(this.os, deviceNode.os) && this.w == deviceNode.w && this.h == deviceNode.h && Intrinsics.areEqual(this.ua, deviceNode.ua) && Intrinsics.areEqual(this.ifa, deviceNode.ifa) && Intrinsics.areEqual(this.lmt, deviceNode.lmt) && Intrinsics.areEqual(this.ext, deviceNode.ext);
    }

    @Nullable
    public final String getCarrier() {
        return this.carrier;
    }

    @Nullable
    public final VungleExt getExt() {
        return this.ext;
    }

    public final int getH() {
        return this.h;
    }

    @Nullable
    public final String getIfa() {
        return this.ifa;
    }

    @Nullable
    public final Integer getLmt() {
        return this.lmt;
    }

    @NotNull
    public final String getMake() {
        return this.make;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOs() {
        return this.os;
    }

    @NotNull
    public final String getOsv() {
        return this.osv;
    }

    @Nullable
    public final String getUa() {
        return this.ua;
    }

    public final int getW() {
        return this.w;
    }

    public int hashCode() {
        int iHashCode = ((((this.make.hashCode() * 31) + this.model.hashCode()) * 31) + this.osv.hashCode()) * 31;
        String str = this.carrier;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.os.hashCode()) * 31) + this.w) * 31) + this.h) * 31;
        String str2 = this.ua;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ifa;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.lmt;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        VungleExt vungleExt = this.ext;
        return iHashCode5 + (vungleExt != null ? vungleExt.hashCode() : 0);
    }

    public final void setExt(@Nullable VungleExt vungleExt) {
        this.ext = vungleExt;
    }

    public final void setH(int i10) {
        this.h = i10;
    }

    public final void setIfa(@Nullable String str) {
        this.ifa = str;
    }

    public final void setLmt(@Nullable Integer num) {
        this.lmt = num;
    }

    public final void setUa(@Nullable String str) {
        this.ua = str;
    }

    public final void setW(int i10) {
        this.w = i10;
    }

    @NotNull
    public String toString() {
        return "DeviceNode(make=" + this.make + ", model=" + this.model + ", osv=" + this.osv + ", carrier=" + this.carrier + ", os=" + this.os + ", w=" + this.w + ", h=" + this.h + ", ua=" + this.ua + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", ext=" + this.ext + ')';
    }

    public DeviceNode(@NotNull String make, @NotNull String model, @NotNull String osv, @Nullable String str, @NotNull String os, int i10, int i11, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable VungleExt vungleExt) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(osv, "osv");
        Intrinsics.checkNotNullParameter(os, "os");
        this.make = make;
        this.model = model;
        this.osv = osv;
        this.carrier = str;
        this.os = os;
        this.w = i10;
        this.h = i11;
        this.ua = str2;
        this.ifa = str3;
        this.lmt = num;
        this.ext = vungleExt;
    }

    public /* synthetic */ DeviceNode(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, VungleExt vungleExt, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4, str5, i10, i11, (i12 & 128) != 0 ? null : str6, (i12 & 256) != 0 ? null : str7, (i12 & 512) != 0 ? null : num, (i12 & 1024) != 0 ? null : vungleExt);
    }
}
