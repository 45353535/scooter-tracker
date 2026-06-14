package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static boolean a(Modifier.Element element, Function1 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return ((Boolean) predicate.invoke(element)).booleanValue();
    }

    public static boolean b(Modifier.Element element, Function1 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return ((Boolean) predicate.invoke(element)).booleanValue();
    }

    public static Object c(Modifier.Element element, Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, element);
    }

    public static Object d(Modifier.Element element, Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(element, obj);
    }
}
