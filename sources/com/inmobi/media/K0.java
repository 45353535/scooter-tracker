package com.inmobi.media;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes9.dex */
public final class K0 implements Eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L0 f37177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC4045t2 f37178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f37179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Qh f37180d;

    public K0(L0 l02, AbstractC4045t2 abstractC4045t2, boolean z10, Qh qh2) {
        this.f37177a = l02;
        this.f37178b = abstractC4045t2;
        this.f37179c = z10;
        this.f37180d = qh2;
    }

    @Override // com.inmobi.media.Eg
    public final void a(Object obj) {
        this.f37177a.a((Bitmap) obj, this.f37178b, this.f37179c, this.f37180d);
    }

    @Override // com.inmobi.media.Eg
    public final void onError(Exception exc) {
        this.f37177a.a(exc, this.f37178b);
    }
}
