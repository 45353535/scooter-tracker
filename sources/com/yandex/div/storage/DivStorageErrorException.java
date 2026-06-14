package com.yandex.div.storage;

import com.taurusx.tax.f.y;
import com.yandex.div.storage.database.StorageException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div/storage/DivStorageErrorException;", "Lcom/yandex/div/storage/database/StorageException;", "errorMessage", "", "cause", "", "cardId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", y.f66058y, "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivStorageErrorException extends StorageException {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/storage/DivStorageErrorException$Companion;", "", "()V", "getMessage", "", "errorMessage", "cardId", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String getMessage(java.lang.String r3, java.lang.String r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                if (r4 == 0) goto L1d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r1 = " Card id: "
                r3.append(r1)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                if (r3 != 0) goto L1f
            L1d:
                java.lang.String r3 = ""
            L1f:
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.storage.DivStorageErrorException.Companion.getMessage(java.lang.String, java.lang.String):java.lang.String");
        }

        private Companion() {
        }
    }

    public /* synthetic */ DivStorageErrorException(String str, Throwable th2, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : th2, (i10 & 4) != 0 ? null : str2);
    }

    public DivStorageErrorException(@NotNull String str, @Nullable Throwable th2, @Nullable String str2) {
        super(INSTANCE.getMessage(str, str2), th2, str2);
    }
}
