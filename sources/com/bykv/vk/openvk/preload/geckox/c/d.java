package com.bykv.vk.openvk.preload.geckox.c;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class d extends com.bykv.vk.openvk.preload.a.d<List<String>, List<Pair<String, Long>>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f15816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f15817e;

    @Override // com.bykv.vk.openvk.preload.a.d
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.b<List<Pair<String, Long>>> bVar, List<String> list) throws Throwable {
        List<String> list2 = list;
        GeckoLogger.d("gecko-debug-tag", "get local channel version:", list2);
        File file = new File(this.f15816d, this.f15817e);
        ArrayList arrayList = new ArrayList();
        for (String str : list2) {
            Long lA = com.bykv.vk.openvk.preload.geckox.utils.g.a(new File(file, str));
            arrayList.add(new Pair<>(str, Long.valueOf(lA == null ? 0L : lA.longValue())));
        }
        return bVar.a(arrayList);
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    protected final void a(Object... objArr) {
        super.a(objArr);
        this.f15816d = (File) objArr[0];
        this.f15817e = (String) objArr[1];
    }
}
