package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"getDefaultLazyLayoutKey", "", FirebaseAnalytics.Param.INDEX, "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Lazy_androidKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final Object getDefaultLazyLayoutKey(int i10) {
        return new DefaultLazyKey(i10);
    }
}
