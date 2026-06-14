package com.mbridge.msdk.config.component.status;

import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class StatusCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static c f47235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static e f47236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static d f47237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static a f47238n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f47239h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Map<String, Object> f47240i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Map<String, Object> f47241j = null;

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f46644f = "916001";
        if (map == null) {
            return;
        }
        this.f47241j = map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void c(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f47240i = map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        String strValueOf;
        List<String> list;
        super.d();
        Map<String, Object> map = this.f47240i;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (f47238n == null) {
            f47238n = new a() { // from class: com.mbridge.msdk.config.component.status.f
                @Override // com.mbridge.msdk.config.component.status.a
                public final void a(com.mbridge.msdk.config.component.base.b bVar) {
                    this.f47266a.c(bVar);
                }
            };
        }
        if (d("916002")) {
            if (!c("916002")) {
                c cVar = f47235k;
                if (cVar != null) {
                    cVar.b(f47238n);
                    f47235k.d();
                }
                f47235k = null;
            } else if (f47235k == null) {
                c cVar2 = new c();
                f47235k = cVar2;
                cVar2.a(f47238n);
            }
        }
        if (d("916003") || d("916004")) {
            if (c("916003") || c("916004")) {
                b bVar = com.mbridge.msdk.foundation.controller.a.f48256s;
                if (bVar != null) {
                    bVar.a(f47238n);
                }
            } else {
                b bVar2 = com.mbridge.msdk.foundation.controller.a.f48256s;
                if (bVar2 != null) {
                    bVar2.b(f47238n);
                }
            }
        }
        if (d("916005")) {
            if (!c("916005")) {
                e eVar = f47236l;
                if (eVar != null) {
                    eVar.b(f47238n);
                    f47236l.d();
                }
                f47236l = null;
            } else if (f47236l == null) {
                e eVar2 = new e();
                f47236l = eVar2;
                eVar2.a(f47238n);
            }
        }
        if (d("916006")) {
            Map<String, Object> map2 = this.f47241j;
            if (map2 != null) {
                Object obj = map2.get(DownloadModel.FILE_NAME);
                if (obj == null) {
                    obj = "";
                }
                strValueOf = String.valueOf(obj);
                list = (this.f47241j.containsKey("key_list") && (this.f47241j.get("key_list") instanceof List)) ? (List) this.f47241j.get("key_list") : null;
            } else {
                strValueOf = null;
                list = null;
            }
            if (!c("916006")) {
                d dVar = f47237m;
                if (dVar != null) {
                    dVar.b(f47238n);
                }
                f47237m = null;
            } else if (f47237m == null) {
                d dVar2 = new d(strValueOf);
                f47237m = dVar2;
                dVar2.a(list);
                f47237m.a(f47238n);
            }
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.mbridge.msdk.config.component.base.b bVar) {
        String strC = bVar.c();
        strC.getClass();
        switch (strC) {
            case "916002":
                String strValueOf = String.valueOf(bVar.b().get("networkType"));
                if (!TextUtils.isEmpty(this.f47239h)) {
                    if (!this.f47239h.equals(strValueOf)) {
                        this.f47239h = strValueOf;
                        a(a(bVar.c(), bVar.b()));
                        break;
                    }
                } else {
                    this.f47239h = strValueOf;
                    break;
                }
                break;
            case "916003":
            case "916004":
            case "916005":
            case "916006":
                a(a(bVar.c(), bVar.b()));
                break;
        }
    }

    private void g() {
        boolean zC = c("916002");
        boolean zC2 = c("916005");
        boolean z10 = c("916004") || c("916003");
        boolean zC3 = c("916006");
        if (zC || zC2 || z10 || zC3) {
            return;
        }
        f47238n = null;
    }

    private boolean c(String str) {
        Object obj = this.f47240i.get(str);
        if (obj instanceof Map) {
            return String.valueOf(((Map) obj).get(Constants.REPORT)).equals("1");
        }
        return false;
    }

    private boolean d(String str) {
        Object obj;
        Object obj2 = this.f47240i.get(str);
        if (!(obj2 instanceof Map) || (obj = ((Map) obj2).get(Constants.REPORT)) == null) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        return strValueOf.equals("1") || strValueOf.equals("0");
    }
}
