package yads;

import com.google.firebase.analytics.FirebaseAnalytics;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class vf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vf f116992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vf f116993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final vf f116994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final vf f116995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final vf f116996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final vf f116997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ vf[] f116998i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116999b;

    static {
        vf vfVar = new vf(0, "AD_REQUEST", Reporting.Key.AD_REQUEST);
        f116992c = vfVar;
        vf vfVar2 = new vf(1, "AD_ATTEMPT", "ad_attempt");
        f116993d = vfVar2;
        vf vfVar3 = new vf(2, "AD_FILLED_REQUEST", "ad_filled_request");
        f116994e = vfVar3;
        vf vfVar4 = new vf(3, "AD_IMPRESSION", FirebaseAnalytics.Event.AD_IMPRESSION);
        f116995f = vfVar4;
        vf vfVar5 = new vf(4, "AD_CLICK", "ad_click");
        f116996g = vfVar5;
        vf vfVar6 = new vf(5, "AD_REWARD", "ad_reward");
        f116997h = vfVar6;
        vf[] vfVarArr = {vfVar, vfVar2, vfVar3, vfVar4, vfVar5, vfVar6};
        f116998i = vfVarArr;
        qf.a.a(vfVarArr);
    }

    public vf(int i10, String str, String str2) {
        this.f116999b = str2;
    }

    public static vf valueOf(String str) {
        return (vf) Enum.valueOf(vf.class, str);
    }

    public static vf[] values() {
        return (vf[]) f116998i.clone();
    }

    public final String a() {
        return this.f116999b;
    }
}
