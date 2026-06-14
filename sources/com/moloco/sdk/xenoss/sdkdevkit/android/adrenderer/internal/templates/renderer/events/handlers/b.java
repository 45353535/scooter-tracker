package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.c0;
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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f56901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f56902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableSharedFlow f56903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableSharedFlow f56904d;

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56905r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f56907t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.f56907t = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new a(this.f56907t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56905r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                c0 c0Var = b.this.f56901a;
                String str = this.f56907t;
                Intrinsics.checkNotNull(str);
                MutableSharedFlow mutableSharedFlow = b.this.f56903c;
                this.f56905r = 1;
                if (c0Var.b(str, mutableSharedFlow, this) == objG) {
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

    public b(c0 clickthroughService, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f56901a = clickthroughService;
        this.f56902b = scope;
        MutableSharedFlow mutableSharedFlowB = hg.c0.b(0, 0, null, 7, null);
        this.f56903c = mutableSharedFlowB;
        this.f56904d = mutableSharedFlowB;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public String b() {
        return "ClickthroughEventHandler";
    }

    public final MutableSharedFlow d() {
        return this.f56904d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public Set a() {
        return SetsKt.setOf("clickthrough");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(JSONObject event) throws JSONException {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!Intrinsics.areEqual(event.getString("event"), CollectionsKt.first(a()))) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Event not supported: " + event.getString("event"), false, 4, null);
            return;
        }
        String string = event.getString("contentType");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Ad clicked on " + string, false, 4, null);
        eg.i.d(this.f56902b, null, null, new a(event.getString("url"), null), 3, null);
    }
}
