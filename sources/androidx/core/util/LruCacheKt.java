package androidx.core.util;

import android.util.LruCache;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0096\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\u0006\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00052\u0016\b\u0006\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00072(\b\u0006\u0010\f\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020\u000b0\tH\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "maxSize", "Lkotlin/Function2;", "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "", "onEntryRemoved", "Landroid/util/LruCache;", "lruCache", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)Landroid/util/LruCache;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LruCacheKt {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0002\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00012\b\u0010\n\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/util/LruCacheKt$lruCache$4", "Landroid/util/LruCache;", "create", C4240b4.i.W, "(Ljava/lang/Object;)Ljava/lang/Object;", "entryRemoved", "", "evicted", "", "oldValue", "newValue", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "sizeOf", "", "value", "(Ljava/lang/Object;Ljava/lang/Object;)I", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass4<K, V> extends LruCache<K, V> {
        final /* synthetic */ Function1<K, V> $create;
        final /* synthetic */ Function4<Boolean, K, V, V, Unit> $onEntryRemoved;
        final /* synthetic */ Function2<K, V, Integer> $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(int i10, Function2<? super K, ? super V, Integer> function2, Function1<? super K, ? extends V> function1, Function4<? super Boolean, ? super K, ? super V, ? super V, Unit> function4) {
            super(i10);
            this.$sizeOf = function2;
            this.$create = function1;
            this.$onEntryRemoved = function4;
        }

        @Override // android.util.LruCache
        @Nullable
        protected V create(@NotNull K key) {
            return this.$create.invoke(key);
        }

        @Override // android.util.LruCache
        protected void entryRemoved(boolean evicted, @NotNull K key, @NotNull V oldValue, @Nullable V newValue) {
            this.$onEntryRemoved.invoke(Boolean.valueOf(evicted), key, oldValue, newValue);
        }

        @Override // android.util.LruCache
        protected int sizeOf(@NotNull K key, @NotNull V value) {
            return this.$sizeOf.invoke(key, value).intValue();
        }
    }

    @NotNull
    public static final <K, V> LruCache<K, V> lruCache(int i10, @NotNull Function2<? super K, ? super V, Integer> function2, @NotNull Function1<? super K, ? extends V> function1, @NotNull Function4<? super Boolean, ? super K, ? super V, ? super V, Unit> function4) {
        return new AnonymousClass4(i10, function2, function1, function4);
    }

    public static /* synthetic */ LruCache lruCache$default(int i10, Function2 function2, Function1 function1, Function4 function4, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function2 = new Function2() { // from class: androidx.core.util.LruCacheKt.lruCache.1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final Integer invoke(@NotNull Object obj2, @NotNull Object obj3) {
                    return 1;
                }
            };
        }
        if ((i11 & 4) != 0) {
            function1 = new Function1() { // from class: androidx.core.util.LruCacheKt.lruCache.2
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull Object obj2) {
                    return null;
                }
            };
        }
        if ((i11 & 8) != 0) {
            function4 = new Function4() { // from class: androidx.core.util.LruCacheKt.lruCache.3
                public final void invoke(boolean z10, @NotNull Object obj2, @NotNull Object obj3, @Nullable Object obj4) {
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke(((Boolean) obj2).booleanValue(), obj3, obj4, obj5);
                    return Unit.f93236a;
                }
            };
        }
        return new AnonymousClass4(i10, function2, function1, function4);
    }
}
