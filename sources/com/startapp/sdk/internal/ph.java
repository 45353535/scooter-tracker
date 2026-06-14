package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ph extends ce {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lb f65116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b6 f65117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h3 f65118l;

    public ph(Context context, lb lbVar, lb lbVar2, lb lbVar3, b6 b6Var, h3 h3Var) {
        super(context, lbVar, lbVar2, "c9c194d3e01bcf14", "086ea3852ae4e475");
        this.f65116j = lbVar3;
        this.f65117k = b6Var;
        this.f65118l = h3Var;
    }

    @Override // com.startapp.sdk.internal.ce
    public final Object a(String str) {
        if (str != null) {
            try {
                return new mh(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #0 {all -> 0x00c9, blocks: (B:33:0x00ce, B:26:0x00bf, B:28:0x00c5, B:22:0x00b6), top: B:48:0x00b4, outer: #2, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r6) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.ph.b(boolean):void");
    }

    @Override // com.startapp.sdk.internal.ce
    public final String c(Object obj) {
        mh mhVar = (mh) obj;
        if (mhVar != null) {
            return mhVar.f64941a.toString();
        }
        return null;
    }

    @Override // com.startapp.sdk.internal.ce
    public final long d() {
        return 60000L;
    }

    @Override // com.startapp.sdk.internal.ce
    public final boolean f() {
        Boolean boolB = ((h6) this.f65116j.a()).b();
        if (boolB != null && boolB.booleanValue()) {
            this.f65117k.getClass();
            TelephonyMetadata telephonyMetadataA0 = MetaData.E().a0();
            if (telephonyMetadataA0 != null && telephonyMetadataA0.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.startapp.sdk.internal.ce
    public final void g() {
        b(true);
    }

    public final boolean a(int i10) {
        this.f65117k.getClass();
        TelephonyMetadata telephonyMetadataA0 = MetaData.E().a0();
        if (telephonyMetadataA0 == null || !telephonyMetadataA0.c()) {
            telephonyMetadataA0 = null;
        }
        return telephonyMetadataA0 != null && (telephonyMetadataA0.a() & i10) == i10 && Math.random() < telephonyMetadataA0.b();
    }

    @Override // com.startapp.sdk.internal.k6
    public final Object c() {
        return mh.f64940b;
    }

    public static int a(CellInfo cellInfo) {
        CellSignalStrength cellSignalStrength;
        if (cellInfo instanceof CellInfoCdma) {
            cellSignalStrength = ((CellInfoCdma) cellInfo).getCellSignalStrength();
        } else if (cellInfo instanceof CellInfoGsm) {
            cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
        } else if (cellInfo instanceof CellInfoLte) {
            cellSignalStrength = ((CellInfoLte) cellInfo).getCellSignalStrength();
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && k5.n3.a(cellInfo)) {
                cellSignalStrength = com.my.tracker.obfuscated.x3.a(cellInfo).getCellSignalStrength();
            } else {
                cellSignalStrength = (i10 < 29 || !k5.i3.a(cellInfo)) ? cellInfo instanceof CellInfoWcdma ? ((CellInfoWcdma) cellInfo).getCellSignalStrength() : null : k5.j3.a(cellInfo).getCellSignalStrength();
            }
        }
        if (cellSignalStrength != null) {
            return cellSignalStrength.getLevel();
        }
        return 0;
    }

    public static void a(mh mhVar, List list) {
        int timingAdvance;
        ArrayList<CellInfo> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new oh());
        mhVar.a(6, g.b(arrayList.toString()));
        boolean z10 = true;
        for (CellInfo cellInfo : arrayList) {
            if (z10) {
                if (cellInfo instanceof CellInfoCdma) {
                    CellIdentityCdma cellIdentity = ((CellInfoCdma) cellInfo).getCellIdentity();
                    int latitude = cellIdentity.getLatitude();
                    int longitude = cellIdentity.getLongitude();
                    if (latitude != Integer.MAX_VALUE && longitude != Integer.MAX_VALUE) {
                        mhVar.a(1, g.b(String.valueOf(latitude)));
                        mhVar.a(2, g.b(String.valueOf(longitude)));
                    }
                } else if (cellInfo instanceof CellInfoGsm) {
                    CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                    CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                    int lac = cellIdentity2.getLac();
                    if (lac != Integer.MAX_VALUE) {
                        mhVar.a(3, g.b(String.valueOf(lac)));
                    }
                    int cid = cellIdentity2.getCid();
                    if (cid != Integer.MAX_VALUE) {
                        mhVar.a(4, g.b(String.valueOf(cid)));
                    }
                    if (Build.VERSION.SDK_INT >= 26 && (timingAdvance = cellInfoGsm.getCellSignalStrength().getTimingAdvance()) != Integer.MAX_VALUE) {
                        mhVar.a(13, String.valueOf(timingAdvance));
                    }
                } else if (cellInfo instanceof CellInfoLte) {
                    CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                    int tac = cellInfoLte.getCellIdentity().getTac();
                    if (tac != Integer.MAX_VALUE) {
                        mhVar.a(5, g.b(String.valueOf(tac)));
                    }
                    int timingAdvance2 = cellInfoLte.getCellSignalStrength().getTimingAdvance();
                    if (timingAdvance2 != Integer.MAX_VALUE) {
                        mhVar.a(13, String.valueOf(timingAdvance2));
                    }
                } else {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 29 && k5.n3.a(cellInfo)) {
                        int tac2 = k5.e4.a(com.my.tracker.obfuscated.x3.a(cellInfo).getCellIdentity()).getTac();
                        if (tac2 != Integer.MAX_VALUE) {
                            mhVar.a(5, g.b(String.valueOf(tac2)));
                        }
                    } else if (i10 >= 29 && k5.i3.a(cellInfo)) {
                        CellIdentityTdscdma cellIdentity3 = k5.j3.a(cellInfo).getCellIdentity();
                        int lac2 = cellIdentity3.getLac();
                        if (lac2 != Integer.MAX_VALUE) {
                            mhVar.a(3, g.b(String.valueOf(lac2)));
                        }
                        int cid2 = cellIdentity3.getCid();
                        if (cid2 != Integer.MAX_VALUE) {
                            mhVar.a(4, g.b(String.valueOf(cid2)));
                        }
                    } else if (cellInfo instanceof CellInfoWcdma) {
                        CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                        int lac3 = cellIdentity4.getLac();
                        if (lac3 != Integer.MAX_VALUE) {
                            mhVar.a(3, g.b(String.valueOf(lac3)));
                        }
                        int cid3 = cellIdentity4.getCid();
                        if (cid3 != Integer.MAX_VALUE) {
                            mhVar.a(4, g.b(String.valueOf(cid3)));
                        }
                    }
                }
                z10 = false;
            }
            if (!cellInfo.isRegistered()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 29 && k5.n3.a(cellInfo)) {
                mhVar.a(14, 1);
            }
        }
    }
}
