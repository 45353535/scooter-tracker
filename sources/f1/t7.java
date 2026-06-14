package f1;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class t7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t7 f71134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t7 f71135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t7 f71136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t7 f71137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t7 f71138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t7 f71139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t7 f71140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t7 f71141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t7 f71142k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t7 f71143l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final t7 f71144m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ t7[] f71145n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f71146o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FriendlyObstructionPurpose f71147b;

    static {
        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.VIDEO_CONTROLS;
        f71134c = new t7("VIDEO_CONTROLS", 0, friendlyObstructionPurpose);
        f71135d = new t7("CLOSE_BUTTON", 1, FriendlyObstructionPurpose.CLOSE_AD);
        FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.OTHER;
        f71136e = new t7("CTA_BUTTON", 2, friendlyObstructionPurpose2);
        f71137f = new t7("SKIP_BUTTON", 3, friendlyObstructionPurpose);
        f71138g = new t7("INDUSTRY_ICON", 4, friendlyObstructionPurpose2);
        f71139h = new t7("COUNTDOWN_TIMER", 5, friendlyObstructionPurpose2);
        FriendlyObstructionPurpose friendlyObstructionPurpose3 = FriendlyObstructionPurpose.NOT_VISIBLE;
        f71140i = new t7("OVERLAY", 6, friendlyObstructionPurpose3);
        f71141j = new t7("BLUR", 7, friendlyObstructionPurpose2);
        f71142k = new t7("PROGRESS_BAR", 8, friendlyObstructionPurpose2);
        f71143l = new t7("NOT_VISIBLE", 9, friendlyObstructionPurpose3);
        f71144m = new t7(NativeAdContent.ViewTag.OTHER, 10, friendlyObstructionPurpose2);
        t7[] t7VarArrD = d();
        f71145n = t7VarArrD;
        f71146o = qf.a.a(t7VarArrD);
    }

    public t7(String str, int i10, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.f71147b = friendlyObstructionPurpose;
    }

    public static final /* synthetic */ t7[] d() {
        return new t7[]{f71134c, f71135d, f71136e, f71137f, f71138g, f71139h, f71140i, f71141j, f71142k, f71143l, f71144m};
    }

    public static t7 valueOf(String str) {
        return (t7) Enum.valueOf(t7.class, str);
    }

    public static t7[] values() {
        return (t7[]) f71145n.clone();
    }
}
