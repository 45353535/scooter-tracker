package com.my.target;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import com.ironsource.X3;
import com.my.target.common.MyTargetConfig;
import com.my.target.z1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class z1 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f61125a = new d(new HashMap(), 0);

    public static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61126a = "cdma";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f61127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f61129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f61130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f61131f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f61132g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f61133h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f61134i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f61135j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f61136k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f61137l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f61138m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f61139n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f61140o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f61141p;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
            this.f61127b = i10;
            this.f61128c = i11;
            this.f61129d = i12;
            this.f61130e = i13;
            this.f61131f = i14;
            this.f61132g = i15;
            this.f61133h = i16;
            this.f61134i = i17;
            this.f61135j = i18;
            this.f61136k = i19;
            this.f61137l = i20;
            this.f61138m = i21;
            this.f61139n = i22;
            this.f61140o = i23;
            this.f61141p = i24;
        }

        @Override // com.my.target.z1.b
        public String a() {
            return this.f61126a + StringUtils.COMMA + this.f61127b + StringUtils.COMMA + this.f61128c + StringUtils.COMMA + this.f61129d + StringUtils.COMMA + this.f61130e + StringUtils.COMMA + this.f61131f + StringUtils.COMMA + this.f61132g + StringUtils.COMMA + this.f61133h + StringUtils.COMMA + this.f61134i + StringUtils.COMMA + this.f61135j + StringUtils.COMMA + this.f61136k + StringUtils.COMMA + this.f61137l + StringUtils.COMMA + this.f61138m + StringUtils.COMMA + this.f61139n + StringUtils.COMMA + this.f61140o + StringUtils.COMMA + this.f61141p;
        }
    }

    public interface b {
        String a();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f61142a;

        public c(Context context) {
            b bVarB;
            this.f61142a = null;
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return;
            }
            try {
                boolean z10 = Build.VERSION.SDK_INT < 29 && c2.a("android.permission.ACCESS_COARSE_LOCATION", context);
                boolean zA = c2.a("android.permission.ACCESS_FINE_LOCATION", context);
                if (z10 || zA) {
                    List listA = a(telephonyManager);
                    this.f61142a = listA;
                    if ((listA == null || listA.isEmpty()) && (bVarB = b(telephonyManager)) != null) {
                        ArrayList arrayList = new ArrayList();
                        this.f61142a = arrayList;
                        arrayList.add(bVarB);
                    }
                }
            } catch (Throwable th2) {
                gb.a("EnvironmentParamsDataProvider$CellEnvironment: Environment provider error - " + th2.getMessage());
            }
        }

        public static List a(TelephonyManager telephonyManager) {
            Object eVar;
            Object aVar;
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (CellInfo cellInfo : allCellInfo) {
                if (cellInfo.isRegistered()) {
                    if (cellInfo instanceof CellInfoLte) {
                        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
                        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
                        long ci2 = cellIdentity.getCi();
                        int i10 = Build.VERSION.SDK_INT;
                        eVar = new e("lte", ci2, Integer.MAX_VALUE, i10 >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i10 >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), cellSignalStrength.getTimingAdvance(), i10 >= 24 ? cellIdentity.getEarfcn() : Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, cellIdentity.getTac());
                    } else if (cellInfo instanceof CellInfoGsm) {
                        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                        CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                        CellSignalStrengthGsm cellSignalStrength2 = cellInfoGsm.getCellSignalStrength();
                        long cid = cellIdentity2.getCid();
                        int lac = cellIdentity2.getLac();
                        int i11 = Build.VERSION.SDK_INT;
                        eVar = new e("gsm", cid, lac, i11 >= 28 ? cellIdentity2.getMccString() : String.valueOf(cellIdentity2.getMcc()), i11 >= 28 ? cellIdentity2.getMncString() : String.valueOf(cellIdentity2.getMnc()), cellSignalStrength2.getLevel(), cellSignalStrength2.getDbm(), cellSignalStrength2.getAsuLevel(), i11 >= 26 ? cellSignalStrength2.getTimingAdvance() : Integer.MAX_VALUE, Integer.MAX_VALUE, i11 >= 24 ? cellIdentity2.getBsic() : Integer.MAX_VALUE, cellIdentity2.getPsc(), Integer.MAX_VALUE);
                    } else if (cellInfo instanceof CellInfoWcdma) {
                        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                        CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
                        CellSignalStrengthWcdma cellSignalStrength3 = cellInfoWcdma.getCellSignalStrength();
                        long cid2 = cellIdentity3.getCid();
                        int lac2 = cellIdentity3.getLac();
                        int i12 = Build.VERSION.SDK_INT;
                        eVar = new e("wcdma", cid2, lac2, i12 >= 28 ? cellIdentity3.getMccString() : String.valueOf(cellIdentity3.getMcc()), i12 >= 28 ? cellIdentity3.getMncString() : String.valueOf(cellIdentity3.getMnc()), cellSignalStrength3.getLevel(), cellSignalStrength3.getDbm(), cellSignalStrength3.getAsuLevel(), Integer.MAX_VALUE, i12 >= 24 ? cellIdentity3.getUarfcn() : Integer.MAX_VALUE, Integer.MAX_VALUE, cellIdentity3.getPsc(), Integer.MAX_VALUE);
                    } else {
                        if (cellInfo instanceof CellInfoCdma) {
                            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                            CellIdentityCdma cellIdentity4 = cellInfoCdma.getCellIdentity();
                            CellSignalStrengthCdma cellSignalStrength4 = cellInfoCdma.getCellSignalStrength();
                            aVar = new a(cellIdentity4.getNetworkId(), cellIdentity4.getSystemId(), cellIdentity4.getBasestationId(), cellIdentity4.getLatitude(), cellIdentity4.getLongitude(), cellSignalStrength4.getCdmaLevel(), cellSignalStrength4.getLevel(), cellSignalStrength4.getEvdoLevel(), cellSignalStrength4.getAsuLevel(), cellSignalStrength4.getCdmaDbm(), cellSignalStrength4.getDbm(), cellSignalStrength4.getEvdoDbm(), cellSignalStrength4.getEvdoEcio(), cellSignalStrength4.getCdmaEcio(), cellSignalStrength4.getEvdoSnr());
                        } else {
                            int i13 = Build.VERSION.SDK_INT;
                            if (i13 >= 29 && k5.n3.a(cellInfo)) {
                                CellIdentityNr cellIdentityNrA = k5.e4.a(cellInfo.getCellIdentity());
                                CellSignalStrengthNr cellSignalStrengthNrA = k5.g4.a(cellInfo.getCellSignalStrength());
                                aVar = new e("nr", cellIdentityNrA.getNci(), Integer.MAX_VALUE, cellIdentityNrA.getMccString(), cellIdentityNrA.getMncString(), cellSignalStrengthNrA.getLevel(), cellSignalStrengthNrA.getDbm(), cellSignalStrengthNrA.getAsuLevel(), Integer.MAX_VALUE, cellIdentityNrA.getNrarfcn(), Integer.MAX_VALUE, Integer.MAX_VALUE, cellIdentityNrA.getTac());
                            } else if (i13 >= 30 && k5.i3.a(cellInfo)) {
                                CellIdentityTdscdma cellIdentity5 = k5.j3.a(cellInfo).getCellIdentity();
                                CellSignalStrengthTdscdma cellSignalStrengthTdscdmaA = k5.l3.a(cellInfo.getCellSignalStrength());
                                aVar = new e("tdscdma", cellIdentity5.getCid(), cellIdentity5.getLac(), cellIdentity5.getMccString(), cellIdentity5.getMncString(), cellSignalStrengthTdscdmaA.getLevel(), cellSignalStrengthTdscdmaA.getDbm(), cellSignalStrengthTdscdmaA.getAsuLevel(), Integer.MAX_VALUE, cellIdentity5.getUarfcn(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                            }
                        }
                        eVar = aVar;
                    }
                    arrayList.add(eVar);
                }
            }
            return arrayList;
        }

        public static b b(TelephonyManager telephonyManager) {
            String str;
            String str2;
            String strSubstring;
            CellLocation cellLocation = telephonyManager.getCellLocation();
            String strSubstring2 = null;
            if (!(cellLocation instanceof GsmCellLocation)) {
                return null;
            }
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            String networkOperator = telephonyManager.getNetworkOperator();
            if (networkOperator == null || networkOperator.length() == 0) {
                str = null;
                str2 = null;
            } else {
                try {
                    strSubstring = networkOperator.substring(0, 3);
                    try {
                        strSubstring2 = networkOperator.substring(3);
                    } catch (Throwable unused) {
                        gb.a("EnvironmentParamsDataProvider$CellEnvironment: Unable to substring network operator " + networkOperator);
                    }
                } catch (Throwable unused2) {
                    strSubstring = null;
                }
                str2 = strSubstring2;
                str = strSubstring;
            }
            return new e("gsm", gsmCellLocation.getCid(), gsmCellLocation.getLac(), str, str2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f61143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f61144b;

        public d(Map map, long j10) {
            this.f61143a = map;
            this.f61144b = j10;
        }

        public long a() {
            return this.f61144b;
        }

        public Map b() {
            return new HashMap(this.f61143a);
        }
    }

    public static class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f61147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f61148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f61149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f61150f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f61151g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f61152h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f61153i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f61154j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f61155k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f61156l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f61157m;

        public e(String str, long j10, int i10, String str2, String str3, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f61145a = str;
            this.f61148d = j10;
            this.f61149e = i10;
            this.f61146b = str2 == null ? String.valueOf(Integer.MAX_VALUE) : str2;
            this.f61147c = str3 == null ? String.valueOf(Integer.MAX_VALUE) : str3;
            this.f61150f = i11;
            this.f61151g = i12;
            this.f61152h = i13;
            this.f61153i = i14;
            this.f61154j = i15;
            this.f61155k = i16;
            this.f61156l = i17;
            this.f61157m = i18;
        }

        @Override // com.my.target.z1.b
        public String a() {
            return this.f61145a + StringUtils.COMMA + this.f61148d + StringUtils.COMMA + this.f61149e + StringUtils.COMMA + this.f61146b + StringUtils.COMMA + this.f61147c + StringUtils.COMMA + this.f61150f + StringUtils.COMMA + this.f61151g + StringUtils.COMMA + this.f61152h + StringUtils.COMMA + this.f61153i + StringUtils.COMMA + this.f61154j + StringUtils.COMMA + this.f61155k + StringUtils.COMMA + this.f61156l + StringUtils.COMMA + this.f61157m;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WifiInfo f61158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f61159b;

        public f(Context context) {
            try {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(X3.f42018b);
                if (wifiManager != null && wifiManager.isWifiEnabled()) {
                    this.f61158a = wifiManager.getConnectionInfo();
                    if (Build.VERSION.SDK_INT < 24 || z1.a(context)) {
                        this.f61159b = wifiManager.getScanResults();
                    }
                    List list = this.f61159b;
                    if (list == null) {
                        return;
                    }
                    Collections.sort(list, new Comparator() { // from class: k5.l4
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return z1.f.a((ScanResult) obj, (ScanResult) obj2);
                        }
                    });
                }
            } catch (Throwable unused) {
                gb.a("EnvironmentParamsDataProvider$WiFiEnvironment: No permissions for access to wifi state");
            }
        }

        public static /* synthetic */ int a(ScanResult scanResult, ScanResult scanResult2) {
            return scanResult2.level - scanResult.level;
        }
    }

    public static boolean a(Context context) {
        return c2.a("android.permission.ACCESS_FINE_LOCATION", context) || c2.a("android.permission.ACCESS_COARSE_LOCATION", context);
    }

    public static void b(Map map, Context context) {
        LocationManager locationManager;
        if (a(context) && (locationManager = (LocationManager) context.getSystemService("location")) != null) {
            Location location = null;
            long j10 = 0;
            float f10 = Float.MAX_VALUE;
            String str = null;
            for (String str2 : locationManager.getAllProviders()) {
                try {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(str2);
                    if (lastKnownLocation != null) {
                        gb.a("EnvironmentParamsDataProvider: LocationProvider - " + str2);
                        float accuracy = lastKnownLocation.getAccuracy();
                        long time = lastKnownLocation.getTime();
                        if (location == null || (time > j10 && accuracy < f10)) {
                            str = str2;
                            location = lastKnownLocation;
                            f10 = accuracy;
                            j10 = time;
                        }
                    }
                } catch (Throwable unused) {
                    gb.a("EnvironmentParamsDataProvider: No permissions for get geo data");
                }
            }
            if (location == null) {
                return;
            }
            String str3 = location.getLatitude() + StringUtils.COMMA + location.getLongitude() + StringUtils.COMMA + location.getAccuracy() + StringUtils.COMMA + location.getSpeed() + StringUtils.COMMA + (j10 / 1000);
            map.put("location", str3);
            gb.a("EnvironmentParamsDataProvider: Location - " + str3);
            map.put("location_provider", str);
        }
    }

    public final void c(Map map, Context context) {
        if (c2.a("android.permission.ACCESS_WIFI_STATE", context)) {
            f fVar = new f(context);
            WifiInfo wifiInfo = fVar.f61158a;
            if (wifiInfo != null) {
                String bssid = wifiInfo.getBSSID();
                if (bssid == null) {
                    bssid = "";
                }
                int linkSpeed = wifiInfo.getLinkSpeed();
                int networkId = wifiInfo.getNetworkId();
                int rssi = wifiInfo.getRssi();
                String ssid = wifiInfo.getSSID();
                if (ssid == null) {
                    ssid = "";
                }
                String str = bssid + StringUtils.COMMA + ssid + StringUtils.COMMA + rssi + StringUtils.COMMA + networkId + StringUtils.COMMA + linkSpeed;
                map.put(X3.f42018b, str);
                gb.a("EnvironmentParamsDataProvider: ip - " + wifiInfo.getIpAddress());
                gb.a("EnvironmentParamsDataProvider: wifi - " + str);
            }
            List list = fVar.f61159b;
            if (list == null) {
                return;
            }
            int iMin = Math.min(list.size(), 5);
            int i10 = 0;
            while (i10 < iMin) {
                ScanResult scanResult = (ScanResult) list.get(i10);
                gb.a(scanResult.level + "");
                String str2 = scanResult.BSSID;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = scanResult.SSID;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str2 + StringUtils.COMMA + str3 + StringUtils.COMMA + scanResult.level;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(X3.f42018b);
                i10++;
                sb2.append(i10);
                map.put(sb2.toString(), str4);
                gb.a("EnvironmentParamsDataProvider: wifi" + i10 + " - " + str4);
            }
        }
    }

    public synchronized d a() {
        return this.f61125a;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(MyTargetConfig myTargetConfig, Context context) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (!myTargetConfig.isTrackingLocationEnabled) {
            synchronized (this) {
                this.f61125a = new d(new HashMap(), SystemClock.uptimeMillis() - jUptimeMillis);
            }
            return;
        }
        HashMap map = new HashMap();
        b(map, context);
        if (myTargetConfig.isTrackingEnvironmentEnabled) {
            c(map, context);
            a(map, context);
        }
        synchronized (this) {
            this.f61125a = new d(map, SystemClock.uptimeMillis() - jUptimeMillis);
        }
    }

    public synchronized Map b(final MyTargetConfig myTargetConfig, final Context context) {
        d dVarA;
        dVarA = a();
        f0.e(new Runnable() { // from class: k5.b3
            @Override // java.lang.Runnable
            public final void run() {
                this.f86000b.c(myTargetConfig, context);
            }
        });
        return dVarA.b();
    }

    public final void a(Map map, Context context) {
        List list;
        if (c2.a("android.permission.ACCESS_COARSE_LOCATION", context) && (list = new c(context).f61142a) != null) {
            int i10 = 0;
            while (i10 < list.size()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("cell");
                sb2.append(i10 != 0 ? Integer.valueOf(i10) : "");
                map.put(sb2.toString(), ((b) list.get(i10)).a());
                i10++;
            }
        }
    }
}
