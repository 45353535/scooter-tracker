package com.appsflyer.internal;

import android.graphics.ImageFormat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class AFg1dSDK {
    private StringBuilder getMediationNetwork = new StringBuilder();
    private final List<AFa1uSDK> AFAdRevenueData = new ArrayList();
    private final String getRevenue = null;

    enum AFa1uSDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public final AFg1dSDK AFAdRevenueData(AFa1uSDK aFa1uSDK, String str) throws AFg1jSDK {
        if (this.AFAdRevenueData.isEmpty() && this.getMediationNetwork.length() > 0) {
            throw new AFg1jSDK("Nesting problem: multiple top-level roots");
        }
        getMonetizationNetwork();
        this.AFAdRevenueData.add(aFa1uSDK);
        this.getMediationNetwork.append(str);
        return this;
    }

    final void getCurrencyIso4217Code(String str) {
        this.getMediationNetwork.append("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                this.getMediationNetwork.append("\\f");
            } else if (cCharAt == '\r') {
                this.getMediationNetwork.append("\\r");
            } else if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        this.getMediationNetwork.append("\\b");
                        break;
                    case '\t':
                        this.getMediationNetwork.append("\\t");
                        break;
                    case '\n':
                        this.getMediationNetwork.append("\\n");
                        break;
                    default:
                        if (cCharAt <= 31) {
                            this.getMediationNetwork.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                        } else {
                            this.getMediationNetwork.append(cCharAt);
                        }
                        break;
                }
            } else {
                StringBuilder sb2 = this.getMediationNetwork;
                sb2.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                sb2.append(cCharAt);
            }
        }
        this.getMediationNetwork.append("\"");
    }

    public final AFg1dSDK getMediationNetwork(AFa1uSDK aFa1uSDK, AFa1uSDK aFa1uSDK2, String str) throws AFg1jSDK {
        AFa1uSDK mediationNetwork = getMediationNetwork();
        if (mediationNetwork != aFa1uSDK2 && mediationNetwork != aFa1uSDK) {
            throw new AFg1jSDK("Nesting problem");
        }
        this.AFAdRevenueData.remove(r2.size() - 1);
        this.getMediationNetwork.append(str);
        return this;
    }

    public final AFg1dSDK getMonetizationNetwork(Object obj) throws Throwable {
        if (this.AFAdRevenueData.isEmpty()) {
            throw new AFg1jSDK("Nesting problem");
        }
        if (((Class) AFa1jSDK.AFAdRevenueData((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 321, (char) (56707 - ImageFormat.getBitsPerPixel(0)), MotionEvent.axisFromString("") + 37)).isInstance(obj)) {
            try {
                Object[] objArr = {this};
                Map map = AFa1jSDK.unregisterClient;
                Object declaredMethod = map.get(1322349739);
                if (declaredMethod == null) {
                    declaredMethod = ((Class) AFa1jSDK.AFAdRevenueData((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 321, (char) (TextUtils.indexOf((CharSequence) "", '0') + 56709), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35)).getDeclaredMethod("getRevenue", AFg1dSDK.class);
                    map.put(1322349739, declaredMethod);
                }
                ((Method) declaredMethod).invoke(obj, objArr);
                return this;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        if (obj instanceof AFg1gSDK) {
            ((AFg1gSDK) obj).getRevenue(this);
            return this;
        }
        getMonetizationNetwork();
        if (obj == null || (obj instanceof Boolean) || obj == AFg1gSDK.getRevenue) {
            this.getMediationNetwork.append(obj);
            return this;
        }
        if (obj instanceof Number) {
            this.getMediationNetwork.append(AFg1gSDK.getMediationNetwork((Number) obj));
            return this;
        }
        getCurrencyIso4217Code(obj.toString());
        return this;
    }

    public final String toString() {
        if (this.getMediationNetwork.length() == 0) {
            return null;
        }
        return this.getMediationNetwork.toString();
    }

    private AFa1uSDK getMediationNetwork() throws AFg1jSDK {
        if (!this.AFAdRevenueData.isEmpty()) {
            return this.AFAdRevenueData.get(r0.size() - 1);
        }
        throw new AFg1jSDK("Nesting problem");
    }

    private void getMonetizationNetwork() throws AFg1jSDK {
        if (this.AFAdRevenueData.isEmpty()) {
            return;
        }
        AFa1uSDK mediationNetwork = getMediationNetwork();
        if (mediationNetwork == AFa1uSDK.EMPTY_ARRAY) {
            AFa1uSDK aFa1uSDK = AFa1uSDK.NONEMPTY_ARRAY;
            this.AFAdRevenueData.set(r1.size() - 1, aFa1uSDK);
        } else {
            if (mediationNetwork == AFa1uSDK.NONEMPTY_ARRAY) {
                this.getMediationNetwork.append(',');
                return;
            }
            if (mediationNetwork == AFa1uSDK.DANGLING_KEY) {
                this.getMediationNetwork.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                AFa1uSDK aFa1uSDK2 = AFa1uSDK.NONEMPTY_OBJECT;
                this.AFAdRevenueData.set(r1.size() - 1, aFa1uSDK2);
                return;
            }
            if (mediationNetwork != AFa1uSDK.NULL) {
                throw new AFg1jSDK("Nesting problem");
            }
        }
    }

    final void getCurrencyIso4217Code() throws AFg1jSDK {
        AFa1uSDK mediationNetwork = getMediationNetwork();
        if (mediationNetwork == AFa1uSDK.NONEMPTY_OBJECT) {
            this.getMediationNetwork.append(',');
        } else if (mediationNetwork != AFa1uSDK.EMPTY_OBJECT) {
            throw new AFg1jSDK("Nesting problem");
        }
        AFa1uSDK aFa1uSDK = AFa1uSDK.DANGLING_KEY;
        this.AFAdRevenueData.set(r1.size() - 1, aFa1uSDK);
    }
}
