package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(TextToolbar textToolbar, Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        if ((i10 & 4) != 0) {
            function02 = null;
        }
        if ((i10 & 8) != 0) {
            function03 = null;
        }
        if ((i10 & 16) != 0) {
            function04 = null;
        }
        textToolbar.showMenu(rect, function0, function02, function03, function04);
    }
}
