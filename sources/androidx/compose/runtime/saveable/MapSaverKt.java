package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ak\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\t\"\u0004\b\u0000\u0010\u00002&\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u00012\"\u0010\b\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"T", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "", "", "", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/runtime/saveable/Saver;", "mapSaver", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MapSaverKt {
    @NotNull
    public static final <T> Saver<T, Object> mapSaver(@NotNull final Function2<? super SaverScope, ? super T, ? extends Map<String, ? extends Object>> save, @NotNull final Function1<? super Map<String, ? extends Object>, ? extends T> restore) {
        Intrinsics.checkNotNullParameter(save, "save");
        Intrinsics.checkNotNullParameter(restore, "restore");
        return ListSaverKt.listSaver(new Function2<SaverScope, T, List<? extends Object>>() { // from class: androidx.compose.runtime.saveable.MapSaverKt.mapSaver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final List<Object> invoke(@NotNull SaverScope listSaver, T t10) {
                Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, Object> entry : save.invoke(listSaver, t10).entrySet()) {
                    arrayList.add(entry.getKey());
                    arrayList.add(entry.getValue());
                }
                return arrayList;
            }
        }, new Function1<List<? extends Object>, T>() { // from class: androidx.compose.runtime.saveable.MapSaverKt.mapSaver.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final T invoke(@NotNull List<? extends Object> list) {
                Intrinsics.checkNotNullParameter(list, "list");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (list.size() % 2 != 0) {
                    throw new IllegalStateException("Check failed.");
                }
                for (int i10 = 0; i10 < list.size(); i10 += 2) {
                    Object obj = list.get(i10);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, list.get(i10 + 1));
                }
                return restore.invoke(linkedHashMap);
            }
        });
    }
}
