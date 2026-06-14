package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4078ua extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4103va f39656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoViewPosition f39657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f39658c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4078ua(C4103va c4103va, VideoViewPosition videoViewPosition, String str, Continuation continuation) {
        super(2, continuation);
        this.f39656a = c4103va;
        this.f39657b = videoViewPosition;
        this.f39658c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4078ua(this.f39656a, this.f39657b, this.f39658c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4078ua) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39656a.f39764a;
        VideoViewPosition newVideoViewPosition = this.f39657b;
        String str = this.f39658c;
        gestureDetectorOnGestureListenerC3635ci.getClass();
        Intrinsics.checkNotNullParameter(newVideoViewPosition, "videoViewPosition");
        C4101v8 c4101v8 = gestureDetectorOnGestureListenerC3635ci.Y0;
        if (c4101v8 != null) {
            Intrinsics.checkNotNullParameter(newVideoViewPosition, "newVideoViewPosition");
            if (!c4101v8.f39751g.get()) {
                EnumC4026s8[] enumC4026s8Arr = {EnumC4026s8.f39509c, EnumC4026s8.f39511e, EnumC4026s8.f39512f, EnumC4026s8.f39513g};
                EnumC3573a8[] enumC3573a8Arr = EnumC3573a8.f38173a;
                if (C4101v8.a(c4101v8, enumC4026s8Arr, "updateVideoPlayerPosition", "updateVideoPosition", null, 8)) {
                    c4101v8.f39755k.a(newVideoViewPosition);
                }
            }
            gestureDetectorOnGestureListenerC3635ci.a(EnumC3952p8.f39259j, str);
        } else {
            EnumC3952p8 enumC3952p8 = EnumC3952p8.f39254e;
            EnumC3573a8[] enumC3573a8Arr2 = EnumC3573a8.f38173a;
            X7 obj2 = new X7((Object) str);
            Intrinsics.checkNotNullParameter(obj2, "obj");
            gestureDetectorOnGestureListenerC3635ci.a(enumC3952p8, AbstractC3879ma.a(obj2, X7.class));
        }
        return Unit.f93236a;
    }
}
