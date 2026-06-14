package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.moloco.sdk.internal.i0;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 extends View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
    }

    public final Object a(MotionEvent motionEvent, com.moloco.sdk.internal.services.c0 c0Var, String str, String str2, r rVar, MutableSharedFlow mutableSharedFlow, com.moloco.sdk.internal.i0 i0Var, Continuation continuation) {
        Object objA;
        if (motionEvent.getAction() == 0) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a(ArraysKt.first(iArr), ArraysKt.last(iArr), getHeight(), getWidth(), (int) (motionEvent.getX() + ArraysKt.first(iArr)), (int) (motionEvent.getY() + ArraysKt.last(iArr)));
            if (str != null) {
                kotlin.coroutines.jvm.internal.b.a(i0.a.a(i0Var, str, System.currentTimeMillis(), null, 4, null));
            }
            if (str2 != null && (objA = c0Var.a(str2, aVar, rVar, mutableSharedFlow, continuation)) == pf.b.g()) {
                return objA;
            }
        }
        return Unit.f93236a;
    }
}
