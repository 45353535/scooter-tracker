package com.bykv.vk.openvk.preload.geckox.statistic;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.adjust.sdk.purchase.ADJPConstants;
import com.amazon.device.ads.DtbConstants;
import com.appsflyer.AppsFlyerProperties;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar) {
        IStatisticMonitor iStatisticMonitorQ = bVar.q();
        if (iStatisticMonitorQ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("params_for_special", "gecko");
                jSONObject.put("device_id", bVar.r());
                jSONObject.put("os", 0);
                jSONObject.put("app_version", bVar.o());
                jSONObject.put("api_version", "v3");
                jSONObject.put("aid", bVar.k());
                jSONObject.put("x_tt_logid", aVar.f15778e);
                jSONObject.put("http_status", aVar.f15780g);
                jSONObject.put("err_msg", aVar.f15777d);
                if (TextUtils.isEmpty(aVar.f15778e)) {
                    jSONObject.put("deployments_info", aVar.f15775b);
                    jSONObject.put("local_info", aVar.f15774a);
                    jSONObject.put("custom_info", aVar.f15776c);
                } else {
                    jSONObject.put("deployments_info", "");
                    jSONObject.put("local_info", "");
                    jSONObject.put("custom_info", "");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Build.VERSION.SDK_INT);
                jSONObject.put(CommonUrlParts.OS_VERSION, sb2.toString());
                jSONObject.put("device_platform", "android");
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, aVar.f15779f);
                iStatisticMonitorQ.upload("geckosdk_query_pkgs", jSONObject);
            } catch (Throwable th2) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th2);
            }
        }
    }

    private static List<StatisticModel.PackageStatisticModel.DownloadFailRecords> b(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    private static Integer a(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    private static void a(com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar, List<StatisticModel.PackageStatisticModel> list) {
        if (aVar.f15893z && aVar.A) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 0;
            packageStatisticModel.accessKey = aVar.f15868a;
            packageStatisticModel.groupName = aVar.f15869b;
            packageStatisticModel.channel = aVar.f15870c;
            packageStatisticModel.f15866ac = aVar.f15881n;
            packageStatisticModel.f15867id = aVar.f15883p;
            packageStatisticModel.downloadRetryTimes = a(aVar.f15888u);
            packageStatisticModel.downloadUrl = aVar.f15887t;
            packageStatisticModel.downloadFailRecords = b(aVar.f15888u);
            packageStatisticModel.downloadDuration = Long.valueOf(aVar.f15890w - aVar.f15889v);
            if (aVar.B) {
                StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                list.add(packageStatisticModel2);
                packageStatisticModel2.accessKey = aVar.f15868a;
                packageStatisticModel2.groupName = aVar.f15869b;
                packageStatisticModel2.statsType = 2;
                packageStatisticModel2.f15867id = aVar.f15883p;
                packageStatisticModel2.channel = aVar.f15870c;
                packageStatisticModel2.activeCheckDuration = Long.valueOf(aVar.f15891x - aVar.f15890w);
                packageStatisticModel2.applyDuration = Long.valueOf(aVar.f15892y - aVar.f15891x);
                return;
            }
            StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel3);
            packageStatisticModel3.statsType = 3;
            packageStatisticModel3.accessKey = aVar.f15868a;
            packageStatisticModel3.groupName = aVar.f15869b;
            packageStatisticModel3.errCode = "500";
            packageStatisticModel3.f15867id = aVar.f15883p;
            packageStatisticModel3.channel = aVar.f15870c;
            packageStatisticModel3.errMsg = aVar.D;
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel4);
        packageStatisticModel4.statsType = 1;
        packageStatisticModel4.accessKey = aVar.f15868a;
        packageStatisticModel4.groupName = aVar.f15869b;
        packageStatisticModel4.channel = aVar.f15870c;
        packageStatisticModel4.f15866ac = aVar.f15881n;
        packageStatisticModel4.f15867id = aVar.f15883p;
        packageStatisticModel4.downloadRetryTimes = a(aVar.f15888u);
        packageStatisticModel4.downloadUrl = aVar.f15887t;
        packageStatisticModel4.downloadFailRecords = b(aVar.f15888u);
        if (!aVar.f15893z) {
            packageStatisticModel4.errCode = "300";
            List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = aVar.f15888u;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            packageStatisticModel4.errMsg = aVar.f15888u.get(0).reason;
            return;
        }
        if (aVar.A) {
            return;
        }
        packageStatisticModel4.errCode = "450";
        packageStatisticModel4.errMsg = aVar.C;
    }

    public static void a(final com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        StatisticModel statisticModel;
        ArrayList arrayList = new ArrayList();
        for (com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar2 : aVar.a()) {
            if (aVar2.f15871d != null || aVar2.f15873f != 0) {
                if (aVar2.f15875h && aVar2.f15876i) {
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel);
                    packageStatisticModel.statsType = 100;
                    packageStatisticModel.groupName = aVar2.f15869b;
                    packageStatisticModel.accessKey = aVar2.f15868a;
                    packageStatisticModel.channel = aVar2.f15870c;
                    packageStatisticModel.f15866ac = aVar2.f15881n;
                    packageStatisticModel.f15867id = aVar2.f15883p;
                    packageStatisticModel.patchId = aVar2.f15882o;
                    packageStatisticModel.downloadRetryTimes = a(aVar2.f15872e);
                    packageStatisticModel.downloadUrl = aVar2.f15871d;
                    packageStatisticModel.downloadFailRecords = b(aVar2.f15872e);
                    packageStatisticModel.downloadDuration = Long.valueOf(aVar2.f15874g - aVar2.f15873f);
                    if (!aVar2.f15877j) {
                        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel2);
                        packageStatisticModel2.statsType = 100;
                        packageStatisticModel2.channel = aVar2.f15870c;
                        packageStatisticModel2.errCode = "403";
                        packageStatisticModel2.errMsg = aVar2.f15885r;
                        packageStatisticModel2.f15866ac = aVar2.f15881n;
                        packageStatisticModel2.patchId = aVar2.f15882o;
                        packageStatisticModel2.f15867id = aVar2.f15883p;
                        packageStatisticModel2.downloadRetryTimes = a(aVar2.f15872e);
                        packageStatisticModel2.downloadUrl = aVar2.f15871d;
                        packageStatisticModel2.downloadFailRecords = b(aVar2.f15872e);
                    } else if (aVar2.f15878k) {
                        StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel3);
                        packageStatisticModel3.accessKey = aVar2.f15868a;
                        packageStatisticModel3.groupName = aVar2.f15869b;
                        packageStatisticModel3.statsType = 102;
                        packageStatisticModel3.patchId = aVar2.f15882o;
                        packageStatisticModel3.f15867id = aVar2.f15883p;
                        packageStatisticModel3.channel = aVar2.f15870c;
                        packageStatisticModel3.activeCheckDuration = Long.valueOf(aVar2.f15879l - aVar2.f15874g);
                        packageStatisticModel3.applyDuration = Long.valueOf(aVar2.f15880m - aVar2.f15879l);
                    } else {
                        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel4);
                        packageStatisticModel4.accessKey = aVar2.f15868a;
                        packageStatisticModel4.groupName = aVar2.f15869b;
                        packageStatisticModel4.statsType = 103;
                        packageStatisticModel4.errCode = "501";
                        packageStatisticModel4.channel = aVar2.f15870c;
                        packageStatisticModel4.patchId = aVar2.f15882o;
                        packageStatisticModel4.f15867id = aVar2.f15883p;
                        packageStatisticModel4.errMsg = aVar2.f15886s;
                        a(aVar2, arrayList);
                    }
                } else {
                    StatisticModel.PackageStatisticModel packageStatisticModel5 = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.statsType = 101;
                    packageStatisticModel5.accessKey = aVar2.f15868a;
                    packageStatisticModel5.groupName = aVar2.f15869b;
                    packageStatisticModel5.channel = aVar2.f15870c;
                    packageStatisticModel5.f15866ac = aVar2.f15881n;
                    packageStatisticModel5.patchId = aVar2.f15882o;
                    packageStatisticModel5.f15867id = aVar2.f15883p;
                    packageStatisticModel5.downloadRetryTimes = a(aVar2.f15872e);
                    packageStatisticModel5.downloadUrl = aVar2.f15871d;
                    packageStatisticModel5.downloadFailRecords = b(aVar2.f15872e);
                    if (!aVar2.f15875h) {
                        packageStatisticModel5.errCode = "301";
                        List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list = aVar2.f15872e;
                        if (list != null && !list.isEmpty()) {
                            packageStatisticModel5.errMsg = aVar2.f15872e.get(0).reason;
                        }
                    } else if (!aVar2.f15876i) {
                        packageStatisticModel5.errCode = "402";
                        packageStatisticModel5.errMsg = aVar2.f15884q;
                    }
                    a(aVar2, arrayList);
                }
            }
            a(aVar2, arrayList);
        }
        Context contextA = bVar.a();
        arrayList.addAll(com.bykv.vk.openvk.preload.geckox.a.a.a(contextA));
        if (arrayList.isEmpty()) {
            statisticModel = null;
        } else {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(contextA), e.a(contextA), bVar.l(), bVar.m());
            statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages = arrayList;
            String string = UUID.randomUUID().toString();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((StatisticModel.PackageStatisticModel) it.next()).logId = string;
            }
        }
        if (statisticModel == null || statisticModel.packages == null) {
            return;
        }
        IStatisticMonitor iStatisticMonitorQ = bVar.q();
        if (iStatisticMonitorQ != null) {
            try {
                for (StatisticModel.PackageStatisticModel packageStatisticModel6 : statisticModel.packages) {
                    Common common2 = statisticModel.common;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("params_for_special", "gecko");
                    jSONObject.put("region", common2.region);
                    jSONObject.put("err_code", packageStatisticModel6.errCode);
                    jSONObject.put("err_msg", packageStatisticModel6.errMsg);
                    jSONObject.put(ADJPConstants.KEY_SDK_VERSION, common2.sdkVersion);
                    jSONObject.put("access_key", packageStatisticModel6.accessKey);
                    jSONObject.put("stats_type", packageStatisticModel6.statsType);
                    jSONObject.put("device_id", common2.deviceId);
                    Long l10 = packageStatisticModel6.patchId;
                    jSONObject.put("patch_id", l10 == null ? 0L : l10.longValue());
                    jSONObject.put("group_name", packageStatisticModel6.groupName);
                    jSONObject.put("os", common2.os);
                    jSONObject.put("app_version", common2.appVersion);
                    jSONObject.put("device_model", common2.deviceModel);
                    jSONObject.put(AppsFlyerProperties.CHANNEL, packageStatisticModel6.channel);
                    Long l11 = packageStatisticModel6.f15867id;
                    jSONObject.put("id", l11 == null ? 0L : l11.longValue());
                    jSONObject.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, common2.f15851ac);
                    Integer num = packageStatisticModel6.downloadRetryTimes;
                    jSONObject.put("download_retry_times", num == null ? 0 : num.intValue());
                    String str = packageStatisticModel6.downloadUrl;
                    Object obj = "";
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put(DownloadModel.DOWNLOAD_URL, str);
                    jSONObject.put("download_duration", packageStatisticModel6.downloadDuration);
                    List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = packageStatisticModel6.downloadFailRecords;
                    if (list2 != null) {
                        obj = list2;
                    }
                    jSONObject.put("download_fail_records", obj);
                    jSONObject.put("log_id", packageStatisticModel6.logId);
                    Long l12 = packageStatisticModel6.activeCheckDuration;
                    jSONObject.put("active_check_duration", l12 == null ? 0L : l12.longValue());
                    Long l13 = packageStatisticModel6.applyDuration;
                    jSONObject.put("apply_duration", l13 == null ? 0L : l13.longValue());
                    iStatisticMonitorQ.upload("geckosdk_update_stats", jSONObject);
                }
            } catch (Throwable th2) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th2);
            }
        }
        if (bVar.c()) {
            try {
                final String json = statisticModel.toJson();
                if (TextUtils.isEmpty(json)) {
                    return;
                }
                final String str2 = DtbConstants.HTTPS + bVar.j() + "/gecko/server/packages/stats";
                com.bykv.vk.openvk.preload.geckox.b.g().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (int i10 = 0; i10 < 3; i10++) {
                            try {
                                Response responseDoPost = bVar.i().doPost(str2, json);
                                if (responseDoPost.code != 200) {
                                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str2);
                                }
                                if (new JSONObject(responseDoPost.body).getInt("status") == 0) {
                                    return;
                                }
                            } catch (Exception e10) {
                                GeckoLogger.w("gecko-debug-tag", "upload statistic:", e10);
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}
