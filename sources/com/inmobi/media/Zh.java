package com.inmobi.media;

import androidx.webkit.Profile;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes9.dex */
public final class Zh extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mutex f38126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3635ci f38127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f38129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3635ci f38130e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zh(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, Continuation continuation) {
        super(2, continuation);
        this.f38130e = gestureDetectorOnGestureListenerC3635ci;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        Zh zh2 = new Zh(this.f38130e, continuation);
        zh2.f38129d = obj;
        return zh2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Zh zh2 = new Zh(this.f38130e, (Continuation) obj2);
        zh2.f38129d = (CoroutineScope) obj;
        return zh2.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci;
        Mutex mutex;
        Object objG = pf.b.g();
        int i10 = this.f38128c;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.f38129d;
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = this.f38130e;
            Mutex mutex2 = gestureDetectorOnGestureListenerC3635ci2.f38400y;
            this.f38129d = coroutineScope2;
            this.f38126a = mutex2;
            this.f38127b = gestureDetectorOnGestureListenerC3635ci2;
            this.f38128c = 1;
            if (mutex2.lock(null, this) == objG) {
                return objG;
            }
            coroutineScope = coroutineScope2;
            gestureDetectorOnGestureListenerC3635ci = gestureDetectorOnGestureListenerC3635ci2;
            mutex = mutex2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gestureDetectorOnGestureListenerC3635ci = this.f38127b;
            mutex = this.f38126a;
            coroutineScope = (CoroutineScope) this.f38129d;
            kotlin.d.b(obj);
        }
        try {
            if (Intrinsics.areEqual("Loading", gestureDetectorOnGestureListenerC3635ci.f38402z)) {
                InterfaceC3878m9 interfaceC3878m9 = gestureDetectorOnGestureListenerC3635ci.f38368i;
                if (interfaceC3878m9 != null) {
                    String str = GestureDetectorOnGestureListenerC3635ci.f38347g1;
                    Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                    ((C3903n9) interfaceC3878m9).a(str, "updateWebViewLoaded " + coroutineScope);
                }
                gestureDetectorOnGestureListenerC3635ci.getListener().g(gestureDetectorOnGestureListenerC3635ci);
                gestureDetectorOnGestureListenerC3635ci.setAndUpdateViewState(Profile.DEFAULT_PROFILE_NAME);
                InterfaceC3878m9 interfaceC3878m92 = gestureDetectorOnGestureListenerC3635ci.f38368i;
                if (interfaceC3878m92 != null) {
                    String str2 = GestureDetectorOnGestureListenerC3635ci.f38347g1;
                    Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$cp(...)");
                    ((C3903n9) interfaceC3878m92).a(str2, "updateWebViewLoaded state changed to " + gestureDetectorOnGestureListenerC3635ci.getViewState());
                }
            }
            Unit unit = Unit.f93236a;
            mutex.unlock(null);
            return unit;
        } catch (Throwable th2) {
            mutex.unlock(null);
            throw th2;
        }
    }
}
