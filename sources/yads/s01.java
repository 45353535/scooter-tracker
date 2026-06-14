package yads;

import com.taurusx.tax.vast.VastResourceXmlManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class s01 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r01 f115658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ s01[] f115659d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f115660b;

    static {
        s01[] s01VarArr = {new s01(0, "STATIC_RESOURCE", VastResourceXmlManager.STATIC_RESOURCE), new s01(1, "IFRAME_RESOURCE", VastResourceXmlManager.IFRAME_RESOURCE), new s01(2, "HTML_RESOURCE", VastResourceXmlManager.HTML_RESOURCE)};
        f115659d = s01VarArr;
        qf.a.a(s01VarArr);
        f115658c = new r01();
    }

    public s01(int i10, String str, String str2) {
        this.f115660b = str2;
    }

    public static s01 valueOf(String str) {
        return (s01) Enum.valueOf(s01.class, str);
    }

    public static s01[] values() {
        return (s01[]) f115659d.clone();
    }
}
