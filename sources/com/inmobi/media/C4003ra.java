package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4003ra extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4103va f39459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pm f39460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f39461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4003ra(C4103va c4103va, Pm pm, JSONObject jSONObject, Continuation continuation) {
        super(2, continuation);
        this.f39459a = c4103va;
        this.f39460b = pm;
        this.f39461c = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4003ra(this.f39459a, this.f39460b, this.f39461c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4003ra) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        pf.b.g();
        kotlin.d.b(obj);
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39459a.f39764a;
        Pm action = this.f39460b;
        JSONObject jSONObject = this.f39461c;
        gestureDetectorOnGestureListenerC3635ci.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        C4101v8 c4101v8 = gestureDetectorOnGestureListenerC3635ci.Y0;
        if (c4101v8 != null) {
            Intrinsics.checkNotNullParameter(action, "action");
            switch (action.ordinal()) {
                case 0:
                    c4101v8.b(true);
                    break;
                case 1:
                    c4101v8.b(false);
                    break;
                case 2:
                    if (!c4101v8.f39751g.get()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("action", "play");
                        EnumC4026s8 enumC4026s8 = EnumC4026s8.f39511e;
                        EnumC4026s8[] enumC4026s8Arr = {EnumC4026s8.f39509c, EnumC4026s8.f39512f, EnumC4026s8.f39513g, enumC4026s8};
                        EnumC3573a8[] enumC3573a8Arr = EnumC3573a8.f38173a;
                        if (c4101v8.a(enumC4026s8Arr, "executeVideoPlayerActions", jSONObject2.toString(), enumC4026s8)) {
                            c4101v8.f39755k.d();
                        }
                    }
                    break;
                case 3:
                    if (!c4101v8.f39751g.get()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("action", "pause");
                        EnumC4026s8 enumC4026s82 = EnumC4026s8.f39512f;
                        EnumC4026s8[] enumC4026s8Arr2 = {EnumC4026s8.f39509c, enumC4026s82, EnumC4026s8.f39513g, EnumC4026s8.f39511e};
                        EnumC3573a8[] enumC3573a8Arr2 = EnumC3573a8.f38173a;
                        if (c4101v8.a(enumC4026s8Arr2, "executeVideoPlayerActions", jSONObject3.toString(), enumC4026s82)) {
                            c4101v8.f39755k.c();
                        }
                    }
                    break;
                case 4:
                    c4101v8.a(true);
                    break;
                case 5:
                    c4101v8.a(false);
                    break;
                case 6:
                    if (!c4101v8.f39751g.get()) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("action", "pause");
                        EnumC4026s8 enumC4026s83 = EnumC4026s8.f39512f;
                        EnumC4026s8[] enumC4026s8Arr3 = {EnumC4026s8.f39509c, enumC4026s83, EnumC4026s8.f39513g, EnumC4026s8.f39511e};
                        EnumC3573a8[] enumC3573a8Arr3 = EnumC3573a8.f38173a;
                        if (c4101v8.a(enumC4026s8Arr3, "executeVideoPlayerActions", jSONObject4.toString(), enumC4026s83)) {
                            c4101v8.f39755k.c();
                        }
                    }
                    C4183yf c4183yf = c4101v8.f39760p;
                    if (c4183yf != null) {
                        C3817jn videoEvent = new C3817jn((long) c4101v8.f39755k.a().getTime());
                        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
                        Ae ae2 = c4183yf.f40001e;
                        if (ae2 != null) {
                            ae2.a(videoEvent);
                        }
                    }
                    break;
                default:
                    throw new lf.m();
            }
            gestureDetectorOnGestureListenerC3635ci.a(EnumC3952p8.f39261l, jSONObject);
        } else {
            EnumC3952p8 enumC3952p8 = EnumC3952p8.f39254e;
            EnumC3573a8[] enumC3573a8Arr4 = EnumC3573a8.f38173a;
            X7 obj2 = new X7(jSONObject);
            Intrinsics.checkNotNullParameter(obj2, "obj");
            gestureDetectorOnGestureListenerC3635ci.a(enumC3952p8, AbstractC3879ma.a(obj2, X7.class));
        }
        return Unit.f93236a;
    }
}
