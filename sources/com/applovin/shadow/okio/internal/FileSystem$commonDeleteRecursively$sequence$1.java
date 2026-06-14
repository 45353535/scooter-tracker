package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Path;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/j;", "Lcom/applovin/shadow/okio/Path;", "", "<anonymous>", "(Lkotlin/sequences/j;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.applovin.shadow.okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", l = {75}, m = "invokeSuspend")
final class FileSystem$commonDeleteRecursively$sequence$1 extends j implements Function2<kotlin.sequences.j, Continuation, Object> {
    final /* synthetic */ Path $fileOrDirectory;
    final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, Continuation continuation) {
        super(2, continuation);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, continuation);
        fileSystem$commonDeleteRecursively$sequence$1.L$0 = obj;
        return fileSystem$commonDeleteRecursively$sequence$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            kotlin.sequences.j jVar = (kotlin.sequences.j) this.L$0;
            FileSystem fileSystem = this.$this_commonDeleteRecursively;
            ArrayDeque arrayDeque = new ArrayDeque();
            Path path = this.$fileOrDirectory;
            this.label = 1;
            if (FileSystem.collectRecursively(jVar, fileSystem, arrayDeque, path, false, true, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull kotlin.sequences.j jVar, @Nullable Continuation continuation) {
        return ((FileSystem$commonDeleteRecursively$sequence$1) create(jVar, continuation)).invokeSuspend(Unit.f93236a);
    }
}
