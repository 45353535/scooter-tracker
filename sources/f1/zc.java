package f1;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class zc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zc f71810b = new zc("INFO", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zc f71811c = new zc("VOLUME", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zc f71812d = new zc("CLOSE", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zc f71813e = new zc("SKIP", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zc f71814f = new zc("TIMER", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zc f71815g = new zc(NativeAdContent.ViewTag.CTA, 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ zc[] f71816h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f71817i;

    static {
        zc[] zcVarArrD = d();
        f71816h = zcVarArrD;
        f71817i = qf.a.a(zcVarArrD);
    }

    public zc(String str, int i10) {
    }

    public static final /* synthetic */ zc[] d() {
        return new zc[]{f71810b, f71811c, f71812d, f71813e, f71814f, f71815g};
    }

    public static zc valueOf(String str) {
        return (zc) Enum.valueOf(zc.class, str);
    }

    public static zc[] values() {
        return (zc[]) f71816h.clone();
    }
}
