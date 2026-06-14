package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e0 {

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57842r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Animatable f57843s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ float f57844t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f57845u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i f57846v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Animatable animatable, float f10, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Continuation continuation) {
            super(2, continuation);
            this.f57843s = animatable;
            this.f57844t = f10;
            this.f57845u = z10;
            this.f57846v = iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f57843s, this.f57844t, this.f57845u, this.f57846v, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, null, null, r13, 12, null) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        
            if (r14.stop(r13) == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r13.f57842r
                r2 = 3
                r3 = 1
                r4 = 2
                if (r1 == 0) goto L27
                if (r1 == r3) goto L23
                if (r1 == r4) goto L1e
                if (r1 != r2) goto L16
                kotlin.d.b(r14)
                r10 = r13
                goto L79
            L16:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1e:
                kotlin.d.b(r14)
                r10 = r13
                goto L7b
            L23:
                kotlin.d.b(r14)
                goto L3c
            L27:
                kotlin.d.b(r14)
                androidx.compose.animation.core.Animatable r14 = r13.f57843s
                float r1 = r13.f57844t
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.c(r1)
                r13.f57842r = r3
                java.lang.Object r14 = r14.snapTo(r1, r13)
                if (r14 != r0) goto L3c
                r10 = r13
                goto L78
            L3c:
                boolean r14 = r13.f57845u
                if (r14 == 0) goto L6d
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i r14 = r13.f57846v
                boolean r14 = r14 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c
                if (r14 == 0) goto L6d
                androidx.compose.animation.core.Animatable r5 = r13.f57843s
                r14 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r6 = kotlin.coroutines.jvm.internal.b.c(r14)
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i r14 = r13.f57846v
                int r14 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.e0.b(r14)
                androidx.compose.animation.core.Easing r1 = androidx.compose.animation.core.EasingKt.getLinearEasing()
                r2 = 0
                r3 = 0
                androidx.compose.animation.core.TweenSpec r7 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r14, r2, r1, r4, r3)
                r13.f57842r = r4
                r11 = 12
                r12 = 0
                r8 = 0
                r9 = 0
                r10 = r13
                java.lang.Object r14 = androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L7b
                goto L78
            L6d:
                r10 = r13
                androidx.compose.animation.core.Animatable r14 = r10.f57843s
                r10.f57842r = r2
                java.lang.Object r14 = r14.stop(r13)
                if (r14 != r0) goto L79
            L78:
                return r0
            L79:
                kotlin.Unit r14 = kotlin.Unit.f93236a
            L7b:
                kotlin.Unit r14 = kotlin.Unit.f93236a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.e0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final float a(MutableState mutableState) {
        return ((Number) mutableState.getValue()).floatValue();
    }

    public static final MutableState c() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
    }

    public static final Unit d(Animatable animatable, float f10, long j10, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        androidx.compose.ui.graphics.drawscope.b.M(drawBehind, j10, 0L, SizeKt.Size(((Number) animatable.getValue()).floatValue() * Size.m1440getWidthimpl(drawBehind.mo2040getSizeNHjbRc()), Size.m1437getHeightimpl(drawBehind.mo2040getSizeNHjbRc())), CornerRadiusKt.CornerRadius(f10, f10), null, 0.0f, null, 0, 242, null);
        return Unit.f93236a;
    }

    public static final Unit e(boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Modifier modifier, long j10, int i10, int i11, Composer composer, int i12) {
        g(z10, iVar, modifier, j10, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    public static final void f(MutableState mutableState, float f10) {
        mutableState.setValue(Float.valueOf(f10));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
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
    public static final void g(final boolean r22, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i r23, androidx.compose.ui.Modifier r24, long r25, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.e0.g(boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float h(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        if (iVar instanceof i.a) {
            return 100.0f;
        }
        if (iVar instanceof i.c) {
            if (((i.c) iVar).b() == 0) {
                return 0.0f;
            }
            return (float) (r4.a() / r4.b());
        }
        if ((iVar instanceof i.d) || Intrinsics.areEqual(iVar, i.b.f58219a)) {
            return 0.0f;
        }
        throw new lf.m();
    }

    public static final int i(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        if (!(iVar instanceof i.a)) {
            if (iVar instanceof i.c) {
                i.c cVar = (i.c) iVar;
                if (cVar.b() != 0) {
                    return kotlin.ranges.g.e((int) (cVar.b() - cVar.a()), 0);
                }
            } else if (!(iVar instanceof i.d) && !Intrinsics.areEqual(iVar, i.b.f58219a)) {
                throw new lf.m();
            }
        }
        return 0;
    }
}
