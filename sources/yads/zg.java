package yads;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zg implements StartupParamsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vg f118656a;

    public zg(vg vgVar) {
        this.f118656a = vgVar;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        ArrayList arrayList;
        Map<String, StartupParamsItem> map;
        StartupParamsItem startupParamsItem;
        Map<String, StartupParamsItem> map2;
        StartupParamsItem startupParamsItem2;
        Map<String, StartupParamsItem> map3;
        StartupParamsItem startupParamsItem3;
        vg vgVar = this.f118656a;
        String id2 = null;
        String id3 = (result == null || (map3 = result.parameters) == null || (startupParamsItem3 = map3.get(StartupParamsCallback.APPMETRICA_UUID)) == null) ? null : startupParamsItem3.getId();
        String id4 = (result == null || (map2 = result.parameters) == null || (startupParamsItem2 = map2.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)) == null) ? null : startupParamsItem2.getId();
        if (result != null && (map = result.parameters) != null && (startupParamsItem = map.get("appmetrica_get_ad_url")) != null) {
            id2 = startupParamsItem.getId();
        }
        pg pgVar = (pg) vgVar;
        pgVar.getClass();
        boolean z10 = lb1.f113032a;
        pgVar.c();
        ng ngVar = pgVar.f114661a;
        mg mgVar = new mg(id2, id4, id3);
        synchronized (ngVar.f113868a) {
            arrayList = new ArrayList(ngVar.f113869b);
            ngVar.f113869b.clear();
            Unit unit = Unit.f93236a;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n11) it.next()).a(mgVar);
        }
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        vg vgVar = this.f118656a;
        ug ugVar = Intrinsics.areEqual(reason, StartupParamsCallback.Reason.NETWORK) ? ug.f116632c : Intrinsics.areEqual(reason, StartupParamsCallback.Reason.INVALID_RESPONSE) ? ug.f116633d : ug.f116631b;
        pg pgVar = (pg) vgVar;
        pgVar.c();
        pgVar.f114664d.f112701a.getClass();
        String str = (String) lg.f113090a.get(ugVar);
        if (str == null) {
            str = "Unknown";
        }
        kg.a(str);
        pgVar.a();
    }
}
