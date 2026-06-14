package com.inmobi.media;

import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoWcdma;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37392c;

    public N2() {
    }

    public static String a(String mcc, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(mcc, "mcc");
        return mcc + "#" + i10 + "#" + i11 + "#" + i12;
    }

    public N2(CellInfo cellInfo, String mcc, String mnc, int i10) {
        Intrinsics.checkNotNullParameter(mcc, "mcc");
        Intrinsics.checkNotNullParameter(mnc, "mnc");
        if (cellInfo instanceof CellInfoGsm) {
            this.f37392c = i10;
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            this.f37391b = cellInfoGsm.getCellSignalStrength().getDbm();
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            Intrinsics.checkNotNullExpressionValue(cellIdentity, "getCellIdentity(...)");
            this.f37390a = a(mcc, mnc, cellIdentity.getLac(), cellIdentity.getCid(), -1, Integer.MAX_VALUE);
            return;
        }
        if (cellInfo instanceof CellInfoCdma) {
            this.f37392c = i10;
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            this.f37391b = cellInfoCdma.getCellSignalStrength().getDbm();
            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
            Intrinsics.checkNotNullExpressionValue(cellIdentity2, "getCellIdentity(...)");
            this.f37390a = a(mcc, cellIdentity2.getSystemId(), cellIdentity2.getNetworkId(), cellIdentity2.getBasestationId());
            return;
        }
        if (cellInfo instanceof CellInfoWcdma) {
            this.f37392c = i10;
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            this.f37391b = cellInfoWcdma.getCellSignalStrength().getDbm();
            CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
            Intrinsics.checkNotNullExpressionValue(cellIdentity3, "getCellIdentity(...)");
            this.f37390a = a(mcc, mnc, cellIdentity3.getLac(), cellIdentity3.getCid(), cellIdentity3.getPsc(), Integer.MAX_VALUE);
        }
    }

    public static String a(String mcc, String mnc, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(mcc, "mcc");
        Intrinsics.checkNotNullParameter(mnc, "mnc");
        return mcc + "#" + mnc + "#" + i10 + "#" + i11 + "#" + (i12 == -1 ? "" : Integer.valueOf(i12)) + "#" + (i13 != Integer.MAX_VALUE ? Integer.valueOf(i13) : "");
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f37390a);
            int i10 = this.f37391b;
            if (i10 != Integer.MAX_VALUE) {
                jSONObject.put("ss", i10);
            }
            jSONObject.put("nt", this.f37392c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
