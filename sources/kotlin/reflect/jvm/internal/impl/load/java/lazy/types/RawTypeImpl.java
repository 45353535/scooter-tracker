package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RawTypeImpl extends FlexibleType implements RawType {
    private RawTypeImpl(SimpleType simpleType, SimpleType simpleType2, boolean z10) {
        super(simpleType, simpleType2);
        if (z10) {
            return;
        }
        KotlinTypeChecker.DEFAULT.isSubtypeOf(simpleType, simpleType2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence render$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "(raw) " + it;
    }

    private static final boolean render$onlyOutDiffers(String str, String str2) {
        return Intrinsics.areEqual(str, StringsKt.P0(str2, "out ")) || Intrinsics.areEqual(str2, ProxyConfig.MATCH_ALL_SCHEMES);
    }

    private static final List<String> render$renderArguments(DescriptorRenderer descriptorRenderer, KotlinType kotlinType) {
        List<TypeProjection> arguments = kotlinType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(descriptorRenderer.renderTypeProjection((TypeProjection) it.next()));
        }
        return arrayList;
    }

    private static final String render$replaceArgs(String str, String str2) {
        if (!StringsKt.f0(str, '<', false, 2, null)) {
            return str;
        }
        return StringsKt.o1(str, '<', null, 2, null) + '<' + str2 + '>' + StringsKt.k1(str, '>', null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public SimpleType getDelegate() {
        return getLowerBound();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = getConstructor().mo8663getDeclarationDescriptor();
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = null;
        byte b10 = 0;
        ClassDescriptor classDescriptor = classifierDescriptorMo8663getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo8663getDeclarationDescriptor : null;
        if (classDescriptor != null) {
            MemberScope memberScope = classDescriptor.getMemberScope(new RawSubstitution(typeParameterUpperBoundEraser, 1, b10 == true ? 1 : 0));
            Intrinsics.checkNotNullExpressionValue(memberScope, "getMemberScope(...)");
            return memberScope;
        }
        throw new IllegalStateException(("Incorrect classifier: " + getConstructor().mo8663getDeclarationDescriptor()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public String render(@NotNull DescriptorRenderer renderer, @NotNull DescriptorRendererOptions options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        String strRenderType = renderer.renderType(getLowerBound());
        String strRenderType2 = renderer.renderType(getUpperBound());
        if (options.getDebugMode()) {
            return "raw (" + strRenderType + ".." + strRenderType2 + ')';
        }
        if (getUpperBound().getArguments().isEmpty()) {
            return renderer.renderFlexibleType(strRenderType, strRenderType2, TypeUtilsKt.getBuiltIns(this));
        }
        List<String> listRender$renderArguments = render$renderArguments(renderer, getLowerBound());
        List<String> listRender$renderArguments2 = render$renderArguments(renderer, getUpperBound());
        List<String> list = listRender$renderArguments;
        String strJoinToString$default = CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return RawTypeImpl.render$lambda$2((String) obj);
            }
        }, 30, null);
        List<Pair> listZip = CollectionsKt.zip(list, listRender$renderArguments2);
        if ((listZip instanceof Collection) && listZip.isEmpty()) {
            strRenderType2 = render$replaceArgs(strRenderType2, strJoinToString$default);
        } else {
            for (Pair pair : listZip) {
                if (!render$onlyOutDiffers((String) pair.getFirst(), (String) pair.getSecond())) {
                    break;
                }
            }
            strRenderType2 = render$replaceArgs(strRenderType2, strJoinToString$default);
        }
        String strRender$replaceArgs = render$replaceArgs(strRenderType, strJoinToString$default);
        return Intrinsics.areEqual(strRender$replaceArgs, strRenderType2) ? strRender$replaceArgs : renderer.renderFlexibleType(strRender$replaceArgs, strRenderType2, TypeUtilsKt.getBuiltIns(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public RawTypeImpl makeNullableAsSpecified(boolean z10) {
        return new RawTypeImpl(getLowerBound().makeNullableAsSpecified(z10), getUpperBound().makeNullableAsSpecified(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public RawTypeImpl replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new RawTypeImpl(getLowerBound().replaceAttributes(newAttributes), getUpperBound().replaceAttributes(newAttributes));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(@NotNull SimpleType lowerBound, @NotNull SimpleType upperBound) {
        this(lowerBound, upperBound, false);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public FlexibleType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeRefineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getLowerBound());
        Intrinsics.checkNotNull(kotlinTypeRefineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinTypeRefineType2 = kotlinTypeRefiner.refineType((KotlinTypeMarker) getUpperBound());
        Intrinsics.checkNotNull(kotlinTypeRefineType2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new RawTypeImpl((SimpleType) kotlinTypeRefineType, (SimpleType) kotlinTypeRefineType2, true);
    }
}
