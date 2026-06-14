package com.pubmatic.sdk.video.player;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.N6;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.POBVastPlayerConfig;
import com.pubmatic.sdk.video.player.POBVideoPlayer;
import com.pubmatic.sdk.video.vastmodels.POBCompanion;
import com.pubmatic.sdk.video.vastmodels.POBMediaFile;
import com.pubmatic.sdk.video.vastmodels.POBVastAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class POBVastPlayerUtil {
    private static List a(List list, POBVideoPlayer.SupportedMediaType[] supportedMediaTypeArr) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (list != null) {
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                POBMediaFile pOBMediaFile = (POBMediaFile) it.next();
                int length = supportedMediaTypeArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        POBVideoPlayer.SupportedMediaType supportedMediaType = supportedMediaTypeArr[i10];
                        String type = pOBMediaFile.getType();
                        if (type == null || !type.contains(supportedMediaType.getValue())) {
                            i10++;
                        } else {
                            arrayList.add(pOBMediaFile);
                            if (supportedMediaType != POBVideoPlayer.SupportedMediaType.MEDIA_WEBM) {
                                arrayList2.add(pOBMediaFile);
                            }
                        }
                    }
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        return (arrayList2 == null || !arrayList2.isEmpty()) ? arrayList2 : arrayList;
    }

    @Nullable
    public static POBMediaFile filterMediaFiles(@Nullable List<POBMediaFile> list, @NonNull POBVideoPlayer.SupportedMediaType[] supportedMediaTypeArr, int i10, int i11, int i12) {
        List listA = a(list, supportedMediaTypeArr);
        if (listA == null || listA.size() <= 0) {
            return null;
        }
        if (listA.size() == 1) {
            return (POBMediaFile) listA.get(0);
        }
        float f10 = i10;
        float fA = a((POBMediaFile) listA.get(0), f10, i11, i12);
        POBMediaFile pOBMediaFile = (POBMediaFile) listA.get(0);
        for (int i13 = 1; i13 < listA.size(); i13++) {
            POBMediaFile pOBMediaFile2 = (POBMediaFile) listA.get(i13);
            float fA2 = a(pOBMediaFile2, f10, i11, i12);
            if (fA2 < fA) {
                pOBMediaFile = pOBMediaFile2;
                fA = fA2;
            }
        }
        return pOBMediaFile;
    }

    @NonNull
    public static Map<String, String> generateErrorQueryParams(@NonNull Context context, @Nullable POBDeviceInfo pOBDeviceInfo, @Nullable POBMediaFile pOBMediaFile) {
        HashMap map = new HashMap();
        if (pOBDeviceInfo != null) {
            String make = pOBDeviceInfo.getMake();
            if (make != null) {
                map.put("dmk", make);
            }
            String model = pOBDeviceInfo.getModel();
            if (model != null) {
                map.put("dmdl", model);
            }
            String osVersion = pOBDeviceInfo.getOsVersion();
            if (osVersion != null) {
                map.put(N6.G, osVersion);
            }
        }
        map.put("dmver", OpenWrapSDK.getVersion());
        map.put("ctyp", String.valueOf(POBInstanceProvider.getNetworkMonitor(context.getApplicationContext()).getConnectionType().getValue()));
        if (pOBMediaFile != null) {
            int bitrate = pOBMediaFile.getBitrate();
            if (bitrate != 0) {
                map.put("br", String.valueOf(bitrate));
            }
            int width = pOBMediaFile.getWidth();
            int height = pOBMediaFile.getHeight();
            if (width != 0 && height != 0) {
                map.put("csz", width + "x" + height);
            }
            String type = pOBMediaFile.getType();
            if (type != null) {
                map.put(N6.f41367a1, type);
            }
        }
        return map;
    }

    public static int getBitRate(boolean z10, boolean z11) {
        if (z10 && !z11) {
            return 600;
        }
        if (z10) {
            return 1000;
        }
        return z11 ? 2000 : 600;
    }

    @Nullable
    public static String getCustomProductPageClickUrl(@Nullable POBVastAd pOBVastAd, @Nullable String str) {
        if (pOBVastAd == null) {
            return null;
        }
        String closestClickThroughURL = pOBVastAd.getClosestClickThroughURL();
        if (POBUtils.isValidPlayStoreUrl(closestClickThroughURL)) {
            return closestClickThroughURL;
        }
        if (POBUtils.isNullOrEmpty(str)) {
            return null;
        }
        return String.format("https://play.google.com/store/apps/details?id=%s", str);
    }

    public static int getScaleFactor(@NonNull Context context) {
        return context.getResources().getDisplayMetrics().density >= 2.0f ? 2 : 1;
    }

    public static double getSkipOffset(double d10, @NonNull POBVastPlayerConfig pOBVastPlayerConfig, long j10) {
        int skipAfter;
        if (pOBVastPlayerConfig.getSkip() == 0) {
            if (d10 < 0.0d || d10 > pOBVastPlayerConfig.getMaxDuration()) {
                skipAfter = pOBVastPlayerConfig.getMaxDuration();
                d10 = skipAfter;
            }
        } else if (pOBVastPlayerConfig.getSkip() != 1) {
            d10 = 0.0d;
        } else if (j10 > pOBVastPlayerConfig.getSkipMin()) {
            d10 = pOBVastPlayerConfig.getMaxDuration() > 0 ? pOBVastPlayerConfig.getMaxDuration() : j10;
            if (!pOBVastPlayerConfig.isSkipAfterCompletionEnabled()) {
                skipAfter = pOBVastPlayerConfig.getSkipAfter();
                d10 = skipAfter;
            }
        } else {
            d10 = j10;
        }
        return Math.floor(d10 > 0.0d ? Math.min(j10, d10) : 0.0d);
    }

    @Nullable
    public static POBCompanion getSuitableEndCardCompanion(@NonNull List<POBCompanion> list, float f10, float f11) {
        ArrayList<POBCompanion> arrayList = new ArrayList();
        float f12 = f10 / f11;
        for (POBCompanion pOBCompanion : list) {
            if ("end-card".equals(pOBCompanion.getRenderingMode())) {
                arrayList.add(pOBCompanion);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(list);
        }
        float f13 = 9999.0f;
        float f14 = 2.1474836E9f;
        POBCompanion pOBCompanion2 = null;
        for (POBCompanion pOBCompanion3 : arrayList) {
            int width = pOBCompanion3.getWidth();
            int height = pOBCompanion3.getHeight();
            float fConvertDpToPixelWithFloatPrecession = POBUtils.convertDpToPixelWithFloatPrecession(width);
            float fConvertDpToPixelWithFloatPrecession2 = POBUtils.convertDpToPixelWithFloatPrecession(height);
            POBLog.debug("POBVastPlayerUtil", String.format(Locale.getDefault(), "Companion: Width x Height dp = %d x %d px = %.3f x %.3f", Integer.valueOf(width), Integer.valueOf(height), Float.valueOf(fConvertDpToPixelWithFloatPrecession), Float.valueOf(fConvertDpToPixelWithFloatPrecession2)), new Object[0]);
            float fAbs = Math.abs(1.0f - ((fConvertDpToPixelWithFloatPrecession / fConvertDpToPixelWithFloatPrecession2) / f12));
            float fAbs2 = Math.abs(fConvertDpToPixelWithFloatPrecession - f10);
            if (fAbs < f13 || (fAbs == f13 && fAbs2 <= f14)) {
                pOBCompanion2 = pOBCompanion3;
                f13 = fAbs;
                f14 = fAbs2;
            }
        }
        return pOBCompanion2;
    }

    private static float a(POBMediaFile pOBMediaFile, float f10, int i10, int i11) {
        return Math.abs((pOBMediaFile.getBitrate() - f10) / f10) + Math.abs((pOBMediaFile.getWidth() - i10) / i10) + Math.abs((pOBMediaFile.getHeight() - i11) / i11);
    }
}
