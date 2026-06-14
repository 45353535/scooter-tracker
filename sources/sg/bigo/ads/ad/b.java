package sg.bigo.ads.ad;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.l;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, List<Ad>> f100146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Map<String, List<Ad>>> f100147b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static b f100151a = new b(0);
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.b$b, reason: collision with other inner class name */
    interface InterfaceC1205b {
        boolean a(Ad ad2);
    }

    private b() {
        this.f100146a = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        this.f100147b = arrayList;
        arrayList.add(this.f100146a);
    }

    private int a(String str, @NonNull Map<String, List<Ad>> map) {
        return a(str, map, new InterfaceC1205b() { // from class: sg.bigo.ads.ad.b.1
            @Override // sg.bigo.ads.ad.b.InterfaceC1205b
            public final boolean a(Ad ad2) {
                return ad2 != null && ad2.isExpired();
            }
        });
    }

    private static String b(Ad ad2) {
        return ad2 == null ? "null" : ad2.toString();
    }

    /* synthetic */ b(byte b10) {
        this();
    }

    private int a(String str, @NonNull Map<String, List<Ad>> map, @NonNull InterfaceC1205b interfaceC1205b) {
        List<Ad> list = map.get(str);
        int i10 = 0;
        if (list != null && !list.isEmpty()) {
            for (Ad ad2 : list) {
                if (interfaceC1205b.a(ad2)) {
                    a(ad2);
                    list.remove(ad2);
                    i10++;
                }
            }
        }
        return i10;
    }

    private static String b(l lVar) {
        if (lVar == null) {
            return null;
        }
        String strL = lVar.l();
        if (TextUtils.isEmpty(strL)) {
            return null;
        }
        return strL + "_" + lVar.v() + "_" + lVar.b();
    }

    public final Ad a(l lVar) {
        String strB = b(lVar);
        sg.bigo.ads.common.t.a.a(0, 3, "AdCacheManager", "AdCacheManager:key = ".concat(String.valueOf(strB)));
        Ad ad2 = null;
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "AdCacheManager", "AdCacheManager:getAd expiredNum is ".concat(String.valueOf(a(strB, this.f100146a))));
        List<Ad> list = this.f100146a.get(strB);
        if (list != null && !list.isEmpty()) {
            int i10 = 0;
            while (i10 < list.size()) {
                try {
                    Ad ad3 = list.get(i10);
                    i10++;
                    ad2 = ad3;
                } catch (Exception e10) {
                    sg.bigo.ads.common.t.a.a(0, "AdCacheManager", "AdCacheManager:getAd end error= " + e10.getMessage());
                }
            }
            if (ad2 != null) {
                list.remove(ad2);
            }
            sg.bigo.ads.common.t.a.a(0, 3, "AdCacheManager", "AdCacheManager:getAd end cacheNum= " + list.size() + "ad = " + b(ad2));
        }
        return ad2;
    }

    private void a(final Ad ad2) {
        if (ad2 == null) {
            return;
        }
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.b.2
            @Override // java.lang.Runnable
            public final void run() {
                ad2.destroy();
            }
        });
    }

    public final void a(l lVar, Ad ad2) {
        h hVar;
        if (lVar == null) {
            return;
        }
        String strL = lVar.l();
        String strB = b(lVar);
        if (TextUtils.isEmpty(strB) || (hVar = i.f102116a) == null) {
            return;
        }
        int iH = hVar.q().h(strL);
        Map<String, List<Ad>> map = this.f100146a;
        int iA = a(strB, map);
        List copyOnWriteArrayList = map.get(strB);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.add(ad2);
            map.put(strB, (List<Ad>) copyOnWriteArrayList);
        } else {
            int iIndexOf = copyOnWriteArrayList.indexOf(ad2);
            if (iIndexOf >= 0) {
                copyOnWriteArrayList.set(iIndexOf, ad2);
            } else {
                copyOnWriteArrayList.add(ad2);
            }
        }
        sg.bigo.ads.api.core.b[] bVarArrA = sg.bigo.ads.controller.loader.a.a(ad2);
        for (int i10 = 0; bVarArrA != null && i10 < bVarArrA.length; i10++) {
            sg.bigo.ads.api.core.b bVar = bVarArrA[i10];
            bVar.T();
            bVar.S();
        }
        Object[] array = copyOnWriteArrayList.toArray();
        if (array != null) {
            List listAsList = Arrays.asList(array);
            Collections.sort(listAsList, Collections.reverseOrder());
            copyOnWriteArrayList.clear();
            copyOnWriteArrayList.addAll(listAsList);
        }
        int size = copyOnWriteArrayList.size();
        if (iH > 0 && size > iH) {
            try {
                Ad ad3 = (Ad) copyOnWriteArrayList.remove(iH);
                sg.bigo.ads.common.t.a.a(0, 3, "AdCacheManager", "AdCacheManager:removeAd due to limit:" + b(ad3));
                a(ad3);
            } catch (Exception e10) {
                sg.bigo.ads.common.t.a.a(0, "AdCacheManager", "AdCacheManager:doAdPut, error = " + e10.getMessage());
            }
        }
        sg.bigo.ads.common.t.a.a(0, 3, "AdCacheManager", "AdCacheManager:putAdInCache:" + b(ad2));
        sg.bigo.ads.common.t.a.a(0, 3, "AdCacheManager", "AdCacheManager:doAdPut, size = " + copyOnWriteArrayList.size() + ", expired num = " + iA);
    }
}
