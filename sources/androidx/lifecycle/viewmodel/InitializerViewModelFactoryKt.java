package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\n\u001a\u00020\u0002\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0007*\u00020\u00012\u0014\b\b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", "builder", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initializer", "(Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;Lkotlin/jvm/functions/Function1;)V", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, Function1<? super CreationExtras, ? extends VM> initializer) {
        Intrinsics.checkNotNullParameter(initializerViewModelFactoryBuilder, "<this>");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        Intrinsics.reifiedOperationMarker(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(v0.b(ViewModel.class), initializer);
    }

    @NotNull
    public static final ViewModelProvider.Factory viewModelFactory(@NotNull Function1<? super InitializerViewModelFactoryBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        builder.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
