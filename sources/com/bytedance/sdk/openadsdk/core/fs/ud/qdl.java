package com.bytedance.sdk.openadsdk.core.fs.ud;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.core.fs.ud.lnr;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends lnr implements Comparable<qdl> {
    public long qdl;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.fs.ud.qdl$qdl, reason: collision with other inner class name */
    public static class C0260qdl {
        private lnr.EnumC0259lnr lnr = lnr.EnumC0259lnr.TRACKING_URL;
        private final String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final long f17249ud;

        public C0260qdl(String str, long j10) {
            this.qdl = str;
            this.f17249ud = j10;
        }

        public qdl qdl() {
            return new qdl(this.f17249ud, this.qdl, this.lnr, Boolean.FALSE);
        }
    }

    protected qdl(long j10, String str, lnr.EnumC0259lnr enumC0259lnr, Boolean bool) {
        super(str, enumC0259lnr, bool);
        this.qdl = j10;
    }

    public long qdl() {
        return this.qdl;
    }

    public String toString() {
        return super.toString();
    }

    public JSONObject ud() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", lnr());
        jSONObject.put("trackingMilliseconds", this.qdl);
        return jSONObject;
    }

    public static int qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Integer.parseInt(strArrSplit[0]) * Constants.ONE_HOUR) + (Integer.parseInt(strArrSplit[1]) * 60000) + (Float.parseFloat(strArrSplit[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean qdl(long j10) {
        return this.qdl <= j10 && !mzz();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public int compareTo(qdl qdlVar) {
        if (qdlVar == null) {
            return 1;
        }
        long j10 = this.qdl;
        long j11 = qdlVar.qdl;
        if (j10 > j11) {
            return 1;
        }
        return j10 < j11 ? -1 : 0;
    }
}
