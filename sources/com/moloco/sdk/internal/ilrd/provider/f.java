package com.moloco.sdk.internal.ilrd.provider;

import android.content.Context;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.moloco.sdk.internal.ilrd.i;
import hg.c0;
import hg.l0;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import lf.i;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements com.moloco.sdk.internal.ilrd.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f54440h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f54441i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f54443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.ilrd.model.a f54444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f54445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f54446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f54447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MutableSharedFlow f54448g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements ImpressionDataListener {
        public b() {
        }
    }

    public f(Context context, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f54442a = context;
        this.f54443b = scope;
        this.f54444c = com.moloco.sdk.internal.ilrd.model.a.f54419c;
        this.f54445d = i.a(new Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.f(this.f54438b);
            }
        });
        this.f54446e = i.a(new Function0() { // from class: com.moloco.sdk.internal.ilrd.provider.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.d(this.f54439b);
            }
        });
        this.f54447f = l0.a(i.c.f54417a);
        this.f54448g = c0.b(0, 0, null, 7, null);
    }

    public static final SharedFlow d(f fVar) {
        return hg.i.b(fVar.f54448g);
    }

    public static final StateFlow f(f fVar) {
        return hg.i.c(fVar.f54447f);
    }

    private final Object g() {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            Class.forName("com.ironsource.mediationsdk.impressionData.ImpressionData");
            IronSource.addImpressionDataListener(e());
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        return thG == null ? Result.b(Unit.f93236a) : Result.b(kotlin.d.a(thG));
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public com.moloco.sdk.internal.ilrd.model.a a() {
        return this.f54444c;
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public synchronized Object b() {
        Object objG;
        try {
            objG = g();
            Throwable thG = Result.g(objG);
            if (thG != null) {
                this.f54447f.setValue(new i.a(thG.toString()));
            }
            if (Result.j(objG)) {
                this.f54447f.setValue(i.b.f54416a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return objG;
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public SharedFlow c() {
        return (SharedFlow) this.f54446e.getValue();
    }

    public final b e() {
        return new b();
    }

    @Override // com.moloco.sdk.internal.ilrd.d
    public StateFlow getState() {
        return (StateFlow) this.f54445d.getValue();
    }
}
