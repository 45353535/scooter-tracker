package com.bykv.vk.openvk.preload.geckox.c;

import android.net.Uri;
import android.util.Pair;
import com.bykv.vk.openvk.preload.a.k;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class g extends k<UpdatePackage, Pair<Uri, UpdatePackage>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15820d = 0;

    @Override // com.bykv.vk.openvk.preload.a.k
    protected final boolean a(Throwable th2) {
        GeckoLogger.w("gecko-debug-tag", "full update failed and retry", th2);
        if (this.f15820d >= g().getFullPackage().getUrlList().size()) {
            return false;
        }
        return (th2 instanceof com.bykv.vk.openvk.preload.geckox.b.a) || (th2 instanceof com.bykv.vk.openvk.preload.geckox.b.b);
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    protected final /* synthetic */ Pair<Uri, UpdatePackage> a() {
        UpdatePackage updatePackageG = g();
        List<String> urlList = updatePackageG.getFullPackage().getUrlList();
        int i10 = this.f15820d;
        this.f15820d = i10 + 1;
        return new Pair<>(Uri.parse(urlList.get(i10)), updatePackageG);
    }
}
