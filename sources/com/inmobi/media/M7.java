package com.inmobi.media;

import android.transition.TransitionManager;
import android.widget.RelativeLayout;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class M7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f37345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoViewPosition f37346b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M7(Continuation continuation, N7 n72, VideoViewPosition videoViewPosition) {
        super(2, continuation);
        this.f37345a = n72;
        this.f37346b = videoViewPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new M7(continuation, this.f37345a, this.f37346b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new M7((Continuation) obj2, this.f37345a, this.f37346b).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        TransitionManager.beginDelayedTransition(this.f37345a.f37415n);
        this.f37345a.f37406e.setVideoViewPosition(this.f37346b);
        int iB = (int) (J5.b() * this.f37346b.getWidth());
        int iB2 = (int) (J5.b() * this.f37346b.getHeight());
        G1 g12 = this.f37345a.f37415n;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iB, iB2);
        if (this.f37345a.f37406e.getVideoViewPosition() != null) {
            layoutParams.setMargins(this.f37346b.getX(), this.f37346b.getY(), 0, 0);
        }
        g12.setLayoutParams(layoutParams);
        if (this.f37345a.f37410i > 0 && this.f37345a.f37411j > 0) {
            N7 n72 = this.f37345a;
            G1 g13 = n72.f37415n;
            int i10 = n72.f37410i;
            int i11 = this.f37345a.f37411j;
            g13.getClass();
            if (i10 > 0 && i11 > 0) {
                g13.f36915a = i10 / i11;
                g13.requestLayout();
            }
        }
        this.f37345a.f37415n.requestLayout();
        return Unit.f93236a;
    }
}
