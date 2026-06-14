package com.yandex.div.core.dagger;

import com.yandex.div.core.dagger.Div2ViewModule;
import com.yandex.div.core.view2.state.DivStateSwitcher;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {
    static {
        Div2ViewModule.Companion companion = Div2ViewModule.INSTANCE;
    }

    public static DivStateSwitcher a(boolean z10, kf.a aVar, kf.a aVar2) {
        return Div2ViewModule.INSTANCE.provideStateSwitcher(z10, aVar, aVar2);
    }
}
