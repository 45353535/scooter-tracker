package f1;

import com.ironsource.C4424m2;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ta {
    public static final /* synthetic */ ta[] S;
    public static final /* synthetic */ EnumEntries T;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f71156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f71157d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71180b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ta f71158e = new ta("GET_PARAMETERS", 0, "getParameters");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ta f71159f = new ta("GET_MAX_SIZE", 1, "getMaxSize");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ta f71160g = new ta("GET_SCREEN_SIZE", 2, "getScreenSize");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ta f71161h = new ta("GET_CURRENT_POSITION", 3, "getCurrentPosition");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ta f71162i = new ta("GET_DEFAULT_POSITION", 4, "getDefaultPosition");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ta f71163j = new ta("GET_ORIENTATION_PROPERTIES", 5, "getOrientationProperties");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ta f71164k = new ta(com.taurusx.tax.w.s.w.f67535o, 6, "click");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ta f71165l = new ta("CLOSE", 7, "close");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ta f71166m = new ta("SKIPPED", 8, Reporting.EventType.VIDEO_AD_SKIPPED);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ta f71167n = new ta("VIDEO_COMPLETED", 9, "videoCompleted");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ta f71168o = new ta("VIDEO_RESUMED", 10, "videoResumed");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ta f71169p = new ta("VIDEO_PAUSED", 11, "videoPaused");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ta f71170q = new ta("VIDEO_REPLAY", 12, "videoReplay");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ta f71171r = new ta("CURRENT_VIDEO_DURATION", 13, "currentVideoDuration");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ta f71172s = new ta("TOTAL_VIDEO_DURATION", 14, "totalVideoDuration");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ta f71173t = new ta("SHOW", 15, C4424m2.f43623v);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ta f71174u = new ta("ERROR", 16, "error");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ta f71175v = new ta("WARNING", 17, "warning");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ta f71176w = new ta("DEBUG", 18, "debug");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ta f71177x = new ta("TRACKING", 19, "tracking");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final ta f71178y = new ta("OPEN_URL", 20, "openUrl");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ta f71179z = new ta("SET_ORIENTATION_PROPERTIES", 21, MRAIDPresenter.SET_ORIENTATION_PROPERTIES);
    public static final ta A = new ta("REWARD", 22, "reward");
    public static final ta B = new ta("REWARDED_VIDEO_COMPLETED", 23, "rewardedVideoCompleted");
    public static final ta C = new ta("PLAY_VIDEO", 24, "playVideo");
    public static final ta D = new ta("PAUSE_VIDEO", 25, "pauseVideo");
    public static final ta E = new ta("CLOSE_VIDEO", 26, "closeVideo");
    public static final ta F = new ta("MUTE_VIDEO", 27, "mute");
    public static final ta G = new ta("UNMUTE_VIDEO", 28, "unmute");
    public static final ta H = new ta("OM_MEASUREMENT_RESOURCES", 29, "OMMeasurementResources");
    public static final ta I = new ta("START", 30, "start");
    public static final ta J = new ta("BUFFER_START", 31, "bufferStart");
    public static final ta K = new ta("BUFFER_END", 32, "bufferEnd");
    public static final ta L = new ta("VIDEO_FINISHED", 33, "videoFinished");
    public static final ta M = new ta("VIDEO_STARTED", 34, "videoStarted");
    public static final ta N = new ta("VIDEO_ENDED", 35, "videoEnded");
    public static final ta O = new ta("VIDEO_FAILED", 36, "videoFailed");
    public static final ta P = new ta("PLAYBACK_TIME", 37, "playbackTime");
    public static final ta Q = new ta("ON_BACKGROUND", 38, "onBackground");
    public static final ta R = new ta("ON_FOREGROUND", 39, "onForeground");

    public static final class a {
        public a() {
        }

        public final ta a(String cmdName) {
            Intrinsics.checkNotNullParameter(cmdName, "cmdName");
            return (ta) ta.f71157d.get(cmdName);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        ta[] taVarArrD = d();
        S = taVarArrD;
        T = qf.a.a(taVarArrD);
        f71156c = new a(null);
        EnumEntries enumEntriesI = i();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(enumEntriesI, 10)), 16));
        for (Object obj : enumEntriesI) {
            linkedHashMap.put(((ta) obj).f71180b, obj);
        }
        f71157d = linkedHashMap;
    }

    public ta(String str, int i10, String str2) {
        this.f71180b = str2;
    }

    public static final /* synthetic */ ta[] d() {
        return new ta[]{f71158e, f71159f, f71160g, f71161h, f71162i, f71163j, f71164k, f71165l, f71166m, f71167n, f71168o, f71169p, f71170q, f71171r, f71172s, f71173t, f71174u, f71175v, f71176w, f71177x, f71178y, f71179z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R};
    }

    public static EnumEntries i() {
        return T;
    }

    public static ta valueOf(String str) {
        return (ta) Enum.valueOf(ta.class, str);
    }

    public static ta[] values() {
        return (ta[]) S.clone();
    }

    public final String h() {
        return this.f71180b;
    }
}
