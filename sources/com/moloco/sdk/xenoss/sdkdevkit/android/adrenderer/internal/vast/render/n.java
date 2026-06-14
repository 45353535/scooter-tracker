package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public abstract class n {

    public static final class a extends kotlin.coroutines.jvm.internal.d {
        public /* synthetic */ Object A;
        public int B;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58307r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58308s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f58309t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f58310u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f58311v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f58312w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f58313x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f58314y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f58315z;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.B |= Integer.MIN_VALUE;
            return n.b(null, null, null, null, 0, 0, null, null, false, null, this);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58316r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58317s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a0 f58318t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref$ObjectRef ref$ObjectRef, a0 a0Var, Continuation continuation) {
            super(2, continuation);
            this.f58317s = ref$ObjectRef;
            this.f58318t = a0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f58317s, this.f58318t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f58316r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            this.f58317s.f93280b = n.d(this.f58318t);
            return Unit.f93236a;
        }
    }

    public static final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Integer f58319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f58322e;

        public c(Integer num, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
            this.f58319b = num;
            this.f58320c = ref$ObjectRef;
            this.f58321d = ref$ObjectRef2;
            this.f58322e = ref$ObjectRef3;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
        public void destroy() {
            Integer num = this.f58319b;
            if (num != null) {
                z.f58866a.c(num.intValue());
            }
            v vVar = (v) this.f58320c.f93280b;
            if (vVar != null) {
                vVar.destroy();
            }
            this.f58320c.f93280b = null;
            d0 d0Var = (d0) this.f58321d.f93280b;
            if (d0Var != null) {
                d0Var.destroy();
            }
            this.f58321d.f93280b = null;
            CoroutineScope coroutineScope = (CoroutineScope) this.f58322e.f93280b;
            if (coroutineScope != null) {
                kotlinx.coroutines.i.f(coroutineScope, null, 1, null);
            }
            this.f58322e.f93280b = null;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58323r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Function0 f58324s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f58324s = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation continuation) {
            return ((d) create(unit, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f58324s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f58323r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            this.f58324s.invoke();
            return Unit.f93236a;
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58325r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f58326s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Function1 f58327t;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f58328r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f58329s;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, Continuation continuation) {
                return ((a) create(gVar, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(continuation);
                aVar.f58329s = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f58328r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.f58329s) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f58326s = aVar;
            this.f58327t = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f58326s, this.f58327t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f58325r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                StateFlow unrecoverableError = this.f58326s.getUnrecoverableError();
                a aVar = new a(null);
                this.f58325r = 1;
                obj = hg.i.y(unrecoverableError, aVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj;
            if (gVar != null) {
                this.f58327t.invoke(gVar);
            }
            return Unit.f93236a;
        }
    }

    public static final j a(a0 a0Var, int i10, int i11) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        if (!(a0Var instanceof a0.c)) {
            return null;
        }
        a0.c cVar = (a0.c) a0Var;
        if (cVar.a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k.f57578b) {
            return new j.b(cVar.a().b(), i10, i11);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 r28, android.content.Context r29, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a r30, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 r31, int r32, int r33, kotlin.jvm.functions.Function0 r34, kotlin.jvm.functions.Function1 r35, boolean r36, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n r37, kotlin.coroutines.Continuation r38) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0, android.content.Context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0, int, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final String d(a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        if (a0Var instanceof a0.a) {
            a0.a aVar = (a0.a) a0Var;
            if (j0.f56170a.a(aVar.a().a())) {
                return aVar.a().a();
            }
            return null;
        }
        if (a0Var instanceof a0.b) {
            a0.b bVar = (a0.b) a0Var;
            if (j0.f56170a.a(bVar.a().a())) {
                return bVar.a().a();
            }
            return null;
        }
        if (!(a0Var instanceof a0.c)) {
            throw new lf.m();
        }
        a0.c cVar = (a0.c) a0Var;
        if (cVar.a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k.f57579c && j0.f56170a.a(cVar.a().b())) {
            return cVar.a().b();
        }
        return null;
    }

    public static final Unit e() {
        return Unit.f93236a;
    }

    public static final Unit f() {
        return Unit.f93236a;
    }
}
