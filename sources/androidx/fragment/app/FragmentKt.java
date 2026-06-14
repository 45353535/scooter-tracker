package androidx.fragment.app;

import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "requestKey", "Landroid/os/Bundle;", "result", "", "setFragmentResult", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V", "clearFragmentResult", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Lkotlin/Function2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setFragmentResultListener", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "clearFragmentResultListener", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FragmentKt {
    public static final void clearFragmentResult(@NotNull Fragment fragment, @NotNull String requestKey) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResult(requestKey);
    }

    public static final void clearFragmentResultListener(@NotNull Fragment fragment, @NotNull String requestKey) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        fragment.getParentFragmentManager().clearFragmentResultListener(requestKey);
    }

    public static final void setFragmentResult(@NotNull Fragment fragment, @NotNull String requestKey, @NotNull Bundle result) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(result, "result");
        fragment.getParentFragmentManager().setFragmentResult(requestKey, result);
    }

    public static final void setFragmentResultListener(@NotNull Fragment fragment, @NotNull String requestKey, @NotNull final Function2<? super String, ? super Bundle, Unit> listener) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(listener, "listener");
        fragment.getParentFragmentManager().setFragmentResultListener(requestKey, fragment, new FragmentResultListener() { // from class: androidx.fragment.app.n
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                FragmentKt.setFragmentResultListener$lambda$0(listener, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFragmentResultListener$lambda$0(Function2 tmp0, String p02, Bundle p12) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        tmp0.invoke(p02, p12);
    }
}
