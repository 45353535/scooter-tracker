package com.inmobi.media;

import android.widget.ImageView;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: renamed from: com.inmobi.media.sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4037sj extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f39549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f39550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ref$BooleanRef f39551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f39552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4137wj f39553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39554f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4037sj(C4137wj c4137wj, kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
        this.f39553e = c4137wj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f39552d = obj;
        this.f39554f |= Integer.MIN_VALUE;
        return this.f39553e.a((List) null, (ImageView) null, this);
    }
}
