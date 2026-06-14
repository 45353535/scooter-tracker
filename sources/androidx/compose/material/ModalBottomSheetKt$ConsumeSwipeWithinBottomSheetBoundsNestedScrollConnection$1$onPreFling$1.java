package androidx.compose.material;

import androidx.compose.material.ModalBottomSheetKt;
import com.unity3d.mediation.LevelPlayAdError;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", l = {LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK}, m = "onPreFling-QWom1Mo")
final class ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 extends d {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ModalBottomSheetKt.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1(ModalBottomSheetKt.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo316onPreFlingQWom1Mo(0L, this);
    }
}
