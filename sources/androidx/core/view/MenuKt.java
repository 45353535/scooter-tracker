package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a(\u0010\u0012\u001a\u00020\n*\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0010H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a.\u0010\u0015\u001a\u00020\n*\u00020\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0014H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001b\"\u0016\u0010\u001e\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroid/view/Menu;", "", FirebaseAnalytics.Param.INDEX, "Landroid/view/MenuItem;", "get", "(Landroid/view/Menu;I)Landroid/view/MenuItem;", "item", "", "contains", "(Landroid/view/Menu;Landroid/view/MenuItem;)Z", "", "minusAssign", "(Landroid/view/Menu;Landroid/view/MenuItem;)V", "isEmpty", "(Landroid/view/Menu;)Z", "isNotEmpty", "Lkotlin/Function1;", "action", "forEach", "(Landroid/view/Menu;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "forEachIndexed", "(Landroid/view/Menu;Lkotlin/jvm/functions/Function2;)V", "", "iterator", "(Landroid/view/Menu;)Ljava/util/Iterator;", "removeItemAt", "(Landroid/view/Menu;I)V", "getSize", "(Landroid/view/Menu;)I", "size", "Lkotlin/sequences/Sequence;", "getChildren", "(Landroid/view/Menu;)Lkotlin/sequences/Sequence;", "children", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MenuKt {

    /* JADX INFO: renamed from: androidx.core.view.MenuKt$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"androidx/core/view/MenuKt$iterator$1", "", "Landroid/view/MenuItem;", FirebaseAnalytics.Param.INDEX, "", "hasNext", "", "next", "remove", "", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<MenuItem>, yf.a {
        final /* synthetic */ Menu $this_iterator;
        private int index;

        AnonymousClass1(Menu menu) {
            this.$this_iterator = menu;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            Unit unit;
            Menu menu = this.$this_iterator;
            int i10 = this.index - 1;
            this.index = i10;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                menu.removeItem(item.getItemId());
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IndexOutOfBoundsException();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        @NotNull
        public MenuItem next() {
            Menu menu = this.$this_iterator;
            int i10 = this.index;
            this.index = i10 + 1;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public static final boolean contains(@NotNull Menu menu, @NotNull MenuItem menuItem) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Intrinsics.areEqual(menu.getItem(i10), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(@NotNull Menu menu, @NotNull Function1<? super MenuItem, Unit> function1) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            function1.invoke(menu.getItem(i10));
        }
    }

    public static final void forEachIndexed(@NotNull Menu menu, @NotNull Function2<? super Integer, ? super MenuItem, Unit> function2) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            function2.invoke(Integer.valueOf(i10), menu.getItem(i10));
        }
    }

    @NotNull
    public static final MenuItem get(@NotNull Menu menu, int i10) {
        return menu.getItem(i10);
    }

    @NotNull
    public static final Sequence<MenuItem> getChildren(@NotNull final Menu menu) {
        return new Sequence<MenuItem>() { // from class: androidx.core.view.MenuKt$children$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<MenuItem> iterator() {
                return MenuKt.iterator(menu);
            }
        };
    }

    public static final int getSize(@NotNull Menu menu) {
        return menu.size();
    }

    public static final boolean isEmpty(@NotNull Menu menu) {
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(@NotNull Menu menu) {
        return menu.size() != 0;
    }

    @NotNull
    public static final Iterator<MenuItem> iterator(@NotNull Menu menu) {
        return new AnonymousClass1(menu);
    }

    public static final void minusAssign(@NotNull Menu menu, @NotNull MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(@NotNull Menu menu, int i10) {
        Unit unit;
        MenuItem item = menu.getItem(i10);
        if (item != null) {
            menu.removeItem(item.getItemId());
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
