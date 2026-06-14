package yads;

import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class jy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final jy f112503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final jy f112504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ jy[] f112505e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112506b;

    static {
        jy jyVar = new jy(0, "NETWORK", "network");
        f112503c = jyVar;
        jy jyVar2 = new jy(1, "CACHE", Reporting.EventType.CACHE);
        f112504d = jyVar2;
        jy[] jyVarArr = {jyVar, jyVar2};
        f112505e = jyVarArr;
        qf.a.a(jyVarArr);
    }

    public jy(int i10, String str, String str2) {
        this.f112506b = str2;
    }

    public static jy valueOf(String str) {
        return (jy) Enum.valueOf(jy.class, str);
    }

    public static jy[] values() {
        return (jy[]) f112505e.clone();
    }
}
