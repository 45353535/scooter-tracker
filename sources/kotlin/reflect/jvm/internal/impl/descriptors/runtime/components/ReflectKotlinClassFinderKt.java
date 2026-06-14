package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ReflectKotlinClassFinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toRuntimeFqName(ClassId classId) {
        String strV = StringsKt.V(classId.getRelativeClassName().asString(), '.', '$', false, 4, null);
        if (classId.getPackageFqName().isRoot()) {
            return strV;
        }
        return classId.getPackageFqName() + '.' + strV;
    }
}
