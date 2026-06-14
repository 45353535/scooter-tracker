package com.adjust.sdk;

import android.net.UrlQuerySanitizer;
import com.adjust.sdk.ActivityHandler;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes5.dex */
public class PackageFactory {
    private static final String ADJUST_PREFIX = "adjust_";

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0006, code lost:
    
        r4 = r12.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.adjust.sdk.ActivityPackage buildDeeplinkSdkClickPackage(android.net.Uri r12, android.net.Uri r13, long r14, com.adjust.sdk.ActivityState r16, com.adjust.sdk.AdjustConfig r17, com.adjust.sdk.DeviceInfo r18, com.adjust.sdk.GlobalParameters r19, com.adjust.sdk.FirstSessionDelayManager r20, com.adjust.sdk.ActivityHandler.InternalState r21) {
        /*
            r1 = 0
            r2 = 1
            r3 = 0
            if (r12 != 0) goto L6
            return r3
        L6:
            java.lang.String r4 = r12.toString()
            if (r4 == 0) goto La3
            int r0 = r4.length()
            if (r0 != 0) goto L14
            goto La3
        L14:
            java.lang.String r0 = "UTF-8"
            java.lang.String r4 = java.net.URLDecoder.decode(r4, r0)     // Catch: java.lang.Exception -> L1b java.lang.IllegalArgumentException -> L1d java.io.UnsupportedEncodingException -> L1f
            goto L56
        L1b:
            r0 = move-exception
            goto L21
        L1d:
            r0 = move-exception
            goto L33
        L1f:
            r0 = move-exception
            goto L45
        L21:
            com.adjust.sdk.ILogger r5 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r0
            java.lang.String r0 = "Deeplink url decoding failed. Message: (%s)"
            r5.error(r0, r6)
            goto L56
        L33:
            com.adjust.sdk.ILogger r5 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r0
            java.lang.String r0 = "Deeplink url decoding failed due to IllegalArgumentException. Message: (%s)"
            r5.error(r0, r6)
            goto L56
        L45:
            com.adjust.sdk.ILogger r5 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r0
            java.lang.String r0 = "Deeplink url decoding failed due to UnsupportedEncodingException. Message: (%s)"
            r5.error(r0, r6)
        L56:
            com.adjust.sdk.ILogger r0 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r4
            java.lang.String r1 = "Url to parse (%s)"
            r0.verbose(r1, r5)
            android.net.UrlQuerySanitizer r0 = new android.net.UrlQuerySanitizer
            r0.<init>()
            android.net.UrlQuerySanitizer$ValueSanitizer r1 = android.net.UrlQuerySanitizer.getAllButNulLegal()
            r0.setUnregisteredParameterValueSanitizer(r1)
            r0.setAllowUnregisteredParamaters(r2)
            r0.parseUrl(r4)
            java.util.List r5 = r0.getParameterList()
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            com.adjust.sdk.PackageBuilder r0 = queryStringClickPackageBuilder(r5, r6, r7, r8, r9, r10, r11)
            if (r0 != 0) goto L8c
            return r3
        L8c:
            java.lang.String r12 = r12.toString()
            r0.deeplink = r12
            r0.clickTimeInMilliseconds = r14
            if (r13 == 0) goto L9c
            java.lang.String r12 = r13.toString()
            r0.referrer = r12
        L9c:
            java.lang.String r12 = "deeplink"
            com.adjust.sdk.ActivityPackage r12 = r0.buildClickPackage(r12)
            return r12
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.PackageFactory.buildDeeplinkSdkClickPackage(android.net.Uri, android.net.Uri, long, com.adjust.sdk.ActivityState, com.adjust.sdk.AdjustConfig, com.adjust.sdk.DeviceInfo, com.adjust.sdk.GlobalParameters, com.adjust.sdk.FirstSessionDelayManager, com.adjust.sdk.ActivityHandler$InternalState):com.adjust.sdk.ActivityPackage");
    }

    public static ActivityPackage buildInstallReferrerSdkClickPackage(ReferrerDetails referrerDetails, String str, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, GlobalParameters globalParameters, FirstSessionDelayManager firstSessionDelayManager, ActivityHandler.InternalState internalState) {
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, globalParameters, firstSessionDelayManager, System.currentTimeMillis());
        packageBuilder.internalState = internalState;
        packageBuilder.referrer = referrerDetails.installReferrer;
        packageBuilder.clickTimeInSeconds = referrerDetails.referrerClickTimestampSeconds;
        packageBuilder.installBeginTimeInSeconds = referrerDetails.installBeginTimestampSeconds;
        packageBuilder.clickTimeServerInSeconds = referrerDetails.referrerClickTimestampServerSeconds;
        packageBuilder.installBeginTimeServerInSeconds = referrerDetails.installBeginTimestampServerSeconds;
        packageBuilder.installVersion = referrerDetails.installVersion;
        packageBuilder.googlePlayInstant = referrerDetails.googlePlayInstant;
        packageBuilder.isClick = referrerDetails.isClick;
        packageBuilder.referrerApi = str;
        return packageBuilder.buildClickPackage(Constants.INSTALL_REFERRER);
    }

    public static ActivityPackage buildLicenseVerificationSdkClickPackage(LicenseData licenseData, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, GlobalParameters globalParameters, FirstSessionDelayManager firstSessionDelayManager, ActivityHandler.InternalState internalState) {
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, globalParameters, firstSessionDelayManager, System.currentTimeMillis());
        packageBuilder.internalState = internalState;
        packageBuilder.licenseData = licenseData;
        return packageBuilder.buildClickPackage(Constants.LICENSE_VERIFICATION);
    }

    public static ActivityPackage buildPreinstallSdkClickPackage(String str, String str2, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, GlobalParameters globalParameters, FirstSessionDelayManager firstSessionDelayManager) {
        if (str == null || str.length() == 0) {
            return null;
        }
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, globalParameters, firstSessionDelayManager, System.currentTimeMillis());
        packageBuilder.preinstallPayload = str;
        packageBuilder.preinstallLocation = str2;
        return packageBuilder.buildClickPackage(Constants.PREINSTALL);
    }

    public static ActivityPackage buildReftagSdkClickPackage(String str, long j10, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, GlobalParameters globalParameters, FirstSessionDelayManager firstSessionDelayManager, ActivityHandler.InternalState internalState) {
        String strDecode = Constants.MALFORMED;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            strDecode = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            AdjustFactory.getLogger().error("Referrer decoding failed due to UnsupportedEncodingException. Message: (%s)", e10.getMessage());
        } catch (IllegalArgumentException e11) {
            AdjustFactory.getLogger().error("Referrer decoding failed due to IllegalArgumentException. Message: (%s)", e11.getMessage());
        } catch (Exception e12) {
            AdjustFactory.getLogger().error("Referrer decoding failed. Message: (%s)", e12.getMessage());
        }
        AdjustFactory.getLogger().verbose("Referrer to parse (%s)", strDecode);
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseQuery(strDecode);
        PackageBuilder packageBuilderQueryStringClickPackageBuilder = queryStringClickPackageBuilder(urlQuerySanitizer.getParameterList(), activityState, adjustConfig, deviceInfo, globalParameters, firstSessionDelayManager, internalState);
        if (packageBuilderQueryStringClickPackageBuilder == null) {
            return null;
        }
        packageBuilderQueryStringClickPackageBuilder.referrer = strDecode;
        packageBuilderQueryStringClickPackageBuilder.clickTimeInMilliseconds = j10;
        packageBuilderQueryStringClickPackageBuilder.rawReferrer = str;
        return packageBuilderQueryStringClickPackageBuilder.buildClickPackage(Constants.REFTAG);
    }

    private static PackageBuilder queryStringClickPackageBuilder(List<UrlQuerySanitizer.ParameterValuePair> list, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, GlobalParameters globalParameters, FirstSessionDelayManager firstSessionDelayManager, ActivityHandler.InternalState internalState) {
        if (list == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdjustAttribution adjustAttribution = new AdjustAttribution();
        for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : list) {
            readQueryString(parameterValuePair.mParameter, parameterValuePair.mValue, linkedHashMap, adjustAttribution);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = (String) linkedHashMap.remove(Constants.REFTAG);
        if (activityState != null) {
            activityState.lastInterval = jCurrentTimeMillis - activityState.lastActivity;
        }
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, globalParameters, firstSessionDelayManager, jCurrentTimeMillis);
        packageBuilder.internalState = internalState;
        packageBuilder.extraParameters = linkedHashMap;
        packageBuilder.attribution = adjustAttribution;
        packageBuilder.reftag = str;
        return packageBuilder;
    }

    private static boolean readQueryString(String str, String str2, Map<String, String> map, AdjustAttribution adjustAttribution) {
        if (str == null || str2 == null || !str.startsWith(ADJUST_PREFIX)) {
            return false;
        }
        String strSubstring = str.substring(7);
        if (strSubstring.length() == 0 || str2.length() == 0) {
            return false;
        }
        if (tryToSetAttribution(adjustAttribution, strSubstring, str2)) {
            return true;
        }
        map.put(strSubstring, str2);
        return true;
    }

    private static boolean tryToSetAttribution(AdjustAttribution adjustAttribution, String str, String str2) {
        if (str.equals("tracker")) {
            adjustAttribution.trackerName = str2;
            return true;
        }
        if (str.equals("campaign")) {
            adjustAttribution.campaign = str2;
            return true;
        }
        if (str.equals("adgroup")) {
            adjustAttribution.adgroup = str2;
            return true;
        }
        if (!str.equals(Reporting.Key.CREATIVE)) {
            return false;
        }
        adjustAttribution.creative = str2;
        return true;
    }
}
