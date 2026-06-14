package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Na {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Na f37430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Na f37431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Na f37432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Na f37433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Na f37434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Na f37435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Na f37436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Na[] f37437k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37440c;

    static {
        Na na2 = new Na("LPClickStart", 0, "clickStartCalled", "sdk_click_detected", 0);
        f37430d = na2;
        Na na3 = new Na("LPStartFailed", 1, "landingsStartFailed", "valid_click_failed", 1);
        f37431e = na3;
        Na na4 = new Na("LPStartSuccess", 2, "landingsStartSuccess", "browser_open_success", 2);
        f37432f = na4;
        Na na5 = new Na("LPBrowserOpenFailed", 3, "browserOpenFailed", "browser_open_failed", 2);
        f37433g = na5;
        Na na6 = new Na("LPPageStart", 4, "landingsPageStarted", "on_page_started", 3);
        f37434h = na6;
        Na na7 = new Na("LPCompleteSuccess", 5, "landingsCompleteSuccess", "landing_success", 4);
        f37435i = na7;
        Na na8 = new Na("LPCompleteFailed", 6, "landingsCompleteFailed", "landing_failed", 4);
        f37436j = na8;
        Na[] naArr = {na2, na3, na4, na5, na6, na7, na8};
        f37437k = naArr;
        qf.a.a(naArr);
    }

    public Na(String str, int i10, String str2, String str3, int i11) {
        this.f37438a = str2;
        this.f37439b = str3;
        this.f37440c = i11;
    }

    public static Na valueOf(String str) {
        return (Na) Enum.valueOf(Na.class, str);
    }

    public static Na[] values() {
        return (Na[]) f37437k.clone();
    }
}
