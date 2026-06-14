package com.appodeal.ads.nativead.downloader;

import android.net.Uri;
import com.appodeal.ads.VideoData;
import com.appodeal.ads.ext.ResultExtKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ VideoData f13858r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f13859s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(VideoData videoData, g gVar, Continuation continuation) {
        super(2, continuation);
        this.f13858r = videoData;
        this.f13859s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f13858r, this.f13859s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f13858r, this.f13859s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        VideoData videoData = this.f13858r;
        if (videoData instanceof VideoData.Remote) {
            Object objA = ((o) this.f13859s.f13864c.getValue()).a(((VideoData.Remote) this.f13858r).getRemoteUrl());
            return Result.a(Result.j(objA) ? Result.b(new VideoData.LocalUri((Uri) objA)) : Result.b(objA));
        }
        if (videoData != null) {
            return Result.a(ResultExtKt.asSuccess(videoData));
        }
        return null;
    }
}
