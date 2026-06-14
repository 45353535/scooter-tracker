package qf;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f99120c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f99121b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Class<?> componentType = entries.getClass().getComponentType();
        Intrinsics.checkNotNull(componentType);
        this.f99121b = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f99121b.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        return qf.a.a((Enum[]) enumConstants);
    }
}
