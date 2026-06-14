package sg.bigo.ads.core.e;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.u.a.e;
import sg.bigo.ads.common.u.c.c;
import sg.bigo.ads.common.u.g;
import sg.bigo.ads.common.u.h;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    public interface a {
        void a();

        boolean a(int i10);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i10, String str, String str2, @NonNull sg.bigo.ads.common.u.a aVar, String str3, boolean z10, int i11, int i12, Map<String, String> map, int i13, String str4) {
        HashMap map2;
        if (map == null) {
            map = new HashMap<>();
        }
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        map2 = new HashMap(map);
        map2.put("action", str);
        map2.put("track_url", aVar.a());
        map2.put("domain_front", aVar.e() ? aVar.d() : "");
        map2.put("track_name", str3);
        map2.put("states", str2);
        map2.put("src", z10 ? "1" : "0");
        map2.put("res_code", String.valueOf(i13));
        if (str4 == null) {
            str4 = "";
        }
        map2.put("res_msg", str4);
        map2.put("retry", String.valueOf(i11));
        map2.put("out_ad", String.valueOf(i12));
        map2.put("replace", String.valueOf(i10));
        str.getClass();
        switch (str) {
            case "va_cpn_cli":
            case "va_cli":
            case "click_track":
                sg.bigo.ads.core.d.b.b(map2);
                break;
            case "va_cpn_imp":
            case "impl_track":
            case "va_show":
                sg.bigo.ads.core.d.b.a(map2);
                break;
            default:
                sg.bigo.ads.common.t.a.a(0, 3, "TrackerRequestHelper", "reportTrack dont report action =".concat(str));
                break;
        }
    }

    private static void a(int i10, String str, @NonNull sg.bigo.ads.common.u.a aVar, String str2, boolean z10, int i11, int i12, Map<String, String> map) {
        b(i10, str, "start", aVar, str2, z10, i11, i12, map, 0, "");
    }

    public static void a(Context context, int i10, String str, @NonNull sg.bigo.ads.common.u.a aVar, String str2, int i11, Map<String, String> map, a aVar2) {
        a(context, i10, str, aVar, str2, i11, false, 0, map, aVar2);
    }

    public static void a(Context context, final int i10, final String str, @NonNull final sg.bigo.ads.common.u.a aVar, final String str2, final int i11, final boolean z10, final int i12, final Map<String, String> map, final a aVar2) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "TrackerRequestHelper", "track url = " + aVar.a());
        if (i.f102116a.n().a(9) && URLUtil.isHttpUrl(aVar.a())) {
            b(i10, str, "failure", aVar, str2, z10, i12, i11, map, 901, "Invalid http url");
            return;
        }
        a(i10, str, aVar, str2, z10, i12, i11, map);
        sg.bigo.ads.common.u.b.a aVar3 = new sg.bigo.ads.common.u.b.a(aVar, context);
        aVar3.f102749l = e.g();
        g.a(aVar3, new sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.a, sg.bigo.ads.common.u.c.a>() { // from class: sg.bigo.ads.core.e.b.1

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private final List<Integer> f104174k = new ArrayList();

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f104175l = -1;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private boolean f104176m = false;

            @Override // sg.bigo.ads.common.u.b
            public final /* bridge */ /* synthetic */ c a(@NonNull sg.bigo.ads.common.u.c.a aVar4) {
                return aVar4;
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @Nullable String str3, int i13) {
                super.a((sg.bigo.ads.common.u.b.a) cVar, str3, i13);
                this.f104174k.add(Integer.valueOf(i13));
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull c cVar2) {
                sg.bigo.ads.common.u.c.a aVar4 = (sg.bigo.ads.common.u.c.a) cVar2;
                a aVar5 = aVar2;
                if (aVar5 != null) {
                    aVar5.b();
                }
                b.b(i10, str, "success", aVar, str2, z10, i12, i11, map, aVar4.f102756a, "success");
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull h hVar) {
                int i13;
                String str3;
                sg.bigo.ads.common.u.a aVar4;
                String str4;
                boolean z11;
                int i14;
                int i15;
                Map map2;
                int i16;
                String message;
                String str5;
                sg.bigo.ads.common.u.b.a aVar5 = (sg.bigo.ads.common.u.b.a) cVar;
                if (this.f104176m || a(aVar5)) {
                    a aVar6 = aVar2;
                    if (aVar6 != null) {
                        aVar6.b();
                    }
                    i13 = i10;
                    str3 = str;
                    aVar4 = aVar;
                    str4 = str2;
                    z11 = z10;
                    i14 = i12;
                    i15 = i11;
                    map2 = map;
                    i16 = this.f104175l;
                    message = "Something wrong occurs when handling the request, but it is still successful";
                    str5 = "success";
                } else {
                    sg.bigo.ads.common.t.a.a(0, 3, "TrackerRequestHelper", "track onError e=" + hVar.getMessage());
                    a aVar7 = aVar2;
                    if (aVar7 != null) {
                        aVar7.a();
                    }
                    i13 = i10;
                    str3 = str;
                    aVar4 = aVar;
                    str4 = str2;
                    z11 = z10;
                    i14 = i12;
                    i15 = i11;
                    map2 = map;
                    i16 = hVar.f102773a;
                    message = hVar.getMessage();
                    str5 = "failure";
                }
                b.b(i13, str3, str5, aVar4, str4, z11, i14, i15, map2, i16, message);
            }

            private boolean a(@NonNull sg.bigo.ads.common.u.b.a aVar4) {
                Iterator<Integer> it = this.f104174k.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    a aVar5 = aVar2;
                    if ((aVar5 != null && aVar5.a(iIntValue)) || super.a(aVar4, iIntValue)) {
                        this.f104175l = iIntValue;
                        this.f104176m = true;
                        return true;
                    }
                }
                return false;
            }

            @Override // sg.bigo.ads.common.u.b
            public final /* synthetic */ boolean a(@NonNull sg.bigo.ads.common.u.b.c cVar, int i13) {
                this.f104174k.add(Integer.valueOf(i13));
                return a((sg.bigo.ads.common.u.b.a) cVar);
            }
        });
    }
}
