package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ScopesHolderForClass<T extends MemberScope> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {v0.j(new n0(ScopesHolderForClass.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final ClassDescriptor classDescriptor;

    @NotNull
    private final KotlinTypeRefiner kotlinTypeRefinerForOwnerModule;

    @NotNull
    private final Function1<KotlinTypeRefiner, T> scopeFactory;

    @NotNull
    private final NotNullLazyValue scopeForOwnerModule$delegate;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T extends MemberScope> ScopesHolderForClass<T> create(@NotNull ClassDescriptor classDescriptor, @NotNull StorageManager storageManager, @NotNull KotlinTypeRefiner kotlinTypeRefinerForOwnerModule, @NotNull Function1<? super KotlinTypeRefiner, ? extends T> scopeFactory) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            Intrinsics.checkNotNullParameter(scopeFactory, "scopeFactory");
            return new ScopesHolderForClass<>(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, Function1 function1, KotlinTypeRefiner kotlinTypeRefiner, DefaultConstructorMarker defaultConstructorMarker) {
        this(classDescriptor, storageManager, function1, kotlinTypeRefiner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope getScope$lambda$1(ScopesHolderForClass scopesHolderForClass, KotlinTypeRefiner kotlinTypeRefiner) {
        return scopesHolderForClass.scopeFactory.invoke(kotlinTypeRefiner);
    }

    private final T getScopeForOwnerModule() {
        return (T) StorageKt.getValue(this.scopeForOwnerModule$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope scopeForOwnerModule_delegate$lambda$0(ScopesHolderForClass scopesHolderForClass) {
        return scopesHolderForClass.scopeFactory.invoke(scopesHolderForClass.kotlinTypeRefinerForOwnerModule);
    }

    @NotNull
    public final T getScope(@NotNull final KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!kotlinTypeRefiner.isRefinementNeededForModule(DescriptorUtilsKt.getModule(this.classDescriptor))) {
            return (T) getScopeForOwnerModule();
        }
        TypeConstructor typeConstructor = this.classDescriptor.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return !kotlinTypeRefiner.isRefinementNeededForTypeConstructor(typeConstructor) ? (T) getScopeForOwnerModule() : (T) kotlinTypeRefiner.getOrPutScopeForClass(this.classDescriptor, new Function0(this, kotlinTypeRefiner) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$$Lambda$1
            private final ScopesHolderForClass arg$0;
            private final KotlinTypeRefiner arg$1;

            {
                this.arg$0 = this;
                this.arg$1 = kotlinTypeRefiner;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return ScopesHolderForClass.getScope$lambda$1(this.arg$0, this.arg$1);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, Function1<? super KotlinTypeRefiner, ? extends T> function1, KotlinTypeRefiner kotlinTypeRefiner) {
        this.classDescriptor = classDescriptor;
        this.scopeFactory = function1;
        this.kotlinTypeRefinerForOwnerModule = kotlinTypeRefiner;
        this.scopeForOwnerModule$delegate = storageManager.createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$$Lambda$0
            private final ScopesHolderForClass arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return ScopesHolderForClass.scopeForOwnerModule_delegate$lambda$0(this.arg$0);
            }
        });
    }
}
