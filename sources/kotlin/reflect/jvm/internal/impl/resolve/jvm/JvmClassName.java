package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class JvmClassName {
    private FqName fqName;
    private final String internalName;

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.$$$reportNull$$$0(int):void");
    }

    private JvmClassName(@NotNull String str) {
        if (str == null) {
            $$$reportNull$$$0(7);
        }
        this.internalName = str;
    }

    @NotNull
    public static JvmClassName byClassId(@NotNull ClassId classId) {
        if (classId == null) {
            $$$reportNull$$$0(1);
        }
        return new JvmClassName(internalNameByClassId(classId));
    }

    @NotNull
    public static JvmClassName byFqNameWithoutInnerClasses(@NotNull FqName fqName) {
        if (fqName == null) {
            $$$reportNull$$$0(4);
        }
        JvmClassName jvmClassName = new JvmClassName(fqName.asString().replace('.', IOUtils.DIR_SEPARATOR_UNIX));
        jvmClassName.fqName = fqName;
        return jvmClassName;
    }

    @NotNull
    public static JvmClassName byInternalName(@NotNull String str) {
        if (str == null) {
            $$$reportNull$$$0(0);
        }
        return new JvmClassName(str);
    }

    @NotNull
    public static String internalNameByClassId(@NotNull ClassId classId) {
        if (classId == null) {
            $$$reportNull$$$0(2);
        }
        FqName packageFqName = classId.getPackageFqName();
        String strReplace = classId.getRelativeClassName().asString().replace('.', '$');
        if (!packageFqName.isRoot()) {
            strReplace = packageFqName.asString().replace('.', IOUtils.DIR_SEPARATOR_UNIX) + "/" + strReplace;
        }
        if (strReplace == null) {
            $$$reportNull$$$0(3);
        }
        return strReplace;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.internalName.equals(((JvmClassName) obj).internalName);
    }

    @NotNull
    public FqName getFqNameForTopLevelClassMaybeWithDollars() {
        return new FqName(this.internalName.replace(IOUtils.DIR_SEPARATOR_UNIX, '.'));
    }

    @NotNull
    public String getInternalName() {
        String str = this.internalName;
        if (str == null) {
            $$$reportNull$$$0(10);
        }
        return str;
    }

    @NotNull
    public FqName getPackageFqName() {
        int iLastIndexOf = this.internalName.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new FqName(this.internalName.substring(0, iLastIndexOf).replace(IOUtils.DIR_SEPARATOR_UNIX, '.'));
        }
        FqName fqName = FqName.ROOT;
        if (fqName == null) {
            $$$reportNull$$$0(9);
        }
        return fqName;
    }

    public int hashCode() {
        return this.internalName.hashCode();
    }

    public String toString() {
        return this.internalName;
    }
}
