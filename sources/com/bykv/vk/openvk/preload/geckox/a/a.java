package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import com.amazon.device.ads.DtbConstants;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f15716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15717b = 1;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a$a, reason: collision with other inner class name */
    static class C0197a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f15720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f15721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f15723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        File f15724e;

        C0197a(String str, String str2, int i10, long j10, File file) {
            this.f15720a = str;
            this.f15721b = str2;
            this.f15722c = i10;
            this.f15723d = j10;
            this.f15724e = file;
        }
    }

    public a(List<String> list) {
        this.f15716a = list;
    }

    public static void a(final Context context, Map<String, ComponentModel.b> map, File file, com.bykv.vk.openvk.preload.geckox.d.a aVar) {
        final ArrayList arrayList;
        ComponentModel.b value;
        List<ComponentModel.a> list;
        List<Long> listB;
        List<Long> listB2;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ComponentModel.b> entry : map.entrySet()) {
                String key = entry.getKey();
                File file2 = new File(file, key);
                if (file2.isDirectory() && (value = entry.getValue()) != null && (list = value.f15855a) != null && !list.isEmpty()) {
                    List<ComponentModel.a> list2 = value.f15855a;
                    HashSet hashSet = new HashSet();
                    for (ComponentModel.a aVar2 : list2) {
                        String str = aVar2.f15852a;
                        if (!hashSet.contains(str)) {
                            hashSet.add(str);
                            int i10 = aVar2.f15853b;
                            List<Long> list3 = aVar2.f15854c;
                            File file3 = new File(file2, str);
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        File file4 = new File(file2, str);
                                        File file5 = new File(file2, str + "--pending-delete");
                                        file4.renameTo(file5);
                                        arrayList.add(new C0197a(key, str, i10, 0L, file5));
                                    }
                                } else if (list3 != null && (listB = g.b(file3)) != null && !listB.isEmpty()) {
                                    for (Long l10 : listB) {
                                        if (list3.get(0).longValue() > l10.longValue()) {
                                            File file6 = new File(file3, l10 + "--pending-delete");
                                            new File(file3, String.valueOf(l10)).renameTo(file6);
                                            arrayList.add(new C0197a(key, str, i10, l10.longValue(), file6));
                                        }
                                    }
                                }
                            } else if (list3 != null && (listB2 = g.b(file3)) != null && !listB2.isEmpty()) {
                                for (Long l11 : listB2) {
                                    if (list3.contains(l11)) {
                                        File file7 = new File(file3, l11 + "--pending-delete");
                                        new File(file3, String.valueOf(l11)).renameTo(file7);
                                        arrayList.add(new C0197a(key, str, i10, l11.longValue(), file7));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context2 = context;
                    List<C0197a> list4 = arrayList;
                    if (list4 != null && !list4.isEmpty()) {
                        for (C0197a c0197a : list4) {
                            File file8 = c0197a.f15724e;
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            boolean zA = com.bykv.vk.openvk.preload.geckox.utils.b.a(file8);
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            if (zA) {
                                b.a(context2).a(c0197a.f15720a, c0197a.f15721b, c0197a.f15722c, 200, c0197a.f15723d, 0, null, jUptimeMillis2 - jUptimeMillis);
                            } else {
                                b.a(context2).a(c0197a.f15720a, c0197a.f15721b, c0197a.f15722c, 201, c0197a.f15723d, 601, "delete failed", jUptimeMillis2 - jUptimeMillis);
                            }
                        }
                    }
                } catch (Exception e11) {
                    GeckoLogger.w("clean-channel", "", e11);
                }
            }
        });
    }

    public static List<StatisticModel.PackageStatisticModel> a(Context context) {
        return b.a(context).a();
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        if (bVar.c()) {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(bVar.a()), e.a(bVar.a()), bVar.l(), bVar.m());
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(b.a(bVar.a()).a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            String str = DtbConstants.HTTPS + bVar.j() + "/gecko/server/packages/stats";
            try {
                Response responseDoPost = bVar.i().doPost(str, statisticModel.toJson());
                if (responseDoPost.code == 200) {
                    if (new JSONObject(responseDoPost.body).getInt("status") != 0) {
                        throw new RuntimeException("upload failed");
                    }
                } else {
                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public final String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f15716a != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < this.f15716a.size(); i10++) {
                    jSONArray.put(this.f15716a.get(i10));
                }
                jSONObject.put("gecko_accesskey", jSONArray);
            }
            jSONObject.put("os", 0);
            jSONObject.put("msg_type", this.f15717b);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
