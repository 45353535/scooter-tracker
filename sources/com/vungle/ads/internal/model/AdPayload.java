package com.vungle.ads.internal.model;

import androidx.annotation.VisibleForTesting;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.amazon.device.ads.DtbConstants;
import com.mbridge.msdk.foundation.entity.b;
import com.my.target.common.menu.MenuActionType;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.f.y;
import com.vungle.ads.AdConfig;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.c0;
import kotlinx.serialization.json.g0;
import kotlinx.serialization.json.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ug.l;
import vg.a;
import xg.f;
import yg.c1;
import yg.i;
import yg.i1;
import yg.t2;
import yg.x0;
import yg.y2;

/* JADX INFO: loaded from: classes11.dex */
@l
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 \u009a\u00012\u00020\u0001:\u0016\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009a\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0085\u0001\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0001\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0016\b\u0001\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0007\u0010\u0017J%\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b%\u0010&J(\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*HÇ\u0001¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b2\u00100J\r\u00103\u001a\u00020\t¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\t¢\u0006\u0004\b5\u00104J\u000f\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b7\u00108J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u00109J\r\u0010:\u001a\u00020\u0012¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0012¢\u0006\u0004\b<\u0010;J\r\u0010=\u001a\u00020\u0012¢\u0006\u0004\b=\u0010;J\r\u0010>\u001a\u00020\u0012¢\u0006\u0004\b>\u0010;J\u0015\u0010@\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u000e¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u0012¢\u0006\u0004\bB\u0010;J\u0017\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010C\u001a\u00020\u000e¢\u0006\u0004\bE\u0010FJ\u001b\u0010G\u001a\b\u0012\u0004\u0012\u00020D0\u00022\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bG\u0010HJ5\u0010K\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00022\u0006\u0010I\u001a\u00020\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020,¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\u0012¢\u0006\u0004\bO\u0010;J\u0015\u0010P\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020\u0012¢\u0006\u0004\bR\u0010;J\u000f\u0010S\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bS\u00100J-\u0010X\u001a\u00020,2\u0006\u0010T\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\u000e¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020,¢\u0006\u0004\bZ\u0010NJ\u0019\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\u0004\b[\u0010\\J\r\u0010^\u001a\u00020]¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\t2\b\u0010`\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\ba\u0010bJ\r\u0010c\u001a\u00020\u000e¢\u0006\u0004\bc\u00100J\u000f\u0010d\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bd\u00100J\u000f\u0010e\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\be\u00100J\u000f\u0010f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bf\u00100J\u000f\u0010h\u001a\u0004\u0018\u00010g¢\u0006\u0004\bh\u0010iJ\r\u0010j\u001a\u00020\u0012¢\u0006\u0004\bj\u0010;J\u001d\u0010m\u001a\u00020,2\u0006\u0010k\u001a\u00020\u000e2\u0006\u0010l\u001a\u00020\u0018¢\u0006\u0004\bm\u0010nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010o\u0012\u0004\bp\u0010NR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0006\u0010q\u0012\u0004\br\u0010NR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010sR(\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000f\u0010t\u0012\u0004\bu\u0010NR4\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010v\u0012\u0004\bz\u0010N\u001a\u0004\bw\u0010\\\"\u0004\bx\u0010yR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010{\u001a\u0004\b|\u0010;\"\u0004\b}\u0010~R2\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u0012\u0005\b\u0086\u0001\u0010N\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R3\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u0012\u0005\b\u008e\u0001\u0010N\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R+\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0014\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u00100R0\u0010\u0092\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020D0\u00108\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010v\u0012\u0005\b\u0094\u0001\u0010N\u001a\u0005\b\u0093\u0001\u0010\\R\u0019\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0099\u0001\u001a\u0004\u0018\u0001068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u00108¨\u0006¥\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload;", "", "", "Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", b.JSON_KEY_ADS, "Lcom/vungle/ads/internal/model/ConfigPayload;", "config", "<init>", "(Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload;)V", "", "seen1", "", "expiryWindowStart", "j$/util/concurrent/ConcurrentHashMap", "", "mraidFiles", "", "incentivizedTextSettings", "", "assetsFullyDownloaded", "indexFilePath", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload;Ljava/lang/Long;Lj$/util/concurrent/ConcurrentHashMap;Ljava/util/Map;ZLjava/lang/String;Lyg/t2;)V", "Ljava/io/File;", "dir", "Lkotlin/Pair;", "getIndexHtmlFile", "(Ljava/io/File;)Lkotlin/Pair;", "percentage", "computeAssetRequirement", "(Ljava/lang/Integer;)Lkotlin/Pair;", "value", "valueOrEmpty", "(Ljava/lang/String;)Ljava/lang/String;", "oldValue", "newValue", "complexReplace", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/AdPayload;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "placementId", "()Ljava/lang/String;", "eventId", "advAppId", "adWidth", "()I", "adHeight", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "adUnit", "()Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "()Lcom/vungle/ads/internal/model/ConfigPayload;", "adLoadOptimizationEnabled", "()Z", "isPartialDownloadEnabled", "omEnabled", "isClickCoordinatesTrackingEnabled", "failingUrl", "isCriticalAsset", "(Ljava/lang/String;)Z", "heartbeatEnabled", "remoteUrl", "Lcom/vungle/ads/internal/model/AdAsset;", "getLocalPartialDownloadAssets", "(Ljava/lang/String;)Lcom/vungle/ads/internal/model/AdAsset;", "getDownloadableAssets", "(Ljava/io/File;)Ljava/util/List;", "event", "secondValue", "getTpatUrls", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "recordExpiryWindowStart", "()V", "hasExpired", "getWinNotifications", "()Ljava/util/List;", "isNativeTemplateType", "templateType", "title", "body", "keepWatching", "close", "setIncentivizedText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "setAssetFullyDownloaded", "getMRAIDArgsInMap", "()Ljava/util/Map;", "Lkotlinx/serialization/json/JsonObject;", "createMRAIDArgs", "()Lkotlinx/serialization/json/JsonObject;", "incentivized", "getShowCloseDelay", "(Ljava/lang/Boolean;)I", "getCreativeId", "getAdSource", "getMediationName", "getViewMasterVersion", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "getWebViewSettings", "()Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "usePreloading", "adIdentifier", "localFile", "updateAdAssetPath", "(Ljava/lang/String;Ljava/io/File;)V", "Ljava/util/List;", "getAds$annotations", "Lcom/vungle/ads/internal/model/ConfigPayload;", "getConfig$annotations", "Ljava/lang/Long;", "Lj$/util/concurrent/ConcurrentHashMap;", "getMraidFiles$annotations", "Ljava/util/Map;", "getIncentivizedTextSettings", "setIncentivizedTextSettings", "(Ljava/util/Map;)V", "getIncentivizedTextSettings$annotations", "Z", "getAssetsFullyDownloaded", "setAssetsFullyDownloaded", "(Z)V", "Lcom/vungle/ads/AdConfig;", "adConfig", "Lcom/vungle/ads/AdConfig;", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "setAdConfig", "(Lcom/vungle/ads/AdConfig;)V", "getAdConfig$annotations", "Lcom/vungle/ads/internal/util/LogEntry;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "setLogEntry$vungle_ads_release", "(Lcom/vungle/ads/internal/util/LogEntry;)V", "getLogEntry$vungle_ads_release$annotations", "<set-?>", "Ljava/lang/String;", "getIndexFilePath", "partialDownloadAssets", "getPartialDownloadAssets$vungle_ads_release", "getPartialDownloadAssets$vungle_ads_release$annotations", "getAd", "()Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "ad", "getAdMarkup", "adMarkup", y.f66058y, "$serializer", "AdSizeInfo", "AdUnit", "CacheableReplacement", "PlacementAdUnit", "TemplateSettings", "TpatSerializer", "ViewAbility", "ViewAbilityInfo", "WebViewSettings", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String FILE_SCHEME = "file://";

    @NotNull
    public static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";

    @NotNull
    public static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";

    @NotNull
    public static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";

    @NotNull
    public static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";

    @NotNull
    public static final String KEY_VM = "vmURL";

    @NotNull
    private static final String TAG = "AdPayload";

    @NotNull
    public static final String TPAT_CLICK_COORDINATES_URLS = "video.clickCoordinates";

    @NotNull
    private static final String UNKNOWN = "unknown";

    @Nullable
    private AdConfig adConfig;

    @Nullable
    private final List<PlacementAdUnit> ads;
    private boolean assetsFullyDownloaded;

    @Nullable
    private final ConfigPayload config;

    @Nullable
    private Long expiryWindowStart;

    @NotNull
    private Map<String, String> incentivizedTextSettings;

    @Nullable
    private String indexFilePath;

    @Nullable
    private LogEntry logEntry;

    @NotNull
    private ConcurrentHashMap<String, String> mraidFiles;

    @NotNull
    private final Map<String, AdAsset> partialDownloadAssets;

    @l
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J(\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0014R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0014¨\u0006)"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "", "", "width", "height", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/Integer;", "component2", MenuActionType.COPY, "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getWidth", "getWidth$annotations", "()V", "getHeight", "getHeight$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class AdSizeInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer height;

        @Nullable
        private final Integer width;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return AdPayload$AdSizeInfo$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public AdSizeInfo() {
            this((Integer) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ AdSizeInfo copy$default(AdSizeInfo adSizeInfo, Integer num, Integer num2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = adSizeInfo.width;
            }
            if ((i10 & 2) != 0) {
                num2 = adSizeInfo.height;
            }
            return adSizeInfo.copy(num, num2);
        }

        public static /* synthetic */ void getHeight$annotations() {
        }

        public static /* synthetic */ void getWidth$annotations() {
        }

        public static final void write$Self(@NotNull AdSizeInfo self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Integer num;
            Integer num2;
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || (num2 = self.width) == null || num2.intValue() != 0) {
                output.h(serialDesc, 0, x0.f119093a, self.width);
            }
            if (output.r(serialDesc, 1) || (num = self.height) == null || num.intValue() != 0) {
                output.h(serialDesc, 1, x0.f119093a, self.height);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getWidth() {
            return this.width;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getHeight() {
            return this.height;
        }

        @NotNull
        public final AdSizeInfo copy(@Nullable Integer width, @Nullable Integer height) {
            return new AdSizeInfo(width, height);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdSizeInfo)) {
                return false;
            }
            AdSizeInfo adSizeInfo = (AdSizeInfo) other;
            return Intrinsics.areEqual(this.width, adSizeInfo.width) && Intrinsics.areEqual(this.height, adSizeInfo.height);
        }

        @Nullable
        public final Integer getHeight() {
            return this.height;
        }

        @Nullable
        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            Integer num = this.width;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.height;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdSizeInfo(width=" + this.width + ", height=" + this.height + ')';
        }

        public /* synthetic */ AdSizeInfo(int i10, Integer num, Integer num2, t2 t2Var) {
            this.width = (i10 & 1) == 0 ? 0 : num;
            if ((i10 & 2) == 0) {
                this.height = 0;
            } else {
                this.height = num2;
            }
        }

        public AdSizeInfo(@Nullable Integer num, @Nullable Integer num2) {
            this.width = num;
            this.height = num2;
        }

        public /* synthetic */ AdSizeInfo(Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? 0 : num2);
        }
    }

    @l
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bz\b\u0087\b\u0018\u0000 ¬\u00012\u00020\u0001:\u0004\u00ad\u0001¬\u0001B\u008d\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b)\u0010*B¡\u0003\b\u0017\u0012\u0006\u0010+\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u001c\b\u0001\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013\u0012\u0010\b\u0001\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\n\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b)\u0010.J(\u00105\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202HÇ\u0001¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u00108J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u00108J\u0012\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b=\u0010<J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u00108J\u0012\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bA\u0010@J\u0012\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bB\u0010@J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u00108J\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u00108J\u0012\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bE\u0010<J\u0012\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bF\u0010<J$\u0010G\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u00108J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u00108J\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u00108J\u0018\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0018\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bN\u0010MJ\u0012\u0010O\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u00108J\u0012\u0010R\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bT\u00108J\u0012\u0010U\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bU\u00108J\u0012\u0010V\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bV\u0010<J\u0012\u0010W\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bW\u0010<J\u0012\u0010X\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0012\u0010Z\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bZ\u0010[J\u0012\u0010\\\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\\\u0010@J\u0012\u0010]\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b]\u0010@J\u0096\u0003\u0010^\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00132\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00132\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b`\u00108J\u0010\u0010a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\ba\u0010bJ\u001a\u0010d\u001a\u00020\n2\b\u0010c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bd\u0010eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010f\u0012\u0004\bh\u0010i\u001a\u0004\bg\u00108R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010f\u0012\u0004\bk\u0010i\u001a\u0004\bj\u00108R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010f\u0012\u0004\bm\u0010i\u001a\u0004\bl\u00108R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010n\u0012\u0004\bp\u0010i\u001a\u0004\bo\u0010<R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010n\u0012\u0004\br\u0010i\u001a\u0004\bq\u0010<R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010f\u0012\u0004\bt\u0010i\u001a\u0004\bs\u00108R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010u\u0012\u0004\bw\u0010i\u001a\u0004\bv\u0010@R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010u\u0012\u0004\by\u0010i\u001a\u0004\bx\u0010@R\"\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010u\u0012\u0004\b{\u0010i\u001a\u0004\bz\u0010@R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010f\u0012\u0004\b}\u0010i\u001a\u0004\b|\u00108R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010f\u0012\u0004\b\u007f\u0010i\u001a\u0004\b~\u00108R$\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0010\u0010n\u0012\u0005\b\u0081\u0001\u0010i\u001a\u0005\b\u0080\u0001\u0010<R$\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0011\u0010n\u0012\u0005\b\u0083\u0001\u0010i\u001a\u0005\b\u0082\u0001\u0010<R7\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0014\u0010\u0084\u0001\u0012\u0005\b\u0086\u0001\u0010i\u001a\u0005\b\u0085\u0001\u0010HR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0015\u0010f\u0012\u0005\b\u0088\u0001\u0010i\u001a\u0005\b\u0087\u0001\u00108R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0016\u0010f\u0012\u0005\b\u008a\u0001\u0010i\u001a\u0005\b\u0089\u0001\u00108R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0017\u0010f\u0012\u0005\b\u008c\u0001\u0010i\u001a\u0005\b\u008b\u0001\u00108R+\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0018\u0010\u008d\u0001\u0012\u0005\b\u008f\u0001\u0010i\u001a\u0005\b\u008e\u0001\u0010MR+\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u0019\u0010\u008d\u0001\u0012\u0005\b\u0091\u0001\u0010i\u001a\u0005\b\u0090\u0001\u0010MR%\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001b\u0010\u0092\u0001\u0012\u0005\b\u0094\u0001\u0010i\u001a\u0005\b\u0093\u0001\u0010PR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001c\u0010f\u0012\u0005\b\u0096\u0001\u0010i\u001a\u0005\b\u0095\u0001\u00108R%\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001e\u0010\u0097\u0001\u0012\u0005\b\u0099\u0001\u0010i\u001a\u0005\b\u0098\u0001\u0010SR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001f\u0010f\u0012\u0005\b\u009b\u0001\u0010i\u001a\u0005\b\u009a\u0001\u00108R$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b \u0010f\u0012\u0005\b\u009d\u0001\u0010i\u001a\u0005\b\u009c\u0001\u00108R$\u0010!\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b!\u0010n\u0012\u0005\b\u009f\u0001\u0010i\u001a\u0005\b\u009e\u0001\u0010<R$\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\"\u0010n\u0012\u0005\b¡\u0001\u0010i\u001a\u0005\b \u0001\u0010<R%\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b$\u0010¢\u0001\u0012\u0005\b¤\u0001\u0010i\u001a\u0005\b£\u0001\u0010YR%\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b&\u0010¥\u0001\u0012\u0005\b§\u0001\u0010i\u001a\u0005\b¦\u0001\u0010[R$\u0010'\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b'\u0010u\u0012\u0005\b©\u0001\u0010i\u001a\u0005\b¨\u0001\u0010@R$\u0010(\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b(\u0010u\u0012\u0005\b«\u0001\u0010i\u001a\u0005\bª\u0001\u0010@¨\u0006®\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "", "", "id", "adType", "adSource", "", "expiry", "expiryDuration", "deeplinkUrl", "", "clickCoordinatesEnabled", "adLoadOptimizationEnabled", "templateHeartbeatCheck", DtbConstants.MEDIATION_NAME, "info", "sleep", "errorCode", "", "", "tpat", AdPayload.KEY_VM, "vmVersion", "adMarketId", "notification", "loadAdUrls", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "viewAbility", "templateType", "Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "templateSettings", "creativeId", "advAppId", "showClose", "showCloseIncentivized", "Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "adSizeInfo", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "webViewSettings", "usePreloading", "partialDownloadEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/AdPayload$AdUnit;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Ljava/util/Map;", "component15", "component16", "component17", "component18", "()Ljava/util/List;", "component19", "component20", "()Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "component21", "component22", "()Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "component23", "component24", "component25", "component26", "component27", "()Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "component28", "()Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "component29", "component30", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAdType", "getAdType$annotations", "getAdSource", "getAdSource$annotations", "Ljava/lang/Integer;", "getExpiry", "getExpiry$annotations", "getExpiryDuration", "getExpiryDuration$annotations", "getDeeplinkUrl", "getDeeplinkUrl$annotations", "Ljava/lang/Boolean;", "getClickCoordinatesEnabled", "getClickCoordinatesEnabled$annotations", "getAdLoadOptimizationEnabled", "getAdLoadOptimizationEnabled$annotations", "getTemplateHeartbeatCheck", "getTemplateHeartbeatCheck$annotations", "getMediationName", "getMediationName$annotations", "getInfo", "getInfo$annotations", "getSleep", "getSleep$annotations", "getErrorCode", "getErrorCode$annotations", "Ljava/util/Map;", "getTpat", "getTpat$annotations", "getVmURL", "getVmURL$annotations", "getVmVersion", "getVmVersion$annotations", "getAdMarketId", "getAdMarketId$annotations", "Ljava/util/List;", "getNotification", "getNotification$annotations", "getLoadAdUrls", "getLoadAdUrls$annotations", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "getViewAbility", "getViewAbility$annotations", "getTemplateType", "getTemplateType$annotations", "Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "getTemplateSettings", "getTemplateSettings$annotations", "getCreativeId", "getCreativeId$annotations", "getAdvAppId", "getAdvAppId$annotations", "getShowClose", "getShowClose$annotations", "getShowCloseIncentivized", "getShowCloseIncentivized$annotations", "Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "getAdSizeInfo", "getAdSizeInfo$annotations", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "getWebViewSettings", "getWebViewSettings$annotations", "getUsePreloading", "getUsePreloading$annotations", "getPartialDownloadEnabled", "getPartialDownloadEnabled$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class AdUnit {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Boolean adLoadOptimizationEnabled;

        @Nullable
        private final String adMarketId;

        @Nullable
        private final AdSizeInfo adSizeInfo;

        @Nullable
        private final String adSource;

        @Nullable
        private final String adType;

        @Nullable
        private final String advAppId;

        @Nullable
        private final Boolean clickCoordinatesEnabled;

        @Nullable
        private final String creativeId;

        @Nullable
        private final String deeplinkUrl;

        @Nullable
        private final Integer errorCode;

        @Nullable
        private final Integer expiry;

        @Nullable
        private final Integer expiryDuration;

        @Nullable
        private final String id;

        @Nullable
        private final String info;

        @Nullable
        private final List<String> loadAdUrls;

        @Nullable
        private final String mediationName;

        @Nullable
        private final List<String> notification;

        @Nullable
        private final Boolean partialDownloadEnabled;

        @Nullable
        private final Integer showClose;

        @Nullable
        private final Integer showCloseIncentivized;

        @Nullable
        private final Integer sleep;

        @Nullable
        private final Boolean templateHeartbeatCheck;

        @Nullable
        private final TemplateSettings templateSettings;

        @Nullable
        private final String templateType;

        @Nullable
        private final Map<String, List<String>> tpat;

        @Nullable
        private final Boolean usePreloading;

        @Nullable
        private final ViewAbility viewAbility;

        @Nullable
        private final String vmURL;

        @Nullable
        private final String vmVersion;

        @Nullable
        private final WebViewSettings webViewSettings;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdUnit$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return AdPayload$AdUnit$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public AdUnit() {
            this((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Integer) null, (Map) null, (String) null, (String) null, (String) null, (List) null, (List) null, (ViewAbility) null, (String) null, (TemplateSettings) null, (String) null, (String) null, (Integer) null, (Integer) null, (AdSizeInfo) null, (WebViewSettings) null, (Boolean) null, (Boolean) null, 1073741823, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AdUnit copy$default(AdUnit adUnit, String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, Integer num3, Integer num4, Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool4, Boolean bool5, int i10, Object obj) {
            Boolean bool6;
            Boolean bool7;
            String str13 = (i10 & 1) != 0 ? adUnit.id : str;
            String str14 = (i10 & 2) != 0 ? adUnit.adType : str2;
            String str15 = (i10 & 4) != 0 ? adUnit.adSource : str3;
            Integer num7 = (i10 & 8) != 0 ? adUnit.expiry : num;
            Integer num8 = (i10 & 16) != 0 ? adUnit.expiryDuration : num2;
            String str16 = (i10 & 32) != 0 ? adUnit.deeplinkUrl : str4;
            Boolean bool8 = (i10 & 64) != 0 ? adUnit.clickCoordinatesEnabled : bool;
            Boolean bool9 = (i10 & 128) != 0 ? adUnit.adLoadOptimizationEnabled : bool2;
            Boolean bool10 = (i10 & 256) != 0 ? adUnit.templateHeartbeatCheck : bool3;
            String str17 = (i10 & 512) != 0 ? adUnit.mediationName : str5;
            String str18 = (i10 & 1024) != 0 ? adUnit.info : str6;
            Integer num9 = (i10 & 2048) != 0 ? adUnit.sleep : num3;
            Integer num10 = (i10 & 4096) != 0 ? adUnit.errorCode : num4;
            Map map2 = (i10 & 8192) != 0 ? adUnit.tpat : map;
            String str19 = str13;
            String str20 = (i10 & 16384) != 0 ? adUnit.vmURL : str7;
            String str21 = (i10 & 32768) != 0 ? adUnit.vmVersion : str8;
            String str22 = (i10 & 65536) != 0 ? adUnit.adMarketId : str9;
            List list3 = (i10 & 131072) != 0 ? adUnit.notification : list;
            List list4 = (i10 & 262144) != 0 ? adUnit.loadAdUrls : list2;
            ViewAbility viewAbility2 = (i10 & 524288) != 0 ? adUnit.viewAbility : viewAbility;
            String str23 = (i10 & 1048576) != 0 ? adUnit.templateType : str10;
            TemplateSettings templateSettings2 = (i10 & 2097152) != 0 ? adUnit.templateSettings : templateSettings;
            String str24 = (i10 & 4194304) != 0 ? adUnit.creativeId : str11;
            String str25 = (i10 & 8388608) != 0 ? adUnit.advAppId : str12;
            Integer num11 = (i10 & 16777216) != 0 ? adUnit.showClose : num5;
            Integer num12 = (i10 & 33554432) != 0 ? adUnit.showCloseIncentivized : num6;
            AdSizeInfo adSizeInfo2 = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? adUnit.adSizeInfo : adSizeInfo;
            WebViewSettings webViewSettings2 = (i10 & 134217728) != 0 ? adUnit.webViewSettings : webViewSettings;
            Boolean bool11 = (i10 & 268435456) != 0 ? adUnit.usePreloading : bool4;
            if ((i10 & 536870912) != 0) {
                bool7 = bool11;
                bool6 = adUnit.partialDownloadEnabled;
            } else {
                bool6 = bool5;
                bool7 = bool11;
            }
            return adUnit.copy(str19, str14, str15, num7, num8, str16, bool8, bool9, bool10, str17, str18, num9, num10, map2, str20, str21, str22, list3, list4, viewAbility2, str23, templateSettings2, str24, str25, num11, num12, adSizeInfo2, webViewSettings2, bool7, bool6);
        }

        public static /* synthetic */ void getAdLoadOptimizationEnabled$annotations() {
        }

        public static /* synthetic */ void getAdMarketId$annotations() {
        }

        public static /* synthetic */ void getAdSizeInfo$annotations() {
        }

        public static /* synthetic */ void getAdSource$annotations() {
        }

        public static /* synthetic */ void getAdType$annotations() {
        }

        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        public static /* synthetic */ void getClickCoordinatesEnabled$annotations() {
        }

        public static /* synthetic */ void getCreativeId$annotations() {
        }

        public static /* synthetic */ void getDeeplinkUrl$annotations() {
        }

        public static /* synthetic */ void getErrorCode$annotations() {
        }

        public static /* synthetic */ void getExpiry$annotations() {
        }

        public static /* synthetic */ void getExpiryDuration$annotations() {
        }

        public static /* synthetic */ void getId$annotations() {
        }

        public static /* synthetic */ void getInfo$annotations() {
        }

        public static /* synthetic */ void getLoadAdUrls$annotations() {
        }

        public static /* synthetic */ void getMediationName$annotations() {
        }

        public static /* synthetic */ void getNotification$annotations() {
        }

        public static /* synthetic */ void getPartialDownloadEnabled$annotations() {
        }

        public static /* synthetic */ void getShowClose$annotations() {
        }

        public static /* synthetic */ void getShowCloseIncentivized$annotations() {
        }

        public static /* synthetic */ void getSleep$annotations() {
        }

        public static /* synthetic */ void getTemplateHeartbeatCheck$annotations() {
        }

        public static /* synthetic */ void getTemplateSettings$annotations() {
        }

        public static /* synthetic */ void getTemplateType$annotations() {
        }

        @l(with = TpatSerializer.class)
        public static /* synthetic */ void getTpat$annotations() {
        }

        public static /* synthetic */ void getUsePreloading$annotations() {
        }

        public static /* synthetic */ void getViewAbility$annotations() {
        }

        public static /* synthetic */ void getVmURL$annotations() {
        }

        public static /* synthetic */ void getVmVersion$annotations() {
        }

        public static /* synthetic */ void getWebViewSettings$annotations() {
        }

        public static final void write$Self(@NotNull AdUnit self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Integer num;
            Integer num2;
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || self.id != null) {
                output.h(serialDesc, 0, y2.f119104a, self.id);
            }
            if (output.r(serialDesc, 1) || self.adType != null) {
                output.h(serialDesc, 1, y2.f119104a, self.adType);
            }
            if (output.r(serialDesc, 2) || self.adSource != null) {
                output.h(serialDesc, 2, y2.f119104a, self.adSource);
            }
            if (output.r(serialDesc, 3) || self.expiry != null) {
                output.h(serialDesc, 3, x0.f119093a, self.expiry);
            }
            if (output.r(serialDesc, 4) || self.expiryDuration != null) {
                output.h(serialDesc, 4, x0.f119093a, self.expiryDuration);
            }
            if (output.r(serialDesc, 5) || self.deeplinkUrl != null) {
                output.h(serialDesc, 5, y2.f119104a, self.deeplinkUrl);
            }
            if (output.r(serialDesc, 6) || self.clickCoordinatesEnabled != null) {
                output.h(serialDesc, 6, i.f118983a, self.clickCoordinatesEnabled);
            }
            if (output.r(serialDesc, 7) || self.adLoadOptimizationEnabled != null) {
                output.h(serialDesc, 7, i.f118983a, self.adLoadOptimizationEnabled);
            }
            if (output.r(serialDesc, 8) || self.templateHeartbeatCheck != null) {
                output.h(serialDesc, 8, i.f118983a, self.templateHeartbeatCheck);
            }
            if (output.r(serialDesc, 9) || self.mediationName != null) {
                output.h(serialDesc, 9, y2.f119104a, self.mediationName);
            }
            if (output.r(serialDesc, 10) || self.info != null) {
                output.h(serialDesc, 10, y2.f119104a, self.info);
            }
            if (output.r(serialDesc, 11) || self.sleep != null) {
                output.h(serialDesc, 11, x0.f119093a, self.sleep);
            }
            if (output.r(serialDesc, 12) || self.errorCode != null) {
                output.h(serialDesc, 12, x0.f119093a, self.errorCode);
            }
            if (output.r(serialDesc, 13) || self.tpat != null) {
                output.h(serialDesc, 13, TpatSerializer.INSTANCE, self.tpat);
            }
            if (output.r(serialDesc, 14) || self.vmURL != null) {
                output.h(serialDesc, 14, y2.f119104a, self.vmURL);
            }
            if (output.r(serialDesc, 15) || self.vmVersion != null) {
                output.h(serialDesc, 15, y2.f119104a, self.vmVersion);
            }
            if (output.r(serialDesc, 16) || self.adMarketId != null) {
                output.h(serialDesc, 16, y2.f119104a, self.adMarketId);
            }
            if (output.r(serialDesc, 17) || self.notification != null) {
                output.h(serialDesc, 17, new yg.f(y2.f119104a), self.notification);
            }
            if (output.r(serialDesc, 18) || self.loadAdUrls != null) {
                output.h(serialDesc, 18, new yg.f(y2.f119104a), self.loadAdUrls);
            }
            if (output.r(serialDesc, 19) || self.viewAbility != null) {
                output.h(serialDesc, 19, AdPayload$ViewAbility$$serializer.INSTANCE, self.viewAbility);
            }
            if (output.r(serialDesc, 20) || self.templateType != null) {
                output.h(serialDesc, 20, y2.f119104a, self.templateType);
            }
            if (output.r(serialDesc, 21) || self.templateSettings != null) {
                output.h(serialDesc, 21, AdPayload$TemplateSettings$$serializer.INSTANCE, self.templateSettings);
            }
            if (output.r(serialDesc, 22) || self.creativeId != null) {
                output.h(serialDesc, 22, y2.f119104a, self.creativeId);
            }
            if (output.r(serialDesc, 23) || self.advAppId != null) {
                output.h(serialDesc, 23, y2.f119104a, self.advAppId);
            }
            if (output.r(serialDesc, 24) || (num2 = self.showClose) == null || num2.intValue() != 0) {
                output.h(serialDesc, 24, x0.f119093a, self.showClose);
            }
            if (output.r(serialDesc, 25) || (num = self.showCloseIncentivized) == null || num.intValue() != 0) {
                output.h(serialDesc, 25, x0.f119093a, self.showCloseIncentivized);
            }
            if (output.r(serialDesc, 26) || self.adSizeInfo != null) {
                output.h(serialDesc, 26, AdPayload$AdSizeInfo$$serializer.INSTANCE, self.adSizeInfo);
            }
            if (output.r(serialDesc, 27) || self.webViewSettings != null) {
                output.h(serialDesc, 27, AdPayload$WebViewSettings$$serializer.INSTANCE, self.webViewSettings);
            }
            if (output.r(serialDesc, 28) || !Intrinsics.areEqual(self.usePreloading, Boolean.FALSE)) {
                output.h(serialDesc, 28, i.f118983a, self.usePreloading);
            }
            if (!output.r(serialDesc, 29) && self.partialDownloadEnabled == null) {
                return;
            }
            output.h(serialDesc, 29, i.f118983a, self.partialDownloadEnabled);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getMediationName() {
            return this.mediationName;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getInfo() {
            return this.info;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Integer getSleep() {
            return this.sleep;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        @Nullable
        public final Map<String, List<String>> component14() {
            return this.tpat;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getVmURL() {
            return this.vmURL;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getVmVersion() {
            return this.vmVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getAdMarketId() {
            return this.adMarketId;
        }

        @Nullable
        public final List<String> component18() {
            return this.notification;
        }

        @Nullable
        public final List<String> component19() {
            return this.loadAdUrls;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAdType() {
            return this.adType;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final ViewAbility getViewAbility() {
            return this.viewAbility;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final String getTemplateType() {
            return this.templateType;
        }

        @Nullable
        /* JADX INFO: renamed from: component22, reason: from getter */
        public final TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        @Nullable
        /* JADX INFO: renamed from: component23, reason: from getter */
        public final String getCreativeId() {
            return this.creativeId;
        }

        @Nullable
        /* JADX INFO: renamed from: component24, reason: from getter */
        public final String getAdvAppId() {
            return this.advAppId;
        }

        @Nullable
        /* JADX INFO: renamed from: component25, reason: from getter */
        public final Integer getShowClose() {
            return this.showClose;
        }

        @Nullable
        /* JADX INFO: renamed from: component26, reason: from getter */
        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        @Nullable
        /* JADX INFO: renamed from: component27, reason: from getter */
        public final AdSizeInfo getAdSizeInfo() {
            return this.adSizeInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component28, reason: from getter */
        public final WebViewSettings getWebViewSettings() {
            return this.webViewSettings;
        }

        @Nullable
        /* JADX INFO: renamed from: component29, reason: from getter */
        public final Boolean getUsePreloading() {
            return this.usePreloading;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAdSource() {
            return this.adSource;
        }

        @Nullable
        /* JADX INFO: renamed from: component30, reason: from getter */
        public final Boolean getPartialDownloadEnabled() {
            return this.partialDownloadEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getExpiry() {
            return this.expiry;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Integer getExpiryDuration() {
            return this.expiryDuration;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Boolean getTemplateHeartbeatCheck() {
            return this.templateHeartbeatCheck;
        }

        @NotNull
        public final AdUnit copy(@Nullable String id2, @Nullable String adType, @Nullable String adSource, @Nullable Integer expiry, @Nullable Integer expiryDuration, @Nullable String deeplinkUrl, @Nullable Boolean clickCoordinatesEnabled, @Nullable Boolean adLoadOptimizationEnabled, @Nullable Boolean templateHeartbeatCheck, @Nullable String mediationName, @Nullable String info, @Nullable Integer sleep, @Nullable Integer errorCode, @Nullable Map<String, ? extends List<String>> tpat, @Nullable String vmURL, @Nullable String vmVersion, @Nullable String adMarketId, @Nullable List<String> notification, @Nullable List<String> loadAdUrls, @Nullable ViewAbility viewAbility, @Nullable String templateType, @Nullable TemplateSettings templateSettings, @Nullable String creativeId, @Nullable String advAppId, @Nullable Integer showClose, @Nullable Integer showCloseIncentivized, @Nullable AdSizeInfo adSizeInfo, @Nullable WebViewSettings webViewSettings, @Nullable Boolean usePreloading, @Nullable Boolean partialDownloadEnabled) {
            return new AdUnit(id2, adType, adSource, expiry, expiryDuration, deeplinkUrl, clickCoordinatesEnabled, adLoadOptimizationEnabled, templateHeartbeatCheck, mediationName, info, sleep, errorCode, tpat, vmURL, vmVersion, adMarketId, notification, loadAdUrls, viewAbility, templateType, templateSettings, creativeId, advAppId, showClose, showCloseIncentivized, adSizeInfo, webViewSettings, usePreloading, partialDownloadEnabled);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdUnit)) {
                return false;
            }
            AdUnit adUnit = (AdUnit) other;
            return Intrinsics.areEqual(this.id, adUnit.id) && Intrinsics.areEqual(this.adType, adUnit.adType) && Intrinsics.areEqual(this.adSource, adUnit.adSource) && Intrinsics.areEqual(this.expiry, adUnit.expiry) && Intrinsics.areEqual(this.expiryDuration, adUnit.expiryDuration) && Intrinsics.areEqual(this.deeplinkUrl, adUnit.deeplinkUrl) && Intrinsics.areEqual(this.clickCoordinatesEnabled, adUnit.clickCoordinatesEnabled) && Intrinsics.areEqual(this.adLoadOptimizationEnabled, adUnit.adLoadOptimizationEnabled) && Intrinsics.areEqual(this.templateHeartbeatCheck, adUnit.templateHeartbeatCheck) && Intrinsics.areEqual(this.mediationName, adUnit.mediationName) && Intrinsics.areEqual(this.info, adUnit.info) && Intrinsics.areEqual(this.sleep, adUnit.sleep) && Intrinsics.areEqual(this.errorCode, adUnit.errorCode) && Intrinsics.areEqual(this.tpat, adUnit.tpat) && Intrinsics.areEqual(this.vmURL, adUnit.vmURL) && Intrinsics.areEqual(this.vmVersion, adUnit.vmVersion) && Intrinsics.areEqual(this.adMarketId, adUnit.adMarketId) && Intrinsics.areEqual(this.notification, adUnit.notification) && Intrinsics.areEqual(this.loadAdUrls, adUnit.loadAdUrls) && Intrinsics.areEqual(this.viewAbility, adUnit.viewAbility) && Intrinsics.areEqual(this.templateType, adUnit.templateType) && Intrinsics.areEqual(this.templateSettings, adUnit.templateSettings) && Intrinsics.areEqual(this.creativeId, adUnit.creativeId) && Intrinsics.areEqual(this.advAppId, adUnit.advAppId) && Intrinsics.areEqual(this.showClose, adUnit.showClose) && Intrinsics.areEqual(this.showCloseIncentivized, adUnit.showCloseIncentivized) && Intrinsics.areEqual(this.adSizeInfo, adUnit.adSizeInfo) && Intrinsics.areEqual(this.webViewSettings, adUnit.webViewSettings) && Intrinsics.areEqual(this.usePreloading, adUnit.usePreloading) && Intrinsics.areEqual(this.partialDownloadEnabled, adUnit.partialDownloadEnabled);
        }

        @Nullable
        public final Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        @Nullable
        public final String getAdMarketId() {
            return this.adMarketId;
        }

        @Nullable
        public final AdSizeInfo getAdSizeInfo() {
            return this.adSizeInfo;
        }

        @Nullable
        public final String getAdSource() {
            return this.adSource;
        }

        @Nullable
        public final String getAdType() {
            return this.adType;
        }

        @Nullable
        public final String getAdvAppId() {
            return this.advAppId;
        }

        @Nullable
        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        @Nullable
        public final String getCreativeId() {
            return this.creativeId;
        }

        @Nullable
        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        @Nullable
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        @Nullable
        public final Integer getExpiry() {
            return this.expiry;
        }

        @Nullable
        public final Integer getExpiryDuration() {
            return this.expiryDuration;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getInfo() {
            return this.info;
        }

        @Nullable
        public final List<String> getLoadAdUrls() {
            return this.loadAdUrls;
        }

        @Nullable
        public final String getMediationName() {
            return this.mediationName;
        }

        @Nullable
        public final List<String> getNotification() {
            return this.notification;
        }

        @Nullable
        public final Boolean getPartialDownloadEnabled() {
            return this.partialDownloadEnabled;
        }

        @Nullable
        public final Integer getShowClose() {
            return this.showClose;
        }

        @Nullable
        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        @Nullable
        public final Integer getSleep() {
            return this.sleep;
        }

        @Nullable
        public final Boolean getTemplateHeartbeatCheck() {
            return this.templateHeartbeatCheck;
        }

        @Nullable
        public final TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        @Nullable
        public final String getTemplateType() {
            return this.templateType;
        }

        @Nullable
        public final Map<String, List<String>> getTpat() {
            return this.tpat;
        }

        @Nullable
        public final Boolean getUsePreloading() {
            return this.usePreloading;
        }

        @Nullable
        public final ViewAbility getViewAbility() {
            return this.viewAbility;
        }

        @Nullable
        public final String getVmURL() {
            return this.vmURL;
        }

        @Nullable
        public final String getVmVersion() {
            return this.vmVersion;
        }

        @Nullable
        public final WebViewSettings getWebViewSettings() {
            return this.webViewSettings;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.adType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.adSource;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.expiry;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryDuration;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str4 = this.deeplinkUrl;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.clickCoordinatesEnabled;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.adLoadOptimizationEnabled;
            int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.templateHeartbeatCheck;
            int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str5 = this.mediationName;
            int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.info;
            int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num3 = this.sleep;
            int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.errorCode;
            int iHashCode13 = (iHashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Map<String, List<String>> map = this.tpat;
            int iHashCode14 = (iHashCode13 + (map == null ? 0 : map.hashCode())) * 31;
            String str7 = this.vmURL;
            int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.vmVersion;
            int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.adMarketId;
            int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
            List<String> list = this.notification;
            int iHashCode18 = (iHashCode17 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.loadAdUrls;
            int iHashCode19 = (iHashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
            ViewAbility viewAbility = this.viewAbility;
            int iHashCode20 = (iHashCode19 + (viewAbility == null ? 0 : viewAbility.hashCode())) * 31;
            String str10 = this.templateType;
            int iHashCode21 = (iHashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
            TemplateSettings templateSettings = this.templateSettings;
            int iHashCode22 = (iHashCode21 + (templateSettings == null ? 0 : templateSettings.hashCode())) * 31;
            String str11 = this.creativeId;
            int iHashCode23 = (iHashCode22 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.advAppId;
            int iHashCode24 = (iHashCode23 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Integer num5 = this.showClose;
            int iHashCode25 = (iHashCode24 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.showCloseIncentivized;
            int iHashCode26 = (iHashCode25 + (num6 == null ? 0 : num6.hashCode())) * 31;
            AdSizeInfo adSizeInfo = this.adSizeInfo;
            int iHashCode27 = (iHashCode26 + (adSizeInfo == null ? 0 : adSizeInfo.hashCode())) * 31;
            WebViewSettings webViewSettings = this.webViewSettings;
            int iHashCode28 = (iHashCode27 + (webViewSettings == null ? 0 : webViewSettings.hashCode())) * 31;
            Boolean bool4 = this.usePreloading;
            int iHashCode29 = (iHashCode28 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.partialDownloadEnabled;
            return iHashCode29 + (bool5 != null ? bool5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdUnit(id=" + this.id + ", adType=" + this.adType + ", adSource=" + this.adSource + ", expiry=" + this.expiry + ", expiryDuration=" + this.expiryDuration + ", deeplinkUrl=" + this.deeplinkUrl + ", clickCoordinatesEnabled=" + this.clickCoordinatesEnabled + ", adLoadOptimizationEnabled=" + this.adLoadOptimizationEnabled + ", templateHeartbeatCheck=" + this.templateHeartbeatCheck + ", mediationName=" + this.mediationName + ", info=" + this.info + ", sleep=" + this.sleep + ", errorCode=" + this.errorCode + ", tpat=" + this.tpat + ", vmURL=" + this.vmURL + ", vmVersion=" + this.vmVersion + ", adMarketId=" + this.adMarketId + ", notification=" + this.notification + ", loadAdUrls=" + this.loadAdUrls + ", viewAbility=" + this.viewAbility + ", templateType=" + this.templateType + ", templateSettings=" + this.templateSettings + ", creativeId=" + this.creativeId + ", advAppId=" + this.advAppId + ", showClose=" + this.showClose + ", showCloseIncentivized=" + this.showCloseIncentivized + ", adSizeInfo=" + this.adSizeInfo + ", webViewSettings=" + this.webViewSettings + ", usePreloading=" + this.usePreloading + ", partialDownloadEnabled=" + this.partialDownloadEnabled + ')';
        }

        public /* synthetic */ AdUnit(int i10, String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, Integer num3, Integer num4, @l(with = TpatSerializer.class) Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool4, Boolean bool5, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.id = null;
            } else {
                this.id = str;
            }
            if ((i10 & 2) == 0) {
                this.adType = null;
            } else {
                this.adType = str2;
            }
            if ((i10 & 4) == 0) {
                this.adSource = null;
            } else {
                this.adSource = str3;
            }
            if ((i10 & 8) == 0) {
                this.expiry = null;
            } else {
                this.expiry = num;
            }
            if ((i10 & 16) == 0) {
                this.expiryDuration = null;
            } else {
                this.expiryDuration = num2;
            }
            if ((i10 & 32) == 0) {
                this.deeplinkUrl = null;
            } else {
                this.deeplinkUrl = str4;
            }
            if ((i10 & 64) == 0) {
                this.clickCoordinatesEnabled = null;
            } else {
                this.clickCoordinatesEnabled = bool;
            }
            if ((i10 & 128) == 0) {
                this.adLoadOptimizationEnabled = null;
            } else {
                this.adLoadOptimizationEnabled = bool2;
            }
            if ((i10 & 256) == 0) {
                this.templateHeartbeatCheck = null;
            } else {
                this.templateHeartbeatCheck = bool3;
            }
            if ((i10 & 512) == 0) {
                this.mediationName = null;
            } else {
                this.mediationName = str5;
            }
            if ((i10 & 1024) == 0) {
                this.info = null;
            } else {
                this.info = str6;
            }
            if ((i10 & 2048) == 0) {
                this.sleep = null;
            } else {
                this.sleep = num3;
            }
            if ((i10 & 4096) == 0) {
                this.errorCode = null;
            } else {
                this.errorCode = num4;
            }
            if ((i10 & 8192) == 0) {
                this.tpat = null;
            } else {
                this.tpat = map;
            }
            if ((i10 & 16384) == 0) {
                this.vmURL = null;
            } else {
                this.vmURL = str7;
            }
            if ((32768 & i10) == 0) {
                this.vmVersion = null;
            } else {
                this.vmVersion = str8;
            }
            if ((65536 & i10) == 0) {
                this.adMarketId = null;
            } else {
                this.adMarketId = str9;
            }
            if ((131072 & i10) == 0) {
                this.notification = null;
            } else {
                this.notification = list;
            }
            if ((262144 & i10) == 0) {
                this.loadAdUrls = null;
            } else {
                this.loadAdUrls = list2;
            }
            if ((524288 & i10) == 0) {
                this.viewAbility = null;
            } else {
                this.viewAbility = viewAbility;
            }
            if ((1048576 & i10) == 0) {
                this.templateType = null;
            } else {
                this.templateType = str10;
            }
            if ((2097152 & i10) == 0) {
                this.templateSettings = null;
            } else {
                this.templateSettings = templateSettings;
            }
            if ((4194304 & i10) == 0) {
                this.creativeId = null;
            } else {
                this.creativeId = str11;
            }
            if ((8388608 & i10) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str12;
            }
            this.showClose = (16777216 & i10) == 0 ? 0 : num5;
            this.showCloseIncentivized = (33554432 & i10) == 0 ? 0 : num6;
            if ((67108864 & i10) == 0) {
                this.adSizeInfo = null;
            } else {
                this.adSizeInfo = adSizeInfo;
            }
            if ((134217728 & i10) == 0) {
                this.webViewSettings = null;
            } else {
                this.webViewSettings = webViewSettings;
            }
            this.usePreloading = (268435456 & i10) == 0 ? Boolean.FALSE : bool4;
            if ((i10 & 536870912) == 0) {
                this.partialDownloadEnabled = null;
            } else {
                this.partialDownloadEnabled = bool5;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdUnit(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable String str4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str5, @Nullable String str6, @Nullable Integer num3, @Nullable Integer num4, @Nullable Map<String, ? extends List<String>> map, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<String> list, @Nullable List<String> list2, @Nullable ViewAbility viewAbility, @Nullable String str10, @Nullable TemplateSettings templateSettings, @Nullable String str11, @Nullable String str12, @Nullable Integer num5, @Nullable Integer num6, @Nullable AdSizeInfo adSizeInfo, @Nullable WebViewSettings webViewSettings, @Nullable Boolean bool4, @Nullable Boolean bool5) {
            this.id = str;
            this.adType = str2;
            this.adSource = str3;
            this.expiry = num;
            this.expiryDuration = num2;
            this.deeplinkUrl = str4;
            this.clickCoordinatesEnabled = bool;
            this.adLoadOptimizationEnabled = bool2;
            this.templateHeartbeatCheck = bool3;
            this.mediationName = str5;
            this.info = str6;
            this.sleep = num3;
            this.errorCode = num4;
            this.tpat = map;
            this.vmURL = str7;
            this.vmVersion = str8;
            this.adMarketId = str9;
            this.notification = list;
            this.loadAdUrls = list2;
            this.viewAbility = viewAbility;
            this.templateType = str10;
            this.templateSettings = templateSettings;
            this.creativeId = str11;
            this.advAppId = str12;
            this.showClose = num5;
            this.showCloseIncentivized = num6;
            this.adSizeInfo = adSizeInfo;
            this.webViewSettings = webViewSettings;
            this.usePreloading = bool4;
            this.partialDownloadEnabled = bool5;
        }

        public /* synthetic */ AdUnit(String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, Integer num3, Integer num4, Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool4, Boolean bool5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : bool, (i10 & 128) != 0 ? null : bool2, (i10 & 256) != 0 ? null : bool3, (i10 & 512) != 0 ? null : str5, (i10 & 1024) != 0 ? null : str6, (i10 & 2048) != 0 ? null : num3, (i10 & 4096) != 0 ? null : num4, (i10 & 8192) != 0 ? null : map, (i10 & 16384) != 0 ? null : str7, (i10 & 32768) != 0 ? null : str8, (i10 & 65536) != 0 ? null : str9, (i10 & 131072) != 0 ? null : list, (i10 & 262144) != 0 ? null : list2, (i10 & 524288) != 0 ? null : viewAbility, (i10 & 1048576) != 0 ? null : str10, (i10 & 2097152) != 0 ? null : templateSettings, (i10 & 4194304) != 0 ? null : str11, (i10 & 8388608) != 0 ? null : str12, (i10 & 16777216) != 0 ? 0 : num5, (i10 & 33554432) != 0 ? 0 : num6, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : adSizeInfo, (i10 & 134217728) != 0 ? null : webViewSettings, (i10 & 268435456) != 0 ? Boolean.FALSE : bool4, (i10 & 536870912) != 0 ? null : bool5);
        }
    }

    @l
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB;\b\u0017\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019¨\u0006,"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "", "", "url", "extension", "", "downloadPercent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getExtension", "Ljava/lang/Integer;", "getDownloadPercent", "getDownloadPercent$annotations", "()V", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class CacheableReplacement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer downloadPercent;

        @Nullable
        private final String extension;

        @Nullable
        private final String url;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return AdPayload$CacheableReplacement$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public CacheableReplacement() {
            this((String) null, (String) null, (Integer) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ CacheableReplacement copy$default(CacheableReplacement cacheableReplacement, String str, String str2, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cacheableReplacement.url;
            }
            if ((i10 & 2) != 0) {
                str2 = cacheableReplacement.extension;
            }
            if ((i10 & 4) != 0) {
                num = cacheableReplacement.downloadPercent;
            }
            return cacheableReplacement.copy(str, str2, num);
        }

        public static /* synthetic */ void getDownloadPercent$annotations() {
        }

        public static final void write$Self(@NotNull CacheableReplacement self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || self.url != null) {
                output.h(serialDesc, 0, y2.f119104a, self.url);
            }
            if (output.r(serialDesc, 1) || self.extension != null) {
                output.h(serialDesc, 1, y2.f119104a, self.extension);
            }
            if (!output.r(serialDesc, 2) && self.downloadPercent == null) {
                return;
            }
            output.h(serialDesc, 2, x0.f119093a, self.downloadPercent);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getExtension() {
            return this.extension;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getDownloadPercent() {
            return this.downloadPercent;
        }

        @NotNull
        public final CacheableReplacement copy(@Nullable String url, @Nullable String extension, @Nullable Integer downloadPercent) {
            return new CacheableReplacement(url, extension, downloadPercent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheableReplacement)) {
                return false;
            }
            CacheableReplacement cacheableReplacement = (CacheableReplacement) other;
            return Intrinsics.areEqual(this.url, cacheableReplacement.url) && Intrinsics.areEqual(this.extension, cacheableReplacement.extension) && Intrinsics.areEqual(this.downloadPercent, cacheableReplacement.downloadPercent);
        }

        @Nullable
        public final Integer getDownloadPercent() {
            return this.downloadPercent;
        }

        @Nullable
        public final String getExtension() {
            return this.extension;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.extension;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.downloadPercent;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CacheableReplacement(url=" + this.url + ", extension=" + this.extension + ", downloadPercent=" + this.downloadPercent + ')';
        }

        public /* synthetic */ CacheableReplacement(int i10, String str, String str2, Integer num, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.url = null;
            } else {
                this.url = str;
            }
            if ((i10 & 2) == 0) {
                this.extension = null;
            } else {
                this.extension = str2;
            }
            if ((i10 & 4) == 0) {
                this.downloadPercent = null;
            } else {
                this.downloadPercent = num;
            }
        }

        public CacheableReplacement(@Nullable String str, @Nullable String str2, @Nullable Integer num) {
            this.url = str;
            this.extension = str2;
            this.downloadPercent = num;
        }

        public /* synthetic */ CacheableReplacement(String str, String str2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$Companion;", "", "()V", "FILE_SCHEME", "", AdPayload.INCENTIVIZED_BODY_TEXT, AdPayload.INCENTIVIZED_CLOSE_TEXT, AdPayload.INCENTIVIZED_CONTINUE_TEXT, AdPayload.INCENTIVIZED_TITLE_TEXT, "KEY_VM", "TAG", "TPAT_CLICK_COORDINATES_URLS", "UNKNOWN", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AdPayload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @l
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "", "", "placementReferenceId", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "adMarkup", "<init>", "(Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$AdUnit;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$AdUnit;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", MenuActionType.COPY, "(Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$AdUnit;)Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlacementReferenceId", "getPlacementReferenceId$annotations", "()V", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "getAdMarkup", "getAdMarkup$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class PlacementAdUnit {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final AdUnit adMarkup;

        @Nullable
        private final String placementReferenceId;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return AdPayload$PlacementAdUnit$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public PlacementAdUnit() {
            this((String) null, (AdUnit) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ PlacementAdUnit copy$default(PlacementAdUnit placementAdUnit, String str, AdUnit adUnit, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = placementAdUnit.placementReferenceId;
            }
            if ((i10 & 2) != 0) {
                adUnit = placementAdUnit.adMarkup;
            }
            return placementAdUnit.copy(str, adUnit);
        }

        public static /* synthetic */ void getAdMarkup$annotations() {
        }

        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }

        public static final void write$Self(@NotNull PlacementAdUnit self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || self.placementReferenceId != null) {
                output.h(serialDesc, 0, y2.f119104a, self.placementReferenceId);
            }
            if (!output.r(serialDesc, 1) && self.adMarkup == null) {
                return;
            }
            output.h(serialDesc, 1, AdPayload$AdUnit$$serializer.INSTANCE, self.adMarkup);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AdUnit getAdMarkup() {
            return this.adMarkup;
        }

        @NotNull
        public final PlacementAdUnit copy(@Nullable String placementReferenceId, @Nullable AdUnit adMarkup) {
            return new PlacementAdUnit(placementReferenceId, adMarkup);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlacementAdUnit)) {
                return false;
            }
            PlacementAdUnit placementAdUnit = (PlacementAdUnit) other;
            return Intrinsics.areEqual(this.placementReferenceId, placementAdUnit.placementReferenceId) && Intrinsics.areEqual(this.adMarkup, placementAdUnit.adMarkup);
        }

        @Nullable
        public final AdUnit getAdMarkup() {
            return this.adMarkup;
        }

        @Nullable
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public int hashCode() {
            String str = this.placementReferenceId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AdUnit adUnit = this.adMarkup;
            return iHashCode + (adUnit != null ? adUnit.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ')';
        }

        public /* synthetic */ PlacementAdUnit(int i10, String str, AdUnit adUnit, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str;
            }
            if ((i10 & 2) == 0) {
                this.adMarkup = null;
            } else {
                this.adMarkup = adUnit;
            }
        }

        public PlacementAdUnit(@Nullable String str, @Nullable AdUnit adUnit) {
            this.placementReferenceId = str;
            this.adMarkup = adUnit;
        }

        public /* synthetic */ PlacementAdUnit(String str, AdUnit adUnit, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : adUnit);
        }
    }

    @l
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B7\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBK\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J@\u0010\u0019\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R.\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R.\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "", "", "", "normalReplacements", "Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "cacheableReplacements", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/util/Map;", "component2", MenuActionType.COPY, "(Ljava/util/Map;Ljava/util/Map;)Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getNormalReplacements", "getNormalReplacements$annotations", "()V", "getCacheableReplacements", "getCacheableReplacements$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class TemplateSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Map<String, CacheableReplacement> cacheableReplacements;

        @Nullable
        private final Map<String, String> normalReplacements;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return AdPayload$TemplateSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public TemplateSettings() {
            this((Map) null, (Map) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TemplateSettings copy$default(TemplateSettings templateSettings, Map map, Map map2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = templateSettings.normalReplacements;
            }
            if ((i10 & 2) != 0) {
                map2 = templateSettings.cacheableReplacements;
            }
            return templateSettings.copy(map, map2);
        }

        public static /* synthetic */ void getCacheableReplacements$annotations() {
        }

        public static /* synthetic */ void getNormalReplacements$annotations() {
        }

        public static final void write$Self(@NotNull TemplateSettings self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || self.normalReplacements != null) {
                y2 y2Var = y2.f119104a;
                output.h(serialDesc, 0, new c1(y2Var, y2Var), self.normalReplacements);
            }
            if (!output.r(serialDesc, 1) && self.cacheableReplacements == null) {
                return;
            }
            output.h(serialDesc, 1, new c1(y2.f119104a, AdPayload$CacheableReplacement$$serializer.INSTANCE), self.cacheableReplacements);
        }

        @Nullable
        public final Map<String, String> component1() {
            return this.normalReplacements;
        }

        @Nullable
        public final Map<String, CacheableReplacement> component2() {
            return this.cacheableReplacements;
        }

        @NotNull
        public final TemplateSettings copy(@Nullable Map<String, String> normalReplacements, @Nullable Map<String, CacheableReplacement> cacheableReplacements) {
            return new TemplateSettings(normalReplacements, cacheableReplacements);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TemplateSettings)) {
                return false;
            }
            TemplateSettings templateSettings = (TemplateSettings) other;
            return Intrinsics.areEqual(this.normalReplacements, templateSettings.normalReplacements) && Intrinsics.areEqual(this.cacheableReplacements, templateSettings.cacheableReplacements);
        }

        @Nullable
        public final Map<String, CacheableReplacement> getCacheableReplacements() {
            return this.cacheableReplacements;
        }

        @Nullable
        public final Map<String, String> getNormalReplacements() {
            return this.normalReplacements;
        }

        public int hashCode() {
            Map<String, String> map = this.normalReplacements;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, CacheableReplacement> map2 = this.cacheableReplacements;
            return iHashCode + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TemplateSettings(normalReplacements=" + this.normalReplacements + ", cacheableReplacements=" + this.cacheableReplacements + ')';
        }

        public /* synthetic */ TemplateSettings(int i10, Map map, Map map2, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.normalReplacements = null;
            } else {
                this.normalReplacements = map;
            }
            if ((i10 & 2) == 0) {
                this.cacheableReplacements = null;
            } else {
                this.cacheableReplacements = map2;
            }
        }

        public TemplateSettings(@Nullable Map<String, String> map, @Nullable Map<String, CacheableReplacement> map2) {
            this.normalReplacements = map;
            this.cacheableReplacements = map2;
        }

        public /* synthetic */ TemplateSettings(Map map, Map map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : map2);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$TpatSerializer;", "Lkotlinx/serialization/json/g0;", "", "", "", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "transformDeserialize", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class TpatSerializer extends g0 {

        @NotNull
        public static final TpatSerializer INSTANCE = new TpatSerializer();

        /* JADX WARN: Illegal instructions before constructor call */
        private TpatSerializer() {
            a1 a1Var = a1.f93282a;
            super(a.k(a.E(a1Var), a.h(a.E(a1Var))));
        }

        @Override // kotlinx.serialization.json.g0
        @NotNull
        protected JsonElement transformDeserialize(@NotNull JsonElement element) {
            Intrinsics.checkNotNullParameter(element, "element");
            JsonObject jsonObjectI = j.i(element);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObjectI.entrySet()) {
                if (!Intrinsics.areEqual(entry.getKey(), "moat")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new JsonObject(linkedHashMap);
        }
    }

    @l
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "om", "<init>", "(Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", MenuActionType.COPY, "(Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;)Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "getOm", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ViewAbility {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final ViewAbilityInfo om;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbility$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return AdPayload$ViewAbility$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ViewAbility() {
            this((ViewAbilityInfo) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ViewAbility copy$default(ViewAbility viewAbility, ViewAbilityInfo viewAbilityInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                viewAbilityInfo = viewAbility.om;
            }
            return viewAbility.copy(viewAbilityInfo);
        }

        public static final void write$Self(@NotNull ViewAbility self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (!output.r(serialDesc, 0) && self.om == null) {
                return;
            }
            output.h(serialDesc, 0, AdPayload$ViewAbilityInfo$$serializer.INSTANCE, self.om);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewAbilityInfo getOm() {
            return this.om;
        }

        @NotNull
        public final ViewAbility copy(@Nullable ViewAbilityInfo om) {
            return new ViewAbility(om);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewAbility) && Intrinsics.areEqual(this.om, ((ViewAbility) other).om);
        }

        @Nullable
        public final ViewAbilityInfo getOm() {
            return this.om;
        }

        public int hashCode() {
            ViewAbilityInfo viewAbilityInfo = this.om;
            if (viewAbilityInfo == null) {
                return 0;
            }
            return viewAbilityInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "ViewAbility(om=" + this.om + ')';
        }

        public /* synthetic */ ViewAbility(int i10, ViewAbilityInfo viewAbilityInfo, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.om = null;
            } else {
                this.om = viewAbilityInfo;
            }
        }

        public ViewAbility(@Nullable ViewAbilityInfo viewAbilityInfo) {
            this.om = viewAbilityInfo;
        }

        public /* synthetic */ ViewAbility(ViewAbilityInfo viewAbilityInfo, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : viewAbilityInfo);
        }
    }

    @l
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b\"\u0010#\u001a\u0004\b\u0003\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\u0018¨\u0006)"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "", "", "isEnabled", "", "extraVast", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", MenuActionType.COPY, "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "isEnabled$annotations", "()V", "Ljava/lang/String;", "getExtraVast", "getExtraVast$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ViewAbilityInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final String extraVast;

        @Nullable
        private final Boolean isEnabled;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return AdPayload$ViewAbilityInfo$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ViewAbilityInfo() {
            this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ ViewAbilityInfo copy$default(ViewAbilityInfo viewAbilityInfo, Boolean bool, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = viewAbilityInfo.isEnabled;
            }
            if ((i10 & 2) != 0) {
                str = viewAbilityInfo.extraVast;
            }
            return viewAbilityInfo.copy(bool, str);
        }

        public static /* synthetic */ void getExtraVast$annotations() {
        }

        public static /* synthetic */ void isEnabled$annotations() {
        }

        public static final void write$Self(@NotNull ViewAbilityInfo self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || self.isEnabled != null) {
                output.h(serialDesc, 0, i.f118983a, self.isEnabled);
            }
            if (!output.r(serialDesc, 1) && self.extraVast == null) {
                return;
            }
            output.h(serialDesc, 1, y2.f119104a, self.extraVast);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getExtraVast() {
            return this.extraVast;
        }

        @NotNull
        public final ViewAbilityInfo copy(@Nullable Boolean isEnabled, @Nullable String extraVast) {
            return new ViewAbilityInfo(isEnabled, extraVast);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewAbilityInfo)) {
                return false;
            }
            ViewAbilityInfo viewAbilityInfo = (ViewAbilityInfo) other;
            return Intrinsics.areEqual(this.isEnabled, viewAbilityInfo.isEnabled) && Intrinsics.areEqual(this.extraVast, viewAbilityInfo.extraVast);
        }

        @Nullable
        public final String getExtraVast() {
            return this.extraVast;
        }

        public int hashCode() {
            Boolean bool = this.isEnabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.extraVast;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Nullable
        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public String toString() {
            return "ViewAbilityInfo(isEnabled=" + this.isEnabled + ", extraVast=" + this.extraVast + ')';
        }

        public /* synthetic */ ViewAbilityInfo(int i10, Boolean bool, String str, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.isEnabled = null;
            } else {
                this.isEnabled = bool;
            }
            if ((i10 & 2) == 0) {
                this.extraVast = null;
            } else {
                this.extraVast = str;
            }
        }

        public ViewAbilityInfo(@Nullable Boolean bool, @Nullable String str) {
            this.isEnabled = bool;
            this.extraVast = str;
        }

        public /* synthetic */ ViewAbilityInfo(Boolean bool, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str);
        }
    }

    @l
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J(\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0015¨\u0006)"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "", "", "allowFileAccessFromFileUrls", "allowUniversalAccessFromFileUrls", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen1", "Lyg/t2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lyg/t2;)V", "self", "Lxg/f;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Lxg/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/Boolean;", "component2", MenuActionType.COPY, "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAllowFileAccessFromFileUrls", "getAllowFileAccessFromFileUrls$annotations", "()V", "getAllowUniversalAccessFromFileUrls", "getAllowUniversalAccessFromFileUrls$annotations", y.f66058y, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class WebViewSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Boolean allowFileAccessFromFileUrls;

        @Nullable
        private final Boolean allowUniversalAccessFromFileUrls;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return AdPayload$WebViewSettings$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public WebViewSettings() {
            this((Boolean) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ WebViewSettings copy$default(WebViewSettings webViewSettings, Boolean bool, Boolean bool2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = webViewSettings.allowFileAccessFromFileUrls;
            }
            if ((i10 & 2) != 0) {
                bool2 = webViewSettings.allowUniversalAccessFromFileUrls;
            }
            return webViewSettings.copy(bool, bool2);
        }

        public static /* synthetic */ void getAllowFileAccessFromFileUrls$annotations() {
        }

        public static /* synthetic */ void getAllowUniversalAccessFromFileUrls$annotations() {
        }

        public static final void write$Self(@NotNull WebViewSettings self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(output, "output");
            Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.r(serialDesc, 0) || self.allowFileAccessFromFileUrls != null) {
                output.h(serialDesc, 0, i.f118983a, self.allowFileAccessFromFileUrls);
            }
            if (!output.r(serialDesc, 1) && self.allowUniversalAccessFromFileUrls == null) {
                return;
            }
            output.h(serialDesc, 1, i.f118983a, self.allowUniversalAccessFromFileUrls);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getAllowFileAccessFromFileUrls() {
            return this.allowFileAccessFromFileUrls;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getAllowUniversalAccessFromFileUrls() {
            return this.allowUniversalAccessFromFileUrls;
        }

        @NotNull
        public final WebViewSettings copy(@Nullable Boolean allowFileAccessFromFileUrls, @Nullable Boolean allowUniversalAccessFromFileUrls) {
            return new WebViewSettings(allowFileAccessFromFileUrls, allowUniversalAccessFromFileUrls);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebViewSettings)) {
                return false;
            }
            WebViewSettings webViewSettings = (WebViewSettings) other;
            return Intrinsics.areEqual(this.allowFileAccessFromFileUrls, webViewSettings.allowFileAccessFromFileUrls) && Intrinsics.areEqual(this.allowUniversalAccessFromFileUrls, webViewSettings.allowUniversalAccessFromFileUrls);
        }

        @Nullable
        public final Boolean getAllowFileAccessFromFileUrls() {
            return this.allowFileAccessFromFileUrls;
        }

        @Nullable
        public final Boolean getAllowUniversalAccessFromFileUrls() {
            return this.allowUniversalAccessFromFileUrls;
        }

        public int hashCode() {
            Boolean bool = this.allowFileAccessFromFileUrls;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.allowUniversalAccessFromFileUrls;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "WebViewSettings(allowFileAccessFromFileUrls=" + this.allowFileAccessFromFileUrls + ", allowUniversalAccessFromFileUrls=" + this.allowUniversalAccessFromFileUrls + ')';
        }

        public /* synthetic */ WebViewSettings(int i10, Boolean bool, Boolean bool2, t2 t2Var) {
            if ((i10 & 1) == 0) {
                this.allowFileAccessFromFileUrls = null;
            } else {
                this.allowFileAccessFromFileUrls = bool;
            }
            if ((i10 & 2) == 0) {
                this.allowUniversalAccessFromFileUrls = null;
            } else {
                this.allowUniversalAccessFromFileUrls = bool2;
            }
        }

        public WebViewSettings(@Nullable Boolean bool, @Nullable Boolean bool2) {
            this.allowFileAccessFromFileUrls = bool;
            this.allowUniversalAccessFromFileUrls = bool2;
        }

        public /* synthetic */ WebViewSettings(Boolean bool, Boolean bool2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2);
        }
    }

    public AdPayload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final String complexReplace(String str, String str2, String str3) {
        String strQuote = Pattern.quote(str2);
        Intrinsics.checkNotNullExpressionValue(strQuote, "quote(oldValue)");
        return new Regex(strQuote).replace(str, valueOrEmpty(str3));
    }

    private final Pair<Boolean, Integer> computeAssetRequirement(Integer percentage) {
        return (isNativeTemplateType() || !adLoadOptimizationEnabled()) ? TuplesKt.to(Boolean.TRUE, null) : !isPartialDownloadEnabled() ? TuplesKt.to(Boolean.FALSE, null) : (percentage == null || percentage.intValue() <= 0) ? TuplesKt.to(Boolean.FALSE, null) : TuplesKt.to(Boolean.TRUE, percentage);
    }

    private final PlacementAdUnit getAd() {
        List<PlacementAdUnit> list = this.ads;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static /* synthetic */ void getAdConfig$annotations() {
    }

    private final AdUnit getAdMarkup() {
        PlacementAdUnit ad2 = getAd();
        if (ad2 != null) {
            return ad2.getAdMarkup();
        }
        return null;
    }

    private static /* synthetic */ void getAds$annotations() {
    }

    private static /* synthetic */ void getConfig$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getIncentivizedTextSettings$annotations() {
    }

    private final Pair<String, File> getIndexHtmlFile(File dir) {
        AdUnit adMarkup;
        String vmURL;
        Object objB;
        File parentFile;
        if (!isNativeTemplateType() && (adMarkup = getAdMarkup()) != null && (vmURL = adMarkup.getVmURL()) != null) {
            if (!FileUtility.INSTANCE.isValidUrl(vmURL)) {
                vmURL = null;
            }
            if (vmURL != null) {
                try {
                    Result.Companion companion = Result.f93230c;
                    String path = new URI(vmURL).getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "URI(url).path");
                    List listX0 = StringsKt.X0(StringsKt.w1(path, IOUtils.DIR_SEPARATOR_UNIX), new char[]{IOUtils.DIR_SEPARATOR_UNIX}, false, 0, 6, null);
                    objB = Result.b(listX0.size() >= 2 ? CollectionsKt.joinToString$default(CollectionsKt.takeLast(listX0, 2), "_", null, null, 0, null, null, 62, null) : "index.html");
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    objB = Result.b(d.a(th2));
                }
                if (Result.i(objB)) {
                    objB = null;
                }
                String str = (String) objB;
                if (str == null || (parentFile = dir.getParentFile()) == null) {
                    return null;
                }
                return new Pair<>(vmURL, new File(parentFile, str));
            }
        }
        return null;
    }

    public static /* synthetic */ void getLogEntry$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getMraidFiles$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPartialDownloadAssets$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ List getTpatUrls$default(AdPayload adPayload, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        return adPayload.getTpatUrls(str, str2, str3);
    }

    private final String valueOrEmpty(String value) {
        return value == null ? "" : value;
    }

    public static final void write$Self(@NotNull AdPayload self, @NotNull f output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.r(serialDesc, 0) || self.ads != null) {
            output.h(serialDesc, 0, new yg.f(AdPayload$PlacementAdUnit$$serializer.INSTANCE), self.ads);
        }
        if (output.r(serialDesc, 1) || self.config != null) {
            output.h(serialDesc, 1, ConfigPayload$$serializer.INSTANCE, self.config);
        }
        if (output.r(serialDesc, 2) || self.expiryWindowStart != null) {
            output.h(serialDesc, 2, i1.f118988a, self.expiryWindowStart);
        }
        if (output.r(serialDesc, 3) || !Intrinsics.areEqual(self.mraidFiles, new ConcurrentHashMap())) {
            KClass kClassB = v0.b(ConcurrentHashMap.class);
            y2 y2Var = y2.f119104a;
            output.F(serialDesc, 3, new ug.b(kClassB, null, new KSerializer[]{y2Var, y2Var}), self.mraidFiles);
        }
        if (output.r(serialDesc, 4) || !Intrinsics.areEqual(self.incentivizedTextSettings, new HashMap())) {
            y2 y2Var2 = y2.f119104a;
            output.F(serialDesc, 4, new c1(y2Var2, y2Var2), self.incentivizedTextSettings);
        }
        if (output.r(serialDesc, 5) || self.assetsFullyDownloaded) {
            output.p(serialDesc, 5, self.assetsFullyDownloaded);
        }
        if (!output.r(serialDesc, 6) && self.indexFilePath == null) {
            return;
        }
        output.h(serialDesc, 6, y2.f119104a, self.indexFilePath);
    }

    public final int adHeight() {
        AdSizeInfo adSizeInfo;
        Integer height;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (height = adSizeInfo.getHeight()) == null) {
            return 0;
        }
        return height.intValue();
    }

    public final boolean adLoadOptimizationEnabled() {
        Boolean adLoadOptimizationEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adLoadOptimizationEnabled = adMarkup.getAdLoadOptimizationEnabled()) == null) {
            return true;
        }
        return adLoadOptimizationEnabled.booleanValue();
    }

    @Nullable
    public final AdUnit adUnit() {
        return getAdMarkup();
    }

    public final int adWidth() {
        AdSizeInfo adSizeInfo;
        Integer width;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (width = adSizeInfo.getWidth()) == null) {
            return 0;
        }
        return width.intValue();
    }

    @Nullable
    public final String advAppId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdvAppId();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: config, reason: from getter */
    public final ConfigPayload getConfig() {
        return this.config;
    }

    @NotNull
    public final JsonObject createMRAIDArgs() {
        Map<String, String> mRAIDArgsInMap = getMRAIDArgsInMap();
        c0 c0Var = new c0();
        for (Map.Entry<String, String> entry : mRAIDArgsInMap.entrySet()) {
            kotlinx.serialization.json.i.d(c0Var, entry.getKey(), entry.getValue());
        }
        return c0Var.a();
    }

    @Nullable
    public final String eventId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getId();
        }
        return null;
    }

    @Nullable
    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    @Nullable
    public final String getAdSource() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdSource();
        }
        return null;
    }

    public final boolean getAssetsFullyDownloaded() {
        return this.assetsFullyDownloaded;
    }

    @NotNull
    public final String getCreativeId() {
        String creativeId;
        AdUnit adMarkup = getAdMarkup();
        return (adMarkup == null || (creativeId = adMarkup.getCreativeId()) == null) ? "unknown" : creativeId;
    }

    @NotNull
    public final List<AdAsset> getDownloadableAssets(@NotNull File dir) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayList arrayList = new ArrayList();
        Pair<String, File> indexHtmlFile = getIndexHtmlFile(dir);
        if (indexHtmlFile != null) {
            String strComponent1 = indexHtmlFile.component1();
            File fileComponent2 = indexHtmlFile.component2();
            this.indexFilePath = fileComponent2.getAbsolutePath();
            if (!fileComponent2.exists()) {
                Logger.INSTANCE.d(TAG, "No cacheable index file found, creating new one: " + fileComponent2);
                String absolutePath = fileComponent2.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "indexFile.absolutePath");
                arrayList.add(new AdAsset(KEY_VM, strComponent1, absolutePath, true, null, 16, null));
            }
        }
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (templateSettings = adMarkup.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String key = entry.getKey();
                CacheableReplacement value = entry.getValue();
                String url = value.getUrl();
                if (url != null) {
                    FileUtility fileUtility = FileUtility.INSTANCE;
                    if (fileUtility.isValidUrl(url)) {
                        String filePath = new File(dir, fileUtility.guessFileName(url, value.getExtension())).getAbsolutePath();
                        Pair<Boolean, Integer> pairComputeAssetRequirement = computeAssetRequirement(value.getDownloadPercent());
                        boolean zBooleanValue = pairComputeAssetRequirement.component1().booleanValue();
                        Integer numComponent2 = pairComputeAssetRequirement.component2();
                        Intrinsics.checkNotNullExpressionValue(filePath, "filePath");
                        AdAsset adAsset = new AdAsset(key, url, filePath, zBooleanValue, numComponent2);
                        arrayList.add(adAsset);
                        if (zBooleanValue && numComponent2 != null) {
                            this.partialDownloadAssets.put(url, adAsset);
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.vungle.ads.internal.model.AdPayload$getDownloadableAssets$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return mf.a.d(Boolean.valueOf(((AdAsset) t11).getIsRequired()), Boolean.valueOf(((AdAsset) t10).getIsRequired()));
                }
            });
        }
        return arrayList;
    }

    @NotNull
    public final Map<String, String> getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    @Nullable
    public final String getIndexFilePath() {
        return this.indexFilePath;
    }

    @Nullable
    public final AdAsset getLocalPartialDownloadAssets(@NotNull String remoteUrl) {
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        return this.partialDownloadAssets.get(remoteUrl);
    }

    @Nullable
    /* JADX INFO: renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final LogEntry getLogEntry() {
        return this.logEntry;
    }

    @NotNull
    public final Map<String, String> getMRAIDArgsInMap() {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        TemplateSettings templateSettings2;
        Map<String, String> normalReplacements;
        AdUnit adMarkup = getAdMarkup();
        if ((adMarkup != null ? adMarkup.getTemplateSettings() : null) == null) {
            throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings2 = adMarkup2.getTemplateSettings()) != null && (normalReplacements = templateSettings2.getNormalReplacements()) != null) {
            linkedHashMap.putAll(normalReplacements);
        }
        AdUnit adMarkup3 = getAdMarkup();
        if (adMarkup3 != null && (templateSettings = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String url = entry.getValue().getUrl();
                if (url != null) {
                    linkedHashMap.put(entry.getKey(), url);
                }
            }
        }
        if (!this.mraidFiles.isEmpty()) {
            linkedHashMap.putAll(this.mraidFiles);
        }
        if (!this.incentivizedTextSettings.isEmpty()) {
            linkedHashMap.putAll(this.incentivizedTextSettings);
        }
        return linkedHashMap;
    }

    @Nullable
    public final String getMediationName() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getMediationName();
        }
        return null;
    }

    @NotNull
    public final Map<String, AdAsset> getPartialDownloadAssets$vungle_ads_release() {
        return this.partialDownloadAssets;
    }

    public final int getShowCloseDelay(@Nullable Boolean incentivized) {
        Integer showClose;
        int iIntValue;
        Integer showCloseIncentivized;
        if (Intrinsics.areEqual(incentivized, Boolean.TRUE)) {
            AdUnit adMarkup = getAdMarkup();
            if (adMarkup == null || (showCloseIncentivized = adMarkup.getShowCloseIncentivized()) == null) {
                return 0;
            }
            iIntValue = showCloseIncentivized.intValue();
        } else {
            AdUnit adMarkup2 = getAdMarkup();
            if (adMarkup2 == null || (showClose = adMarkup2.getShowClose()) == null) {
                return 0;
            }
            iIntValue = showClose.intValue();
        }
        return iIntValue * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public final List<String> getTpatUrls(@NotNull String event, @Nullable String value, @Nullable String secondValue) {
        Map<String, List<String>> tpat;
        Map<String, List<String>> tpat2;
        Intrinsics.checkNotNullParameter(event, "event");
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (tpat2 = adMarkup.getTpat()) != null && !tpat2.containsKey(event)) {
            new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, "Arbitrary tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        AdUnit adMarkup2 = getAdMarkup();
        List<String> list = (adMarkup2 == null || (tpat = adMarkup2.getTpat()) == null) ? null : tpat.get(event);
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        switch (event.hashCode()) {
            case -2125915830:
                if (event.equals(Constants.CHECKPOINT_0)) {
                    List<String> list3 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(complexReplace(complexReplace(complexReplace((String) it.next(), Constants.REMOTE_PLAY_KEY, String.valueOf(!this.assetsFullyDownloaded)), Constants.NETWORK_OPERATOR_KEY, value), Constants.DEVICE_VOLUME_KEY, secondValue));
                    }
                    return arrayList;
                }
                return list;
            case -747709511:
                if (event.equals(Constants.VIDEO_LENGTH_TPAT)) {
                    List<String> list4 = list;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                    Iterator<T> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(complexReplace((String) it2.next(), Constants.VIDEO_LENGTH_KEY, value));
                    }
                    return arrayList2;
                }
                return list;
            case -132489083:
                if (event.equals(Constants.AD_LOAD_DURATION)) {
                    List<String> list5 = list;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                    Iterator<T> it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(complexReplace((String) it3.next(), Constants.AD_LOAD_DURATION_KEY, value));
                    }
                    return arrayList3;
                }
                return list;
            case 1516630125:
                if (event.equals(Constants.AD_CLOSE)) {
                    List<String> list6 = list;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                    Iterator<T> it4 = list6.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(complexReplace(complexReplace((String) it4.next(), Constants.AD_DURATION_KEY, value), Constants.DEVICE_VOLUME_KEY, secondValue));
                    }
                    return arrayList4;
                }
                return list;
            case 1940309120:
                if (event.equals(Constants.DEEPLINK_CLICK)) {
                    List<String> list7 = list;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
                    Iterator<T> it5 = list7.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(complexReplace((String) it5.next(), Constants.DEEPLINK_SUCCESS_KEY, value));
                    }
                    return arrayList5;
                }
                return list;
            default:
                return list;
        }
    }

    @Nullable
    public final String getViewMasterVersion() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getVmVersion();
        }
        return null;
    }

    @Nullable
    public final WebViewSettings getWebViewSettings() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getWebViewSettings();
        }
        return null;
    }

    @Nullable
    public final List<String> getWinNotifications() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getNotification();
        }
        return null;
    }

    public final boolean hasExpired() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null) {
            return false;
        }
        Long l10 = this.expiryWindowStart;
        if (adMarkup.getExpiryDuration() != null && l10 != null) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - l10.longValue()) / 1000;
            Integer expiryDuration = adMarkup.getExpiryDuration();
            return jCurrentTimeMillis > (expiryDuration != null ? Long.valueOf((long) expiryDuration.intValue()) : null).longValue();
        }
        if (adMarkup.getExpiry() != null) {
            if (System.currentTimeMillis() / 1000 > (adMarkup.getExpiry() != null ? Long.valueOf(r0.intValue()) : null).longValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean heartbeatEnabled() {
        Boolean templateHeartbeatCheck;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (templateHeartbeatCheck = adMarkup.getTemplateHeartbeatCheck()) == null) {
            return false;
        }
        return templateHeartbeatCheck.booleanValue();
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        Boolean clickCoordinatesEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (clickCoordinatesEnabled = adMarkup.getClickCoordinatesEnabled()) == null) {
            return false;
        }
        return clickCoordinatesEnabled.booleanValue();
    }

    public final boolean isCriticalAsset(@NotNull String failingUrl) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        if (!isNativeTemplateType()) {
            AdUnit adMarkup = getAdMarkup();
            if (Intrinsics.areEqual(adMarkup != null ? adMarkup.getVmURL() : null, failingUrl)) {
                return true;
            }
        }
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (templateSettings = adMarkup2.getTemplateSettings()) == null || (cacheableReplacements = templateSettings.getCacheableReplacements()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
            if (Intrinsics.areEqual(entry.getValue().getUrl(), failingUrl)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final boolean isNativeTemplateType() {
        return Intrinsics.areEqual(templateType(), "native");
    }

    public final boolean isPartialDownloadEnabled() {
        Boolean partialDownloadEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (partialDownloadEnabled = adMarkup.getPartialDownloadEnabled()) == null) {
            return false;
        }
        return partialDownloadEnabled.booleanValue();
    }

    public final boolean omEnabled() {
        ViewAbility viewAbility;
        ViewAbilityInfo om;
        Boolean boolIsEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (viewAbility = adMarkup.getViewAbility()) == null || (om = viewAbility.getOm()) == null || (boolIsEnabled = om.isEnabled()) == null) {
            return false;
        }
        return boolIsEnabled.booleanValue();
    }

    @Nullable
    public final String placementId() {
        PlacementAdUnit ad2 = getAd();
        if (ad2 != null) {
            return ad2.getPlacementReferenceId();
        }
        return null;
    }

    public final void recordExpiryWindowStart() {
        this.expiryWindowStart = Long.valueOf(System.currentTimeMillis());
    }

    public final void setAdConfig(@Nullable AdConfig adConfig) {
        this.adConfig = adConfig;
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final void setAssetsFullyDownloaded(boolean z10) {
        this.assetsFullyDownloaded = z10;
    }

    public final void setIncentivizedText(@NotNull String title, @NotNull String body, @NotNull String keepWatching, @NotNull String close) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(keepWatching, "keepWatching");
        Intrinsics.checkNotNullParameter(close, "close");
        if (title.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, title);
        }
        if (body.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, body);
        }
        if (keepWatching.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, keepWatching);
        }
        if (close.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, close);
        }
    }

    public final void setIncentivizedTextSettings(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.incentivizedTextSettings = map;
    }

    public final void setLogEntry$vungle_ads_release(@Nullable LogEntry logEntry) {
        this.logEntry = logEntry;
    }

    @Nullable
    public final String templateType() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getTemplateType();
        }
        return null;
    }

    public final synchronized void updateAdAssetPath(@NotNull String adIdentifier, @NotNull File localFile) {
        Intrinsics.checkNotNullParameter(adIdentifier, "adIdentifier");
        Intrinsics.checkNotNullParameter(localFile, "localFile");
        if (localFile.exists()) {
            this.mraidFiles.put(adIdentifier, FILE_SCHEME + localFile.getAbsolutePath());
        }
    }

    public final boolean usePreloading() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return Intrinsics.areEqual(adMarkup.getUsePreloading(), Boolean.TRUE);
        }
        return false;
    }

    public /* synthetic */ AdPayload(int i10, List list, ConfigPayload configPayload, Long l10, ConcurrentHashMap concurrentHashMap, @VisibleForTesting Map map, boolean z10, String str, t2 t2Var) {
        if ((i10 & 1) == 0) {
            this.ads = null;
        } else {
            this.ads = list;
        }
        if ((i10 & 2) == 0) {
            this.config = null;
        } else {
            this.config = configPayload;
        }
        if ((i10 & 4) == 0) {
            this.expiryWindowStart = null;
        } else {
            this.expiryWindowStart = l10;
        }
        if ((i10 & 8) == 0) {
            this.mraidFiles = new ConcurrentHashMap<>();
        } else {
            this.mraidFiles = concurrentHashMap;
        }
        if ((i10 & 16) == 0) {
            this.incentivizedTextSettings = new HashMap();
        } else {
            this.incentivizedTextSettings = map;
        }
        if ((i10 & 32) == 0) {
            this.assetsFullyDownloaded = false;
        } else {
            this.assetsFullyDownloaded = z10;
        }
        this.adConfig = null;
        this.logEntry = null;
        if ((i10 & 64) == 0) {
            this.indexFilePath = null;
        } else {
            this.indexFilePath = str;
        }
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public AdPayload(@Nullable List<PlacementAdUnit> list, @Nullable ConfigPayload configPayload) {
        this.ads = list;
        this.config = configPayload;
        this.mraidFiles = new ConcurrentHashMap<>();
        this.incentivizedTextSettings = new HashMap();
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public /* synthetic */ AdPayload(List list, ConfigPayload configPayload, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : configPayload);
    }
}
