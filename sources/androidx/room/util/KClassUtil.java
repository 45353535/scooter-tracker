package androidx.room.util;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"findAndInstantiateDatabaseImpl", "T", "C", "klass", "Ljava/lang/Class;", "suffix", "", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class KClassUtil {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <T, C> T findAndInstantiateDatabaseImpl(@NotNull Class<C> klass, @NotNull String suffix) {
        String name;
        String str;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Package r02 = klass.getPackage();
        if (r02 == null || (name = r02.getName()) == null) {
            name = "";
        }
        String canonicalName = klass.getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "substring(...)");
        }
        String str2 = StringsKt.V(canonicalName, '.', '_', false, 4, null) + suffix;
        try {
            if (name.length() == 0) {
                str = str2;
            } else {
                str = name + '.' + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            return (T) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist. Is Room annotation processor correctly configured?", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName(), e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName(), e12);
        }
    }

    public static /* synthetic */ Object findAndInstantiateDatabaseImpl$default(Class cls, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "_Impl";
        }
        return findAndInstantiateDatabaseImpl(cls, str);
    }
}
