package yads;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class pv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pv f114792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pv f114793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ pv[] f114794d;

    static {
        pv pvVar = new pv(0, AdPreferences.TYPE_TEXT);
        f114792b = pvVar;
        pv pvVar2 = new pv(1, "IMAGE");
        f114793c = pvVar2;
        pv[] pvVarArr = {pvVar, pvVar2};
        f114794d = pvVarArr;
        qf.a.a(pvVarArr);
    }

    public pv(int i10, String str) {
    }

    public static pv valueOf(String str) {
        return (pv) Enum.valueOf(pv.class, str);
    }

    public static pv[] values() {
        return (pv[]) f114794d.clone();
    }
}
