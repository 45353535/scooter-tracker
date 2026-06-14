package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j {

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57975r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e f57976s;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j$a$a, reason: collision with other inner class name */
        public static final class C0762a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f57977r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e f57978s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0762a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, Continuation continuation) {
                super(2, continuation);
                this.f57978s = eVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0762a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0762a(this.f57978s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f57977r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                this.f57978s.b();
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, Continuation continuation) {
            super(2, continuation);
            this.f57976s = eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f57976s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57975r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineContext main = com.moloco.sdk.internal.scheduling.c.a().getMain();
                C0762a c0762a = new C0762a(this.f57976s, null);
                this.f57975r = 1;
                if (eg.g.g(main, c0762a, this) == objG) {
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

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57979r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f57980s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Function0 f57981t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e f57982u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, Continuation continuation) {
            super(2, continuation);
            this.f57981t = function0;
            this.f57982u = eVar;
        }

        public static final Unit i(Function0 function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, Offset offset, Offset offset2) {
            if (function0 != null) {
                function0.invoke();
            } else {
                eVar.k(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f57289a.c(offset.getPackedValue()));
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            return ((b) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.f57981t, this.f57982u, continuation);
            bVar.f57980s = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57979r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f57980s;
                final Function0 function0 = this.f57981t;
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar = this.f57982u;
                Function2 function2 = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return j.b.i(function0, eVar, (Offset) obj2, (Offset) obj3);
                    }
                };
                this.f57979r = 1;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.b(pointerInputScope, function2, this) == objG) {
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

    public /* synthetic */ class c extends kotlin.jvm.internal.y implements Function0 {
        public c(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e.class, "onVastPrivacyIconDisplayed", "onVastPrivacyIconDisplayed()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e) this.receiver).i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public /* synthetic */ class d extends kotlin.jvm.internal.y implements Function0 {
        public d(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e.class, "onVastPrivacyIconClick", "onVastPrivacyIconClick()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e) this.receiver).u();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j a(State state) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) state.getValue();
    }

    public static final Unit b() {
        return Unit.f93236a;
    }

    public static final Unit c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, Function0 function0, Function6 function6, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        d(eVar, function0, function6, modifier, composer, i10 | 1, i11);
        return Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e r17, final kotlin.jvm.functions.Function0 r18, final kotlin.jvm.functions.Function6 r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function6, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
