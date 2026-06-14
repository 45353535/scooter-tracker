package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static StateRecord a(StateObject stateObject, StateRecord previous, StateRecord current, StateRecord applied) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(applied, "applied");
        return null;
    }
}
