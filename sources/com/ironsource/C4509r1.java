package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.ironsource.C4240b4;
import com.ironsource.C4500q8;
import com.ironsource.InterfaceC4543t1;
import com.ironsource.sdk.utils.Logger;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4509r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f44765a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f44766b;

    /* JADX INFO: renamed from: com.ironsource.r1$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f44767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final C4500q8.e f44768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f44769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final JSONObject f44770d;

        public a(@NotNull String name, @NotNull C4500q8.e productType, @NotNull String demandSourceName, @NotNull JSONObject params) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
            Intrinsics.checkNotNullParameter(params, "params");
            this.f44767a = name;
            this.f44768b = productType;
            this.f44769c = demandSourceName;
            this.f44770d = params;
        }

        @NotNull
        public final String a() {
            return this.f44767a;
        }

        @NotNull
        public final C4500q8.e b() {
            return this.f44768b;
        }

        @NotNull
        public final String c() {
            return this.f44769c;
        }

        @NotNull
        public final JSONObject d() {
            return this.f44770d;
        }

        @NotNull
        public final String e() {
            return this.f44769c;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f44767a, aVar.f44767a) && this.f44768b == aVar.f44768b && Intrinsics.areEqual(this.f44769c, aVar.f44769c) && Intrinsics.areEqual(this.f44770d.toString(), aVar.f44770d.toString());
        }

        @NotNull
        public final String f() {
            return this.f44767a;
        }

        @NotNull
        public final JSONObject g() {
            return this.f44770d;
        }

        @NotNull
        public final C4500q8.e h() {
            return this.f44768b;
        }

        public int hashCode() {
            return super.hashCode();
        }

        @NotNull
        public final JSONObject i() throws JSONException {
            JSONObject jSONObjectPut = new JSONObject(this.f44770d.toString()).put(C4240b4.i.f42638m, this.f44768b).put("demandSourceName", this.f44769c);
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject(params.toStri…eName\", demandSourceName)");
            return jSONObjectPut;
        }

        @NotNull
        public String toString() {
            return "CallbackResult(name=" + this.f44767a + ", productType=" + this.f44768b + ", demandSourceName=" + this.f44769c + ", params=" + this.f44770d + ")";
        }

        @NotNull
        public final a a(@NotNull String name, @NotNull C4500q8.e productType, @NotNull String demandSourceName, @NotNull JSONObject params) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
            Intrinsics.checkNotNullParameter(params, "params");
            return new a(name, productType, demandSourceName, params);
        }

        public static /* synthetic */ a a(a aVar, String str, C4500q8.e eVar, String str2, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f44767a;
            }
            if ((i10 & 2) != 0) {
                eVar = aVar.f44768b;
            }
            if ((i10 & 4) != 0) {
                str2 = aVar.f44769c;
            }
            if ((i10 & 8) != 0) {
                jSONObject = aVar.f44770d;
            }
            return aVar.a(str, eVar, str2, jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r1$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r1$c */
    @kotlin.coroutines.jvm.internal.e(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", f = "AndroidSandboxJSHandler.kt", l = {80}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f44771a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MeasurementManager f44773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f44774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ MotionEvent f44775e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, Continuation continuation) {
            super(2, continuation);
            this.f44773c = measurementManager;
            this.f44774d = uri;
            this.f44775e = motionEvent;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return C4509r1.this.new c(this.f44773c, this.f44774d, this.f44775e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f44771a;
            if (i10 == 0) {
                kotlin.d.b(obj);
                C4509r1 c4509r1 = C4509r1.this;
                MeasurementManager measurementManager = this.f44773c;
                Uri uri = this.f44774d;
                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                MotionEvent motionEvent = this.f44775e;
                this.f44771a = 1;
                if (c4509r1.a(measurementManager, uri, motionEvent, this) == objG) {
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

    /* JADX INFO: renamed from: com.ironsource.r1$d */
    @kotlin.coroutines.jvm.internal.e(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", f = "AndroidSandboxJSHandler.kt", l = {60}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f44776a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MeasurementManager f44778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f44779d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MeasurementManager measurementManager, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f44778c = measurementManager;
            this.f44779d = uri;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return C4509r1.this.new d(this.f44778c, this.f44779d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f44776a;
            if (i10 == 0) {
                kotlin.d.b(obj);
                C4509r1 c4509r1 = C4509r1.this;
                MeasurementManager measurementManager = this.f44778c;
                Uri uri = this.f44779d;
                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                this.f44776a = 1;
                if (c4509r1.a(measurementManager, uri, null, this) == objG) {
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

    static {
        String name = b.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "this::class.java.name");
        f44766b = name;
    }

    @NotNull
    public final a a(@NotNull Context context, @NotNull InterfaceC4543t1 message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof InterfaceC4543t1.a) {
            return a(context, (InterfaceC4543t1.a) message);
        }
        throw new lf.m();
    }

    private final a a(Context context, InterfaceC4543t1.a aVar) {
        MeasurementManager measurementManagerA = C4371j0.a(context);
        if (measurementManagerA == null) {
            Logger.i(f44766b, "could not obtain measurement manager");
            return a(aVar, "could not obtain measurement manager");
        }
        try {
            if (aVar instanceof InterfaceC4543t1.a.b) {
                return a(aVar, measurementManagerA);
            }
            if (aVar instanceof InterfaceC4543t1.a.C0481a) {
                return a((InterfaceC4543t1.a.C0481a) aVar, measurementManagerA);
            }
            throw new lf.m();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return a(aVar, "failed to handle attribution, message: " + e10.getMessage());
        }
    }

    private final a a(InterfaceC4543t1.a aVar, MeasurementManager measurementManager) {
        eg.h.b(null, new d(measurementManager, Uri.parse(aVar.b()), null), 1, null);
        return a(aVar);
    }

    private final a a(InterfaceC4543t1.a.C0481a c0481a, MeasurementManager measurementManager) {
        Uri uri = Uri.parse(c0481a.b());
        long jUptimeMillis = SystemClock.uptimeMillis();
        eg.h.b(null, new c(measurementManager, uri, MotionEvent.obtain(jUptimeMillis, jUptimeMillis, c0481a.n(), c0481a.o().c(), c0481a.o().d(), c0481a.p()), null), 1, null);
        return a(c0481a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public final Object a(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, Continuation continuation) throws Throwable {
        of.e eVar = new of.e(pf.b.d(continuation));
        measurementManager.registerSource(uri, motionEvent, Executors.newSingleThreadExecutor(), C4526s1.a(eVar));
        Object objB = eVar.b();
        if (objB == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objB == pf.b.g() ? objB : Unit.f93236a;
    }

    private final a a(InterfaceC4543t1.a aVar) throws JSONException {
        JSONObject params = new JSONObject().put("params", new JSONObject().put("type", aVar instanceof InterfaceC4543t1.a.C0481a ? "click" : "impression"));
        String strA = aVar.a();
        C4500q8.e eVarD = aVar.d();
        String strE = aVar.e();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        return new a(strA, eVarD, strE, params);
    }

    private final a a(InterfaceC4543t1 interfaceC4543t1, String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("reason", str).put("type", interfaceC4543t1 instanceof InterfaceC4543t1.a.C0481a ? "click" : "impression");
        String strC = interfaceC4543t1.c();
        C4500q8.e eVarD = interfaceC4543t1.d();
        String strE = interfaceC4543t1.e();
        JSONObject jSONObjectPut2 = new JSONObject().put("params", jSONObjectPut);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut2, "JSONObject().put(\"params\", payload)");
        return new a(strC, eVarD, strE, jSONObjectPut2);
    }
}
