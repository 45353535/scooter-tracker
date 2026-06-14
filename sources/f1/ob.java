package f1;

import com.startapp.sdk.adsbase.model.AdPreferences;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ob {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ob f70732b = new ob(AdPreferences.TYPE_TEXT, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ob f70733c = new ob("ARC", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ob[] f70734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f70735e;

    static {
        ob[] obVarArrD = d();
        f70734d = obVarArrD;
        f70735e = qf.a.a(obVarArrD);
    }

    public ob(String str, int i10) {
    }

    public static final /* synthetic */ ob[] d() {
        return new ob[]{f70732b, f70733c};
    }

    public static ob valueOf(String str) {
        return (ob) Enum.valueOf(ob.class, str);
    }

    public static ob[] values() {
        return (ob[]) f70734d.clone();
    }
}
