package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/evaluable/function/ColorGreenComponentSetter;", "Lcom/yandex/div/evaluable/function/ColorComponentSetter;", "()V", "name", "", "getName", "()Ljava/lang/String;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ColorGreenComponentSetter extends ColorComponentSetter {

    @NotNull
    public static final ColorGreenComponentSetter INSTANCE = new ColorGreenComponentSetter();

    @NotNull
    private static final String name = "setColorGreen";

    private ColorGreenComponentSetter() {
        super(new Function2<Color, Double, Color>() { // from class: com.yandex.div.evaluable.function.ColorGreenComponentSetter.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Color invoke(Color color, Double d10) {
                return Color.m7659boximpl(m7626invokeGnj5c28(color.getValue(), d10.doubleValue()));
            }

            /* JADX INFO: renamed from: invoke-Gnj5c28, reason: not valid java name */
            public final int m7626invokeGnj5c28(int i10, double d10) {
                return Color.INSTANCE.m7668argbH0kstlE(Color.m7657alphaimpl(i10), Color.m7665redimpl(i10), ColorFunctionsKt.toColorIntComponentValue(d10), Color.m7658blueimpl(i10));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
