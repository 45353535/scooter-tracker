package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f57806a = Dp.m3951constructorimpl(48);

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57807r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Function0 f57808s;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a0$a$a, reason: collision with other inner class name */
        public static final class C0755a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f57809r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Function0 f57810s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0755a(Function0 function0, Continuation continuation) {
                super(2, continuation);
                this.f57810s = function0;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0755a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0755a(this.f57810s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f57809r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                this.f57810s.invoke();
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f57808s = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f57808s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57807r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineContext main = com.moloco.sdk.internal.scheduling.c.a().getMain();
                C0755a c0755a = new C0755a(this.f57808s, null);
                this.f57807r = 1;
                if (eg.g.g(main, c0755a, this) == objG) {
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

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Function0 function0, Function0 function02, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        b(jVar, function0, function02, modifier, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j r18, final kotlin.jvm.functions.Function0 r19, final kotlin.jvm.functions.Function0 r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a0.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
