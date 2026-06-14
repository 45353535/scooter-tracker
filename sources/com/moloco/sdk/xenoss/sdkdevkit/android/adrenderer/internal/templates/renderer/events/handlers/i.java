package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import com.moloco.sdk.internal.MolocoLogger;
import hg.c0;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f56943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableSharedFlow f56944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedFlow f56945c;

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56946r;

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
            return i.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56946r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, i.this.b(), "Content loaded event emitting", null, false, 12, null);
                MutableSharedFlow mutableSharedFlow = i.this.f56944b;
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(true);
                this.f56946r = 1;
                if (mutableSharedFlow.emit(boolA, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, i.this.b(), "Content loaded event emitted", null, false, 12, null);
            return Unit.f93236a;
        }
    }

    public static final class b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56948r;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return i.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56948r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MutableSharedFlow mutableSharedFlow = i.this.f56944b;
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(false);
                this.f56948r = 1;
                if (mutableSharedFlow.emit(boolA, this) == objG) {
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

    public i(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f56943a = scope;
        MutableSharedFlow mutableSharedFlowB = c0.b(1, 0, null, 6, null);
        this.f56944b = mutableSharedFlowB;
        this.f56945c = mutableSharedFlowB;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public Set a() {
        return SetsKt.setOf((Object[]) new String[]{"requiredContentLoaded", "requiredContentError"});
    }

    public final SharedFlow c() {
        return this.f56945c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(JSONObject event) throws JSONException {
        Intrinsics.checkNotNullParameter(event, "event");
        String string = event.getString("event");
        if (Intrinsics.areEqual(string, "requiredContentLoaded")) {
            eg.i.d(this.f56943a, null, null, new a(null), 3, null);
            return;
        }
        if (Intrinsics.areEqual(string, "requiredContentError")) {
            eg.i.d(this.f56943a, null, null, new b(null), 3, null);
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Event not handled: " + string, false, 4, null);
        Unit unit = Unit.f93236a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public String b() {
        return "RequiredContentEventHandler";
    }
}
