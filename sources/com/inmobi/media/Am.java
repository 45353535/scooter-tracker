package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Am {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Am f36588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Am f36589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Am f36590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Am f36591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Am f36592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Am[] f36593g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y7 f36594a;

    static {
        Am am = new Am("UNKNOWN", 0, Y7.f38026b);
        f36588b = am;
        Am am2 = new Am("MALFORMED_URL", 1, Y7.f38028d);
        f36589c = am2;
        Am am3 = new Am("TIMEOUT", 2, Y7.f38029e);
        Am am4 = new Am("NETWORK", 3, Y7.f38030f);
        f36590d = am4;
        Am am5 = new Am("NO_URL_FOUND", 4, Y7.f38031g);
        f36591e = am5;
        Am am6 = new Am("INVALID_STATE", 5, Y7.f38027c);
        f36592f = am6;
        Am[] amArr = {am, am2, am3, am4, am5, am6};
        f36593g = amArr;
        qf.a.a(amArr);
    }

    public Am(String str, int i10, Y7 y72) {
        this.f36594a = y72;
    }

    public static Am valueOf(String str) {
        return (Am) Enum.valueOf(Am.class, str);
    }

    public static Am[] values() {
        return (Am[]) f36593g.clone();
    }
}
