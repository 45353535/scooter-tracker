package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    static {
        Modifier.Companion companion = Modifier.INSTANCE;
    }

    public static Modifier a(Modifier modifier, Modifier other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other == Modifier.INSTANCE ? modifier : new CombinedModifier(modifier, other);
    }
}
