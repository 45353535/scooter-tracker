package com.yandex.div.core.view2.errors;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class VariableMonitorView$variablesAdapter$1 extends y implements Function3<String, String, String, Unit> {
    VariableMonitorView$variablesAdapter$1(Object obj) {
        super(3, obj, VariableMonitor.class, "mutateVariable", "mutateVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.f93236a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        ((VariableMonitor) this.receiver).mutateVariable(str, str2, str3);
    }
}
