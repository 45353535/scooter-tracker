package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.json.JSONException;
import org.json.JSONObject;
import ve.g;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f56919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f56920b;

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56921r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f56923t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation) {
            super(2, continuation);
            this.f56923t = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return f.this.new a(this.f56923t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56921r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            f.this.f56919a.a(this.f56923t);
            return Unit.f93236a;
        }
    }

    public static final class b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56924r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f56925s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ f f56926t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f56927u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ve.g f56928v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, f fVar, String str2, ve.g gVar, Continuation continuation) {
            super(2, continuation);
            this.f56925s = str;
            this.f56926t = fVar;
            this.f56927u = str2;
            this.f56928v = gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f56925s, this.f56926t, this.f56927u, this.f56928v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56924r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            byte[] bytes = this.f56925s.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            e.a.a(this.f56926t.f56919a, this.f56927u, bytes, this.f56928v, null, 8, null);
            return Unit.f93236a;
        }
    }

    public f(l persistentHttpRequest) {
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.f56919a = persistentHttpRequest;
        this.f56920b = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getIo());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public String b() {
        return "HttpEventHandler";
    }

    public final Job c(String str, String str2, ve.g gVar) {
        return eg.i.d(this.f56920b, null, null, new b(str2, this, str, gVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public Set a() {
        return SetsKt.setOf((Object[]) new String[]{"sendGet", "sendPost"});
    }

    public final Job b(String str) {
        return eg.i.d(this.f56920b, null, null, new a(str, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(JSONObject event) throws JSONException, ve.a {
        Intrinsics.checkNotNullParameter(event, "event");
        String string = event.getString("event");
        if (Intrinsics.areEqual(string, "sendGet")) {
            String string2 = event.getString("url");
            Intrinsics.checkNotNull(string2);
            b(string2);
            return;
        }
        if (Intrinsics.areEqual(string, "sendPost")) {
            String string3 = event.getString("url");
            String string4 = event.getString("body");
            g.b bVar = ve.g.f106625f;
            String strOptString = event.optString("contentType", bVar.a().toString());
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            ve.g gVarB = bVar.b(strOptString);
            Intrinsics.checkNotNull(string3);
            Intrinsics.checkNotNull(string4);
            c(string3, string4, gVarB);
            return;
        }
        MolocoLogger.error$default(MolocoLogger.INSTANCE, b(), "Unsupported event type: " + string, null, false, 12, null);
        Unit unit = Unit.f93236a;
    }
}
