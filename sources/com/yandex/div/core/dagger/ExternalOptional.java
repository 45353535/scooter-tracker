package com.yandex.div.core.dagger;

import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \n*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\nB\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/core/dagger/ExternalOptional;", "", "T", "Lm8/b;", "optional", "<init>", "(Lm8/b;)V", "Lm8/b;", "getOptional", "()Lm8/b;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExternalOptional<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final m8.b optional;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0006\u0010\b\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/yandex/div/core/dagger/ExternalOptional$Companion;", "", "<init>", "()V", "T", "Lcom/yandex/div/core/dagger/ExternalOptional;", "empty", "()Lcom/yandex/div/core/dagger/ExternalOptional;", "value", "of", "(Ljava/lang/Object;)Lcom/yandex/div/core/dagger/ExternalOptional;", "ofNullable", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> ExternalOptional<T> empty() {
            return new ExternalOptional<>(m8.b.f94476b.a());
        }

        @NotNull
        public final <T> ExternalOptional<T> of(@NotNull T value) {
            return new ExternalOptional<>(m8.b.f94476b.b(value));
        }

        @NotNull
        public final <T> ExternalOptional<T> ofNullable(@Nullable T value) {
            return value != null ? of(value) : empty();
        }

        private Companion() {
        }
    }

    public ExternalOptional(@NotNull m8.b bVar) {
        this.optional = bVar;
    }

    @NotNull
    public static final <T> ExternalOptional<T> empty() {
        return INSTANCE.empty();
    }

    @NotNull
    public static final <T> ExternalOptional<T> of(@NotNull T t10) {
        return INSTANCE.of(t10);
    }

    @NotNull
    public final m8.b getOptional() {
        return this.optional;
    }
}
