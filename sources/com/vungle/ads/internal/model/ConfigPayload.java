package com.vungle.ads.internal.model;

import com.ironsource.C4418ld;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ug.l;
import xg.f;
import yg.i;
import yg.i1;
import yg.t2;
import yg.x0;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@l
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bk\b\u0087\b\u0018\u0000 \u008d\u00012\u00020\u0001:\u0014\u008e\u0001\u008f\u0001\u0090\u0001\u008d\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001Bñ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b!\u0010\"B\u0085\u0002\b\u0017\u0012\u0006\u0010#\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0011\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J(\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*HÇ\u0001¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b?\u0010>J\u0012\u0010@\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bB\u0010>J\u0012\u0010C\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bC\u0010AJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bD\u0010>J\u0012\u0010E\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bE\u0010>J\u0012\u0010F\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bF\u0010>J\u0012\u0010G\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bK\u0010>J\u0012\u0010L\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\bL\u0010>Jú\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bO\u0010<J\u0010\u0010P\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u0010S\u001a\u00020\u00112\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bS\u0010TR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010U\u0012\u0004\bW\u0010X\u001a\u0004\bV\u00100R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010Y\u0012\u0004\b[\u0010X\u001a\u0004\bZ\u00102R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\\\u0012\u0004\b^\u0010X\u001a\u0004\b]\u00104R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010_\u0012\u0004\ba\u0010X\u001a\u0004\b`\u00106R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010b\u0012\u0004\bd\u0010X\u001a\u0004\bc\u00108R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010e\u0012\u0004\bg\u0010X\u001a\u0004\bf\u0010:R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010h\u0012\u0004\bj\u0010X\u001a\u0004\bi\u0010<R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010k\u0012\u0004\bm\u0010X\u001a\u0004\bl\u0010>R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010k\u0012\u0004\bn\u0010X\u001a\u0004\b\u0013\u0010>R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010o\u0012\u0004\bq\u0010X\u001a\u0004\bp\u0010AR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010k\u0012\u0004\bs\u0010X\u001a\u0004\br\u0010>R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010o\u0012\u0004\bu\u0010X\u001a\u0004\bt\u0010AR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010k\u0012\u0004\bw\u0010X\u001a\u0004\bv\u0010>R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010k\u0012\u0004\by\u0010X\u001a\u0004\bx\u0010>R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010k\u0012\u0004\b{\u0010X\u001a\u0004\bz\u0010>R+\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0019\n\u0004\b\u001c\u0010|\u0012\u0005\b\u0080\u0001\u0010X\u001a\u0004\b}\u0010H\"\u0004\b~\u0010\u007fR/\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u001e\u0010\u0081\u0001\u0012\u0005\b\u0085\u0001\u0010X\u001a\u0005\b\u0082\u0001\u0010J\"\u0006\b\u0083\u0001\u0010\u0084\u0001R.\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0004\b\u001f\u0010k\u0012\u0005\b\u0089\u0001\u0010X\u001a\u0005\b\u0086\u0001\u0010>\"\u0006\b\u0087\u0001\u0010\u0088\u0001R.\u0010 \u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u001c\n\u0004\b \u0010k\u0012\u0005\b\u008c\u0001\u0010X\u001a\u0005\b\u008a\u0001\u0010>\"\u0006\b\u008b\u0001\u0010\u0088\u0001¨\u0006\u0097\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload;", "", "Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "cleverCache", "Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "configSettings", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "endpoints", "Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "logMetricsSettings", "", "Lcom/vungle/ads/internal/model/Placement;", C4418ld.f43559c, "Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "userPrivacy", "", "configExtension", "", "disableAdId", "isReportIncentivizedEnabled", "", "sessionTimeout", "waitForConnectivityForTPAT", "signalSessionTimeout", "signalsDisabled", "fpdEnabled", "rtaDebugging", "", "configLastValidatedTimestamp", "Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "autoRedirect", "retryPriorityTPATs", "enableOT", "<init>", "(Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/ConfigPayload$CleverCache;Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;Ljava/lang/Boolean;Ljava/lang/Boolean;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/ConfigPayload;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "component2", "()Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "component3", "()Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "component4", "()Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "component5", "()Ljava/util/List;", "component6", "()Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "component7", "()Ljava/lang/String;", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "()Ljava/lang/Integer;", "component11", "component12", "component13", "component14", "component15", "component16", "()Ljava/lang/Long;", "component17", "()Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "component18", "component19", MenuActionType.COPY, "(Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/ConfigPayload;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "getCleverCache", "getCleverCache$annotations", "()V", "Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "getConfigSettings", "getConfigSettings$annotations", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "getEndpoints", "getEndpoints$annotations", "Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "getLogMetricsSettings", "getLogMetricsSettings$annotations", "Ljava/util/List;", "getPlacements", "getPlacements$annotations", "Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "getUserPrivacy", "getUserPrivacy$annotations", "Ljava/lang/String;", "getConfigExtension", "getConfigExtension$annotations", "Ljava/lang/Boolean;", "getDisableAdId", "getDisableAdId$annotations", "isReportIncentivizedEnabled$annotations", "Ljava/lang/Integer;", "getSessionTimeout", "getSessionTimeout$annotations", "getWaitForConnectivityForTPAT", "getWaitForConnectivityForTPAT$annotations", "getSignalSessionTimeout", "getSignalSessionTimeout$annotations", "getSignalsDisabled", "getSignalsDisabled$annotations", "getFpdEnabled", "getFpdEnabled$annotations", "getRtaDebugging", "getRtaDebugging$annotations", "Ljava/lang/Long;", "getConfigLastValidatedTimestamp", "setConfigLastValidatedTimestamp", "(Ljava/lang/Long;)V", "getConfigLastValidatedTimestamp$annotations", "Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "getAutoRedirect", "setAutoRedirect", "(Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;)V", "getAutoRedirect$annotations", "getRetryPriorityTPATs", "setRetryPriorityTPATs", "(Ljava/lang/Boolean;)V", "getRetryPriorityTPATs$annotations", "getEnableOT", "setEnableOT", "getEnableOT$annotations", y.f66058y, "$serializer", "AutoRedirect", "CleverCache", "ConfigSettings", "Endpoints", "GDPRSettings", "IABSettings", "LogMetricsSettings", "UserPrivacy", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ConfigPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private AutoRedirect autoRedirect;

    @Nullable
    private final CleverCache cleverCache;

    @Nullable
    private final String configExtension;

    @Nullable
    private Long configLastValidatedTimestamp;

    @Nullable
    private final ConfigSettings configSettings;

    @Nullable
    private final Boolean disableAdId;

    @Nullable
    private Boolean enableOT;

    @Nullable
    private final Endpoints endpoints;

    @Nullable
    private final Boolean fpdEnabled;

    @Nullable
    private final Boolean isReportIncentivizedEnabled;

    @Nullable
    private final LogMetricsSettings logMetricsSettings;

    @Nullable
    private final List<Placement> placements;

    @Nullable
    private Boolean retryPriorityTPATs;

    @Nullable
    private final Boolean rtaDebugging;

    @Nullable
    private final Integer sessionTimeout;

    @Nullable
    private final Integer signalSessionTimeout;

    @Nullable
    private final Boolean signalsDisabled;

    @Nullable
    private final UserPrivacy userPrivacy;

    @Nullable
    private final Boolean waitForConnectivityForTPAT;

    @l
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0018¨\u0006,"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "", "", "allowAutoRedirect", "", "afterClickDuration", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Long;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Long;", MenuActionType.COPY, "(Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAllowAutoRedirect", "getAllowAutoRedirect$annotations", "()V", "Ljava/lang/Long;", "getAfterClickDuration", "getAfterClickDuration$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class AutoRedirect {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Long afterClickDuration;

        @Nullable
        private final Boolean allowAutoRedirect;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return ConfigPayload$AutoRedirect$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public AutoRedirect() {
            this((Boolean) null, (Long) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ AutoRedirect copy$default(AutoRedirect autoRedirect, Boolean bool, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = autoRedirect.allowAutoRedirect;
            }
            if ((i10 & 2) != 0) {
                l10 = autoRedirect.afterClickDuration;
            }
            return autoRedirect.copy(bool, l10);
        }

        public static /* synthetic */ void getAfterClickDuration$annotations() {
        }

        public static /* synthetic */ void getAllowAutoRedirect$annotations() {
        }

        public static final void write$Self(@NotNull AutoRedirect self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Long l10;
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || !Intrinsics.areEqual(self.allowAutoRedirect, Boolean.FALSE)) {
                output.h(serialDesc, 0, i.f118983a, self.allowAutoRedirect);
            }
            if (output.r(serialDesc, 1) || (l10 = self.afterClickDuration) == null || l10.longValue() != Long.MAX_VALUE) {
                output.h(serialDesc, 1, i1.f118988a, self.afterClickDuration);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getAllowAutoRedirect() {
            return this.allowAutoRedirect;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getAfterClickDuration() {
            return this.afterClickDuration;
        }

        @NotNull
        public final AutoRedirect copy(@Nullable Boolean allowAutoRedirect, @Nullable Long afterClickDuration) {
            return new AutoRedirect(allowAutoRedirect, afterClickDuration);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoRedirect)) {
                return false;
            }
            AutoRedirect autoRedirect = (AutoRedirect) other;
            return Intrinsics.areEqual(this.allowAutoRedirect, autoRedirect.allowAutoRedirect) && Intrinsics.areEqual(this.afterClickDuration, autoRedirect.afterClickDuration);
        }

        @Nullable
        public final Long getAfterClickDuration() {
            return this.afterClickDuration;
        }

        @Nullable
        public final Boolean getAllowAutoRedirect() {
            return this.allowAutoRedirect;
        }

        public int hashCode() {
            Boolean bool = this.allowAutoRedirect;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l10 = this.afterClickDuration;
            return iHashCode + (l10 != null ? l10.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AutoRedirect(allowAutoRedirect=" + this.allowAutoRedirect + ", afterClickDuration=" + this.afterClickDuration + ')';
        }

        public /* synthetic */ AutoRedirect(int i10, Boolean bool, Long l10, t2 t2Var) {
            this.allowAutoRedirect = (i10 & 1) == 0 ? Boolean.FALSE : bool;
            if ((i10 & 2) == 0) {
                this.afterClickDuration = Long.MAX_VALUE;
            } else {
                this.afterClickDuration = l10;
            }
        }

        public AutoRedirect(@Nullable Boolean bool, @Nullable Long l10) {
            this.allowAutoRedirect = bool;
            this.afterClickDuration = l10;
        }

        public /* synthetic */ AutoRedirect(Boolean bool, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? Long.MAX_VALUE : l10);
        }
    }

    @l
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001b¨\u00062"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "", "", "enabled", "", "diskSize", "", "diskPercentage", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;)V", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Long;", "component3", "()Ljava/lang/Integer;", MenuActionType.COPY, "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getEnabled", "getEnabled$annotations", "()V", "Ljava/lang/Long;", "getDiskSize", "getDiskSize$annotations", "Ljava/lang/Integer;", "getDiskPercentage", "getDiskPercentage$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class CleverCache {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer diskPercentage;

        @Nullable
        private final Long diskSize;

        @Nullable
        private final Boolean enabled;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return ConfigPayload$CleverCache$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public CleverCache() {
            this((Boolean) null, (Long) null, (Integer) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ CleverCache copy$default(CleverCache cleverCache, Boolean bool, Long l10, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = cleverCache.enabled;
            }
            if ((i10 & 2) != 0) {
                l10 = cleverCache.diskSize;
            }
            if ((i10 & 4) != 0) {
                num = cleverCache.diskPercentage;
            }
            return cleverCache.copy(bool, l10, num);
        }

        public static /* synthetic */ void getDiskPercentage$annotations() {
        }

        public static /* synthetic */ void getDiskSize$annotations() {
        }

        public static /* synthetic */ void getEnabled$annotations() {
        }

        public static final void write$Self(@NotNull CleverCache self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Integer num;
            Long l10;
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || !Intrinsics.areEqual(self.enabled, Boolean.FALSE)) {
                output.h(serialDesc, 0, i.f118983a, self.enabled);
            }
            if (output.r(serialDesc, 1) || (l10 = self.diskSize) == null || l10.longValue() != 1000) {
                output.h(serialDesc, 1, i1.f118988a, self.diskSize);
            }
            if (output.r(serialDesc, 2) || (num = self.diskPercentage) == null || num.intValue() != 3) {
                output.h(serialDesc, 2, x0.f119093a, self.diskPercentage);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getEnabled() {
            return this.enabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getDiskSize() {
            return this.diskSize;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getDiskPercentage() {
            return this.diskPercentage;
        }

        @NotNull
        public final CleverCache copy(@Nullable Boolean enabled, @Nullable Long diskSize, @Nullable Integer diskPercentage) {
            return new CleverCache(enabled, diskSize, diskPercentage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CleverCache)) {
                return false;
            }
            CleverCache cleverCache = (CleverCache) other;
            return Intrinsics.areEqual(this.enabled, cleverCache.enabled) && Intrinsics.areEqual(this.diskSize, cleverCache.diskSize) && Intrinsics.areEqual(this.diskPercentage, cleverCache.diskPercentage);
        }

        @Nullable
        public final Integer getDiskPercentage() {
            return this.diskPercentage;
        }

        @Nullable
        public final Long getDiskSize() {
            return this.diskSize;
        }

        @Nullable
        public final Boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            Boolean bool = this.enabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l10 = this.diskSize;
            int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
            Integer num = this.diskPercentage;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CleverCache(enabled=" + this.enabled + ", diskSize=" + this.diskSize + ", diskPercentage=" + this.diskPercentage + ')';
        }

        public /* synthetic */ CleverCache(int i10, Boolean bool, Long l10, Integer num, t2 t2Var) {
            this.enabled = (i10 & 1) == 0 ? Boolean.FALSE : bool;
            if ((i10 & 2) == 0) {
                this.diskSize = 1000L;
            } else {
                this.diskSize = l10;
            }
            if ((i10 & 4) == 0) {
                this.diskPercentage = 3;
            } else {
                this.diskPercentage = num;
            }
        }

        public CleverCache(@Nullable Boolean bool, @Nullable Long l10, @Nullable Integer num) {
            this.enabled = bool;
            this.diskSize = l10;
            this.diskPercentage = num;
        }

        public /* synthetic */ CleverCache(Boolean bool, Long l10, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? 1000L : l10, (i10 & 4) != 0 ? 3 : num);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ConfigPayload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @l
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0014¨\u0006&"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "", "", "refreshTime", "<init>", "(Ljava/lang/Long;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/Long;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/Long;", MenuActionType.COPY, "(Ljava/lang/Long;)Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getRefreshTime", "getRefreshTime$annotations", "()V", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ConfigSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Long refreshTime;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return ConfigPayload$ConfigSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ConfigSettings() {
            this((Long) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ConfigSettings copy$default(ConfigSettings configSettings, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = configSettings.refreshTime;
            }
            return configSettings.copy(l10);
        }

        public static /* synthetic */ void getRefreshTime$annotations() {
        }

        public static final void write$Self(@NotNull ConfigSettings self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (!output.r(serialDesc, 0) && self.refreshTime == null) {
                return;
            }
            output.h(serialDesc, 0, i1.f118988a, self.refreshTime);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getRefreshTime() {
            return this.refreshTime;
        }

        @NotNull
        public final ConfigSettings copy(@Nullable Long refreshTime) {
            return new ConfigSettings(refreshTime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfigSettings) && Intrinsics.areEqual(this.refreshTime, ((ConfigSettings) other).refreshTime);
        }

        @Nullable
        public final Long getRefreshTime() {
            return this.refreshTime;
        }

        public int hashCode() {
            Long l10 = this.refreshTime;
            if (l10 == null) {
                return 0;
            }
            return l10.hashCode();
        }

        @NotNull
        public String toString() {
            return "ConfigSettings(refreshTime=" + this.refreshTime + ')';
        }

        public /* synthetic */ ConfigSettings(int i10, Long l10, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.refreshTime = null;
            } else {
                this.refreshTime = l10;
            }
        }

        public ConfigSettings(@Nullable Long l10) {
            this.refreshTime = l10;
        }

        public /* synthetic */ ConfigSettings(Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : l10);
        }
    }

    @l
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBK\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J@\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010\u0017¨\u00060"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "", "", "adsEndpoint", "riEndpoint", "errorLogsEndpoint", "metricsEndpoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAdsEndpoint", "getAdsEndpoint$annotations", "()V", "getRiEndpoint", "getRiEndpoint$annotations", "getErrorLogsEndpoint", "getErrorLogsEndpoint$annotations", "getMetricsEndpoint", "getMetricsEndpoint$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Endpoints {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final String adsEndpoint;

        @Nullable
        private final String errorLogsEndpoint;

        @Nullable
        private final String metricsEndpoint;

        @Nullable
        private final String riEndpoint;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return ConfigPayload$Endpoints$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Endpoints() {
            this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Endpoints copy$default(Endpoints endpoints, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = endpoints.adsEndpoint;
            }
            if ((i10 & 2) != 0) {
                str2 = endpoints.riEndpoint;
            }
            if ((i10 & 4) != 0) {
                str3 = endpoints.errorLogsEndpoint;
            }
            if ((i10 & 8) != 0) {
                str4 = endpoints.metricsEndpoint;
            }
            return endpoints.copy(str, str2, str3, str4);
        }

        public static /* synthetic */ void getAdsEndpoint$annotations() {
        }

        public static /* synthetic */ void getErrorLogsEndpoint$annotations() {
        }

        public static /* synthetic */ void getMetricsEndpoint$annotations() {
        }

        public static /* synthetic */ void getRiEndpoint$annotations() {
        }

        public static final void write$Self(@NotNull Endpoints self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || self.adsEndpoint != null) {
                output.h(serialDesc, 0, y2.f119104a, self.adsEndpoint);
            }
            if (output.r(serialDesc, 1) || self.riEndpoint != null) {
                output.h(serialDesc, 1, y2.f119104a, self.riEndpoint);
            }
            if (output.r(serialDesc, 2) || self.errorLogsEndpoint != null) {
                output.h(serialDesc, 2, y2.f119104a, self.errorLogsEndpoint);
            }
            if (!output.r(serialDesc, 3) && self.metricsEndpoint == null) {
                return;
            }
            output.h(serialDesc, 3, y2.f119104a, self.metricsEndpoint);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        @NotNull
        public final Endpoints copy(@Nullable String adsEndpoint, @Nullable String riEndpoint, @Nullable String errorLogsEndpoint, @Nullable String metricsEndpoint) {
            return new Endpoints(adsEndpoint, riEndpoint, errorLogsEndpoint, metricsEndpoint);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Endpoints)) {
                return false;
            }
            Endpoints endpoints = (Endpoints) other;
            return Intrinsics.areEqual(this.adsEndpoint, endpoints.adsEndpoint) && Intrinsics.areEqual(this.riEndpoint, endpoints.riEndpoint) && Intrinsics.areEqual(this.errorLogsEndpoint, endpoints.errorLogsEndpoint) && Intrinsics.areEqual(this.metricsEndpoint, endpoints.metricsEndpoint);
        }

        @Nullable
        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        @Nullable
        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        @Nullable
        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        @Nullable
        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        public int hashCode() {
            String str = this.adsEndpoint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.riEndpoint;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.errorLogsEndpoint;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.metricsEndpoint;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Endpoints(adsEndpoint=" + this.adsEndpoint + ", riEndpoint=" + this.riEndpoint + ", errorLogsEndpoint=" + this.errorLogsEndpoint + ", metricsEndpoint=" + this.metricsEndpoint + ')';
        }

        public /* synthetic */ Endpoints(int i10, String str, String str2, String str3, String str4, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.adsEndpoint = null;
            } else {
                this.adsEndpoint = str;
            }
            if ((i10 & 2) == 0) {
                this.riEndpoint = null;
            } else {
                this.riEndpoint = str2;
            }
            if ((i10 & 4) == 0) {
                this.errorLogsEndpoint = null;
            } else {
                this.errorLogsEndpoint = str3;
            }
            if ((i10 & 8) == 0) {
                this.metricsEndpoint = null;
            } else {
                this.metricsEndpoint = str4;
            }
        }

        public Endpoints(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.adsEndpoint = str;
            this.riEndpoint = str2;
            this.errorLogsEndpoint = str3;
            this.metricsEndpoint = str4;
        }

        public /* synthetic */ Endpoints(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
        }
    }

    @l
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bBc\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001cJX\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b*\u0010+\u001a\u0004\b\u0003\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b4\u0010+\u001a\u0004\b3\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b6\u0010+\u001a\u0004\b5\u0010\u001c¨\u00069"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "", "", "isCountryDataProtected", "", "consentTitle", "consentMessage", "consentMessageVersion", "buttonAccept", "buttonDeny", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", MenuActionType.COPY, "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "isCountryDataProtected$annotations", "()V", "Ljava/lang/String;", "getConsentTitle", "getConsentTitle$annotations", "getConsentMessage", "getConsentMessage$annotations", "getConsentMessageVersion", "getConsentMessageVersion$annotations", "getButtonAccept", "getButtonAccept$annotations", "getButtonDeny", "getButtonDeny$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class GDPRSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final String buttonAccept;

        @Nullable
        private final String buttonDeny;

        @Nullable
        private final String consentMessage;

        @Nullable
        private final String consentMessageVersion;

        @Nullable
        private final String consentTitle;

        @Nullable
        private final Boolean isCountryDataProtected;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return ConfigPayload$GDPRSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public GDPRSettings() {
            this((Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ GDPRSettings copy$default(GDPRSettings gDPRSettings, Boolean bool, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = gDPRSettings.isCountryDataProtected;
            }
            if ((i10 & 2) != 0) {
                str = gDPRSettings.consentTitle;
            }
            if ((i10 & 4) != 0) {
                str2 = gDPRSettings.consentMessage;
            }
            if ((i10 & 8) != 0) {
                str3 = gDPRSettings.consentMessageVersion;
            }
            if ((i10 & 16) != 0) {
                str4 = gDPRSettings.buttonAccept;
            }
            if ((i10 & 32) != 0) {
                str5 = gDPRSettings.buttonDeny;
            }
            String str6 = str4;
            String str7 = str5;
            return gDPRSettings.copy(bool, str, str2, str3, str6, str7);
        }

        public static /* synthetic */ void getButtonAccept$annotations() {
        }

        public static /* synthetic */ void getButtonDeny$annotations() {
        }

        public static /* synthetic */ void getConsentMessage$annotations() {
        }

        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        public static /* synthetic */ void getConsentTitle$annotations() {
        }

        public static /* synthetic */ void isCountryDataProtected$annotations() {
        }

        public static final void write$Self(@NotNull GDPRSettings self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || self.isCountryDataProtected != null) {
                output.h(serialDesc, 0, i.f118983a, self.isCountryDataProtected);
            }
            if (output.r(serialDesc, 1) || self.consentTitle != null) {
                output.h(serialDesc, 1, y2.f119104a, self.consentTitle);
            }
            if (output.r(serialDesc, 2) || self.consentMessage != null) {
                output.h(serialDesc, 2, y2.f119104a, self.consentMessage);
            }
            if (output.r(serialDesc, 3) || self.consentMessageVersion != null) {
                output.h(serialDesc, 3, y2.f119104a, self.consentMessageVersion);
            }
            if (output.r(serialDesc, 4) || self.buttonAccept != null) {
                output.h(serialDesc, 4, y2.f119104a, self.buttonAccept);
            }
            if (!output.r(serialDesc, 5) && self.buttonDeny == null) {
                return;
            }
            output.h(serialDesc, 5, y2.f119104a, self.buttonDeny);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConsentTitle() {
            return this.consentTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getConsentMessage() {
            return this.consentMessage;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        @NotNull
        public final GDPRSettings copy(@Nullable Boolean isCountryDataProtected, @Nullable String consentTitle, @Nullable String consentMessage, @Nullable String consentMessageVersion, @Nullable String buttonAccept, @Nullable String buttonDeny) {
            return new GDPRSettings(isCountryDataProtected, consentTitle, consentMessage, consentMessageVersion, buttonAccept, buttonDeny);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GDPRSettings)) {
                return false;
            }
            GDPRSettings gDPRSettings = (GDPRSettings) other;
            return Intrinsics.areEqual(this.isCountryDataProtected, gDPRSettings.isCountryDataProtected) && Intrinsics.areEqual(this.consentTitle, gDPRSettings.consentTitle) && Intrinsics.areEqual(this.consentMessage, gDPRSettings.consentMessage) && Intrinsics.areEqual(this.consentMessageVersion, gDPRSettings.consentMessageVersion) && Intrinsics.areEqual(this.buttonAccept, gDPRSettings.buttonAccept) && Intrinsics.areEqual(this.buttonDeny, gDPRSettings.buttonDeny);
        }

        @Nullable
        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        @Nullable
        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        @Nullable
        public final String getConsentMessage() {
            return this.consentMessage;
        }

        @Nullable
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        @Nullable
        public final String getConsentTitle() {
            return this.consentTitle;
        }

        public int hashCode() {
            Boolean bool = this.isCountryDataProtected;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.consentTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.consentMessage;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.consentMessageVersion;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonAccept;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.buttonDeny;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        @Nullable
        public final Boolean isCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        @NotNull
        public String toString() {
            return "GDPRSettings(isCountryDataProtected=" + this.isCountryDataProtected + ", consentTitle=" + this.consentTitle + ", consentMessage=" + this.consentMessage + ", consentMessageVersion=" + this.consentMessageVersion + ", buttonAccept=" + this.buttonAccept + ", buttonDeny=" + this.buttonDeny + ')';
        }

        public /* synthetic */ GDPRSettings(int i10, Boolean bool, String str, String str2, String str3, String str4, String str5, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.isCountryDataProtected = null;
            } else {
                this.isCountryDataProtected = bool;
            }
            if ((i10 & 2) == 0) {
                this.consentTitle = null;
            } else {
                this.consentTitle = str;
            }
            if ((i10 & 4) == 0) {
                this.consentMessage = null;
            } else {
                this.consentMessage = str2;
            }
            if ((i10 & 8) == 0) {
                this.consentMessageVersion = null;
            } else {
                this.consentMessageVersion = str3;
            }
            if ((i10 & 16) == 0) {
                this.buttonAccept = null;
            } else {
                this.buttonAccept = str4;
            }
            if ((i10 & 32) == 0) {
                this.buttonDeny = null;
            } else {
                this.buttonDeny = str5;
            }
        }

        public GDPRSettings(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.isCountryDataProtected = bool;
            this.consentTitle = str;
            this.consentMessage = str2;
            this.consentMessageVersion = str3;
            this.buttonAccept = str4;
            this.buttonDeny = str5;
        }

        public /* synthetic */ GDPRSettings(Boolean bool, String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5);
        }
    }

    @l
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$#%B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0013¨\u0006&"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "", "", "tcfStatus", "<init>", "(Ljava/lang/Integer;)V", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/Integer;", MenuActionType.COPY, "(Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getTcfStatus", "getTcfStatus$annotations", "()V", y.f66058y, "$serializer", "TcfStatus", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class IABSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer tcfStatus;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return ConfigPayload$IABSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "", "rawValue", "", "(Ljava/lang/String;II)V", "getRawValue", "()I", "ALLOW_ID", "DISABLE_ID", "LEGACY", y.f66058y, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum TcfStatus {
            ALLOW_ID(0),
            DISABLE_ID(1),
            LEGACY(2);


            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private static final Map<Integer, TcfStatus> rawValueMap;
            private final int rawValue;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus$Companion;", "", "()V", "rawValueMap", "", "", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "fromRawValue", "rawValue", "(Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @Nullable
                public final TcfStatus fromRawValue(@Nullable Integer rawValue) {
                    return (TcfStatus) TcfStatus.rawValueMap.get(rawValue);
                }

                private Companion() {
                }
            }

            static {
                TcfStatus[] tcfStatusArrValues = values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(MapsKt.mapCapacity(tcfStatusArrValues.length), 16));
                for (TcfStatus tcfStatus : tcfStatusArrValues) {
                    linkedHashMap.put(Integer.valueOf(tcfStatus.rawValue), tcfStatus);
                }
                rawValueMap = linkedHashMap;
            }

            TcfStatus(int i10) {
                this.rawValue = i10;
            }

            public final int getRawValue() {
                return this.rawValue;
            }
        }

        public IABSettings() {
            this((Integer) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ IABSettings copy$default(IABSettings iABSettings, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = iABSettings.tcfStatus;
            }
            return iABSettings.copy(num);
        }

        public static /* synthetic */ void getTcfStatus$annotations() {
        }

        public static final void write$Self(@NotNull IABSettings self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (!output.r(serialDesc, 0) && self.tcfStatus == null) {
                return;
            }
            output.h(serialDesc, 0, x0.f119093a, self.tcfStatus);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getTcfStatus() {
            return this.tcfStatus;
        }

        @NotNull
        public final IABSettings copy(@Nullable Integer tcfStatus) {
            return new IABSettings(tcfStatus);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IABSettings) && Intrinsics.areEqual(this.tcfStatus, ((IABSettings) other).tcfStatus);
        }

        @Nullable
        public final Integer getTcfStatus() {
            return this.tcfStatus;
        }

        public int hashCode() {
            Integer num = this.tcfStatus;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @NotNull
        public String toString() {
            return "IABSettings(tcfStatus=" + this.tcfStatus + ')';
        }

        public /* synthetic */ IABSettings(int i10, Integer num, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.tcfStatus = null;
            } else {
                this.tcfStatus = num;
            }
        }

        public IABSettings(@Nullable Integer num) {
            this.tcfStatus = num;
        }

        public /* synthetic */ IABSettings(Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : num);
        }
    }

    @l
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "", "", "errorLogLevel", "", "metricsEnabled", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Boolean;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/Boolean;", MenuActionType.COPY, "(Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getErrorLogLevel", "getErrorLogLevel$annotations", "()V", "Ljava/lang/Boolean;", "getMetricsEnabled", "getMetricsEnabled$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class LogMetricsSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer errorLogLevel;

        @Nullable
        private final Boolean metricsEnabled;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return ConfigPayload$LogMetricsSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public LogMetricsSettings() {
            this((Integer) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ LogMetricsSettings copy$default(LogMetricsSettings logMetricsSettings, Integer num, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = logMetricsSettings.errorLogLevel;
            }
            if ((i10 & 2) != 0) {
                bool = logMetricsSettings.metricsEnabled;
            }
            return logMetricsSettings.copy(num, bool);
        }

        public static /* synthetic */ void getErrorLogLevel$annotations() {
        }

        public static /* synthetic */ void getMetricsEnabled$annotations() {
        }

        public static final void write$Self(@NotNull LogMetricsSettings self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || self.errorLogLevel != null) {
                output.h(serialDesc, 0, x0.f119093a, self.errorLogLevel);
            }
            if (!output.r(serialDesc, 1) && self.metricsEnabled == null) {
                return;
            }
            output.h(serialDesc, 1, i.f118983a, self.metricsEnabled);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getErrorLogLevel() {
            return this.errorLogLevel;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        @NotNull
        public final LogMetricsSettings copy(@Nullable Integer errorLogLevel, @Nullable Boolean metricsEnabled) {
            return new LogMetricsSettings(errorLogLevel, metricsEnabled);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogMetricsSettings)) {
                return false;
            }
            LogMetricsSettings logMetricsSettings = (LogMetricsSettings) other;
            return Intrinsics.areEqual(this.errorLogLevel, logMetricsSettings.errorLogLevel) && Intrinsics.areEqual(this.metricsEnabled, logMetricsSettings.metricsEnabled);
        }

        @Nullable
        public final Integer getErrorLogLevel() {
            return this.errorLogLevel;
        }

        @Nullable
        public final Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        public int hashCode() {
            Integer num = this.errorLogLevel;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.metricsEnabled;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LogMetricsSettings(errorLogLevel=" + this.errorLogLevel + ", metricsEnabled=" + this.metricsEnabled + ')';
        }

        public /* synthetic */ LogMetricsSettings(int i10, Integer num, Boolean bool, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.errorLogLevel = null;
            } else {
                this.errorLogLevel = num;
            }
            if ((i10 & 2) == 0) {
                this.metricsEnabled = null;
            } else {
                this.metricsEnabled = bool;
            }
        }

        public LogMetricsSettings(@Nullable Integer num, @Nullable Boolean bool) {
            this.errorLogLevel = num;
            this.metricsEnabled = bool;
        }

        public /* synthetic */ LogMetricsSettings(Integer num, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : bool);
        }
    }

    @l
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u0018¨\u0006-"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "gdpr", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "iab", "<init>", "(Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "component2", "()Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", MenuActionType.COPY, "(Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;)Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "getGdpr", "getGdpr$annotations", "()V", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "getIab", "getIab$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class UserPrivacy {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final GDPRSettings gdpr;

        @Nullable
        private final IABSettings iab;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return ConfigPayload$UserPrivacy$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public UserPrivacy() {
            this((GDPRSettings) null, (IABSettings) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ UserPrivacy copy$default(UserPrivacy userPrivacy, GDPRSettings gDPRSettings, IABSettings iABSettings, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gDPRSettings = userPrivacy.gdpr;
            }
            if ((i10 & 2) != 0) {
                iABSettings = userPrivacy.iab;
            }
            return userPrivacy.copy(gDPRSettings, iABSettings);
        }

        public static /* synthetic */ void getGdpr$annotations() {
        }

        public static /* synthetic */ void getIab$annotations() {
        }

        public static final void write$Self(@NotNull UserPrivacy self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || self.gdpr != null) {
                output.h(serialDesc, 0, ConfigPayload$GDPRSettings$$serializer.INSTANCE, self.gdpr);
            }
            if (!output.r(serialDesc, 1) && self.iab == null) {
                return;
            }
            output.h(serialDesc, 1, ConfigPayload$IABSettings$$serializer.INSTANCE, self.iab);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GDPRSettings getGdpr() {
            return this.gdpr;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final IABSettings getIab() {
            return this.iab;
        }

        @NotNull
        public final UserPrivacy copy(@Nullable GDPRSettings gdpr, @Nullable IABSettings iab) {
            return new UserPrivacy(gdpr, iab);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserPrivacy)) {
                return false;
            }
            UserPrivacy userPrivacy = (UserPrivacy) other;
            return Intrinsics.areEqual(this.gdpr, userPrivacy.gdpr) && Intrinsics.areEqual(this.iab, userPrivacy.iab);
        }

        @Nullable
        public final GDPRSettings getGdpr() {
            return this.gdpr;
        }

        @Nullable
        public final IABSettings getIab() {
            return this.iab;
        }

        public int hashCode() {
            GDPRSettings gDPRSettings = this.gdpr;
            int iHashCode = (gDPRSettings == null ? 0 : gDPRSettings.hashCode()) * 31;
            IABSettings iABSettings = this.iab;
            return iHashCode + (iABSettings != null ? iABSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "UserPrivacy(gdpr=" + this.gdpr + ", iab=" + this.iab + ')';
        }

        public /* synthetic */ UserPrivacy(int i10, GDPRSettings gDPRSettings, IABSettings iABSettings, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gDPRSettings;
            }
            if ((i10 & 2) == 0) {
                this.iab = null;
            } else {
                this.iab = iABSettings;
            }
        }

        public UserPrivacy(@Nullable GDPRSettings gDPRSettings, @Nullable IABSettings iABSettings) {
            this.gdpr = gDPRSettings;
            this.iab = iABSettings;
        }

        public /* synthetic */ UserPrivacy(GDPRSettings gDPRSettings, IABSettings iABSettings, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : gDPRSettings, (i10 & 2) != 0 ? null : iABSettings);
        }
    }

    public ConfigPayload() {
        this((CleverCache) null, (ConfigSettings) null, (Endpoints) null, (LogMetricsSettings) null, (List) null, (UserPrivacy) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (AutoRedirect) null, (Boolean) null, (Boolean) null, 524287, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigPayload copy$default(ConfigPayload configPayload, CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7, Boolean bool8, int i10, Object obj) {
        Boolean bool9;
        Boolean bool10;
        CleverCache cleverCache2 = (i10 & 1) != 0 ? configPayload.cleverCache : cleverCache;
        ConfigSettings configSettings2 = (i10 & 2) != 0 ? configPayload.configSettings : configSettings;
        Endpoints endpoints2 = (i10 & 4) != 0 ? configPayload.endpoints : endpoints;
        LogMetricsSettings logMetricsSettings2 = (i10 & 8) != 0 ? configPayload.logMetricsSettings : logMetricsSettings;
        List list2 = (i10 & 16) != 0 ? configPayload.placements : list;
        UserPrivacy userPrivacy2 = (i10 & 32) != 0 ? configPayload.userPrivacy : userPrivacy;
        String str2 = (i10 & 64) != 0 ? configPayload.configExtension : str;
        Boolean bool11 = (i10 & 128) != 0 ? configPayload.disableAdId : bool;
        Boolean bool12 = (i10 & 256) != 0 ? configPayload.isReportIncentivizedEnabled : bool2;
        Integer num3 = (i10 & 512) != 0 ? configPayload.sessionTimeout : num;
        Boolean bool13 = (i10 & 1024) != 0 ? configPayload.waitForConnectivityForTPAT : bool3;
        Integer num4 = (i10 & 2048) != 0 ? configPayload.signalSessionTimeout : num2;
        Boolean bool14 = (i10 & 4096) != 0 ? configPayload.signalsDisabled : bool4;
        Boolean bool15 = (i10 & 8192) != 0 ? configPayload.fpdEnabled : bool5;
        CleverCache cleverCache3 = cleverCache2;
        Boolean bool16 = (i10 & 16384) != 0 ? configPayload.rtaDebugging : bool6;
        Long l11 = (i10 & 32768) != 0 ? configPayload.configLastValidatedTimestamp : l10;
        AutoRedirect autoRedirect2 = (i10 & 65536) != 0 ? configPayload.autoRedirect : autoRedirect;
        Boolean bool17 = (i10 & 131072) != 0 ? configPayload.retryPriorityTPATs : bool7;
        if ((i10 & 262144) != 0) {
            bool10 = bool17;
            bool9 = configPayload.enableOT;
        } else {
            bool9 = bool8;
            bool10 = bool17;
        }
        return configPayload.copy(cleverCache3, configSettings2, endpoints2, logMetricsSettings2, list2, userPrivacy2, str2, bool11, bool12, num3, bool13, num4, bool14, bool15, bool16, l11, autoRedirect2, bool10, bool9);
    }

    public static /* synthetic */ void getAutoRedirect$annotations() {
    }

    public static /* synthetic */ void getCleverCache$annotations() {
    }

    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
    }

    public static /* synthetic */ void getConfigSettings$annotations() {
    }

    public static /* synthetic */ void getDisableAdId$annotations() {
    }

    public static /* synthetic */ void getEnableOT$annotations() {
    }

    public static /* synthetic */ void getEndpoints$annotations() {
    }

    public static /* synthetic */ void getFpdEnabled$annotations() {
    }

    public static /* synthetic */ void getLogMetricsSettings$annotations() {
    }

    public static /* synthetic */ void getPlacements$annotations() {
    }

    public static /* synthetic */ void getRetryPriorityTPATs$annotations() {
    }

    public static /* synthetic */ void getRtaDebugging$annotations() {
    }

    public static /* synthetic */ void getSessionTimeout$annotations() {
    }

    public static /* synthetic */ void getSignalSessionTimeout$annotations() {
    }

    public static /* synthetic */ void getSignalsDisabled$annotations() {
    }

    public static /* synthetic */ void getUserPrivacy$annotations() {
    }

    public static /* synthetic */ void getWaitForConnectivityForTPAT$annotations() {
    }

    public static /* synthetic */ void isReportIncentivizedEnabled$annotations() {
    }

    public static final void write$Self(@NotNull ConfigPayload self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.r(serialDesc, 0) || self.cleverCache != null) {
            output.h(serialDesc, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, self.cleverCache);
        }
        if (output.r(serialDesc, 1) || self.configSettings != null) {
            output.h(serialDesc, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, self.configSettings);
        }
        if (output.r(serialDesc, 2) || self.endpoints != null) {
            output.h(serialDesc, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, self.endpoints);
        }
        if (output.r(serialDesc, 3) || self.logMetricsSettings != null) {
            output.h(serialDesc, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, self.logMetricsSettings);
        }
        if (output.r(serialDesc, 4) || self.placements != null) {
            output.h(serialDesc, 4, new yg.f(Placement$$serializer.INSTANCE), self.placements);
        }
        if (output.r(serialDesc, 5) || self.userPrivacy != null) {
            output.h(serialDesc, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, self.userPrivacy);
        }
        if (output.r(serialDesc, 6) || self.configExtension != null) {
            output.h(serialDesc, 6, y2.f119104a, self.configExtension);
        }
        if (output.r(serialDesc, 7) || !Intrinsics.areEqual(self.disableAdId, Boolean.TRUE)) {
            output.h(serialDesc, 7, i.f118983a, self.disableAdId);
        }
        if (output.r(serialDesc, 8) || self.isReportIncentivizedEnabled != null) {
            output.h(serialDesc, 8, i.f118983a, self.isReportIncentivizedEnabled);
        }
        if (output.r(serialDesc, 9) || self.sessionTimeout != null) {
            output.h(serialDesc, 9, x0.f119093a, self.sessionTimeout);
        }
        if (output.r(serialDesc, 10) || self.waitForConnectivityForTPAT != null) {
            output.h(serialDesc, 10, i.f118983a, self.waitForConnectivityForTPAT);
        }
        if (output.r(serialDesc, 11) || self.signalSessionTimeout != null) {
            output.h(serialDesc, 11, x0.f119093a, self.signalSessionTimeout);
        }
        if (output.r(serialDesc, 12) || self.signalsDisabled != null) {
            output.h(serialDesc, 12, i.f118983a, self.signalsDisabled);
        }
        if (output.r(serialDesc, 13) || self.fpdEnabled != null) {
            output.h(serialDesc, 13, i.f118983a, self.fpdEnabled);
        }
        if (output.r(serialDesc, 14) || self.rtaDebugging != null) {
            output.h(serialDesc, 14, i.f118983a, self.rtaDebugging);
        }
        if (output.r(serialDesc, 15) || self.configLastValidatedTimestamp != null) {
            output.h(serialDesc, 15, i1.f118988a, self.configLastValidatedTimestamp);
        }
        if (output.r(serialDesc, 16) || self.autoRedirect != null) {
            output.h(serialDesc, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, self.autoRedirect);
        }
        if (output.r(serialDesc, 17) || self.retryPriorityTPATs != null) {
            output.h(serialDesc, 17, i.f118983a, self.retryPriorityTPATs);
        }
        if (!output.r(serialDesc, 18) && self.enableOT == null) {
            return;
        }
        output.h(serialDesc, 18, i.f118983a, self.enableOT);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CleverCache getCleverCache() {
        return this.cleverCache;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final AutoRedirect getAutoRedirect() {
        return this.autoRedirect;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getRetryPriorityTPATs() {
        return this.retryPriorityTPATs;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getEnableOT() {
        return this.enableOT;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Endpoints getEndpoints() {
        return this.endpoints;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LogMetricsSettings getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    @Nullable
    public final List<Placement> component5() {
        return this.placements;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UserPrivacy getUserPrivacy() {
        return this.userPrivacy;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getConfigExtension() {
        return this.configExtension;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    @NotNull
    public final ConfigPayload copy(@Nullable CleverCache cleverCache, @Nullable ConfigSettings configSettings, @Nullable Endpoints endpoints, @Nullable LogMetricsSettings logMetricsSettings, @Nullable List<Placement> placements, @Nullable UserPrivacy userPrivacy, @Nullable String configExtension, @Nullable Boolean disableAdId, @Nullable Boolean isReportIncentivizedEnabled, @Nullable Integer sessionTimeout, @Nullable Boolean waitForConnectivityForTPAT, @Nullable Integer signalSessionTimeout, @Nullable Boolean signalsDisabled, @Nullable Boolean fpdEnabled, @Nullable Boolean rtaDebugging, @Nullable Long configLastValidatedTimestamp, @Nullable AutoRedirect autoRedirect, @Nullable Boolean retryPriorityTPATs, @Nullable Boolean enableOT) {
        return new ConfigPayload(cleverCache, configSettings, endpoints, logMetricsSettings, placements, userPrivacy, configExtension, disableAdId, isReportIncentivizedEnabled, sessionTimeout, waitForConnectivityForTPAT, signalSessionTimeout, signalsDisabled, fpdEnabled, rtaDebugging, configLastValidatedTimestamp, autoRedirect, retryPriorityTPATs, enableOT);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigPayload)) {
            return false;
        }
        ConfigPayload configPayload = (ConfigPayload) other;
        return Intrinsics.areEqual(this.cleverCache, configPayload.cleverCache) && Intrinsics.areEqual(this.configSettings, configPayload.configSettings) && Intrinsics.areEqual(this.endpoints, configPayload.endpoints) && Intrinsics.areEqual(this.logMetricsSettings, configPayload.logMetricsSettings) && Intrinsics.areEqual(this.placements, configPayload.placements) && Intrinsics.areEqual(this.userPrivacy, configPayload.userPrivacy) && Intrinsics.areEqual(this.configExtension, configPayload.configExtension) && Intrinsics.areEqual(this.disableAdId, configPayload.disableAdId) && Intrinsics.areEqual(this.isReportIncentivizedEnabled, configPayload.isReportIncentivizedEnabled) && Intrinsics.areEqual(this.sessionTimeout, configPayload.sessionTimeout) && Intrinsics.areEqual(this.waitForConnectivityForTPAT, configPayload.waitForConnectivityForTPAT) && Intrinsics.areEqual(this.signalSessionTimeout, configPayload.signalSessionTimeout) && Intrinsics.areEqual(this.signalsDisabled, configPayload.signalsDisabled) && Intrinsics.areEqual(this.fpdEnabled, configPayload.fpdEnabled) && Intrinsics.areEqual(this.rtaDebugging, configPayload.rtaDebugging) && Intrinsics.areEqual(this.configLastValidatedTimestamp, configPayload.configLastValidatedTimestamp) && Intrinsics.areEqual(this.autoRedirect, configPayload.autoRedirect) && Intrinsics.areEqual(this.retryPriorityTPATs, configPayload.retryPriorityTPATs) && Intrinsics.areEqual(this.enableOT, configPayload.enableOT);
    }

    @Nullable
    public final AutoRedirect getAutoRedirect() {
        return this.autoRedirect;
    }

    @Nullable
    public final CleverCache getCleverCache() {
        return this.cleverCache;
    }

    @Nullable
    public final String getConfigExtension() {
        return this.configExtension;
    }

    @Nullable
    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    @Nullable
    public final ConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    @Nullable
    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    @Nullable
    public final Boolean getEnableOT() {
        return this.enableOT;
    }

    @Nullable
    public final Endpoints getEndpoints() {
        return this.endpoints;
    }

    @Nullable
    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    @Nullable
    public final LogMetricsSettings getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    @Nullable
    public final List<Placement> getPlacements() {
        return this.placements;
    }

    @Nullable
    public final Boolean getRetryPriorityTPATs() {
        return this.retryPriorityTPATs;
    }

    @Nullable
    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    @Nullable
    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    @Nullable
    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    @Nullable
    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    @Nullable
    public final UserPrivacy getUserPrivacy() {
        return this.userPrivacy;
    }

    @Nullable
    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    public int hashCode() {
        CleverCache cleverCache = this.cleverCache;
        int iHashCode = (cleverCache == null ? 0 : cleverCache.hashCode()) * 31;
        ConfigSettings configSettings = this.configSettings;
        int iHashCode2 = (iHashCode + (configSettings == null ? 0 : configSettings.hashCode())) * 31;
        Endpoints endpoints = this.endpoints;
        int iHashCode3 = (iHashCode2 + (endpoints == null ? 0 : endpoints.hashCode())) * 31;
        LogMetricsSettings logMetricsSettings = this.logMetricsSettings;
        int iHashCode4 = (iHashCode3 + (logMetricsSettings == null ? 0 : logMetricsSettings.hashCode())) * 31;
        List<Placement> list = this.placements;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        UserPrivacy userPrivacy = this.userPrivacy;
        int iHashCode6 = (iHashCode5 + (userPrivacy == null ? 0 : userPrivacy.hashCode())) * 31;
        String str = this.configExtension;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disableAdId;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isReportIncentivizedEnabled;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.sessionTimeout;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.waitForConnectivityForTPAT;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.signalSessionTimeout;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.signalsDisabled;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.fpdEnabled;
        int iHashCode14 = (iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.rtaDebugging;
        int iHashCode15 = (iHashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l10 = this.configLastValidatedTimestamp;
        int iHashCode16 = (iHashCode15 + (l10 == null ? 0 : l10.hashCode())) * 31;
        AutoRedirect autoRedirect = this.autoRedirect;
        int iHashCode17 = (iHashCode16 + (autoRedirect == null ? 0 : autoRedirect.hashCode())) * 31;
        Boolean bool7 = this.retryPriorityTPATs;
        int iHashCode18 = (iHashCode17 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.enableOT;
        return iHashCode18 + (bool8 != null ? bool8.hashCode() : 0);
    }

    @Nullable
    public final Boolean isReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public final void setAutoRedirect(@Nullable AutoRedirect autoRedirect) {
        this.autoRedirect = autoRedirect;
    }

    public final void setConfigLastValidatedTimestamp(@Nullable Long l10) {
        this.configLastValidatedTimestamp = l10;
    }

    public final void setEnableOT(@Nullable Boolean bool) {
        this.enableOT = bool;
    }

    public final void setRetryPriorityTPATs(@Nullable Boolean bool) {
        this.retryPriorityTPATs = bool;
    }

    @NotNull
    public String toString() {
        return "ConfigPayload(cleverCache=" + this.cleverCache + ", configSettings=" + this.configSettings + ", endpoints=" + this.endpoints + ", logMetricsSettings=" + this.logMetricsSettings + ", placements=" + this.placements + ", userPrivacy=" + this.userPrivacy + ", configExtension=" + this.configExtension + ", disableAdId=" + this.disableAdId + ", isReportIncentivizedEnabled=" + this.isReportIncentivizedEnabled + ", sessionTimeout=" + this.sessionTimeout + ", waitForConnectivityForTPAT=" + this.waitForConnectivityForTPAT + ", signalSessionTimeout=" + this.signalSessionTimeout + ", signalsDisabled=" + this.signalsDisabled + ", fpdEnabled=" + this.fpdEnabled + ", rtaDebugging=" + this.rtaDebugging + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ", autoRedirect=" + this.autoRedirect + ", retryPriorityTPATs=" + this.retryPriorityTPATs + ", enableOT=" + this.enableOT + ')';
    }

    public /* synthetic */ ConfigPayload(int i10, CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7, Boolean bool8, t2 t2Var) {
        if ((i10 & 1) == 0) {
            this.cleverCache = null;
        } else {
            this.cleverCache = cleverCache;
        }
        if ((i10 & 2) == 0) {
            this.configSettings = null;
        } else {
            this.configSettings = configSettings;
        }
        if ((i10 & 4) == 0) {
            this.endpoints = null;
        } else {
            this.endpoints = endpoints;
        }
        if ((i10 & 8) == 0) {
            this.logMetricsSettings = null;
        } else {
            this.logMetricsSettings = logMetricsSettings;
        }
        if ((i10 & 16) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i10 & 32) == 0) {
            this.userPrivacy = null;
        } else {
            this.userPrivacy = userPrivacy;
        }
        if ((i10 & 64) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        if ((i10 & 128) == 0) {
            this.disableAdId = Boolean.TRUE;
        } else {
            this.disableAdId = bool;
        }
        if ((i10 & 256) == 0) {
            this.isReportIncentivizedEnabled = null;
        } else {
            this.isReportIncentivizedEnabled = bool2;
        }
        if ((i10 & 512) == 0) {
            this.sessionTimeout = null;
        } else {
            this.sessionTimeout = num;
        }
        if ((i10 & 1024) == 0) {
            this.waitForConnectivityForTPAT = null;
        } else {
            this.waitForConnectivityForTPAT = bool3;
        }
        if ((i10 & 2048) == 0) {
            this.signalSessionTimeout = null;
        } else {
            this.signalSessionTimeout = num2;
        }
        if ((i10 & 4096) == 0) {
            this.signalsDisabled = null;
        } else {
            this.signalsDisabled = bool4;
        }
        if ((i10 & 8192) == 0) {
            this.fpdEnabled = null;
        } else {
            this.fpdEnabled = bool5;
        }
        if ((i10 & 16384) == 0) {
            this.rtaDebugging = null;
        } else {
            this.rtaDebugging = bool6;
        }
        if ((32768 & i10) == 0) {
            this.configLastValidatedTimestamp = null;
        } else {
            this.configLastValidatedTimestamp = l10;
        }
        if ((65536 & i10) == 0) {
            this.autoRedirect = null;
        } else {
            this.autoRedirect = autoRedirect;
        }
        if ((131072 & i10) == 0) {
            this.retryPriorityTPATs = null;
        } else {
            this.retryPriorityTPATs = bool7;
        }
        if ((i10 & 262144) == 0) {
            this.enableOT = null;
        } else {
            this.enableOT = bool8;
        }
    }

    public ConfigPayload(@Nullable CleverCache cleverCache, @Nullable ConfigSettings configSettings, @Nullable Endpoints endpoints, @Nullable LogMetricsSettings logMetricsSettings, @Nullable List<Placement> list, @Nullable UserPrivacy userPrivacy, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Boolean bool3, @Nullable Integer num2, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Long l10, @Nullable AutoRedirect autoRedirect, @Nullable Boolean bool7, @Nullable Boolean bool8) {
        this.cleverCache = cleverCache;
        this.configSettings = configSettings;
        this.endpoints = endpoints;
        this.logMetricsSettings = logMetricsSettings;
        this.placements = list;
        this.userPrivacy = userPrivacy;
        this.configExtension = str;
        this.disableAdId = bool;
        this.isReportIncentivizedEnabled = bool2;
        this.sessionTimeout = num;
        this.waitForConnectivityForTPAT = bool3;
        this.signalSessionTimeout = num2;
        this.signalsDisabled = bool4;
        this.fpdEnabled = bool5;
        this.rtaDebugging = bool6;
        this.configLastValidatedTimestamp = l10;
        this.autoRedirect = autoRedirect;
        this.retryPriorityTPATs = bool7;
        this.enableOT = bool8;
    }

    public /* synthetic */ ConfigPayload(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7, Boolean bool8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : cleverCache, (i10 & 2) != 0 ? null : configSettings, (i10 & 4) != 0 ? null : endpoints, (i10 & 8) != 0 ? null : logMetricsSettings, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : userPrivacy, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? Boolean.TRUE : bool, (i10 & 256) != 0 ? null : bool2, (i10 & 512) != 0 ? null : num, (i10 & 1024) != 0 ? null : bool3, (i10 & 2048) != 0 ? null : num2, (i10 & 4096) != 0 ? null : bool4, (i10 & 8192) != 0 ? null : bool5, (i10 & 16384) != 0 ? null : bool6, (i10 & 32768) != 0 ? null : l10, (i10 & 65536) != 0 ? null : autoRedirect, (i10 & 131072) != 0 ? null : bool7, (i10 & 262144) != 0 ? null : bool8);
    }
}
