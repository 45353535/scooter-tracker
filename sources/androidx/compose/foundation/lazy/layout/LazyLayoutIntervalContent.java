package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "", "Lkotlin/Function1;", "", "getKey", "()Lkotlin/jvm/functions/Function1;", C4240b4.i.W, "getType", "type", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LazyLayoutIntervalContent {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static Function1 a(LazyLayoutIntervalContent lazyLayoutIntervalContent) {
            return null;
        }

        public static Function1 b(LazyLayoutIntervalContent lazyLayoutIntervalContent) {
            return new Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$type$1
                @Nullable
                public final Void invoke(int i10) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            };
        }
    }

    @Nullable
    Function1<Integer, Object> getKey();

    @NotNull
    Function1<Integer, Object> getType();
}
