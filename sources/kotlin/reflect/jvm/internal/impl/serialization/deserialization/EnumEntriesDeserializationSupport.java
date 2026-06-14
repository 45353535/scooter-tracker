package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface EnumEntriesDeserializationSupport {

    public static final class Default implements EnumEntriesDeserializationSupport {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport
        @Nullable
        public Boolean canSynthesizeEnumEntries() {
            return null;
        }
    }

    @Nullable
    Boolean canSynthesizeEnumEntries();
}
