package com.google.android.material.color.utilities;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i5 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f26246a;

    public /* synthetic */ i5(MaterialDynamicColors materialDynamicColors) {
        this.f26246a = materialDynamicColors;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo7820andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return this.f26246a.highestSurface((DynamicScheme) obj);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
