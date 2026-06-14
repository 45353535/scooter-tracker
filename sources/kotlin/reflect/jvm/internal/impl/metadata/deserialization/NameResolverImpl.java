package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class NameResolverImpl implements NameResolver {

    @NotNull
    private final ProtoBuf.QualifiedNameTable qualifiedNames;

    @NotNull
    private final ProtoBuf.StringTable strings;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NameResolverImpl(@NotNull ProtoBuf.StringTable strings, @NotNull ProtoBuf.QualifiedNameTable qualifiedNames) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(qualifiedNames, "qualifiedNames");
        this.strings = strings;
        this.qualifiedNames = qualifiedNames;
    }

    private final Triple traverseIds(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = this.qualifiedNames.getQualifiedName(i10);
            String string = this.strings.getString(qualifiedName.getShortName());
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            Intrinsics.checkNotNull(kind);
            int i11 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(string);
            } else if (i11 == 2) {
                linkedList.addFirst(string);
            } else {
                if (i11 != 3) {
                    throw new m();
                }
                linkedList2.addFirst(string);
                z10 = true;
            }
            i10 = qualifiedName.getParentQualifiedName();
        }
        return new Triple(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getQualifiedClassName(int i10) {
        Triple tripleTraverseIds = traverseIds(i10);
        List list = (List) tripleTraverseIds.d();
        String strJoinToString$default = CollectionsKt.joinToString$default((List) tripleTraverseIds.g(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return strJoinToString$default;
        }
        return CollectionsKt.joinToString$default(list, "/", null, null, 0, null, null, 62, null) + IOUtils.DIR_SEPARATOR_UNIX + strJoinToString$default;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int i10) {
        String string = this.strings.getString(i10);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i10) {
        return ((Boolean) traverseIds(i10).k()).booleanValue();
    }
}
