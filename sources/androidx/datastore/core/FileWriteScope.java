package androidx.datastore.core;

import com.ironsource.C4240b4;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Landroidx/datastore/core/FileWriteScope;", "T", "Landroidx/datastore/core/FileReadScope;", "Landroidx/datastore/core/WriteScope;", C4240b4.i.f42616b, "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", "writeData", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileWriteScope<T> extends FileReadScope<T> implements WriteScope<T> {

    /* JADX INFO: renamed from: androidx.datastore.core.FileWriteScope$writeData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", l = {201}, m = "writeData")
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FileWriteScope<T> fileWriteScope, Continuation continuation) {
            super(continuation);
            this.this$0 = fileWriteScope;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope(@NotNull File file, @NotNull Serializer<T> serializer) {
        super(file, serializer);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.WriteScope
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object writeData(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) throws java.io.IOException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.datastore.core.FileWriteScope.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.FileWriteScope$writeData$1 r0 = (androidx.datastore.core.FileWriteScope.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.FileWriteScope$writeData$1 r0 = new androidx.datastore.core.FileWriteScope$writeData$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            java.io.FileOutputStream r6 = (java.io.FileOutputStream) r6
            java.lang.Object r0 = r0.L$0
            java.io.Closeable r0 = (java.io.Closeable) r0
            kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L62
        L31:
            r6 = move-exception
            goto L74
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.d.b(r7)
            r5.checkNotClosed()
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r2 = r5.getFile()
            r7.<init>(r2)
            androidx.datastore.core.Serializer r2 = r5.getSerializer()     // Catch: java.lang.Throwable -> L72
            androidx.datastore.core.UncloseableOutputStream r4 = new androidx.datastore.core.UncloseableOutputStream     // Catch: java.lang.Throwable -> L72
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L72
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L72
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L72
            r0.label = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r6 = r2.writeTo(r6, r4, r0)     // Catch: java.lang.Throwable -> L72
            if (r6 != r1) goto L60
            return r1
        L60:
            r6 = r7
            r0 = r6
        L62:
            java.io.FileDescriptor r6 = r6.getFD()     // Catch: java.lang.Throwable -> L31
            r6.sync()     // Catch: java.lang.Throwable -> L31
            kotlin.Unit r6 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L31
            r6 = 0
            uf.c.a(r0, r6)
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L72:
            r6 = move-exception
            r0 = r7
        L74:
            throw r6     // Catch: java.lang.Throwable -> L75
        L75:
            r7 = move-exception
            uf.c.a(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileWriteScope.writeData(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
