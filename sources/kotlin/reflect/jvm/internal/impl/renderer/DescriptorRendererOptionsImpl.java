package kotlin.reflect.jvm.internal.impl.renderer;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.v0;
import kotlin.properties.a;
import kotlin.properties.c;
import kotlin.properties.e;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {v0.f(new g0(DescriptorRendererOptionsImpl.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "withDefinedIn", "getWithDefinedIn()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "modifiers", "getModifiers()Ljava/util/Set;", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "startFromName", "getStartFromName()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "debugMode", "getDebugMode()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "verbose", "getVerbose()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "unitReturnType", "getUnitReturnType()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "withoutReturnType", "getWithoutReturnType()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "enhancedTypes", "getEnhancedTypes()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "receiverAfterName", "getReceiverAfterName()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0)), v0.f(new g0(DescriptorRendererOptionsImpl.class, "informativeErrorType", "getInformativeErrorType()Z", 0))};

    @NotNull
    private final e actualPropertiesInPrimaryConstructor$delegate;

    @NotNull
    private final e alwaysRenderModifiers$delegate;

    @NotNull
    private final e annotationArgumentsRenderingPolicy$delegate;

    @NotNull
    private final e annotationFilter$delegate;

    @NotNull
    private final e boldOnlyForNamesInHtml$delegate;

    @NotNull
    private final e classWithPrimaryConstructor$delegate;

    @NotNull
    private final e classifierNamePolicy$delegate = property(ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.INSTANCE);

    @NotNull
    private final e debugMode$delegate;

    @NotNull
    private final e defaultParameterValueRenderer$delegate;

    @NotNull
    private final e eachAnnotationOnNewLine$delegate;

    @NotNull
    private final e enhancedTypes$delegate;

    @NotNull
    private final e excludedAnnotationClasses$delegate;

    @NotNull
    private final e excludedTypeAnnotationClasses$delegate;

    @NotNull
    private final e includeAdditionalModifiers$delegate;

    @NotNull
    private final e includePropertyConstant$delegate;

    @NotNull
    private final e informativeErrorType$delegate;
    private boolean isLocked;

    @NotNull
    private final e modifiers$delegate;

    @NotNull
    private final e normalizedVisibilities$delegate;

    @NotNull
    private final e overrideRenderingPolicy$delegate;

    @NotNull
    private final e parameterNameRenderingPolicy$delegate;

    @NotNull
    private final e parameterNamesInFunctionalTypes$delegate;

    @NotNull
    private final e presentableUnresolvedTypes$delegate;

    @NotNull
    private final e propertyAccessorRenderingPolicy$delegate;

    @NotNull
    private final e propertyConstantRenderer$delegate;

    @NotNull
    private final e receiverAfterName$delegate;

    @NotNull
    private final e renderAbbreviatedTypeComments$delegate;

    @NotNull
    private final e renderCompanionObjectName$delegate;

    @NotNull
    private final e renderConstructorDelegation$delegate;

    @NotNull
    private final e renderConstructorKeyword$delegate;

    @NotNull
    private final e renderDefaultAnnotationArguments$delegate;

    @NotNull
    private final e renderDefaultModality$delegate;

    @NotNull
    private final e renderDefaultVisibility$delegate;

    @NotNull
    private final e renderFunctionContracts$delegate;

    @NotNull
    private final e renderPrimaryConstructorParametersAsProperties$delegate;

    @NotNull
    private final e renderTypeExpansions$delegate;

    @NotNull
    private final e renderUnabbreviatedType$delegate;

    @NotNull
    private final e secondaryConstructorsAsPrimary$delegate;

    @NotNull
    private final e startFromDeclarationKeyword$delegate;

    @NotNull
    private final e startFromName$delegate;

    @NotNull
    private final e textFormat$delegate;

    @NotNull
    private final e typeNormalizer$delegate;

    @NotNull
    private final e uninferredTypeParameterAsName$delegate;

    @NotNull
    private final e unitReturnType$delegate;

    @NotNull
    private final e valueParametersHandler$delegate;

    @NotNull
    private final e verbose$delegate;

    @NotNull
    private final e withDefinedIn$delegate;

    @NotNull
    private final e withSourceFileForTopLevel$delegate;

    @NotNull
    private final e withoutReturnType$delegate;

    @NotNull
    private final e withoutSuperTypes$delegate;

    @NotNull
    private final e withoutTypeParameters$delegate;

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.withDefinedIn$delegate = property(bool);
        this.withSourceFileForTopLevel$delegate = property(bool);
        this.modifiers$delegate = property(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.startFromName$delegate = property(bool2);
        this.startFromDeclarationKeyword$delegate = property(bool2);
        this.debugMode$delegate = property(bool2);
        this.classWithPrimaryConstructor$delegate = property(bool2);
        this.verbose$delegate = property(bool2);
        this.unitReturnType$delegate = property(bool);
        this.withoutReturnType$delegate = property(bool2);
        this.enhancedTypes$delegate = property(bool2);
        this.normalizedVisibilities$delegate = property(bool2);
        this.renderDefaultVisibility$delegate = property(bool);
        this.renderDefaultModality$delegate = property(bool);
        this.renderConstructorDelegation$delegate = property(bool2);
        this.renderPrimaryConstructorParametersAsProperties$delegate = property(bool2);
        this.actualPropertiesInPrimaryConstructor$delegate = property(bool2);
        this.uninferredTypeParameterAsName$delegate = property(bool2);
        this.includePropertyConstant$delegate = property(bool2);
        this.propertyConstantRenderer$delegate = property(null);
        this.withoutTypeParameters$delegate = property(bool2);
        this.withoutSuperTypes$delegate = property(bool2);
        this.typeNormalizer$delegate = property(new Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return DescriptorRendererOptionsImpl.typeNormalizer_delegate$lambda$2((KotlinType) obj);
            }
        });
        this.defaultParameterValueRenderer$delegate = property(new Function1() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return DescriptorRendererOptionsImpl.defaultParameterValueRenderer_delegate$lambda$3((ValueParameterDescriptor) obj);
            }
        });
        this.secondaryConstructorsAsPrimary$delegate = property(bool);
        this.overrideRenderingPolicy$delegate = property(OverrideRenderingPolicy.RENDER_OPEN);
        this.valueParametersHandler$delegate = property(DescriptorRenderer.ValueParametersHandler.DEFAULT.INSTANCE);
        this.textFormat$delegate = property(RenderingFormat.PLAIN);
        this.parameterNameRenderingPolicy$delegate = property(ParameterNameRenderingPolicy.ALL);
        this.receiverAfterName$delegate = property(bool2);
        this.renderCompanionObjectName$delegate = property(bool2);
        this.propertyAccessorRenderingPolicy$delegate = property(PropertyAccessorRenderingPolicy.DEBUG);
        this.renderDefaultAnnotationArguments$delegate = property(bool2);
        this.eachAnnotationOnNewLine$delegate = property(bool2);
        this.excludedAnnotationClasses$delegate = property(SetsKt.emptySet());
        this.excludedTypeAnnotationClasses$delegate = property(ExcludedTypeAnnotations.INSTANCE.getInternalAnnotationsForResolve());
        this.annotationFilter$delegate = property(null);
        this.annotationArgumentsRenderingPolicy$delegate = property(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS);
        this.alwaysRenderModifiers$delegate = property(bool2);
        this.renderConstructorKeyword$delegate = property(bool);
        this.renderUnabbreviatedType$delegate = property(bool);
        this.renderTypeExpansions$delegate = property(bool2);
        this.renderAbbreviatedTypeComments$delegate = property(bool2);
        this.includeAdditionalModifiers$delegate = property(bool);
        this.parameterNamesInFunctionalTypes$delegate = property(bool);
        this.renderFunctionContracts$delegate = property(bool2);
        this.presentableUnresolvedTypes$delegate = property(bool2);
        this.boldOnlyForNamesInHtml$delegate = property(bool2);
        this.informativeErrorType$delegate = property(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String defaultParameterValueRenderer_delegate$lambda$3(ValueParameterDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return APSSharedUtil.TRUNCATE_SEPARATOR;
    }

    private final <T> e property(final T t10) {
        a aVar = a.f93338a;
        return new c(t10) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1
            @Override // kotlin.properties.c
            protected boolean beforeChange(KProperty<?> property, T t11, T t12) {
                Intrinsics.checkNotNullParameter(property, "property");
                if (this.isLocked()) {
                    throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
                }
                return true;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType typeNormalizer_delegate$lambda$2(KotlinType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    @NotNull
    public final DescriptorRendererOptionsImpl copy() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
        Iterator itA = i.a(DescriptorRendererOptionsImpl.class.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null) {
                    String name = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    StringsKt.a0(name, "is", false, 2, null);
                    KClass kClassB = v0.b(DescriptorRendererOptionsImpl.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    String name3 = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        name3 = upperCase + strSubstring;
                    }
                    sb2.append(name3);
                    field.set(descriptorRendererOptionsImpl, descriptorRendererOptionsImpl.property(cVar.getValue(this, new n0(kClassB, name2, sb2.toString()))));
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return ((Boolean) this.actualPropertiesInPrimaryConstructor$delegate.getValue(this, $$delegatedProperties[17])).booleanValue();
    }

    public boolean getAlwaysRenderModifiers() {
        return ((Boolean) this.alwaysRenderModifiers$delegate.getValue(this, $$delegatedProperties[39])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return (AnnotationArgumentsRenderingPolicy) this.annotationArgumentsRenderingPolicy$delegate.getValue(this, $$delegatedProperties[38]);
    }

    @Nullable
    public Function1<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return (Function1) this.annotationFilter$delegate.getValue(this, $$delegatedProperties[37]);
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return ((Boolean) this.boldOnlyForNamesInHtml$delegate.getValue(this, $$delegatedProperties[48])).booleanValue();
    }

    public boolean getClassWithPrimaryConstructor() {
        return ((Boolean) this.classWithPrimaryConstructor$delegate.getValue(this, $$delegatedProperties[7])).booleanValue();
    }

    @NotNull
    public ClassifierNamePolicy getClassifierNamePolicy() {
        return (ClassifierNamePolicy) this.classifierNamePolicy$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return ((Boolean) this.debugMode$delegate.getValue(this, $$delegatedProperties[6])).booleanValue();
    }

    @Nullable
    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return (Function1) this.defaultParameterValueRenderer$delegate.getValue(this, $$delegatedProperties[24]);
    }

    public boolean getEachAnnotationOnNewLine() {
        return ((Boolean) this.eachAnnotationOnNewLine$delegate.getValue(this, $$delegatedProperties[34])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return ((Boolean) this.enhancedTypes$delegate.getValue(this, $$delegatedProperties[11])).booleanValue();
    }

    @NotNull
    public Set<FqName> getExcludedAnnotationClasses() {
        return (Set) this.excludedAnnotationClasses$delegate.getValue(this, $$delegatedProperties[35]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return (Set) this.excludedTypeAnnotationClasses$delegate.getValue(this, $$delegatedProperties[36]);
    }

    public boolean getIncludeAdditionalModifiers() {
        return ((Boolean) this.includeAdditionalModifiers$delegate.getValue(this, $$delegatedProperties[44])).booleanValue();
    }

    public boolean getIncludeAnnotationArguments() {
        return DescriptorRendererOptions.DefaultImpls.getIncludeAnnotationArguments(this);
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return DescriptorRendererOptions.DefaultImpls.getIncludeEmptyAnnotationArguments(this);
    }

    public boolean getIncludePropertyConstant() {
        return ((Boolean) this.includePropertyConstant$delegate.getValue(this, $$delegatedProperties[19])).booleanValue();
    }

    public boolean getInformativeErrorType() {
        return ((Boolean) this.informativeErrorType$delegate.getValue(this, $$delegatedProperties[49])).booleanValue();
    }

    @NotNull
    public Set<DescriptorRendererModifier> getModifiers() {
        return (Set) this.modifiers$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public boolean getNormalizedVisibilities() {
        return ((Boolean) this.normalizedVisibilities$delegate.getValue(this, $$delegatedProperties[12])).booleanValue();
    }

    @NotNull
    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return (OverrideRenderingPolicy) this.overrideRenderingPolicy$delegate.getValue(this, $$delegatedProperties[26]);
    }

    @NotNull
    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return (ParameterNameRenderingPolicy) this.parameterNameRenderingPolicy$delegate.getValue(this, $$delegatedProperties[29]);
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return ((Boolean) this.parameterNamesInFunctionalTypes$delegate.getValue(this, $$delegatedProperties[45])).booleanValue();
    }

    public boolean getPresentableUnresolvedTypes() {
        return ((Boolean) this.presentableUnresolvedTypes$delegate.getValue(this, $$delegatedProperties[47])).booleanValue();
    }

    @NotNull
    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return (PropertyAccessorRenderingPolicy) this.propertyAccessorRenderingPolicy$delegate.getValue(this, $$delegatedProperties[32]);
    }

    @Nullable
    public Function1<ConstantValue<?>, String> getPropertyConstantRenderer() {
        return (Function1) this.propertyConstantRenderer$delegate.getValue(this, $$delegatedProperties[20]);
    }

    public boolean getReceiverAfterName() {
        return ((Boolean) this.receiverAfterName$delegate.getValue(this, $$delegatedProperties[30])).booleanValue();
    }

    public boolean getRenderAbbreviatedTypeComments() {
        return ((Boolean) this.renderAbbreviatedTypeComments$delegate.getValue(this, $$delegatedProperties[43])).booleanValue();
    }

    public boolean getRenderCompanionObjectName() {
        return ((Boolean) this.renderCompanionObjectName$delegate.getValue(this, $$delegatedProperties[31])).booleanValue();
    }

    public boolean getRenderConstructorDelegation() {
        return ((Boolean) this.renderConstructorDelegation$delegate.getValue(this, $$delegatedProperties[15])).booleanValue();
    }

    public boolean getRenderConstructorKeyword() {
        return ((Boolean) this.renderConstructorKeyword$delegate.getValue(this, $$delegatedProperties[40])).booleanValue();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return ((Boolean) this.renderDefaultAnnotationArguments$delegate.getValue(this, $$delegatedProperties[33])).booleanValue();
    }

    public boolean getRenderDefaultModality() {
        return ((Boolean) this.renderDefaultModality$delegate.getValue(this, $$delegatedProperties[14])).booleanValue();
    }

    public boolean getRenderDefaultVisibility() {
        return ((Boolean) this.renderDefaultVisibility$delegate.getValue(this, $$delegatedProperties[13])).booleanValue();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return ((Boolean) this.renderPrimaryConstructorParametersAsProperties$delegate.getValue(this, $$delegatedProperties[16])).booleanValue();
    }

    public boolean getRenderTypeExpansions() {
        return ((Boolean) this.renderTypeExpansions$delegate.getValue(this, $$delegatedProperties[42])).booleanValue();
    }

    public boolean getRenderUnabbreviatedType() {
        return ((Boolean) this.renderUnabbreviatedType$delegate.getValue(this, $$delegatedProperties[41])).booleanValue();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return ((Boolean) this.secondaryConstructorsAsPrimary$delegate.getValue(this, $$delegatedProperties[25])).booleanValue();
    }

    public boolean getStartFromDeclarationKeyword() {
        return ((Boolean) this.startFromDeclarationKeyword$delegate.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    public boolean getStartFromName() {
        return ((Boolean) this.startFromName$delegate.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    @NotNull
    public RenderingFormat getTextFormat() {
        return (RenderingFormat) this.textFormat$delegate.getValue(this, $$delegatedProperties[28]);
    }

    @NotNull
    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return (Function1) this.typeNormalizer$delegate.getValue(this, $$delegatedProperties[23]);
    }

    public boolean getUninferredTypeParameterAsName() {
        return ((Boolean) this.uninferredTypeParameterAsName$delegate.getValue(this, $$delegatedProperties[18])).booleanValue();
    }

    public boolean getUnitReturnType() {
        return ((Boolean) this.unitReturnType$delegate.getValue(this, $$delegatedProperties[9])).booleanValue();
    }

    @NotNull
    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return (DescriptorRenderer.ValueParametersHandler) this.valueParametersHandler$delegate.getValue(this, $$delegatedProperties[27]);
    }

    public boolean getVerbose() {
        return ((Boolean) this.verbose$delegate.getValue(this, $$delegatedProperties[8])).booleanValue();
    }

    public boolean getWithDefinedIn() {
        return ((Boolean) this.withDefinedIn$delegate.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public boolean getWithSourceFileForTopLevel() {
        return ((Boolean) this.withSourceFileForTopLevel$delegate.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public boolean getWithoutReturnType() {
        return ((Boolean) this.withoutReturnType$delegate.getValue(this, $$delegatedProperties[10])).booleanValue();
    }

    public boolean getWithoutSuperTypes() {
        return ((Boolean) this.withoutSuperTypes$delegate.getValue(this, $$delegatedProperties[22])).booleanValue();
    }

    public boolean getWithoutTypeParameters() {
        return ((Boolean) this.withoutTypeParameters$delegate.getValue(this, $$delegatedProperties[21])).booleanValue();
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final void lock() {
        this.isLocked = true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        Intrinsics.checkNotNullParameter(annotationArgumentsRenderingPolicy, "<set-?>");
        this.annotationArgumentsRenderingPolicy$delegate.setValue(this, $$delegatedProperties[38], annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        Intrinsics.checkNotNullParameter(classifierNamePolicy, "<set-?>");
        this.classifierNamePolicy$delegate.setValue(this, $$delegatedProperties[0], classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z10) {
        this.debugMode$delegate.setValue(this, $$delegatedProperties[6], Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(@NotNull Set<FqName> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.excludedTypeAnnotationClasses$delegate.setValue(this, $$delegatedProperties[36], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(@NotNull Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.modifiers$delegate.setValue(this, $$delegatedProperties[3], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy, "<set-?>");
        this.parameterNameRenderingPolicy$delegate.setValue(this, $$delegatedProperties[29], parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z10) {
        this.receiverAfterName$delegate.setValue(this, $$delegatedProperties[30], Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z10) {
        this.renderCompanionObjectName$delegate.setValue(this, $$delegatedProperties[31], Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z10) {
        this.startFromName$delegate.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(@NotNull RenderingFormat renderingFormat) {
        Intrinsics.checkNotNullParameter(renderingFormat, "<set-?>");
        this.textFormat$delegate.setValue(this, $$delegatedProperties[28], renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z10) {
        this.verbose$delegate.setValue(this, $$delegatedProperties[8], Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z10) {
        this.withDefinedIn$delegate.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z10) {
        this.withoutSuperTypes$delegate.setValue(this, $$delegatedProperties[22], Boolean.valueOf(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z10) {
        this.withoutTypeParameters$delegate.setValue(this, $$delegatedProperties[21], Boolean.valueOf(z10));
    }
}
