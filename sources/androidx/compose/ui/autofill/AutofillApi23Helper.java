package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J@\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J6\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0007¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi23Helper;", "", "()V", "addChildCount", "", "structure", "Landroid/view/ViewStructure;", "num", "newChild", FirebaseAnalytics.Param.INDEX, "setDimens", "", "left", "top", "scrollX", "scrollY", "width", "height", "setId", "id", "packageName", "", "typeName", "entryName", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AutofillApi23Helper {

    @NotNull
    public static final AutofillApi23Helper INSTANCE = new AutofillApi23Helper();

    private AutofillApi23Helper() {
    }

    @DoNotInline
    @RequiresApi(23)
    public final int addChildCount(@NotNull ViewStructure structure, int num) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        return structure.addChildCount(num);
    }

    @DoNotInline
    @RequiresApi(23)
    @Nullable
    public final ViewStructure newChild(@NotNull ViewStructure structure, int index) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        return structure.newChild(index);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void setDimens(@NotNull ViewStructure structure, int left, int top, int scrollX, int scrollY, int width, int height) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.setDimens(left, top, scrollX, scrollY, width, height);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void setId(@NotNull ViewStructure structure, int id2, @Nullable String packageName, @Nullable String typeName, @Nullable String entryName) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.setId(id2, packageName, typeName, entryName);
    }
}
