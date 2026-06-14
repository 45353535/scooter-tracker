package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import java.util.Comparator;

/* JADX INFO: renamed from: com.inmobi.media.zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4212zj implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40072a;

    public C4212zj(int i10) {
        this.f40072a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return mf.a.d(Integer.valueOf(Math.abs(((Image) obj).getWidth() - this.f40072a)), Integer.valueOf(Math.abs(((Image) obj2).getWidth() - this.f40072a)));
    }
}
