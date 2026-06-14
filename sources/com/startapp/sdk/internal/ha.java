package com.startapp.sdk.internal;

import android.content.Context;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes11.dex */
public final class ha extends k6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final String b(InputMethodSubtype inputMethodSubtype) {
        Intrinsics.checkNotNull(inputMethodSubtype);
        return ga.a(inputMethodSubtype);
    }

    @Override // com.startapp.sdk.internal.k6
    public final /* bridge */ /* synthetic */ Object c() {
        return fa.f64492b;
    }

    @Override // com.startapp.sdk.internal.k6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final fa a() {
        Object systemService = this.f64817a.getSystemService("input_method");
        final InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return null;
        }
        InputMethodSubtype currentInputMethodSubtype = inputMethodManager.getCurrentInputMethodSubtype();
        Sequence sequenceU = kotlin.sequences.k.u(currentInputMethodSubtype != null ? ga.a(currentInputMethodSubtype) : null);
        List<InputMethodInfo> inputMethodList = inputMethodManager.getInputMethodList();
        Intrinsics.checkNotNullExpressionValue(inputMethodList, "getInputMethodList(...)");
        Set setE0 = kotlin.sequences.k.e0(kotlin.sequences.k.Z(kotlin.sequences.k.E(kotlin.sequences.k.G(kotlin.sequences.k.W(sequenceU, kotlin.sequences.k.Q(kotlin.sequences.k.E(kotlin.sequences.k.p(kotlin.sequences.k.Q(CollectionsKt.asSequence(inputMethodList), new Function1() { // from class: com.startapp.sdk.internal.am
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ha.a(inputMethodManager, (InputMethodInfo) obj);
            }
        })), new Function1() { // from class: com.startapp.sdk.internal.bm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ha.a((InputMethodSubtype) obj));
            }
        }), new Function1() { // from class: com.startapp.sdk.internal.cm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ha.b((InputMethodSubtype) obj);
            }
        }))), new Function1() { // from class: com.startapp.sdk.internal.dm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ha.a((String) obj));
            }
        }), 10));
        if (setE0.isEmpty()) {
            return null;
        }
        return new fa(setE0);
    }

    public static final List a(InputMethodManager systemService, InputMethodInfo inputMethodInfo) {
        Intrinsics.checkNotNullParameter(systemService, "$systemService");
        return systemService.getEnabledInputMethodSubtypeList(inputMethodInfo, true);
    }

    public static final boolean a(InputMethodSubtype inputMethodSubtype) {
        return Intrinsics.areEqual("keyboard", inputMethodSubtype.getMode());
    }

    public static final boolean a(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.length() > 0;
    }
}
