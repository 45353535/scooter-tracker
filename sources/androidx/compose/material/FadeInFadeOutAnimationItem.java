package androidx.compose.material;

import androidx.compose.runtime.Composer;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012&\u0010\t\u001a\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\b¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\b¢\u0006\u0002\b\u0007HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJJ\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002(\b\u0002\u0010\t\u001a\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\b¢\u0006\u0002\b\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR7\u0010\t\u001a\"\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\b¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Landroidx/compose/material/FadeInFadeOutAnimationItem;", "T", "", C4240b4.i.W, "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/material/FadeInFadeOutTransition;", "transition", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lkotlin/jvm/functions/Function3;", MenuActionType.COPY, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Landroidx/compose/material/FadeInFadeOutAnimationItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getKey", "Lkotlin/jvm/functions/Function3;", "getTransition", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class FadeInFadeOutAnimationItem<T> {
    private final T key;

    @NotNull
    private final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> transition;

    /* JADX WARN: Multi-variable type inference failed */
    public FadeInFadeOutAnimationItem(T t10, @NotNull Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.key = t10;
        this.transition = transition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FadeInFadeOutAnimationItem copy$default(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem, Object obj, Function3 function3, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = fadeInFadeOutAnimationItem.key;
        }
        if ((i10 & 2) != 0) {
            function3 = fadeInFadeOutAnimationItem.transition;
        }
        return fadeInFadeOutAnimationItem.copy(obj, function3);
    }

    public final T component1() {
        return this.key;
    }

    @NotNull
    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> component2() {
        return this.transition;
    }

    @NotNull
    public final FadeInFadeOutAnimationItem<T> copy(T key, @NotNull Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        return new FadeInFadeOutAnimationItem<>(key, transition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) other;
        return Intrinsics.areEqual(this.key, fadeInFadeOutAnimationItem.key) && Intrinsics.areEqual(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    public final T getKey() {
        return this.key;
    }

    @NotNull
    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> getTransition() {
        return this.transition;
    }

    public int hashCode() {
        T t10 = this.key;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + this.transition.hashCode();
    }

    @NotNull
    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
