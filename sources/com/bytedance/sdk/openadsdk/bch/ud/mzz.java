package com.bytedance.sdk.openadsdk.bch.ud;

import android.view.View;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.utils.gy;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class mzz {
    private static final Map<Integer, ud> qdl = new ConcurrentHashMap();

    public static class qdl {
        public int qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public int f16937ud = -1;

        public qdl(int i10) {
            this.qdl = i10;
        }
    }

    private static boolean lnr(ljh ljhVar) {
        if (ljhVar == null) {
            return false;
        }
        String strQdl = gy.qdl(ljhVar);
        return ((!"open_ad".equals(strQdl) && !"fullscreen_interstitial_ad".equals(strQdl) && !Constants.REWARDED_VIDEO.equals(strQdl)) || vu.ud(ljhVar) || ljhVar.taz() == 5 || ljhVar.taz() == 33 || !ljh.mzz(ljhVar) || ljhVar.tdy() == null) ? false : true;
    }

    public static void qdl(View view, ljh ljhVar, qdl qdlVar) {
        if (view == null || ljhVar == null || ljhVar.kt()) {
            return;
        }
        boolean zLnr = lnr(ljhVar);
        if (vu.ud(ljhVar) && qdlVar != null) {
            qdlVar.qdl = -1;
        }
        qdl(qdl(view, ljhVar, zLnr, qdlVar));
    }

    public static void ud(Integer num) {
        qdl.remove(num);
    }

    public static Integer ud(ljh ljhVar) {
        return Integer.valueOf((ljhVar.cev() + ljhVar.yre()).hashCode());
    }

    private static ud qdl(View view, ljh ljhVar, boolean z10, qdl qdlVar) {
        if (view == null || ljhVar == null || ljhVar.yre() == null) {
            return null;
        }
        Integer numUd = ud(ljhVar);
        Map<Integer, ud> map = qdl;
        if (map.containsKey(numUd)) {
            ud udVar = map.get(numUd);
            if (udVar != null) {
                udVar.qdl(view);
            }
            return udVar;
        }
        ud udVarQdl = ud.qdl(z10, numUd, view, ljhVar, qdlVar);
        map.put(numUd, udVarQdl);
        return udVarQdl;
    }

    private static void qdl(ud udVar) {
        if (udVar == null) {
            return;
        }
        udVar.qdl();
    }

    public static void qdl(ljh ljhVar, int i10) {
        if (ljhVar == null || ljhVar.yre() == null) {
            return;
        }
        qdl(qdl.get(ud(ljhVar)), i10);
    }

    public static void qdl(ud udVar, int i10) {
        if (udVar == null) {
            return;
        }
        udVar.qdl(i10);
    }

    public static void qdl(ljh ljhVar) {
        if (ljhVar == null || ljhVar.yre() == null) {
            return;
        }
        Integer numUd = ud(ljhVar);
        Map<Integer, ud> map = qdl;
        ud udVar = map.get(numUd);
        if (udVar != null) {
            udVar.to();
        }
        ud(numUd);
        if (map.size() <= 0) {
            wd.qdl();
        }
    }

    public static ud qdl(Integer num) {
        return qdl.get(num);
    }
}
