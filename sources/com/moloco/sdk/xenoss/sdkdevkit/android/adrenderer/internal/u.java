package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements t {

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56960r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f56961s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ View f56962t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, Continuation continuation) {
            super(2, continuation);
            this.f56962t = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gg.v vVar, Continuation continuation) {
            return ((a) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f56962t, continuation);
            aVar.f56961s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56960r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                gg.v vVar = (gg.v) this.f56961s;
                View view = this.f56962t;
                this.f56960r = 1;
                if (v.i(vVar, view, this) == objG) {
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

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t
    public Flow a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return v.g(hg.i.j(new a(view, null)));
    }
}
