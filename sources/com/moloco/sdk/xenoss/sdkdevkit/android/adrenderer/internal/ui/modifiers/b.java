package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static final Modifier a(Modifier modifier, final a.AbstractC0780a.c savedStateButton, final Function1 updateButtonState) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(savedStateButton, "savedStateButton");
        Intrinsics.checkNotNullParameter(updateButtonState, "updateButtonState");
        return OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.b(savedStateButton, updateButtonState, (LayoutCoordinates) obj);
            }
        });
    }

    public static final Unit b(a.AbstractC0780a.c cVar, Function1 function1, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c cVar2 = c.f57289a;
        a.AbstractC0780a.c cVarB = cVar2.b(it, cVar.c());
        if (cVar2.e(cVarB) && !Intrinsics.areEqual(cVarB, cVar)) {
            function1.invoke(cVarB);
        }
        return Unit.f93236a;
    }
}
