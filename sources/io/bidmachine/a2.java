package io.bidmachine;

import android.text.TextUtils;
import io.bidmachine.ApiRequest;
import io.bidmachine.core.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
class a2 implements nd.b {

    class a implements b.InterfaceC0975b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f79178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ nd.j f79179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TrackEventType f79180c;

        a(List list, nd.j jVar, TrackEventType trackEventType) {
            this.f79178a = list;
            this.f79179b = jVar;
            this.f79180c = trackEventType;
        }

        @Override // io.bidmachine.core.b.InterfaceC0975b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFail(ae.a aVar) {
            if (aVar == null) {
                aVar = ae.a.i("Failed to track URL");
            }
            a2.p(this.f79178a, this.f79179b, this.f79180c.getActionValue(), aVar);
        }

        @Override // io.bidmachine.core.b.InterfaceC0975b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
        }
    }

    class b implements b.InterfaceC0975b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f79181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ nd.j f79182b;

        b(List list, nd.j jVar) {
            this.f79181a = list;
            this.f79182b = jVar;
        }

        @Override // io.bidmachine.core.b.InterfaceC0975b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFail(ae.a aVar) {
            if (aVar == null) {
                aVar = ae.a.i("Failed to track URL");
            }
            a2.p(this.f79181a, this.f79182b, TrackEventType.Error.getActionValue(), aVar);
        }

        @Override // io.bidmachine.core.b.InterfaceC0975b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
        }
    }

    a2() {
    }

    private static List i(nd.l lVar, TrackEventType trackEventType) {
        List listV = j2.e().v(trackEventType);
        ArrayList arrayList = listV != null ? new ArrayList(listV) : null;
        List trackingUrls = lVar.getTrackingUrls(trackEventType);
        if (trackingUrls != null) {
            if (arrayList == null) {
                return new ArrayList(trackingUrls);
            }
            arrayList.addAll(trackingUrls);
        }
        return arrayList;
    }

    private static void j(String str, b.InterfaceC0975b interfaceC0975b) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new ApiRequest.Builder().url(str).setMethod(b.e.Get).setDataBinder(new ApiRequest.ApiTrackerDataBinder()).setCallback(interfaceC0975b).request();
    }

    private static String k(String str, String str2, Object obj) {
        return str.replace("${" + str2 + "}", String.valueOf(obj)).replace("%24%7B" + str2 + "%7D", String.valueOf(obj));
    }

    private static String l(String str, Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(str2) && value != null) {
                    str = k(str, str2, value);
                }
            }
        }
        return str;
    }

    static String m(String str, nd.j jVar, int i10, int i11, nd.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strK = k(k(k(str, Constants.URL_MACROS_BM_EVENT_CODE, Integer.valueOf(i10)), Constants.URL_MACROS_BM_ACTION_CODE, Integer.valueOf(i10)), Constants.URL_MACROS_BM_ERROR_REASON, Integer.valueOf(i11));
        if (aVar != null) {
            String strC = aVar.c();
            if (strC != null) {
                strK = k(strK, Constants.URL_MACROS_AUCTION_SEAT_ID, strC);
            }
            Double d10 = aVar.d();
            if (d10 != null) {
                strK = k(strK, Constants.URL_MACROS_AUCTION_PRICE, d10);
            }
        }
        return jVar != null ? l(k(k(strK, Constants.URL_MACROS_BM_ACTION_START, Long.valueOf(jVar.c())), Constants.URL_MACROS_BM_ACTION_FINISH, Long.valueOf(jVar.b())), jVar.a()) : strK;
    }

    private static void n(List list, List list2, nd.j jVar, final int i10, final ae.a aVar) {
        if (list != null && aVar.j()) {
            io.bidmachine.core.a.a(new ce.b() { // from class: io.bidmachine.x1
                @Override // ce.b
                public final Object get() {
                    int i11 = i10;
                    ae.a aVar2 = aVar;
                    return String.format("Dispatching error event to server - (%s-%s) - %s", Integer.valueOf(i11), Integer.valueOf(aVar2.e()), aVar2.g());
                }
            });
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j(m((String) it.next(), jVar, i10, aVar.e(), null), new b(list2, jVar));
            }
        }
    }

    private static void o(List list, List list2, nd.j jVar, final TrackEventType trackEventType, nd.a aVar) {
        if (list == null) {
            return;
        }
        io.bidmachine.core.a.a(new ce.b() { // from class: io.bidmachine.y1
            @Override // ce.b
            public final Object get() {
                return String.format("Dispatching event to server - %s", trackEventType);
            }
        });
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j(m((String) it.next(), jVar, trackEventType.getActionValue(), -1, aVar), new a(list2, jVar, trackEventType));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(List list, nd.j jVar, int i10, final ae.a aVar) {
        if (list != null && aVar.j()) {
            io.bidmachine.core.a.a(new ce.b() { // from class: io.bidmachine.z1
                @Override // ce.b
                public final Object get() {
                    return String.format("Dispatching tracking fail to server - %s", aVar);
                }
            });
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j(m((String) it.next(), jVar, i10, aVar.e(), null), null);
            }
        }
    }

    @Override // nd.b
    public void trackEvent(nd.l lVar, TrackEventType trackEventType, nd.j jVar, AdsType adsType, ae.a aVar, nd.a aVar2) {
        if (aVar != null) {
            n(i(lVar, TrackEventType.Error), i(lVar, TrackEventType.TrackingError), jVar, trackEventType.getActionValue(), aVar);
        } else {
            o(i(lVar, trackEventType), i(lVar, TrackEventType.TrackingError), jVar, trackEventType, aVar2);
        }
    }
}
