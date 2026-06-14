package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import xf.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModel;", "T", "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initializer", "", "addInitializer", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/ViewModelProvider$Factory;", "build", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "initializers", "Ljava/util/List;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ViewModelFactoryDsl
public final class InitializerViewModelFactoryBuilder {

    @NotNull
    private final List<ViewModelInitializer<?>> initializers = new ArrayList();

    public final <T extends ViewModel> void addInitializer(@NotNull KClass<T> clazz, @NotNull Function1<? super CreationExtras, ? extends T> initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializers.add(new ViewModelInitializer<>(a.b(clazz), initializer));
    }

    @NotNull
    public final ViewModelProvider.Factory build() {
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) this.initializers.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
