package yads;

import com.taurusx.tax.vast.VastExtensionParentXmlManager;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class sb3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f115742d = "yandex_tracking_events";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f115743e = CollectionsKt.listOf((Object[]) new String[]{"ad_system", "social_ad_info", "AdTune", "yandex_ad_info", "bannerId", "VitrinaTVIsInteractive"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f115744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nw2 f115745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vm3 f115746c;

    public sb3() {
        xm3 xm3Var = new xm3();
        this.f115744a = xm3Var;
        this.f115745b = new nw2(xm3Var);
        this.f115746c = a();
    }

    public static vm3 a() {
        return new vm3(new l53(), VastExtensionParentXmlManager.f66980w, "Tracking");
    }
}
