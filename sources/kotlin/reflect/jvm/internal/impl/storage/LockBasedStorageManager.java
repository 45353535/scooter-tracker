package kotlin.reflect.jvm.internal.impl.storage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class LockBasedStorageManager implements StorageManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final String debugText;
    private final ExceptionHandlingStrategy exceptionHandlingStrategy;
    protected final SimpleLock lock;
    private static final String PACKAGE_NAME = StringsKt.r1(LockBasedStorageManager.class.getCanonicalName(), ".", "");
    public static final StorageManager NO_LOCKS = new LockBasedStorageManager("NO_LOCKS", ExceptionHandlingStrategy.THROW, EmptySimpleLock.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.1
        private static /* synthetic */ void $$$reportNull$$$0(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i10 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        @NotNull
        protected <K, V> RecursionDetectedResult<V> recursionDetectedDefault(@NotNull String str, K k10) {
            if (str == null) {
                $$$reportNull$$$0(0);
            }
            RecursionDetectedResult<V> recursionDetectedResultFallThrough = RecursionDetectedResult.fallThrough();
            if (recursionDetectedResultFallThrough == null) {
                $$$reportNull$$$0(1);
            }
            return recursionDetectedResultFallThrough;
        }
    };

    private static class CacheWithNotNullValuesBasedOnMemoizedFunction<K, V> extends CacheWithNullableValuesBasedOnMemoizedFunction<K, V> implements CacheWithNotNullValues<K, V> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNullableValuesBasedOnMemoizedFunction, kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        @NotNull
        public V computeIfAbsent(K k10, @NotNull Function0<? extends V> function0) {
            if (function0 == null) {
                $$$reportNull$$$0(2);
            }
            V v10 = (V) super.computeIfAbsent(k10, function0);
            if (v10 == null) {
                $$$reportNull$$$0(3);
            }
            return v10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private CacheWithNotNullValuesBasedOnMemoizedFunction(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<KeyWithComputation<K, V>, Object> concurrentMap) {
            super(concurrentMap);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
        }
    }

    private static class CacheWithNullableValuesBasedOnMemoizedFunction<K, V> extends MapBasedMemoizedFunction<KeyWithComputation<K, V>, V> implements CacheWithNullableValues<K, V> {
        private static /* synthetic */ void $$$reportNull$$$0(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Nullable
        public V computeIfAbsent(K k10, @NotNull Function0<? extends V> function0) {
            if (function0 == null) {
                $$$reportNull$$$0(2);
            }
            return invoke(new KeyWithComputation(k10, function0));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private CacheWithNullableValuesBasedOnMemoizedFunction(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<KeyWithComputation<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, new Function1<KeyWithComputation<K, V>, V>() { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNullableValuesBasedOnMemoizedFunction.1
                @Override // kotlin.jvm.functions.Function1
                public V invoke(KeyWithComputation<K, V> keyWithComputation) {
                    return (V) ((KeyWithComputation) keyWithComputation).computation.invoke();
                }
            });
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
        }
    }

    public interface ExceptionHandlingStrategy {
        public static final ExceptionHandlingStrategy THROW = new ExceptionHandlingStrategy() { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy.1
            private static /* synthetic */ void $$$reportNull$$$0(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
            @NotNull
            public RuntimeException handleException(@NotNull Throwable th2) {
                if (th2 == null) {
                    $$$reportNull$$$0(0);
                }
                throw ExceptionUtilsKt.rethrow(th2);
            }
        };

        @NotNull
        RuntimeException handleException(@NotNull Throwable th2);
    }

    private static class KeyWithComputation<K, V> {
        private final Function0<? extends V> computation;
        private final K key;

        public KeyWithComputation(K k10, Function0<? extends V> function0) {
            this.key = k10;
            this.computation = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.key.equals(((KeyWithComputation) obj).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }
    }

    private static class LockBasedLazyValue<T> implements NullableLazyValue<T> {
        private final Function0<? extends T> computable;
        private final LockBasedStorageManager storageManager;

        @Nullable
        private volatile Object value;

        private static /* synthetic */ void $$$reportNull$$$0(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i10 != 2 && i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public LockBasedLazyValue(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (function0 == null) {
                $$$reportNull$$$0(1);
            }
            this.value = NotValue.NOT_COMPUTED;
            this.storageManager = lockBasedStorageManager;
            this.computable = function0;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public T invoke() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.value
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue
                if (r1 != 0) goto Lb
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeThrowable(r0)
                return r0
            Lb:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r0 = r4.storageManager
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r0 = r0.lock
                r0.lock()
                java.lang.Object r0 = r4.value     // Catch: java.lang.Throwable -> L24
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L26
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.unescapeThrowable(r0)     // Catch: java.lang.Throwable -> L24
            L1c:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r1 = r4.storageManager
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r1 = r1.lock
                r1.unlock()
                return r0
            L24:
                r0 = move-exception
                goto L85
            L26:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r0 != r1) goto L3e
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                r4.value = r2     // Catch: java.lang.Throwable -> L24
                r2 = 1
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$RecursionDetectedResult r2 = r4.recursionDetected(r2)     // Catch: java.lang.Throwable -> L24
                boolean r3 = r2.isFallThrough()     // Catch: java.lang.Throwable -> L24
                if (r3 != 0) goto L3e
                java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L3e:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                if (r0 != r2) goto L52
                r0 = 0
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$RecursionDetectedResult r0 = r4.recursionDetected(r0)     // Catch: java.lang.Throwable -> L24
                boolean r2 = r0.isFallThrough()     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L52
                java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L52:
                r4.value = r1     // Catch: java.lang.Throwable -> L24
                kotlin.jvm.functions.Function0<? extends T> r0 = r4.computable     // Catch: java.lang.Throwable -> L60
                java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L60
                r4.postCompute(r0)     // Catch: java.lang.Throwable -> L60
                r4.value = r0     // Catch: java.lang.Throwable -> L60
                goto L1c
            L60:
                r0 = move-exception
                boolean r1 = kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.isProcessCanceledException(r0)     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L7e
                java.lang.Object r1 = r4.value     // Catch: java.lang.Throwable -> L24
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r2 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r1 != r2) goto L73
                java.lang.Object r1 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.escapeThrowable(r0)     // Catch: java.lang.Throwable -> L24
                r4.value = r1     // Catch: java.lang.Throwable -> L24
            L73:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r1 = r4.storageManager     // Catch: java.lang.Throwable -> L24
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.access$100(r1)     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = r1.handleException(r0)     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L7e:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$NotValue r1 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NotValue.NOT_COMPUTED     // Catch: java.lang.Throwable -> L24
                r4.value = r1     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L85:
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager r1 = r4.storageManager
                kotlin.reflect.jvm.internal.impl.storage.SimpleLock r1 = r1.lock
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue.invoke():java.lang.Object");
        }

        public boolean isComputed() {
            return (this.value == NotValue.NOT_COMPUTED || this.value == NotValue.COMPUTING) ? false : true;
        }

        protected void postCompute(T t10) {
        }

        @NotNull
        protected RecursionDetectedResult<T> recursionDetected(boolean z10) {
            RecursionDetectedResult<T> recursionDetectedResultRecursionDetectedDefault = this.storageManager.recursionDetectedDefault("in a lazy value", null);
            if (recursionDetectedResultRecursionDetectedDefault == null) {
                $$$reportNull$$$0(2);
            }
            return recursionDetectedResultRecursionDetectedDefault;
        }
    }

    private static abstract class LockBasedLazyValueWithPostCompute<T> extends LockBasedLazyValue<T> {

        @Nullable
        private volatile SingleThreadValue<T> valuePostCompute;

        private static /* synthetic */ void $$$reportNull$$$0(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockBasedLazyValueWithPostCompute(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (function0 == null) {
                $$$reportNull$$$0(1);
            }
            this.valuePostCompute = null;
        }

        protected abstract void doPostCompute(T t10);

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        public T invoke() {
            SingleThreadValue<T> singleThreadValue = this.valuePostCompute;
            return (singleThreadValue == null || !singleThreadValue.hasValue()) ? (T) super.invoke() : singleThreadValue.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
        protected final void postCompute(T t10) {
            this.valuePostCompute = new SingleThreadValue<>(t10);
            try {
                doPostCompute(t10);
            } finally {
                this.valuePostCompute = null;
            }
        }
    }

    private static class LockBasedNotNullLazyValue<T> extends LockBasedLazyValue<T> implements NotNullLazyValue<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockBasedNotNullLazyValue(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (function0 == null) {
                $$$reportNull$$$0(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        @NotNull
        public T invoke() {
            T t10 = (T) super.invoke();
            if (t10 == null) {
                $$$reportNull$$$0(2);
            }
            return t10;
        }
    }

    private static abstract class LockBasedNotNullLazyValueWithPostCompute<T> extends LockBasedLazyValueWithPostCompute<T> implements NotNullLazyValue<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockBasedNotNullLazyValueWithPostCompute(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (function0 == null) {
                $$$reportNull$$$0(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValueWithPostCompute, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        @NotNull
        public T invoke() {
            T t10 = (T) super.invoke();
            if (t10 == null) {
                $$$reportNull$$$0(2);
            }
            return t10;
        }
    }

    private static class MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNullable<K, V> {
        private final ConcurrentMap<K, Object> cache;
        private final Function1<? super K, ? extends V> compute;
        private final LockBasedStorageManager storageManager;

        private static /* synthetic */ void $$$reportNull$$$0(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public MapBasedMemoizedFunction(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
            if (function1 == null) {
                $$$reportNull$$$0(2);
            }
            this.storageManager = lockBasedStorageManager;
            this.cache = concurrentMap;
            this.compute = function1;
        }

        private AssertionError inconsistentComputingKey(K k10, Object obj) {
            return (AssertionError) LockBasedStorageManager.sanitizeStackTrace(new AssertionError("Inconsistent key detected. " + NotValue.COMPUTING + " is expected, was: " + obj + ", most probably race condition detected on input " + k10 + " under " + this.storageManager));
        }

        @NotNull
        private AssertionError raceCondition(K k10, Object obj) {
            AssertionError assertionError = (AssertionError) LockBasedStorageManager.sanitizeStackTrace(new AssertionError("Race condition detected on input " + k10 + ". Old value is " + obj + " under " + this.storageManager));
            if (assertionError == null) {
                $$$reportNull$$$0(4);
            }
            return assertionError;
        }

        private AssertionError unableToRemoveKey(K k10, Throwable th2) {
            return (AssertionError) LockBasedStorageManager.sanitizeStackTrace(new AssertionError("Unable to remove " + k10 + " under " + this.storageManager, th2));
        }

        protected LockBasedStorageManager getStorageManager() {
            return this.storageManager;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
  0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v21 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        @Override // kotlin.jvm.functions.Function1
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public V invoke(K r6) {
            /*
                Method dump skipped, instruction units count: 219
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction.invoke(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
        public boolean isComputed(K k10) {
            Object obj = this.cache.get(k10);
            return (obj == null || obj == NotValue.COMPUTING) ? false : true;
        }

        @NotNull
        protected RecursionDetectedResult<V> recursionDetected(K k10, boolean z10) {
            RecursionDetectedResult<V> recursionDetectedResultRecursionDetectedDefault = this.storageManager.recursionDetectedDefault("", k10);
            if (recursionDetectedResultRecursionDetectedDefault == null) {
                $$$reportNull$$$0(3);
            }
            return recursionDetectedResultRecursionDetectedDefault;
        }
    }

    private static class MapBasedMemoizedFunctionToNotNull<K, V> extends MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNotNull<K, V> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MapBasedMemoizedFunctionToNotNull(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            super(lockBasedStorageManager, concurrentMap, function1);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
            if (function1 == null) {
                $$$reportNull$$$0(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction, kotlin.jvm.functions.Function1
        @NotNull
        public V invoke(K k10) {
            V v10 = (V) super.invoke(k10);
            if (v10 == null) {
                $$$reportNull$$$0(3);
            }
            return v10;
        }
    }

    private enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    private static class RecursionDetectedResult<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final boolean fallThrough;
        private final T value;

        private RecursionDetectedResult(T t10, boolean z10) {
            this.value = t10;
            this.fallThrough = z10;
        }

        @NotNull
        public static <T> RecursionDetectedResult<T> fallThrough() {
            return new RecursionDetectedResult<>(null, true);
        }

        @NotNull
        public static <T> RecursionDetectedResult<T> value(T t10) {
            return new RecursionDetectedResult<>(t10, false);
        }

        public T getValue() {
            return this.value;
        }

        public boolean isFallThrough() {
            return this.fallThrough;
        }

        public String toString() {
            return isFallThrough() ? "FALL_THROUGH" : String.valueOf(this.value);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.$$$reportNull$$$0(int):void");
    }

    @NotNull
    private static <K> ConcurrentMap<K, Object> createConcurrentHashMap() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    public static <T extends Throwable> T sanitizeStackTrace(@NotNull T t10) {
        if (t10 == null) {
            $$$reportNull$$$0(36);
        }
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!stackTrace[i10].getClassName().startsWith(PACKAGE_NAME)) {
                break;
            }
            i10++;
        }
        List listSubList = Arrays.asList(stackTrace).subList(i10, length);
        t10.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        return t10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> T compute(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(34);
        }
        this.lock.lock();
        try {
            return function0.invoke();
        } finally {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues() {
        return new CacheWithNotNullValuesBasedOnMemoizedFunction(createConcurrentHashMap());
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> CacheWithNullableValues<K, V> createCacheWithNullableValues() {
        return new CacheWithNullableValuesBasedOnMemoizedFunction(createConcurrentHashMap());
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createLazyValue(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(23);
        }
        return new LockBasedNotNullLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createLazyValueWithPostCompute(@NotNull Function0<? extends T> function0, final Function1<? super Boolean, ? extends T> function1, @NotNull final Function1<? super T, Unit> function12) {
        if (function0 == null) {
            $$$reportNull$$$0(28);
        }
        if (function12 == null) {
            $$$reportNull$$$0(29);
        }
        return new LockBasedNotNullLazyValueWithPostCompute<T>(this, function0) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.5
            private static /* synthetic */ void $$$reportNull$$$0(int i10) {
                String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                Object[] objArr = new Object[i10 != 2 ? 2 : 3];
                if (i10 != 2) {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
                } else {
                    objArr[0] = "value";
                }
                if (i10 != 2) {
                    objArr[1] = "recursionDetected";
                } else {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
                }
                if (i10 == 2) {
                    objArr[2] = "doPostCompute";
                }
                String str2 = String.format(str, objArr);
                if (i10 == 2) {
                    throw new IllegalArgumentException(str2);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValueWithPostCompute
            protected void doPostCompute(@NotNull T t10) {
                if (t10 == null) {
                    $$$reportNull$$$0(2);
                }
                function12.invoke(t10);
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            @NotNull
            protected RecursionDetectedResult<T> recursionDetected(boolean z10) {
                Function1 function13 = function1;
                if (function13 == null) {
                    RecursionDetectedResult<T> recursionDetectedResultRecursionDetected = super.recursionDetected(z10);
                    if (recursionDetectedResultRecursionDetected == null) {
                        $$$reportNull$$$0(0);
                    }
                    return recursionDetectedResultRecursionDetected;
                }
                RecursionDetectedResult<T> recursionDetectedResultValue = RecursionDetectedResult.value(function13.invoke(Boolean.valueOf(z10)));
                if (recursionDetectedResultValue == null) {
                    $$$reportNull$$$0(1);
                }
                return recursionDetectedResultValue;
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            $$$reportNull$$$0(9);
        }
        MemoizedFunctionToNotNull<K, V> memoizedFunctionToNotNullCreateMemoizedFunction = createMemoizedFunction(function1, createConcurrentHashMap());
        if (memoizedFunctionToNotNullCreateMemoizedFunction == null) {
            $$$reportNull$$$0(10);
        }
        return memoizedFunctionToNotNullCreateMemoizedFunction;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            $$$reportNull$$$0(19);
        }
        MemoizedFunctionToNullable<K, V> memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues = createMemoizedFunctionWithNullableValues(function1, createConcurrentHashMap());
        if (memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues == null) {
            $$$reportNull$$$0(20);
        }
        return memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NullableLazyValue<T> createNullableLazyValue(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(30);
        }
        return new LockBasedLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(@NotNull Function0<? extends T> function0, @NotNull final T t10) {
        if (function0 == null) {
            $$$reportNull$$$0(26);
        }
        if (t10 == null) {
            $$$reportNull$$$0(27);
        }
        return new LockBasedNotNullLazyValue<T>(this, function0) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.4
            private static /* synthetic */ void $$$reportNull$$$0(int i10) {
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            @NotNull
            protected RecursionDetectedResult<T> recursionDetected(boolean z10) {
                RecursionDetectedResult<T> recursionDetectedResultValue = RecursionDetectedResult.value(t10);
                if (recursionDetectedResultValue == null) {
                    $$$reportNull$$$0(0);
                }
                return recursionDetectedResultValue;
            }
        };
    }

    @NotNull
    protected <K, V> RecursionDetectedResult<V> recursionDetectedDefault(@NotNull String str, K k10) {
        String str2;
        if (str == null) {
            $$$reportNull$$$0(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (k10 == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k10;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) sanitizeStackTrace(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.debugText + ")";
    }

    private LockBasedStorageManager(@NotNull String str, @NotNull ExceptionHandlingStrategy exceptionHandlingStrategy, @NotNull SimpleLock simpleLock) {
        if (str == null) {
            $$$reportNull$$$0(4);
        }
        if (exceptionHandlingStrategy == null) {
            $$$reportNull$$$0(5);
        }
        if (simpleLock == null) {
            $$$reportNull$$$0(6);
        }
        this.lock = simpleLock;
        this.exceptionHandlingStrategy = exceptionHandlingStrategy;
        this.debugText = str;
    }

    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            $$$reportNull$$$0(14);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(15);
        }
        return new MapBasedMemoizedFunctionToNotNull(this, concurrentMap, function1);
    }

    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            $$$reportNull$$$0(21);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(22);
        }
        return new MapBasedMemoizedFunction(this, concurrentMap, function1);
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, Unit>) null);
    }

    public LockBasedStorageManager(String str, @Nullable Runnable runnable, @Nullable Function1<InterruptedException, Unit> function1) {
        this(str, ExceptionHandlingStrategy.THROW, SimpleLock.Companion.simpleLock(runnable, function1));
    }
}
