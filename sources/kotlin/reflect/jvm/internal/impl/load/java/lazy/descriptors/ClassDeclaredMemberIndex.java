package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLoadingKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {

    @NotNull
    private final Map<Name, JavaRecordComponent> components;

    @NotNull
    private final Map<Name, JavaField> fields;

    @NotNull
    private final JavaClass jClass;

    @NotNull
    private final Function1<JavaMember, Boolean> memberFilter;

    @NotNull
    private final Function1<JavaMethod, Boolean> methodFilter;

    @NotNull
    private final Map<Name, List<JavaMethod>> methods;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(@NotNull JavaClass jClass, @NotNull Function1<? super JavaMember, Boolean> memberFilter) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(memberFilter, "memberFilter");
        this.jClass = jClass;
        this.memberFilter = memberFilter;
        Function1<JavaMethod, Boolean> function1 = new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex$$Lambda$0
            private final ClassDeclaredMemberIndex arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return Boolean.valueOf(ClassDeclaredMemberIndex.methodFilter$lambda$0(this.arg$0, (JavaMethod) obj));
            }
        };
        this.methodFilter = function1;
        Sequence sequenceE = k.E(CollectionsKt.asSequence(jClass.getMethods()), function1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceE) {
            Name name = ((JavaMethod) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.methods = linkedHashMap;
        Sequence sequenceE2 = k.E(CollectionsKt.asSequence(this.jClass.getFields()), this.memberFilter);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : sequenceE2) {
            linkedHashMap2.put(((JavaField) obj2).getName(), obj2);
        }
        this.fields = linkedHashMap2;
        Collection<JavaRecordComponent> recordComponents = this.jClass.getRecordComponents();
        Function1<JavaMember, Boolean> function12 = this.memberFilter;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : recordComponents) {
            if (function12.invoke((JavaMember) obj3).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((JavaRecordComponent) obj4).getName(), obj4);
        }
        this.components = linkedHashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean methodFilter$lambda$0(ClassDeclaredMemberIndex classDeclaredMemberIndex, JavaMethod m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        return classDeclaredMemberIndex.memberFilter.invoke(m10).booleanValue() && !JavaLoadingKt.isObjectMethodInInterface(m10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @Nullable
    public JavaField findFieldByName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.fields.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Collection<JavaMethod> findMethodsByName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<JavaMethod> list = this.methods.get(name);
        return list != null ? list : CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @Nullable
    public JavaRecordComponent findRecordComponentByName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.components.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set<Name> getFieldNames() {
        Sequence sequenceE = k.E(CollectionsKt.asSequence(this.jClass.getFields()), this.memberFilter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequenceE.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((JavaField) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set<Name> getMethodNames() {
        Sequence sequenceE = k.E(CollectionsKt.asSequence(this.jClass.getMethods()), this.methodFilter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequenceE.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((JavaMethod) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set<Name> getRecordComponentNames() {
        return this.components.keySet();
    }
}
