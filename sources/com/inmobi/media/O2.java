package com.inmobi.media;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public abstract class O2 {
    public static HashMap a() {
        String networkOperatorName;
        HashMap map = new HashMap();
        Context context = Ji.f37157a;
        if (context == null) {
            return map;
        }
        int cellOperatorFlag = Yi.a().getCellOperatorFlag();
        boolean z10 = (cellOperatorFlag & 2) == 2;
        boolean z11 = (cellOperatorFlag & 1) == 1;
        M2 m22 = new M2();
        Object systemService = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (!z10) {
            int[] iArrA = a(telephonyManager.getNetworkOperator());
            m22.f37334a = iArrA[0];
            m22.f37335b = iArrA[1];
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null) {
                Locale ENGLISH = Locale.ENGLISH;
                Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                String lowerCase = networkCountryIso.toLowerCase(ENGLISH);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                m22.f37338e = lowerCase;
            }
        }
        if (!z11) {
            int[] iArrA2 = a(telephonyManager.getSimOperator());
            m22.f37336c = iArrA2[0];
            m22.f37337d = iArrA2[1];
        }
        String strB = m22.b();
        if (strB != null) {
            map.put("s-ho", strB);
        }
        String strA = m22.a();
        if (strA != null) {
            map.put("s-co", strA);
        }
        String str = m22.f37338e;
        if (str != null) {
            map.put("s-iso", str);
        }
        C4148x5.f39893a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService2 = context.getSystemService("phone");
        TelephonyManager telephonyManager2 = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
        if (telephonyManager2 == null || (networkOperatorName = telephonyManager2.getNetworkOperatorName()) == null) {
            networkOperatorName = "";
        }
        map.put("s-cn", networkOperatorName);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap b() {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.O2.b():java.util.HashMap");
    }

    public static HashMap c() {
        ArrayList arrayList;
        Context context;
        if (Ji.d() && d() && e()) {
            C3986qh c3986qh = Yi.f38062a;
            if ((Ji.b() == null || Yi.a().isVisibleCellTowerEnabled()) && (context = Ji.f37157a) != null) {
                Object systemService = context.getSystemService("phone");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                ArrayList arrayList2 = new ArrayList();
                int[] iArrA = a(telephonyManager.getNetworkOperator());
                String strValueOf = String.valueOf(iArrA[0]);
                String strValueOf2 = String.valueOf(iArrA[1]);
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo != null) {
                    for (CellInfo cellInfo : allCellInfo) {
                        if (!cellInfo.isRegistered()) {
                            arrayList2.add(new N2(cellInfo, strValueOf, strValueOf2, Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType()));
                        }
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = new ArrayList();
            }
        } else {
            arrayList = new ArrayList();
        }
        HashMap map = new HashMap();
        if (!arrayList.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(((N2) arrayList.get(arrayList.size() - 1)).a());
            map.put("v-sc", jSONArray.toString());
        }
        return map;
    }

    public static boolean d() {
        if (!Ji.d()) {
            return false;
        }
        boolean zA = Kf.a(Ji.f37157a, "android.permission.READ_PHONE_STATE");
        boolean zA2 = Kf.a(Ji.f37157a, "android.permission.ACCESS_FINE_LOCATION");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            if (!zA2) {
                Intrinsics.checkNotNullExpressionValue("O2", "TAG");
            }
            return zA2;
        }
        if (i10 >= 30) {
            if (!zA2 || !zA) {
                Intrinsics.checkNotNullExpressionValue("O2", "TAG");
            }
            return zA2 && zA;
        }
        boolean zA3 = Kf.a(Ji.f37157a, "android.permission.ACCESS_COARSE_LOCATION");
        if (!zA3 && !zA2) {
            Intrinsics.checkNotNullExpressionValue("O2", "TAG");
        }
        return zA3 || zA2;
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        Context context = Ji.f37157a;
        Object systemService = context != null ? context.getSystemService("location") : null;
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        return locationManager != null && locationManager.isLocationEnabled();
    }

    public static int[] a(String str) {
        int[] iArr = {-1, -1};
        if (str != null && !Intrinsics.areEqual("", str)) {
            try {
                String strSubstring = str.substring(0, 3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                int i10 = Integer.parseInt(strSubstring);
                String strSubstring2 = str.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                int i11 = Integer.parseInt(strSubstring2);
                iArr[0] = i10;
                iArr[1] = i11;
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            }
        }
        return iArr;
    }
}
