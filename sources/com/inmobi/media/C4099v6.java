package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4099v6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f39737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OmSdkInfo f39738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f39739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC4124w6 f39740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4099v6(AbstractC4124w6 abstractC4124w6, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39740d = abstractC4124w6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39739c = obj;
        this.f39741e |= Integer.MIN_VALUE;
        return this.f39740d.a(null, this);
    }
}
