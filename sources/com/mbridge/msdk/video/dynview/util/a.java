package com.mbridge.msdk.video.dynview.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static int a(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return 1;
        }
        return campaignEx.getRewardTemplateMode().g();
    }

    public static int b(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
            return 100;
        }
        int iK = campaignEx.getRewardTemplateMode().k();
        if (iK == 302 || iK == 802 || iK == 902) {
            return -3;
        }
        if (iK != 904) {
            return 100;
        }
        return !a(campaignEx.getRewardTemplateMode().j()) ? -1 : -3;
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static String a(long j10, Context context) {
        String strP = m0.p(context);
        if (strP.startsWith("zh")) {
            if (!strP.contains("TW") && !strP.contains("HK")) {
                return j10 + " 秒后自动播放";
            }
            return j10 + " 秒後自動播放";
        }
        if (strP.startsWith("ja")) {
            return j10 + " 秒後自動的に再生 ";
        }
        if (strP.startsWith(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
            return "Automatische Wiedergabe nach " + j10 + " Sekunden";
        }
        if (strP.startsWith("ko")) {
            return j10 + " 초 후 자동 재생 ";
        }
        if (strP.startsWith("fr")) {
            return "Lecture de vidéo dans " + j10 + " secondes";
        }
        if (strP.startsWith("ar")) {
            return " ثوان" + j10 + "لعب تلقائيا بعد ";
        }
        if (strP.startsWith("ru")) {
            return "Автовоспроизведение через " + j10 + " секунд";
        }
        return "Auto play after " + j10 + " s";
    }

    public static String a(Context context, int i10) {
        String str;
        if (i10 == 1) {
            str = "_por";
        } else {
            str = "_land";
        }
        String strP = m0.p(context);
        if (strP.startsWith("zh")) {
            if (!strP.contains("TW") && !strP.contains("HK")) {
                return "mbridge_reward_two_title_zh";
            }
            return "mbridge_reward_two_title_zh_trad";
        }
        if (strP.startsWith("ja")) {
            return "mbridge_reward_two_title_japan" + str;
        }
        if (strP.startsWith(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
            return "mbridge_reward_two_title_germany" + str;
        }
        if (strP.startsWith("ko")) {
            return "mbridge_reward_two_title_korea" + str;
        }
        if (strP.startsWith("fr")) {
            return "mbridge_reward_two_title_france" + str;
        }
        if (strP.startsWith("ar")) {
            return "mbridge_reward_two_title_arabia" + str;
        }
        if (strP.startsWith("ru")) {
            return "mbridge_reward_two_title_russian" + str;
        }
        return "mbridge_reward_two_title_en" + str;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter("alecfc");
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (queryParameter.equals("1")) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter(str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter;
                }
            }
            return "";
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return "";
        }
    }
}
