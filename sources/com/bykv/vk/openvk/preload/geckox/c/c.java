package com.bykv.vk.openvk.preload.geckox.c;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.amazon.device.ads.DtbConstants;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class c extends com.bykv.vk.openvk.preload.a.d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.b f15809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Map<String, Object>> f15810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, List<CheckRequestBodyModel.TargetChannel>> f15811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.d.a f15812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f15813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a.a f15814i = new com.bykv.vk.openvk.preload.geckox.buffer.a.a();

    public static class a extends RuntimeException {
        a(String str) {
            super(str);
        }
    }

    public static class b extends RuntimeException {
        b(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.c$c, reason: collision with other inner class name */
    public static class C0199c extends RuntimeException {
        C0199c(String str, Throwable th2) {
            super(str, th2);
        }
    }

    private static void b(List<Pair<String, com.bykv.vk.openvk.preload.geckox.f.a>> list) {
        if (list == null) {
            return;
        }
        Iterator<Pair<String, com.bykv.vk.openvk.preload.geckox.f.a>> it = list.iterator();
        while (it.hasNext()) {
            try {
                ((com.bykv.vk.openvk.preload.geckox.f.a) it.next().second).a();
            } catch (Exception e10) {
                GeckoLogger.e("gecko-debug-tag", "releaseLock:", e10);
            }
        }
    }

    private List<Pair<String, com.bykv.vk.openvk.preload.geckox.f.a>> c(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (UpdatePackage updatePackage : list) {
            try {
                File file = new File(new File(this.f15809d.n(), updatePackage.getAccessKey()), updatePackage.getChannel());
                if (file.isFile()) {
                    com.bykv.vk.openvk.preload.geckox.utils.b.a(file);
                }
                if (!file.mkdirs() && !file.isDirectory()) {
                    GeckoLogger.d("gecko-debug-tag", "can not create channel dir：", file.getAbsolutePath());
                    throw new RuntimeException("can not create channel dir:" + file.getAbsolutePath());
                }
                com.bykv.vk.openvk.preload.geckox.f.a aVarA = com.bykv.vk.openvk.preload.geckox.f.a.a(file.getAbsolutePath() + File.separator + "update.lock");
                if (aVarA != null) {
                    arrayList.add(new Pair(updatePackage.getChannel(), aVarA));
                    arrayList2.add(updatePackage);
                } else {
                    com.bykv.vk.openvk.preload.geckox.d.a aVar = this.f15812g;
                    updatePackage.getChannel();
                }
            } catch (Exception e10) {
                GeckoLogger.e("gecko-debug-tag", "filterChannel:", e10);
                updatePackage.getChannel();
                com.bykv.vk.openvk.preload.geckox.d.a aVar2 = this.f15812g;
            }
        }
        list.clear();
        list.addAll(arrayList2);
        return arrayList;
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    protected final void a(Object... objArr) {
        super.a(objArr);
        this.f15809d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.f15810e = (Map) objArr[1];
        this.f15811f = (Map) objArr[2];
        this.f15812g = (com.bykv.vk.openvk.preload.geckox.d.a) objArr[3];
        this.f15813h = (String) objArr[4];
    }

    private String b(Map<String, List<Pair<String, Long>>> map) {
        List<CheckRequestBodyModel.TargetChannel> list;
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        Context contextA = this.f15809d.a();
        checkRequestBodyModel.setCommon(new Common(this.f15809d.k(), this.f15809d.o(), this.f15809d.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(contextA), com.bykv.vk.openvk.preload.geckox.utils.e.a(contextA), this.f15809d.l(), this.f15809d.m()));
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<Pair<String, Long>>> entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Pair<String, Long> pair : entry.getValue()) {
                CheckRequestBodyModel.LocalChannel localChannel = new CheckRequestBodyModel.LocalChannel();
                localChannel.localVersion = (Long) pair.second;
                map3.put(pair.first, localChannel);
            }
            map2.put(entry.getKey(), map3);
        }
        try {
            if (!map2.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str = (String) entry2.getKey();
                    Map map4 = (Map) entry2.getValue();
                    if (map4 != null && !map4.isEmpty()) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (Map.Entry entry3 : map4.entrySet()) {
                            jSONObject2.put((String) entry3.getKey(), ((CheckRequestBodyModel.LocalChannel) entry3.getValue()).toJson());
                        }
                        jSONObject.put(str, jSONObject2);
                    }
                }
                this.f15814i.f15774a = jSONObject.toString();
            }
            checkRequestBodyModel.setLocal(map2);
            HashMap map5 = new HashMap();
            for (String str2 : this.f15809d.e()) {
                CheckRequestBodyModel.Group group = new CheckRequestBodyModel.Group();
                group.groupName = this.f15813h;
                Map<String, List<CheckRequestBodyModel.TargetChannel>> map6 = this.f15811f;
                if (map6 != null && !map6.isEmpty() && (list = this.f15811f.get(str2)) != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    group.targetChannels = arrayList;
                    arrayList.addAll(list);
                }
                map5.put(str2, group);
            }
            if (!map5.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry entry4 : map5.entrySet()) {
                    Object value = entry4.getValue();
                    if (value != null && (value instanceof CheckRequestBodyModel.Group)) {
                        jSONObject3.put((String) entry4.getKey(), ((CheckRequestBodyModel.Group) value).toJson());
                    }
                }
                this.f15814i.f15775b = jSONObject3.toString();
            }
            checkRequestBodyModel.setDeployments(map5);
            Map<String, Map<String, Object>> map7 = this.f15810e;
            if (map7 != null) {
                if (!map7.isEmpty()) {
                    JSONObject jSONObject4 = new JSONObject();
                    for (Map.Entry<String, Map<String, Object>> entry5 : this.f15810e.entrySet()) {
                        String key = entry5.getKey();
                        Map<String, Object> value2 = entry5.getValue();
                        if (value2 != null && !value2.isEmpty()) {
                            JSONObject jSONObject5 = new JSONObject();
                            for (Map.Entry<String, Object> entry6 : value2.entrySet()) {
                                Object value3 = entry6.getValue();
                                if (value3 instanceof String) {
                                    jSONObject5.put(entry6.getKey(), value3);
                                }
                            }
                            jSONObject4.put(key, jSONObject5);
                        }
                    }
                    this.f15814i.f15776c = jSONObject4.toString();
                }
                checkRequestBodyModel.setCustom(this.f15810e);
            }
            return checkRequestBodyModel.toJson();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.d
    public Object a(com.bykv.vk.openvk.preload.a.b<List<UpdatePackage>> bVar, Map<String, List<Pair<String, Long>>> map) throws Exception {
        List<Pair<String, com.bykv.vk.openvk.preload.geckox.f.a>> listC;
        int i10;
        int i11;
        char c10 = 2;
        int i12 = 0;
        int i13 = 1;
        GeckoLogger.d("gecko-debug-tag", "start get server channel version[v3]... local channel version:", map);
        Map<String, List<UpdatePackage>> mapA = a(map);
        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f15809d, this.f15814i);
        Iterator<Map.Entry<String, List<UpdatePackage>>> it = mapA.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<UpdatePackage> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                UpdatePackage next = it2.next();
                long localVersion = next.getLocalVersion();
                long version = next.getVersion();
                if (version < localVersion) {
                    String channel = next.getChannel();
                    Long lValueOf = Long.valueOf(localVersion);
                    Long lValueOf2 = Long.valueOf(version);
                    Object[] objArr = new Object[5];
                    objArr[i12] = channel;
                    objArr[i13] = "rollback：";
                    objArr[c10] = lValueOf;
                    objArr[3] = "->";
                    objArr[4] = lValueOf2;
                    GeckoLogger.d("gecko-debug-tag", objArr);
                    File[] fileArrListFiles = new File(this.f15809d.n(), next.getAccessKey() + File.separator + next.getChannel()).listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.c.c.1
                        @Override // java.io.FileFilter
                        public final boolean accept(File file) {
                            return file.isDirectory();
                        }
                    });
                    if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                        i12 = i12;
                        i13 = i13;
                        c10 = 2;
                    } else {
                        int length = fileArrListFiles.length;
                        int i14 = i12;
                        while (i14 < length) {
                            File file = fileArrListFiles[i14];
                            try {
                                long j10 = Long.parseLong(file.getName());
                                if (j10 > version) {
                                    String parent = file.getParent();
                                    i11 = i12;
                                    StringBuilder sb2 = new StringBuilder();
                                    i10 = i13;
                                    sb2.append(file.getName());
                                    sb2.append("--pending-delete");
                                    final File file2 = new File(parent, sb2.toString());
                                    file.renameTo(file2);
                                    com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.c.c.2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.bykv.vk.openvk.preload.geckox.utils.b.a(file2);
                                        }
                                    });
                                } else {
                                    i10 = i13;
                                    i11 = i12;
                                    if (j10 == version) {
                                        it2.remove();
                                    }
                                }
                            } catch (Exception unused) {
                                i10 = i13;
                                i11 = i12;
                            }
                            i14++;
                            i12 = i11;
                            i13 = i10;
                            c10 = 2;
                        }
                    }
                }
            }
        }
        int i15 = i13;
        int i16 = i12;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, List<UpdatePackage>>> it3 = mapA.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList.addAll(it3.next().getValue());
        }
        Object objA = null;
        try {
            listC = c(arrayList);
        } catch (Throwable th2) {
            th = th2;
            listC = null;
        }
        try {
            objA = bVar.a(arrayList);
            b(listC);
            Object[] objArr2 = new Object[i15];
            objArr2[i16] = "all channel update finished";
            GeckoLogger.d("gecko-debug-tag", objArr2);
        } catch (Throwable th3) {
            th = th3;
            try {
                GeckoLogger.e("gecko-debug-tag", "filterChannel:", th);
                b(listC);
                Object[] objArr3 = new Object[1];
                objArr3[i16] = "all channel update finished";
                GeckoLogger.d("gecko-debug-tag", objArr3);
            } catch (Throwable th4) {
                b(listC);
                Object[] objArr4 = new Object[1];
                objArr4[i16] = "all channel update finished";
                GeckoLogger.d("gecko-debug-tag", objArr4);
                throw th4;
            }
        }
        a(arrayList);
        return objA;
    }

    private void a(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return;
        }
        for (UpdatePackage updatePackage : list) {
            com.bykv.vk.openvk.preload.geckox.a.c.a(new File(new File(this.f15809d.n(), updatePackage.getAccessKey()), updatePackage.getChannel()).getAbsolutePath());
        }
    }

    private Map<String, List<UpdatePackage>> a(Map<String, List<Pair<String, Long>>> map) throws Exception {
        String strB = b(map);
        String str = DtbConstants.HTTPS + this.f15809d.j() + "/gecko/server/v3/package";
        try {
            this.f15814i.f15779f = com.bykv.vk.openvk.preload.geckox.utils.e.a(this.f15809d.a());
            Response responseDoPost = this.f15809d.i().doPost(str, strB);
            com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar = this.f15814i;
            aVar.f15780g = responseDoPost.code;
            aVar.f15777d = responseDoPost.msg;
            Map<String, String> map2 = responseDoPost.headers;
            String str2 = "";
            if (map2 != null && !map2.isEmpty()) {
                String str3 = map2.get("x-tt-logid");
                if (TextUtils.isEmpty(str3)) {
                    str3 = map2.get("X-Tt-Logid");
                    if (TextUtils.isEmpty(str3)) {
                        String str4 = map2.get("X-TT-LOGID");
                        if (!TextUtils.isEmpty(str4)) {
                            str2 = str4;
                        }
                    } else {
                        str2 = str3;
                    }
                } else {
                    str2 = str3;
                }
            }
            aVar.f15778e = str2;
            if (responseDoPost.code == 200) {
                String str5 = responseDoPost.body;
                GeckoLogger.d("gecko-debug-tag", "response:", str5);
                try {
                    com.bykv.vk.openvk.preload.geckox.model.Response response = new com.bykv.vk.openvk.preload.geckox.model.Response();
                    response.fromJson(str5);
                    int i10 = response.status;
                    if (i10 != 0) {
                        if (i10 == 2000) {
                            com.bykv.vk.openvk.preload.geckox.a.a.a(this.f15809d);
                            return new HashMap();
                        }
                        String str6 = "check update error，unknow status code，response.status：" + response.status;
                        com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar2 = this.f15814i;
                        aVar2.f15777d = str6;
                        com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f15809d, aVar2);
                        throw new a(str6);
                    }
                    if (response.data != null) {
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.f15809d.a(), response.data.getUniversalStrategies(), this.f15809d.n(), this.f15812g);
                        Map<String, List<UpdatePackage>> packages = response.data.getPackages();
                        if (packages != null && !packages.isEmpty()) {
                            for (String str7 : this.f15809d.e()) {
                                List<UpdatePackage> list = packages.get(str7);
                                if (list != null && !list.isEmpty()) {
                                    for (UpdatePackage updatePackage : list) {
                                        updatePackage.setAccessKey(str7);
                                        updatePackage.setLocalVersion(a(map.get(str7), updatePackage.getChannel()));
                                    }
                                }
                            }
                            return packages;
                        }
                        com.bykv.vk.openvk.preload.geckox.a.a.a(this.f15809d);
                        return new HashMap();
                    }
                    com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar3 = this.f15814i;
                    aVar3.f15777d = "check update error：response.data==null";
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f15809d, aVar3);
                    throw new a("check update error：response.data==null");
                } catch (Throwable th2) {
                    this.f15814i.f15777d = "json parse failed：" + th2.getMessage();
                    com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f15809d, this.f15814i);
                    throw new b("json parse failed：" + str5 + " caused by:" + th2.getMessage(), th2);
                }
            }
            throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
        } catch (Exception e10) {
            com.bykv.vk.openvk.preload.geckox.statistic.c.a(this.f15809d, this.f15814i);
            throw new C0199c("request failed：url:" + str + ", caused by:" + e10.getMessage(), e10);
        }
    }

    private static long a(List<Pair<String, Long>> list, String str) {
        for (Pair<String, Long> pair : list) {
            if (((String) pair.first).equals(str)) {
                return ((Long) pair.second).longValue();
            }
        }
        return 0L;
    }
}
