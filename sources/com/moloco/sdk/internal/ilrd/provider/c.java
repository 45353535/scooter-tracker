package com.moloco.sdk.internal.ilrd.provider;

import android.content.Context;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.IlrdRequest$MaxImpression;
import com.moloco.sdk.internal.ilrd.d;
import com.moloco.sdk.internal.ilrd.i;
import hg.c0;
import hg.l0;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements com.moloco.sdk.internal.ilrd.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f54424h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f54425i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile AppLovinCommunicatorSubscriber f54426j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f54428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.ilrd.model.a f54429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f54430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f54431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f54432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MutableSharedFlow f54433g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements AppLovinCommunicatorSubscriber {

        public static final class a extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f54435r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ c f54436s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ d.a.C0666a f54437t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, d.a.C0666a c0666a, Continuation continuation) {
                super(2, continuation);
                this.f54436s = cVar;
                this.f54437t = c0666a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f54436s, this.f54437t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f54435r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    MutableSharedFlow mutableSharedFlow = this.f54436s.f54433g;
                    d.a.C0666a c0666a = this.f54437t;
                    this.f54435r = 1;
                    if (mutableSharedFlow.emit(c0666a, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                return Unit.f93236a;
            }
        }

        public b() {
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return "Moloco";
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage message) {
            Intrinsics.checkNotNullParameter(message, "message");
            if (i.i(c.this.f54428b) && Intrinsics.areEqual("max_revenue_events", message.getTopic())) {
                Bundle messageData = message.getMessageData();
                Intrinsics.checkNotNullExpressionValue(messageData, "getMessageData(...)");
                eg.i.d(c.this.f54428b, null, null, new a(c.this, c.this.a(messageData), null), 3, null);
            }
        }
    }

    public c(Context context, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f54427a = context;
        this.f54428b = scope;
        this.f54429c = com.moloco.sdk.internal.ilrd.model.a.f54418b;
        this.f54430d = lf.i.a(new Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.g(this.f54422b);
            }
        });
        this.f54431e = lf.i.a(new Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.e(this.f54423b);
            }
        });
        this.f54432f = l0.a(i.c.f54417a);
        this.f54433g = c0.b(0, 0, null, 7, null);
    }

    public static final SharedFlow e(c cVar) {
        return hg.i.b(cVar.f54433g);
    }

    public static final StateFlow g(c cVar) {
        return hg.i.c(cVar.f54432f);
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public com.moloco.sdk.internal.ilrd.model.a a() {
        return this.f54429c;
    }

    public final b f() {
        return new b();
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public StateFlow getState() {
        return (StateFlow) this.f54430d.getValue();
    }

    public final Object h() {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            int i10 = AppLovinCommunicator.f8174g;
            int i11 = AppLovinCommunicatorMessage.f8179b;
            objB = Result.b(AppLovinCommunicator.getInstance(this.f54427a));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            return Result.b(kotlin.d.a(thG));
        }
        b bVarF = f();
        f54426j = bVarF;
        ((AppLovinCommunicator) objB).subscribe(bVarF, "max_revenue_events");
        return Result.b(Unit.f93236a);
    }

    public final d.a.C0666a a(Bundle bundle) {
        double d10 = bundle.getDouble("revenue");
        String string = bundle.getString("country_code");
        String string2 = bundle.getString("network_name");
        String string3 = bundle.getString("max_ad_unit_id");
        String string4 = bundle.getString("third_party_ad_placement_id");
        String string5 = bundle.getString("ad_format");
        String string6 = bundle.getString("user_segment");
        String string7 = bundle.getString("id");
        IlrdRequest$MaxImpression.a aVarNewBuilder = IlrdRequest$MaxImpression.newBuilder();
        aVarNewBuilder.f(d10);
        if (string != null) {
            aVarNewBuilder.b(string);
        }
        if (string2 != null) {
            aVarNewBuilder.e(string2);
        }
        if (string3 != null) {
            aVarNewBuilder.d(string3);
        }
        if (string4 != null) {
            aVarNewBuilder.g(string4);
        }
        if (string5 != null) {
            aVarNewBuilder.a(string5);
        }
        if (string6 != null) {
            aVarNewBuilder.h(string6);
        }
        if (string7 != null) {
            aVarNewBuilder.c(string7);
        }
        GeneratedMessageLite generatedMessageLiteBuild = aVarNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return new d.a.C0666a((IlrdRequest$MaxImpression) generatedMessageLiteBuild);
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public synchronized Object b() {
        Object objH;
        try {
            objH = h();
            Throwable thG = Result.g(objH);
            if (thG != null) {
                this.f54432f.setValue(new i.a(thG.toString()));
            }
            if (Result.j(objH)) {
                this.f54432f.setValue(i.b.f54416a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return objH;
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public SharedFlow c() {
        return (SharedFlow) this.f54431e.getValue();
    }
}
