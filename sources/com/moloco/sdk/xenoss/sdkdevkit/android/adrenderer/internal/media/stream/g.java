package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h;
import gg.t;
import gg.v;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f56335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Flow f56336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function1 f56337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function2 f56338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function1 f56339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function1 f56340f;

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56341r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f56342s;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        public static final Unit i(g gVar) {
            gVar.f56337c = null;
            gVar.f56338d = null;
            gVar.f56339e = null;
            gVar.f56340f = null;
            return Unit.f93236a;
        }

        public static final Unit j(v vVar, h.a aVar) {
            vVar.e(aVar);
            return Unit.f93236a;
        }

        public static final Unit k(v vVar, h.b bVar) {
            vVar.e(bVar);
            return Unit.f93236a;
        }

        public static final Unit l(v vVar, File file) {
            vVar.e(new h.c(file, new h.d(0L, 0L)));
            return Unit.f93236a;
        }

        public static final Unit m(v vVar, File file, h.d dVar) {
            vVar.e(new h.c(file, dVar));
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v vVar, Continuation continuation) {
            return ((a) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f56342s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56341r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                final v vVar = (v) this.f56342s;
                g.this.f56337c = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return g.a.l(vVar, (File) obj2);
                    }
                };
                g.this.f56338d = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return g.a.m(vVar, (File) obj2, (h.d) obj3);
                    }
                };
                g.this.f56339e = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return g.a.j(vVar, (h.a) obj2);
                    }
                };
                g.this.f56340f = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return g.a.k(vVar, (h.b) obj2);
                    }
                };
                final g gVar = g.this;
                Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g.a.i(gVar);
                    }
                };
                this.f56341r = 1;
                if (t.b(vVar, function0, this) == objG) {
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

    public g(h initialStatus) {
        Intrinsics.checkNotNullParameter(initialStatus, "initialStatus");
        this.f56335a = initialStatus;
        this.f56336b = hg.i.f(new a(null));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void a(h.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f56335a = error;
        Function1 function1 = this.f56340f;
        if (function1 != null) {
            function1.invoke(error);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void b(h.a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f56335a = result;
        Function1 function1 = this.f56339e;
        if (function1 != null) {
            function1.invoke(result);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void c(File file, h.d progress) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f56335a = new h.c(file, progress);
        Function2 function2 = this.f56338d;
        if (function2 != null) {
            function2.invoke(file, progress);
        }
    }

    public h d() {
        return this.f56335a;
    }

    public final Flow g() {
        return this.f56336b;
    }
}
