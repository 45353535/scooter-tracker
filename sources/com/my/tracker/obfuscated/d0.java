package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
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
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
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
import android.text.TextUtils;
import com.ironsource.X3;
import com.my.tracker.obfuscated.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c0.k f61405a = new c0.k(null, Collections.EMPTY_LIST);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61406b = 5;

    private List a(Context context) {
        c0.h hVarA;
        if (Build.VERSION.SDK_INT < 29) {
            if (!m1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                x2.a("EnvironmentParamsDataProvider: can't access information");
                return Collections.EMPTY_LIST;
            }
        } else if (!m1.a("android.permission.ACCESS_FINE_LOCATION", context)) {
            x2.a("EnvironmentParamsDataProvider: can't access information");
            return Collections.EMPTY_LIST;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return Collections.EMPTY_LIST;
            }
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null && !allCellInfo.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (CellInfo cellInfo : allCellInfo) {
                    if (cellInfo.isRegistered()) {
                        if (cellInfo instanceof CellInfoCdma) {
                            arrayList.add(a((CellInfoCdma) cellInfo));
                        } else if (cellInfo instanceof CellInfoGsm) {
                            arrayList.add(a((CellInfoGsm) cellInfo));
                        } else if (cellInfo instanceof CellInfoLte) {
                            arrayList.add(a((CellInfoLte) cellInfo));
                        } else if (cellInfo instanceof CellInfoWcdma) {
                            arrayList.add(a((CellInfoWcdma) cellInfo));
                        } else {
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 29 && k5.i3.a(cellInfo)) {
                                arrayList.add(a(k5.j3.a(cellInfo)));
                            } else if (i10 >= 29 && k5.n3.a(cellInfo)) {
                                arrayList.add(a(x3.a(cellInfo)));
                            }
                        }
                    }
                }
                if (arrayList.isEmpty() && (hVarA = a(telephonyManager)) != null) {
                    arrayList.add(hVarA);
                }
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        } catch (Throwable th2) {
            x2.a("EnvironmentParamsDataProvider: exception during collecting c-info", th2);
            return Collections.EMPTY_LIST;
        }
    }

    private c0.k c(Context context) {
        c0.j jVar;
        if (!m1.a("android.permission.ACCESS_WIFI_STATE", context)) {
            return f61405a;
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(X3.f42018b);
            if (wifiManager != null && wifiManager.isWifiEnabled()) {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (connectionInfo != null) {
                    String ssid = connectionInfo.getSSID();
                    String bssid = connectionInfo.getBSSID();
                    jVar = new c0.j(ssid == null ? "<null>" : ssid, bssid == null ? "<null>" : bssid, connectionInfo.getRssi(), connectionInfo.getNetworkId(), connectionInfo.getLinkSpeed());
                } else {
                    jVar = null;
                }
                if (Build.VERSION.SDK_INT >= 24 && !m1.a("android.permission.ACCESS_FINE_LOCATION", context) && !m1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                    return new c0.k(jVar, Collections.EMPTY_LIST);
                }
                List<ScanResult> scanResults = wifiManager.getScanResults();
                if (scanResults != null && !scanResults.isEmpty()) {
                    Collections.sort(scanResults, new Comparator() { // from class: com.my.tracker.obfuscated.c4
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return d0.a((ScanResult) obj, (ScanResult) obj2);
                        }
                    });
                    int iMin = Math.min(scanResults.size(), f61406b);
                    ArrayList arrayList = new ArrayList(iMin);
                    for (int i10 = 0; i10 < iMin; i10++) {
                        ScanResult scanResult = scanResults.get(i10);
                        String str = scanResult.SSID;
                        String str2 = scanResult.BSSID;
                        if (str == null) {
                            str = "<null>";
                        }
                        if (str2 == null) {
                            str2 = "<null>";
                        }
                        arrayList.add(new c0.a(str, str2, scanResult.level));
                    }
                    return new c0.k(jVar, arrayList);
                }
                return new c0.k(jVar, Collections.EMPTY_LIST);
            }
            return f61405a;
        } catch (Throwable th2) {
            x2.a("EnvironmentParamsDataProvider: exception during collecting w-info", th2);
            return f61405a;
        }
    }

    public c0 b(Context context) {
        return new c0(a(context), c(context));
    }

    private c0.c a(CellInfoCdma cellInfoCdma) {
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        int networkId = cellIdentity.getNetworkId();
        int systemId = cellIdentity.getSystemId();
        int basestationId = cellIdentity.getBasestationId();
        int latitude = cellIdentity.getLatitude();
        int longitude = cellIdentity.getLongitude();
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        return new c0.c(networkId, systemId, basestationId, latitude, longitude, cellSignalStrength.getCdmaLevel(), cellSignalStrength.getCdmaDbm(), cellSignalStrength.getCdmaEcio(), cellSignalStrength.getEvdoLevel(), cellSignalStrength.getEvdoDbm(), cellSignalStrength.getEvdoEcio(), cellSignalStrength.getEvdoSnr());
    }

    private c0.d a(CellInfoGsm cellInfoGsm) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
        int i10 = Build.VERSION.SDK_INT;
        return new c0.d(i10 >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i10 >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), i10 >= 24 ? cellIdentity.getArfcn() : -1, i10 >= 24 ? cellIdentity.getBsic() : -1, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i10 >= 26 ? cellSignalStrength.getTimingAdvance() : -1);
    }

    private c0.e a(CellInfoLte cellInfoLte) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        int i10 = Build.VERSION.SDK_INT;
        return new c0.e(i10 >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i10 >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCi(), cellIdentity.getTac(), i10 >= 24 ? cellIdentity.getEarfcn() : -1, i10 >= 24 ? cellIdentity.getPci() : -1, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i10 >= 26 ? cellSignalStrength.getTimingAdvance() : -1);
    }

    private c0.i a(CellInfoWcdma cellInfoWcdma) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
        int i10 = Build.VERSION.SDK_INT;
        return new c0.i(i10 >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i10 >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), i10 >= 24 ? cellIdentity.getUarfcn() : -1, i10 >= 24 ? cellIdentity.getPsc() : -1, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    private c0.g a(CellInfoTdscdma cellInfoTdscdma) {
        CellIdentityTdscdma cellIdentity = cellInfoTdscdma.getCellIdentity();
        CellSignalStrengthTdscdma cellSignalStrength = cellInfoTdscdma.getCellSignalStrength();
        return new c0.g(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getCpid(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    private c0.f a(CellInfoNr cellInfoNr) {
        CellIdentityNr cellIdentityNrA = k5.e4.a(cellInfoNr.getCellIdentity());
        CellSignalStrengthNr cellSignalStrengthNrA = k5.g4.a(cellInfoNr.getCellSignalStrength());
        return new c0.f(cellIdentityNrA.getMccString(), cellIdentityNrA.getMncString(), cellIdentityNrA.getNci(), cellIdentityNrA.getTac(), cellIdentityNrA.getNrarfcn(), cellIdentityNrA.getPci(), cellSignalStrengthNrA.getLevel(), cellSignalStrengthNrA.getDbm(), cellSignalStrengthNrA.getAsuLevel());
    }

    private c0.h a(TelephonyManager telephonyManager) {
        String str;
        String strSubstring;
        CellLocation cellLocation = telephonyManager.getCellLocation();
        String strSubstring2 = null;
        if (!(cellLocation instanceof GsmCellLocation)) {
            return null;
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (TextUtils.isEmpty(networkOperator)) {
            str = null;
        } else {
            try {
                strSubstring = networkOperator.substring(0, 3);
                try {
                    strSubstring2 = networkOperator.substring(3);
                } catch (Throwable unused) {
                    x2.a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);
                }
            } catch (Throwable unused2) {
                strSubstring = null;
            }
            str = strSubstring2;
            strSubstring2 = strSubstring;
        }
        GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
        return new c0.h(strSubstring2, str, gsmCellLocation.getCid(), gsmCellLocation.getLac());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(ScanResult scanResult, ScanResult scanResult2) {
        return Integer.compare(scanResult2.level, scanResult.level);
    }
}
