package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qf.a;

/* JADX INFO: loaded from: classes3.dex */
public final class JvmBuiltIns extends KotlinBuiltIns {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {v0.j(new n0(JvmBuiltIns.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    @NotNull
    private final NotNullLazyValue customizer$delegate;

    @NotNull
    private final Kind kind;

    @Nullable
    private Function0<Settings> settingsComputation;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;
        public static final Kind FROM_DEPENDENCIES = new Kind("FROM_DEPENDENCIES", 0);
        public static final Kind FROM_CLASS_LOADER = new Kind("FROM_CLASS_LOADER", 1);
        public static final Kind FALLBACK = new Kind("FALLBACK", 2);

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{FROM_DEPENDENCIES, FROM_CLASS_LOADER, FALLBACK};
        }

        static {
            Kind[] kindArr$values = $values();
            $VALUES = kindArr$values;
            $ENTRIES = a.a(kindArr$values);
        }

        private Kind(String str, int i10) {
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    public static final class Settings {
        private final boolean isAdditionalBuiltInsFeatureSupported;

        @NotNull
        private final ModuleDescriptor ownerModuleDescriptor;

        public Settings(@NotNull ModuleDescriptor ownerModuleDescriptor, boolean z10) {
            Intrinsics.checkNotNullParameter(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.ownerModuleDescriptor = ownerModuleDescriptor;
            this.isAdditionalBuiltInsFeatureSupported = z10;
        }

        @NotNull
        public final ModuleDescriptor getOwnerModuleDescriptor() {
            return this.ownerModuleDescriptor;
        }

        public final boolean isAdditionalBuiltInsFeatureSupported() {
            return this.isAdditionalBuiltInsFeatureSupported;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Kind.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(@NotNull final StorageManager storageManager, @NotNull Kind kind) {
        super(storageManager);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.kind = kind;
        this.customizer$delegate = storageManager.createLazyValue(new Function0(this, storageManager) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$$Lambda$0
            private final JvmBuiltIns arg$0;
            private final StorageManager arg$1;

            {
                this.arg$0 = this;
                this.arg$1 = storageManager;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return JvmBuiltIns.customizer_delegate$lambda$5(this.arg$0, this.arg$1);
            }
        });
        int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                createBuiltInsModule(false);
            } else {
                if (i10 != 3) {
                    throw new m();
                }
                createBuiltInsModule(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JvmBuiltInsCustomizer customizer_delegate$lambda$5(final JvmBuiltIns jvmBuiltIns, StorageManager storageManager) {
        ModuleDescriptorImpl builtInsModule = jvmBuiltIns.getBuiltInsModule();
        Intrinsics.checkNotNullExpressionValue(builtInsModule, "getBuiltInsModule(...)");
        return new JvmBuiltInsCustomizer(builtInsModule, storageManager, new Function0(jvmBuiltIns) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$$Lambda$2
            private final JvmBuiltIns arg$0;

            {
                this.arg$0 = jvmBuiltIns;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return JvmBuiltIns.customizer_delegate$lambda$5$lambda$4(this.arg$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Settings customizer_delegate$lambda$5$lambda$4(JvmBuiltIns jvmBuiltIns) {
        Function0<Settings> function0 = jvmBuiltIns.settingsComputation;
        if (function0 == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        Settings settingsInvoke = function0.invoke();
        jvmBuiltIns.settingsComputation = null;
        return settingsInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Settings initialize$lambda$1(ModuleDescriptor moduleDescriptor, boolean z10) {
        return new Settings(moduleDescriptor, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    protected AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return getCustomizer();
    }

    @NotNull
    public final JvmBuiltInsCustomizer getCustomizer() {
        return (JvmBuiltInsCustomizer) StorageKt.getValue(this.customizer$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    protected PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return getCustomizer();
    }

    public final void initialize(@NotNull final ModuleDescriptor moduleDescriptor, final boolean z10) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        setPostponedSettingsComputation(new Function0(moduleDescriptor, z10) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$$Lambda$1
            private final ModuleDescriptor arg$0;
            private final boolean arg$1;

            {
                this.arg$0 = moduleDescriptor;
                this.arg$1 = z10;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return JvmBuiltIns.initialize$lambda$1(this.arg$0, this.arg$1);
            }
        });
    }

    public final void setPostponedSettingsComputation(@NotNull Function0<Settings> computation) {
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.settingsComputation = computation;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    public List<ClassDescriptorFactory> getClassDescriptorFactories() {
        Iterable<ClassDescriptorFactory> classDescriptorFactories = super.getClassDescriptorFactories();
        Intrinsics.checkNotNullExpressionValue(classDescriptorFactories, "getClassDescriptorFactories(...)");
        StorageManager storageManager = getStorageManager();
        Intrinsics.checkNotNullExpressionValue(storageManager, "getStorageManager(...)");
        ModuleDescriptorImpl builtInsModule = getBuiltInsModule();
        Intrinsics.checkNotNullExpressionValue(builtInsModule, "getBuiltInsModule(...)");
        return CollectionsKt.plus(classDescriptorFactories, new JvmBuiltInClassDescriptorFactory(storageManager, builtInsModule, null, 4, null));
    }
}
