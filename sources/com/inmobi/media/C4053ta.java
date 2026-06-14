package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4053ta extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4103va f39584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f39585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f39586c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4053ta(C4103va c4103va, Ref$ObjectRef ref$ObjectRef, CountDownLatch countDownLatch, Continuation continuation) {
        super(2, continuation);
        this.f39584a = c4103va;
        this.f39585b = ref$ObjectRef;
        this.f39586c = countDownLatch;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4053ta(this.f39584a, this.f39585b, this.f39586c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4053ta) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        try {
            HtmlVideoPlaybackState obj2 = this.f39584a.f39764a.getPlaybackState();
            if (obj2 == null) {
                obj2 = new HtmlVideoPlaybackState();
            }
            Ref$ObjectRef ref$ObjectRef = this.f39585b;
            Intrinsics.checkNotNullParameter(obj2, "obj");
            ref$ObjectRef.f93280b = AbstractC3879ma.a(obj2, HtmlVideoPlaybackState.class);
            this.f39586c.countDown();
            return Unit.f93236a;
        } catch (Throwable th2) {
            this.f39586c.countDown();
            throw th2;
        }
    }
}
