package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import com.moloco.sdk.internal.MolocoLogger;
import hg.c0;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f56908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableSharedFlow f56909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableSharedFlow f56910c;

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56911r;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56911r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MutableSharedFlow mutableSharedFlow = c.this.f56909b;
                Unit unit = Unit.f93236a;
                this.f56911r = 1;
                if (mutableSharedFlow.emit(unit, this) == objG) {
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

    public c(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f56908a = scope;
        MutableSharedFlow mutableSharedFlowB = c0.b(0, 0, null, 7, null);
        this.f56909b = mutableSharedFlowB;
        this.f56910c = mutableSharedFlowB;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public Set a() {
        return SetsKt.setOf("close");
    }

    public final MutableSharedFlow c() {
        return this.f56910c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(JSONObject event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(event.getString("event"), CollectionsKt.first(a()))) {
            eg.i.d(this.f56908a, null, null, new a(null), 3, null);
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Event not supported: " + event.getString("event"), false, 4, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public String b() {
        return "CloseHandler";
    }
}
