package com.yandex.div.core.dagger;

import com.taurusx.tax.f.y;
import com.yandex.div.core.view2.state.DivStateSwitcher;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/dagger/Div2ViewModule;", "", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Div2ViewModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/dagger/Div2ViewModule$Companion;", "", "<init>", "()V", "", "multipleStateChangeEnabled", "Lkf/a;", "Lcom/yandex/div/core/view2/state/DivJoinedStateSwitcher;", "joinedStateSwitcher", "Lcom/yandex/div/core/view2/state/DivMultipleStateSwitcher;", "multipleStateSwitcher", "Lcom/yandex/div/core/view2/state/DivStateSwitcher;", "provideStateSwitcher", "(ZLkf/a;Lkf/a;)Lcom/yandex/div/core/view2/state/DivStateSwitcher;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final DivStateSwitcher provideStateSwitcher(boolean multipleStateChangeEnabled, @NotNull kf.a joinedStateSwitcher, @NotNull kf.a multipleStateSwitcher) {
            return (DivStateSwitcher) (multipleStateChangeEnabled ? multipleStateSwitcher.get() : joinedStateSwitcher.get());
        }
    }
}
