package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface ImplicitContextReceiver extends ImplicitReceiver {
    @Nullable
    Name getCustomLabelName();
}
